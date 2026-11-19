MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

MANUAL DE MIGRACIÓN

Minecraft Forge
1.12.2 → 1.20.1

Guía de ingeniería inversa, reconstrucción funcional, modernización y
validación para un agente de IA de programación

OBJETIVO

Transformar un mod heredado de Forge 1.12.2 en un proyecto nativo de
Forge 1.20.1, conservando su comportamiento, contenido, datos y
compatibilidad en la medida técnicamente demostrable.

PRINCIPIO CENTRAL  No se debe “traducir” el código línea por línea. Se debe recuperar qué hace el mod,
mapear cada función a la arquitectura del destino, reconstruirla y demostrar su equivalencia con pruebas.

Versión del manual: 1.0  |  Fecha de referencia: 13 de noviembre de 2026
Destino fijo: Minecraft Java Edition 1.20.1 + Minecraft Forge 47.x + Java 17
Idioma: Español

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

1

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

Cómo utilizar este manual

Este documento está escrito para entregárselo a una IA capaz de leer archivos, descompilar JAR, buscar
símbolos, editar código y ejecutar Gradle. Funciona como especificación técnica y procedimiento operativo.
La IA debe consultarlo durante todo el proceso, no solo al comienzo.

La migración se considera completa cuando todos los comportamientos, registros, recursos, integraciones y
datos del mod original están inventariados, implementados o descartados con justificación explícita, y
validados en el entorno de destino. Un JAR que compila no equivale a un mod migrado.

Mapa de contenido












1. Decisiones de destino y hechos técnicos verificables
2. Reglas no negociables para el agente de IA
3. Inspección y reconstrucción del mod de 1.12.2
4. Java 8 a Java 17
5. Nuevo proyecto Forge 1.20.1 y toolchain
6. Cambios arquitectónicos de Forge y del motor de Minecraft
7. Guía por subsistema: bloques, ítems, entidades, GUI, red, mundo, renderizado, datos y recursos
8. Optimización, compatibilidad, pruebas y aceptación
9. Prompt maestro para iniciar el trabajo con la IA
10. Referencias oficiales y fuentes técnicas

ALCANCE  Se asume que el destino es Forge, no Fabric ni NeoForge. No se asume que exista el código
fuente original; la guía cubre tanto fuente disponible como reconstrucción desde JAR descompilado.

1. Destino técnico: decisiones que deben quedar fijadas

La versión objetivo no debe cambiarse durante el trabajo. Los tutoriales de “Minecraft moderno” no son
intercambiables entre 1.20.1, 1.20.5 y 1.21+: varias APIs, estructuras de datos y sistemas de registro cambiaron
después de 1.20.1.

Objetivo / decisión

Regla para el agente

Elemento

Minecraft

Loader

Java Edition 1.20.1

Minecraft Forge 47.x

Forge observado al preparar este
manual

47.4.29 Latest (8 nov 2026); 47.4.28
Recommended en la página oficial

Java

JDK/JVM 17, 64 bits

Toolchain

MDK oficial para Forge 1.20.1

Mappings

Mojang Official mappings como opción
base

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

2

No actualizar a 1.20.2+ ni 1.21+ durante
esta migración.

No introducir Fabric Loader, Quilt ni
NeoForge.

Elegir una versión exacta, fijarla y no
cambiarla silenciosamente. Para un
modpack, validar cuál usa el entorno
final.

Compilar y ejecutar con Java 17. No
dejar target/source 8 por inercia.

Crear proyecto limpio desde el MDK
exacto; conservar wrapper, Gradle y
configuración compatibles.

Usar una sola familia de mappings en
todo el proyecto; Parchment solo si se
decide y fija expresamente.

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

Elemento

Objetivo / decisión

Regla para el agente

Formato de recursos

Resource pack / data pack format 15

Datos de ItemStack

NBT/CompoundTag en 1.20.1

Usar el valor correspondiente a 1.20–
1.20.1; comprobar `pack.mcmeta`.

No migrar a Data Components de
1.20.5+; esa API no corresponde a este
target.

La página oficial de descargas de Forge mostraba, al 13-11-2026, 47.4.29 como Latest y 47.4.28 como
Recommended. La versión elegida debe quedar registrada en `gradle.properties`, el build y el informe final.
Una actualización de parche no debe mezclarse con cambios de código sin registrar el cambio.

RECOMENDACIÓN PRÁCTICA  Si no hay un motivo concreto para usar la última compilación, tomar la
versión Recommended que coincida con el modpack de destino. Si el proyecto necesita una corrección
presente solo en 47.4.29, fijar 47.4.29 y probarlo ahí. La página de Forge puede cambiar después de la
fecha de este manual.

2. Reglas obligatorias para la IA que hará la migración

2.1 No comenzar editando: primero producir evidencia

 No sobrescribir, renombrar ni eliminar el JAR, fuentes, recursos o configuración originales. Crear una

copia de trabajo y mantener un baseline inmutable.

 No asumir que el descompilador reconstruyó perfectamente el fuente. Los nombres sintéticos, métodos

bridge, lambdas, bloques estáticos y referencias obfuscadas pueden aparecer deformados.

 No generar una “conversión automática” de todo el árbol Java antes de inventariar sus responsabilidades.

Primero clasificar, luego migrar por subsistema.

 No inventar reemplazos de API. Verificar cada clase/método con el código y documentación de Forge

1.20.1, el MDK, fuentes de Forge y ejemplos de la misma versión.

 No dejar `TODO`, stubs vacíos, `return null`, métodos que no hacen nada, eventos sin registrar ni

funcionalidad comentada para “hacer que compile”.

 No eliminar una característica porque parezca obsoleta sin documentar su función y obtener un

reemplazo o declarar formalmente que no se puede preservar.

 No cambiar balance, recetas, probabilidades, alcance, daño, velocidades, rangos, temporizadores ni reglas

de gameplay salvo que sea inevitable y esté explicado.

2.2 Mantener una trazabilidad de cobertura

Cada elemento original debe tener un registro en una matriz de migración. La IA debe asignar un
identificador y enlazarlo con su implementación y prueba en el destino.

ID

SRC-001

REG-001

RES-001

Elemento original

Evidencia / función

Destino 1.20.1

Estado

Prueba

Clase / método /
archivo

Qué comportamiento
implementa

Clase/API nueva

Pendiente / Migrado /
No aplica

Test o caso de prueba

Bloque / item /
entidad

ID y propiedades
antiguas

DeferredRegister + ID
estable

Pendiente / Migrado /
No aplica

Carga/registro/uso

Modelo / textura /
lang

Ruta y objeto al que
pertenece

assets/...

Pendiente / Migrado /
No aplica

Inspección visual/log

DAT-001

Receta / loot / tag /

Comportamiento en

data/... / provider

Pendiente / Migrado /

Validación datapack

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

3

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

ID

Elemento original

Evidencia / función

Destino 1.20.1

Estado

Prueba

worldgen

servidor

No aplica

INT-001

API externa /
integración

Contrato y versión

API equivalente o
adaptación

Pendiente / Migrado /
Bloqueado

Prueba con
dependencia

Estados permitidos: PENDIENTE, EN ANÁLISIS, MIGRADO, VALIDADO, BLOQUEADO, NO APLICA (con
justificación). “Migrado” significa que existe código destino; “Validado” significa que el comportamiento se
probó. No confundir ambos estados.

2.3 Cambios atómicos y control de versiones










Usar Git o snapshots equivalentes desde el primer cambio. Crear commits pequeños por subsistema.
Antes de cambiar una API compartida, buscar todos sus usos. No reparar un solo error de compilación sin
revisar sus efectos colaterales.
Después de cada lote: compilar, revisar logs, ejecutar pruebas afectadas y actualizar la matriz de
cobertura.
Guardar la salida completa de Gradle, logs del cliente y del servidor, versiones de Java/Gradle/Forge y
hash SHA-256 del JAR final.
Cuando la evidencia no alcance para reconstruir una función, marcarla como incierta y explicar qué
archivo, log o prueba hace falta. No llenar los vacíos con conjeturas.

3. Fase cero: arqueología del mod original

3.1 Congelar e identificar el material

  ☐ Guardar el JAR original y calcular SHA-256.

  ☐ Guardar el `mods.toml` no existe en 1.12.2 como en 1.20.1; inspeccionar `mcmod.info`, manifiesto y

metadatos FML del JAR.

  ☐ Anotar `modid`, nombre visible, versión, autores, dependencias obligatorias/opcionales, versión exacta de

Minecraft y Forge.

  ☐ Guardar el árbol completo del JAR, recursos, archivos de configuración de ejemplo y cualquier librería

anidada.

  ☐ Identificar si el material es fuente original, bytecode obfuscado, JAR recompilado, fork o mezcla de

versiones.

  ☐ Intentar reproducir el mod en un entorno aislado de Minecraft 1.12.2, si todavía es posible, y registrar sus

comportamientos observables.

3.2 Descompilación: qué debe recuperar el agente

La descompilación es una fuente de evidencia, no una especificación perfecta. Usar al menos un
descompilador competente y contrastar con bytecode cuando haya estructuras ambiguas. Si existen mappings
MCP/Forge para el build original, aplicarlos para recuperar nombres útiles; conservar también la versión
desofuscada sin reinterpretar.







Paquetes y clases, jerarquías, interfaces, campos estáticos, constructores y métodos.
Anotaciones `@Mod`, `@SidedProxy`, `@SubscribeEvent`, `@NetworkCheckHandler`, `@CapabilityInject` y
anotaciones de mixins/coremods, si existen.
Eventos FML y Forge, buses, suscriptores registrados manualmente, orden de inicialización y callbacks.
Registros: bloques, ítems, entidades, tile entities, biomas, dimensiones, efectos, pociones, sonidos,
partículas, recetas, estructuras y generadores de mundo.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

4

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT












IDs antiguos, registry names, metadata, `ItemBlock`, `ItemStack`, tags NBT, nombres de traducción y
referencias cruzadas.
Paquetes de recursos: `assets`, texturas, modelos, blockstates, `lang`, sonidos, loot tables y datos JSON/NBT.
Acceso a red: `SimpleNetworkWrapper`, IMessage, discriminadores de paquetes, direcciones, `ByteBuf` y
handlers.
Persistencia: `NBTTagCompound`, `WorldSavedData`, `TileEntity`, capability providers, datos de jugadores
y entidades.
Código que depende de otros mods, APIs opcionales, reflection, Access Transformers, coremods, ASM o
acceso a miembros privados.
Código cliente: renderers, TESR, GUI, teclas, GL, sonido, partículas, modelos y recursos cargados
dinámicamente.

3.3 Análisis estático y búsquedas iniciales

La IA debe crear una tabla de símbolos y buscar las APIs heredadas de alto riesgo. Los nombres siguientes son
indicadores de revisión, no sustituciones automáticas:

Buscar en el código antiguo

Qué suele revelar / por qué importa

net.minecraft.util.math.BlockPos, World, IBlockState

Tipos y métodos cambiaron; revisar coordenadas, estados, lado
lógico y chunks.

GameRegistry, RegistryEvent, setRegistryName, @ObjectHolder

Registros y ciclo de vida; adaptar a
DeferredRegister/RegistryObject.

FMLPreInitializationEvent, FMLInitializationEvent,
FMLPostInitializationEvent

Fases eliminadas; reconstruir el orden correcto en buses y
eventos.

TileEntity, TileEntitySpecialRenderer, Container, GuiContainer

BlockEntity, BER, Menu y Screen.

EntityRegistry, EntityEntry, RenderingRegistry

EntityType, atributos, spawn placement y registro de render.

SimpleNetworkWrapper, IMessage, ByteBuf

SimpleChannel, mensajes, FriendlyByteBuf y contexto de red.

WorldGenerator, IWorldGenerator, BiomeDecorator

Worldgen data-driven, features, placement y biome modifiers.

IRecipe, GameRegistry.addRecipe, OreDictionary

JSON recipe system, serializers y tags.

GlStateManager, GL11, Tessellator, VertexBuffer

ModelLoader.setCustomModelResourceLocation,
ItemMeshDefinition, StateMapper

net.minecraftforge.fml.common.Mod

Render pipeline moderno, PoseStack, VertexConsumer,
MultiBufferSource.

Sistema de assets/modelos y baked models distinto.

Punto de entrada sigue siendo @Mod pero cambia el arranque y la
configuración.

javax.annotation, sun.*, com.sun.*, reflection sobre JDK

Compatibilidad con Java 17 y encapsulación fuerte.

Class.forName, setAccessible, ASM, LaunchWrapper,
IFMLLoadingPlugin

Código sensible a mappings, classloading y transformación de
bytecode.

3.4 Crear un catálogo de características antes del port

No limitarse a enumerar clases. Una característica puede estar distribuida en veinte archivos. Describirla
desde el punto de vista del jugador/servidor: qué la activa, qué estado modifica, qué consume, qué produce,
qué se sincroniza y qué se guarda.

  ☐ Bloques e ítems: nombres, variantes, propiedades, recetas, drops, durabilidad, stack size, tooltips, efectos

al usar.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

5

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

  ☐ Entidades: atributos, IA, spawn, daño, movimiento, drops, persistencia, reproducción, renderer y

animaciones.

  ☐ Máquinas: inventario, slots, energía/fluido, procesos, tiempos, filtros, sided access, GUI, automatización y

sincronización.

  ☐ Generación: dimensión, bioma, estructuras, minerales, densidad, alturas, distribución, frecuencia y

condiciones.

  ☐ Interfaz: pantallas, botones, hotkeys, overlays, HUD, mensajes y traducciones.

  ☐ Gameplay: eventos de jugador, combate, progresión, efectos, reglas, cooldowns, comandos y

compatibilidad multijugador.

  ☐ Integraciones: mods requeridos/opcionales, versiones, compatibilidad condicional y fallback.

4. Java: pasar de Java 8 a Java 17 sin romper el comportamiento

Minecraft 1.12.2 pertenece al ecosistema Java 8. Minecraft 1.20.1/Forge requiere Java 17. Java 17 puede
ejecutar bytecode antiguo en muchos casos, pero eso no significa que un proyecto antiguo de ForgeGradle, sus
dependencias o sus APIs internas sigan siendo válidos. La IA debe modernizar el entorno de construcción y
revisar incompatibilidades de plataforma, no reescribir cada línea solo para usar sintaxis nueva.

4.1 Cambios del lenguaje disponibles

Característica desde Java 9 a 17

Uso recomendado

Precaución

var (Java 10)

Variables locales con tipo evidente.

No usar cuando oculta tipos complejos de
Minecraft o APIs públicas.

Switch expressions (Java 14)

Expresiones compactas que devuelven un
valor.

No convertir un switch solo por estética;
mantener casos exhaustivos.

Text blocks (Java 15)

JSON, SNBT o mensajes multilínea.

Cuidar indentación y escapes.

Records (Java 16)

Objetos inmutables simples para
datos/paquetes.

Pattern matching instanceof (Java 16)

Reducir casts redundantes.

No sirven como reemplazo universal de
entidades mutables ni de clases que deben
extender clases base.

Mantener compatibilidad con lógica y
nullability existente.

Sealed classes (Java 17)

Jerarquías cerradas cuando aporten valor.

No necesarias para una migración de mod.

Pattern matching switch

No usar por defecto.

En Java 17 era preview; no depender de
flags preview del runtime de Minecraft.

4.2 Compatibilidad de plataforma y bibliotecas







Configurar el toolchain del proyecto para JDK 17 y compilar con release 17. El bytecode Java 17 usa class-
file major version 61.
Buscar uso de APIs internas del JDK (`sun.*`, `com.sun.*`, `sun.misc.Unsafe`) y reflexión profunda sobre
clases internas. Java 9+ reforzó la encapsulación; no solucionar con una lista indiscriminada de `--add-
opens`.
Comprobar dependencias que antes venían incluidas en el JDK o en Forge antiguo. Por ejemplo, JAXB ya
no forma parte del JDK moderno estándar; si el mod lo usa, agregar una dependencia compatible o
reemplazar esa función.

 No asumir que una librería compilada para Java 8 está rota: puede ser compatible. Comprobar bytecode,

dependencias transitivas, reflexión y soporte real en Java 17.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

6

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

 No cambiar de forma global la semántica de igualdad, orden, concurrencia, números o serialización al



modernizar utilidades propias.
Evitar API obsoletas y bibliotecas sin mantenimiento si hay sustituto probado, pero no introducir
dependencias extra sin necesidad.

4.3 Qué debe revisar el agente en el código Java

  ☐ Generics sin tipos crudos y casts sospechosos reconstruidos por el decompilador.

  ☐ Callbacks, lambdas y métodos puente para que no cambien orden ni captura de estado.

  ☐ Colecciones mutables compartidas entre hilos y estados estáticos globales.

  ☐ Excepciones absorbidas o bloques catch vacíos.

  ☐ Comparaciones `==` usadas para objetos en lugar de igualdad semántica, o viceversa.

  ☐ Concurrencia: `Thread`, `Executor`, sincronización y acceso a mundo/juego fuera del hilo correcto.

  ☐ Codificación de archivos, JSON/NBT, rutas y serialización binaria.

  ☐ Reflexión y carga dinámica de clases; validar con Java 17 y runtime Forge, no solo con tests unitarios

aislados.

NO ES NECESARIO  Transformar todo el código a records, streams, var o switch expressions. Un método
Java 8 claro puede ser perfectamente válido en Java 17. La prioridad es compatibilidad, seguridad de tipos
y comportamiento, no modernizar por decoración.

5. Crear el proyecto objetivo desde cero

5.1 No reutilizar el build de 1.12.2

La estructura y los plugins de construcción de 1.12.2 pertenecen a una generación vieja de
Gradle/ForgeGradle. No copiar `build.gradle`, `settings.gradle`, `gradle-wrapper.properties`, scripts de eclipse
ni configuraciones de mappings del proyecto antiguo al destino. Crear un workspace nuevo desde el MDK
exacto de Forge 1.20.1 y migrar solo código, recursos y configuraciones que se hayan revisado.

  ☐ Instalar JDK 17 de 64 bits y confirmar `java -version` y `javac -version`.

  ☐ Descargar el MDK de la versión Forge exacta seleccionada.

  ☐ Extraerlo en un directorio vacío y ejecutar la configuración Gradle inicial antes de introducir código viejo.

  ☐ Comprobar que `runClient`, `runServer`, `runData` y `build` funcionan con el mod de ejemplo.

  ☐ Fijar `minecraft_version=1.20.1`, `forge_version=47.4.xx` y el plugin/wrapper incluidos en el MDK elegido.

  ☐ Configurar mappings official de Mojang y no mezclar llamadas MCP antiguas con nombres de mappings

distintos.

  ☐ Actualizar el mod ID solo si hay un motivo. Mantenerlo y mantener los registry names siempre que sea

posible para preservar referencias y saves.

5.2 Configuración de referencia

La configuración exacta debe copiarse del MDK descargado, no de un tutorial de otra versión. El siguiente
fragmento expresa la intención y no pretende reemplazar el build completo del MDK:

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

7

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

// Fragmento conceptual: conservar la sintaxis y plugins exactos del MDK elegido.

plugins {

    id 'java'

    id 'net.minecraftforge.gradle' version '<versión incluida/recomendada por el MDK>'

}

java {

    toolchain.languageVersion = JavaLanguageVersion.of(17)

}

minecraft {

    mappings channel: 'official', version: '1.20.1'

}

// La dependencia Forge debe fijarse a la versión 1.20.1-47.4.xx elegida.

El MDK es la fuente de verdad para la versión de ForgeGradle, Gradle wrapper, repositorios, configuraciones
de ejecución y dependencias. No inventar una combinación de plugin/wrapper basada en la que usaba el mod
antiguo. La documentación oficial de Forge especifica el MDK, la configuración del workspace y las tareas de
ejecución.

5.3 Archivos de entrada y empaquetado

Archivo / carpeta

Responsabilidad en 1.20.1

Qué comprobar

src/main/java

Código Java.

src/main/resources/META-INF/mods.toml

Metadatos y dependencias del mod Forge.

Paquetes únicos, separación
client/common/data, clase @Mod.

modId, versión, loaderVersion,
dependencias y rango Minecraft/Forge.

src/main/resources/pack.mcmeta

Metadatos del pack.

Formato correcto para 1.20.1; formato 15.

src/main/resources/assets/<modid>/

Recursos del cliente.

src/main/resources/data/<modid>/

Datos del servidor/datapack.

modelos, blockstates, texturas, lang,
sonidos.

recetas, tags, loot tables, advancements y
worldgen.

gradle/, gradlew, gradlew.bat

Toolchain reproducible.

No sustituir por wrapper viejo.

build.gradle / gradle.properties /
settings.gradle

Build y versiones.

No dejar referencias a 1.12.2, MCP o
dependencias antiguas sin uso.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

8

5.4 Estructura Java sugerida

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

com.example.<modid>

  <ModMain>.java

  registry/

    ModBlocks.java

    ModItems.java

    ModBlockEntities.java

    ModEntities.java

    ModMenus.java

    ModSounds.java

    ModParticles.java

  block/

  item/

  blockentity/

  entity/

  menu/

  network/

  capability/

  config/

  event/

  worldgen/

  data/

  client/             // renderers, screens, key mappings, client events

  integration/        // adapters separados por mod externo

La documentación Forge recomienda un paquete raíz único y separar el código cliente para impedir que un
servidor dedicado intente cargar clases gráficas. Organizar por dominio o por funcionalidad es válido, pero
elegir una convención y usarla siempre.

6. Cambios de arquitectura Minecraft/Forge que afectan a casi
todo

6.1 El aplanamiento de 1.13: IDs y metadata

Este es el corte más importante de 1.12.2 a 1.20.1. En 1.13 se eliminaron los IDs numéricos de bloques/ítems
como identificador principal y la metadata general. El contenido se representa con identificadores
namespaced (`modid:nombre`), blockstates y datos de ítem. Muchos bloques e ítems vanilla se dividieron o
renombraron; también cambiaron partículas, entidades, sonidos, loot, recetas, modelos y traducciones.

Patrón 1.12.2

Block ID + meta

Modelo 1.20.1

Acción de migración

Registry key + BlockState properties

Item ID + damage/meta como variante

Registry key propio por variante

Meta que codifica

BlockState properties con valores tipados

Definir propiedades y lógica de

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

9

Separar variantes que deban ser objetos
distintos; dejar como propiedad solo el
estado intrínseco del bloque.

Registrar IDs distintos para variantes
finitas; usar daño para durabilidad real.

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

Patrón 1.12.2

Modelo 1.20.1

Acción de migración

rotación/parte/conexiones

IBlockState / getStateFromMeta /
getMetaFromState

BlockState

OreDictionary

Tags de bloques e ítems

Registro por integer ID

ResourceLocation y registro tipado

placement/neighbor updates.

Eliminar la serialización por meta e
implementar persistencia moderna.

Crear tags propios y adoptar tags
Forge/vanilla existentes.

Usar IDs estables y únicos:
`mymod:steel_gear`.

Modelos por metadata /
ItemMeshDefinition

Model JSON + overrides o baked model

Reconstruir mapping de estados y modelos.

lang key tile.foo.name / item.foo.name

block.modid.foo / item.modid.foo en JSON

Regenerar traducciones y verificar el key
real del registro.

DECISIÓN DE DISEÑO  Si una variante antigua era un ítem que el jugador podía llevar/crear/craftear por
separado, normalmente merece un registry ID propio en la versión nueva. No esconder decenas de
variantes discretas dentro de un NBT custom solo para preservar un “god item” antiguo: eso empeora
compatibilidad con recetas, tags, búsqueda, red y otros mods.

6.2 Los IDs de registro pasan a ser parte del contrato de guardado

Conservar `modid` y nombres de registro es una de las medidas más útiles para salvar mundos. No cambiar
nombres por estética. Si una entrada se renombra, revisar `MissingMappingsEvent` y probar el remapeo. Sin
embargo, un remapeo de registry key no resuelve automáticamente la conversión de una única entrada
antigua con metadata en varias entradas nuevas. Esa conversión puede requerir un DataFixer o una
herramienta de migración separada.

`MissingMappingsEvent` puede remapear una entrada ausente a otra entrada existente de la misma registry.
Es útil para renombres simples, no es una varita mágica que convierta todos los NBT históricos o que divida
stacks de meta en varias identidades.

6.3 Ciclo de vida y buses de eventos

Forge 1.12.2

Forge 1.20.1

Consecuencia

@Mod.EventHandler: preInit / init / postInit

Eventos de lifecycle en mod event bus

Distribuir tareas por responsabilidad real:
registros, setup, config, client setup, data
generation.

RegistryEvent.Register y registro clásico

DeferredRegister recomendado o
RegisterEvent

Registrar objetos antes de que el juego los
necesite.

FMLCommonHandler / event bus antiguo

MinecraftForge.EVENT_BUS + mod event
bus

Distinguir eventos de gameplay de eventos
de carga/registro.

Inicialización mayormente secuencial

Varios eventos de lifecycle pueden
ejecutarse en paralelo

No asumir orden entre mods ni tocar
estado global sin sincronización.

Registrar/cargar objetos durante fases
antiguas

Registrar con DeferredRegister y usar
`enqueueWork` cuando corresponda

No realizar llamadas inseguras al mundo o
a otros mods durante fase paralela.

Regla práctica: el mod event bus se utiliza para registros y eventos de lifecycle propios del mod;
`MinecraftForge.EVENT_BUS` se utiliza para eventos generales del juego/Forge. Revisar el bus esperado en

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

10

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

cada evento. Si el evento se dispara durante `ParallelDispatchEvent`, usar `enqueueWork` para el trabajo que
debe ejecutarse en el hilo principal correspondiente.

6.4 Lados físicos y lógicos

No confundir cliente físico con servidor lógico. En un mundo de un jugador ambos viven en el mismo proceso,
lo que puede ocultar errores de sincronización. En un servidor dedicado no existen las clases de
renderizado/GUI cliente. Mantener la lógica autoritativa en el servidor y enviar al cliente solo los datos que
necesita mostrar.



Separar clases `client` del código común; no importar `Minecraft`, `Screen`, renderer o clases de cliente
desde código común que se cargue en servidor.

 No usar campos `static` compartidos como mecanismo de sincronización entre cliente y servidor lógico.
 No asumir que `world` o `level` en el cliente contiene el estado autoritativo. Toda acción importante debe

validarse en servidor.
Para enviar datos entre lados, usar paquetes de red y sincronización controlada.



7. Migración por subsistema

7.1 Registros: bloques, ítems y demás objetos

En Forge 1.20.1 los objetos registrables tienen una registry específica y se identifican con `ResourceLocation`.
`DeferredRegister` es el método recomendado. Crear clases de registro por dominio, declarar cada objeto
como `RegistryObject<T>` y adjuntar los deferred registers al mod event bus desde el constructor principal.

// ModBlocks.java

public final class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =

        DeferredRegister.create(ForgeRegistries.BLOCKS, MyMod.MOD_ID);

    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register(

        "steel_block",

        () -> new Block(BlockBehaviour.Properties.of()

            .mapColor(MapColor.METAL)

            .strength(4.0F, 6.0F))

    );

}

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

11

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

// ModItems.java

public final class ModItems {

    public static final DeferredRegister<Item> ITEMS =

        DeferredRegister.create(ForgeRegistries.ITEMS, MyMod.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register(

        "steel_ingot", () -> new Item(new Item.Properties())

    );

    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register(

        "steel_block", () -> new BlockItem(ModBlocks.STEEL_BLOCK.get(), new Item.Properties())

    );

}

El ejemplo es ilustrativo: debe adaptarse a propiedades, clases y dependencias reales. El `Block` y el
`BlockItem` son registros separados; registrar el bloque no crea automáticamente un ítem inventariable.
Evitar llamar `.get()` a `RegistryObject` durante inicialización estática prematura; usar suppliers y resolver
dependencias cuando el registro ya esté disponible.

Otros registros habituales que el inventario debe cubrir: EntityType, BlockEntityType, MenuType,
SoundEvent, ParticleType, MobEffect, Enchantment, RecipeSerializer/RecipeType, CreativeModeTab, registros
personalizados y datadriven registries.

7.2 Bloques y BlockStates

`IBlockState` pasa a `BlockState`. En 1.20.1 las propiedades son tipadas (`BooleanProperty`, `DirectionProperty`,
`IntegerProperty`, `EnumProperty`, etc.) y forman parte del estado del bloque. Diseñar con cuidado: cada
combinación posible puede multiplicar estados registrados, por lo que no crear miles de propiedades de alta
cardinalidad para representar datos arbitrarios.

Responsabilidad antigua

Destino / revisión

createBlockState / setDefaultState

StateDefinition y defaultBlockState; declarar las propiedades una
sola vez.

getStateFromMeta / getMetaFromState

Eliminar; no existe la metadata general de 1.12.

getActualState

onBlockPlacedBy / onBlockActivated

neighborChanged / updateTick

isOpaqueCube / isFullCube / getCollisionBoundingBox

Block.Material

Convertir a estado real cuando deba persistir; usar estado
derivado solo para lo visual cuando corresponda.

Revisar `setPlacedBy` y `use` con la firma exacta de 1.20.1; no
copiar `useWithoutItem` de versiones posteriores.

Revisar `neighborChanged`, `tick`, `randomTick`, `scheduled tick` y
actualizaciones de shape/estado.

Reimplementar con `VoxelShape`, `getShape`, `getCollisionShape`,
propiedades de render/occlusion y soporte de pathfinding
apropiado.

Usar `BlockBehaviour.Properties` y las propiedades concretas del
material/comportamiento; el antiguo sistema Material fue retirado
en 1.20.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

12

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

La IA debe revisar cada bloque de forma funcional: colocación, orientación, colisión, selección, luz, redstone,
agua, sonido, drops, herramienta requerida, resistencia, explosiones, soporte, update de vecinos y
comportamiento al reemplazarse.

7.3 Ítems, variantes, ItemStack y creative tabs

`ItemStack` sigue usando `CompoundTag`/NBT en 1.20.1. No aplicar la API de Data Components que aparece en
versiones posteriores a 1.20.5. La información persistente de un ítem debe estar claramente separada:
durabilidad real, tags del objeto, capability y metadatos del mod.












Crear registros distintos para variantes discretas que tengan identidad propia, receta o aparición
separada.
Usar daño del stack para durabilidad, no como depósito genérico de variantes.
Usar tags (`TagKey`) para grupos interoperables de ítems y bloques; no reemplazar un simple tag con un
NBT custom.
Revisar `Item.Properties` para stack size, durabilidad, reparación, remainder, características requeridas y
comportamiento.
Las creative tabs modernas se registran como `CreativeModeTab`; agregar entradas con
`BuildCreativeModeTabContentsEvent` según el diseño del mod.
Las propiedades de modelo de ítem y overrides se registran del lado cliente durante client setup.

7.4 Recetas, loot tables, advancements y tags

El sistema de recetas es data-driven. Las recetas normales deben migrarse a JSON en `data/<modid>/recipes/`.
Para recetas con lógica nueva, registrar `RecipeType` y `RecipeSerializer` y definir serialización,
codec/deserialización y sincronización cliente-servidor. No recrear cada receta simple como un listener
artesanal si vanilla puede resolverla con JSON.

1.12.2

1.20.1

GameRegistry.addRecipe / IRecipe

JSON recipe en data/<modid>/recipes; custom serializer para lógica
no vanilla.

OreDictionary.getOres("ingotCopper")

Tags de ítems, preferiblemente tags Forge interoperables.

Drops definidos principalmente en Block#getDrops

Loot tables JSON en data/<modid>/loot_tables/; loot
conditions/functions según caso.

Advancement API antigua

JSON en data/<modid>/advancements/.

Sin tags modernos / listas propias

data/<namespace>/tags/blocks, items, entity_types, fluids, etc.
según registry.

Separar tags de bloques y de ítems cuando la función difiera. Una receta vanilla consume ítems, no estados de
bloque en el mundo. Reutilizar tags Forge estándar cuando existan (`forge:ingots/...`, `forge:ores/...`, etc.) para
que otros mods puedan interoperar. Añadir `replace` solo cuando realmente se quiera reemplazar el conjunto
completo del tag.

7.5 TileEntity → BlockEntity; inventarios y máquinas

Las antiguas TileEntity pasan a `BlockEntity`, y el tipo registrable pasa a `BlockEntityType`. La clase puede
almacenar datos dinámicos, ejecutar ticks y soportar renderizado. No usar una BlockEntity para todo: solo
para estado que realmente necesita almacenamiento dinámico o lógica por instancia.



Construir y registrar `BlockEntityType` con el bloque asociado; implementar constructor moderno y
persistencia NBT.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

13

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

 Migrar inventarios a `Container`/`IItemHandler` de acuerdo con las necesidades. Las capabilities Forge

(`IItemHandler`, `IFluidHandler`, `IEnergyStorage`) ofrecen interoperabilidad con pipes, máquinas y otros
mods.
Usar `setChanged()` cuando cambien datos persistentes. Verificar que los cambios de estado del bloque se
notifiquen correctamente.
Implementar `getUpdateTag` / `handleUpdateTag` o paquetes puntuales cuando realmente sea necesario
sincronizar la información visual. No enviar inventarios completos o NBT entero en cada tick.
Invalidar `LazyOptional` al terminar el ciclo de vida de una capability propia; no dejar referencias válidas
a una BlockEntity destruida.
Evitar escanear cientos de bloques cada tick; usar ticks programados, eventos, caches que se invalidan y
actualizaciones por cambio.









7.6 Contenedores y GUIs: Container → Menu; GuiContainer → Screen

La GUI se separa entre lógica de servidor y presentación cliente. Crear `MenuType` y clase derivada de
`AbstractContainerMenu`; la pantalla es una `Screen` o `AbstractContainerScreen`. Abrirla desde el servidor
con el mecanismo de menú moderno. El servidor mantiene autoridad sobre inventario y resultados.







Usar `Slot` para ItemStacks y `DataSlot` para valores enteros pequeños que necesitan sincronización
automática.
Para valores complejos, usar paquetes específicos, con validación de jugador, menú abierto, posición y
permisos.
Implementar `stillValid` y comprobar que el jugador está realmente dentro del alcance y que el
bloque/entidad sigue siendo válido.

 Migrar botones y acciones de cliente a paquetes de intención. El cliente no debe escribir directamente el



estado del inventario/maquinaria del servidor.
Probar shift-click, drag, stack limits, slots bloqueados, desconexión, cerrar/abrir menú y sincronización
con lag.

7.7 Entidades

Migrar `EntityRegistry`/`EntityEntry` al registro de `EntityType` mediante `DeferredRegister`. Revisar por
separado atributos, spawn placement, goals, renderer, modelos, texturas, sonidos, datos sincronizados, spawn
data, persistencia y loot.

  ☐ Cada entidad tiene `EntityType` con tamaño, tracking range, update interval y clasificación correctos.

  ☐ Las entidades vivas registran atributos mediante el evento correspondiente

(`EntityAttributeCreationEvent`).

  ☐ Las reglas de aparición se reconstruyen con `SpawnPlacements`/evento de registro y condiciones de bioma,

luz, superficie, grupo y dificultad.

  ☐ La IA conserva prioridades de goals, mutex/control, memoria, distancias, cooldowns y comportamiento

nocturno/día.

  ☐ Los datos que necesitan los clientes se exponen mediante `SynchedEntityData` o paquetes; no compartir

referencias Java entre lados.

  ☐ Los renderers y layer definitions se registran en eventos cliente en una clase aislada de `client`.

  ☐ Los valores de tracking y sincronización se ajustan a la frecuencia real de actualización, evitando tráfico

por cada tick cuando no aporta nada.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

14

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

7.8 Networking: SimpleNetworkWrapper → SimpleChannel

El sistema habitual de 1.12.2, `SimpleNetworkWrapper` + `IMessage`, se reemplaza en Forge 1.20.1 por
SimpleImpl basado en `SimpleChannel`. Cada mensaje debe tener ID único en su canal, encoder, decoder y
handler. Diseñar el protocolo con versión y dirección clara.

private static final String PROTOCOL = "1";

public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(

    new ResourceLocation(MyMod.MOD_ID, "main"),

    () -> PROTOCOL,

    PROTOCOL::equals,

    PROTOCOL::equals

);

// Registrar cada paquete con un discriminator único:

// CHANNEL.registerMessage(id++, MiMensaje.class, encoder, decoder, handler);

// Dentro del handler, validar y ejecutar en el hilo del lado correspondiente:

// NetworkEvent.Context ctx = supplier.get();

// ctx.enqueueWork(() -> { /* lógica validada */ });

// ctx.setPacketHandled(true);

Los detalles concretos deben seguir la documentación SimpleImpl de Forge 1.20.1. No copiar firmas `ByteBuf`
antiguas: el buffer usado por SimpleImpl moderno es `FriendlyByteBuf`. Cada paquete debe tener límites de
tamaño, datos serializados en orden determinista y handler seguro.

Revisión obligatoria

Validar remitente

Validar estado y permisos

Ejemplo de riesgo

No confiar en coordenadas o IDs enviados por cualquier cliente.

No permitir cambiar un bloque/máquina que el jugador no puede
usar.

Validar distancia y chunk cargado

No forzar carga de chunks por solicitudes de paquetes.

Validar valores

Ejecutar en hilo correcto

Controlar frecuencia

Separar dirección

Rechazar números fuera de rango, listas enormes, enum inválido y
NBT excesivo.

No modificar Level/Entity/BlockEntity directamente desde el hilo
Netty.

No permitir que un cliente envíe decenas de miles de mensajes por
segundo.

No aceptar del cliente mensajes que solo deberían emitir el
servidor.

7.9 Capabilities y energía/fluidos/inventarios

Las capabilities son una arquitectura flexible de Forge para exponer capacidades por objeto sin obligar a
extender una clase específica. Forge ofrece capabilities estándar como `IItemHandler`, `IFluidHandler` e
`IEnergyStorage`. Se pueden exponer en BlockEntity, Entity, ItemStack, Level y LevelChunk, según el caso.




Registrar capability propia en la fase apropiada y definir una interfaz estable.
Exponerla con `getCapability` o evento de attachment según el proveedor.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

15

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT






Usar `LazyOptional` y completar la invalidación del ciclo de vida.
Serializar solo los datos propios necesarios; definir qué pasa al clonar jugador, morir, cambiar dimensión
o destruir el proveedor.
Para Forge Energy, usar la API estándar si el comportamiento antiguo es realmente energía compatible;
para sistemas externos, escribir adapters por dependencia.

7.10 Worldgen: generación antigua → worldgen data-driven

El subsistema de generación cambió drásticamente desde 1.12.2 y volvió a cambiar en 1.18 con la nueva
arquitectura de terreno y height range. No trasladar un `IWorldGenerator` como un evento por chunk que
haga el mismo trabajo sin revisar. La generación moderna usa registries dinámicos, features
configuradas/colocadas, placement modifiers, biome modifiers y datos JSON; la creación programática
requiere bootstrap/codec según el tipo.

Concepto antiguo

Concepto objetivo aproximado

Qué se debe recuperar

IWorldGenerator / generate(World, Random,
BlockPos)

ConfiguredFeature + PlacedFeature + biome
modifier o estructura

Qué se genera, en qué fase,
dimensiones/biomas, probabilidad, altura,
cantidad, separación.

WorldGenMinable / mineral vein

OreConfiguration + Feature.ORE y placement
moderno

Tamaño de veta, rango vertical, distribución,
biomas y reemplazo válido.

BiomeDecorator / listas de generación

Biome modifier / configuración data-driven

Orden/fase y compatibilidad con otras
modificaciones de bioma.

Dimensiones / biomas / estructuras registradas
en código

Registries dinámicos y JSON con keys/codec;
estructuras y world preset cuando aplique

IDs, referencias, reglas de carga, datapack y
mundo nuevo versus mundo existente.

Random global o llamada directa durante
chunk generation

Random/Worldgen context seeded, código
puro y determinista

Reproducibilidad, concurrencia, no modificar
estado externo ni leer chunks arbitrarios.

La generación puede ejecutarse de manera concurrente. La función debe ser determinista a partir del
contexto/seed recibido y no depender de variables globales mutables, hora real, estado cliente, generadores
compartidos o side effects fuera del chunk bajo control. No forzar la carga de chunks vecinos sin una razón y
una estrategia segura.

7.11 Recursos, modelos, blockstates, texturas y traducciones

Desde la separación entre assets y data, el cliente y el servidor consumen recursos distintos. En 1.20.1 la
documentación Forge organiza los recursos bajo `src/main/resources/assets/<namespace>/...` y
`data/<namespace>/...`. Las rutas y nombres deben ser lowercase y snake_case. Para IDs dinámicos en código,
usar la API que realmente existe en 1.20.1 (por ejemplo, `new ResourceLocation(namespace, path)`); no
importar helpers como `ResourceLocation.fromNamespaceAndPath` desde tutoriales de versiones posteriores.

Recurso 1.12.2

Destino en 1.20.1

Revisión

assets/<modid>/textures/blocks/

assets/<modid>/textures/block/

`blocks` cambia a singular `block`.

assets/<modid>/textures/items/

assets/<modid>/textures/item/

`items` cambia a singular `item`.

assets/<modid>/lang/en_us.lang

assets/<modid>/lang/en_us.json

Convertir `key=value` en objeto JSON válido.

assets/<modid>/models/item/*.json

assets/<modid>/models/item/*.json

Verificar parent, texture paths, overrides y
nombre de registro.

blockstates JSON con metadata/variants
antiguos

assets/<modid>/blockstates/*.json

Reescribir variantes usando las propiedades
reales del BlockState moderno.

model references con rutas implícitas antiguas

paths nuevos explícitos bajo models/

No asumir que el subdirectorio `block` se
agrega solo.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

16

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

Recurso 1.12.2

Destino en 1.20.1

Revisión

recipes/loot/advancements mezclados en
assets

data/<modid>/recipes, loot_tables,
advancements

Mover lógica de servidor a `data`.

sound list hardcodeada / recursos antiguos

sounds.json + sound events registrados

Verificar ids, rutas, categorías, atenuación y
streaming.

No basta con mover archivos. Comprobar que los nombres de registro crean la ruta esperada, que los JSON
son válidos, que no hay referencias a texturas inexistentes y que los modelos de bloque/ítem apuntan a los
recursos adecuados. Correr `runData` para detectar recursos declarados por el código que faltan.

7.12 Renderizado, modelos y efectos visuales

El pipeline de renderizado de Minecraft moderno no es el renderizado fijo antiguo. LWJGL pasó a 3.x y el
código debe trabajar con abstracciones de render apropiadas. Sustituir llamadas directas al antiguo
Tessellator/GL11/GlStateManager por las APIs de la versión destino, no por una equivalencia mecánica.

Antiguo 1.12.2

Destino / estrategia 1.20.1

TileEntitySpecialRenderer

BlockEntityRenderer (BER), registrado del lado cliente.

RenderLiving / Render<Entity> antiguos

GlStateManager / GL11 / begin-end inmediato

Tessellator / BufferBuilder antiguos

ModelLoader / ItemMeshDefinition / StateMapper

EntityRenderer y modelo/ModelLayer modernos; registro en
evento cliente.

PoseStack, MultiBufferSource, VertexConsumer, RenderType y
RenderSystem donde aplique.

BufferBuilder y consumidores del pipeline moderno; comprobar
ownership y flush.

Blockstate/model JSON, ItemProperties, ModelBakeEvent/baked
models cuando la lógica lo necesite.

GLFW no usado / Keyboard.KEY_*

GLFW key codes y `KeyMapping` registrado en client setup.

ParticleFactoryRegistry antiguo

ParticleType registrado y ParticleProvider/factory cliente
moderno.

Optimización visual: no crear buffers o recursos GPU a cada frame; no reconstruir matrices/modelos si no
cambian; no emitir geometría invisible; respetar RenderType y transparencia; no hacer IO, raycasts extensos
ni consultas pesadas al mundo dentro del render callback. El renderizador debe consumir un snapshot seguro
de estado sincronizado.

7.13 Comandos, teclas, partículas y sonido











Los comandos usan Brigadier: construir árboles de comandos con argumentos tipados, permisos y
sugerencias; no parsear manualmente strings como en 1.12.
Las teclas usan `KeyMapping`, registradas del lado cliente; la acción de gameplay resultante se envía al
servidor con un paquete validado.
Los sonidos usan `SoundEvent` registrado y `sounds.json`; comprobar los archivos .ogg, categorías,
pitch/volume y si el sonido debe ser posicional.
Las partículas requieren registrar el tipo lógico y la fábrica/proveedor de render cliente, además de
serialización de datos adicionales si el particle type lleva parámetros.
Probar los recursos con idiomas no ingleses, reconfiguración de teclas y servidor dedicado.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

17

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

7.14 Configuración

Forge moderno usa `ForgeConfigSpec` y archivos TOML, con tipos CLIENT, COMMON y SERVER. Convertir
config vieja sin cambiar silenciosamente unidades, rangos, defaults o semántica. Documentar las opciones
obsoletas y considerar migración de configuración si el nombre o formato cambia.






CLIENT: presentación y preferencias locales.
COMMON: opciones no sincronizadas que deben estar disponibles en ambos lados.
SERVER: reglas por mundo/servidor, sincronizadas como corresponda.
Validar rangos, listas y comentarios; manejar eventos de load/reload y recalcular caches cuando cambie el
valor.

 No leer el archivo en cada tick; mantener valores ya cargados y reaccionar a eventos de configuración.

7.15 Persistencia y mundos guardados

Separar los tipos de datos: datos de instancia de bloque
propios de entidad/capability/NBT según contrato; datos de dimensión o mundo
Level; configuración de servidor

 SavedData/capabilities de
 SERVER config. Llamar `setDirty()` en SavedData después de mutaciones.

 BlockEntity; datos de jugador/entidad

→

 datos

→

→

→

No afirmar que una partida modificada de 1.12.2 se abrirá sin pérdida en 1.20.1. Minecraft y Forge tienen
mecanismos de DataFixer/registry remapping para ciertos casos, pero los datos personalizados del mod y las
variantes basadas en metadata pueden necesitar conversión explícita. Crear copias de mundo, abrir primero
una copia, revisar el log de registros faltantes y validar inventarios, bloques colocados, entidades y máquinas.
Nunca ensayar sobre el único save.

7.16 Compatibilidad con otros mods y mixins/coremods

Crear una lista separada para cada dependencia: nombre, mod ID, versión antigua, API consumida, versión
1.20.1 disponible, versión mínima, si es obligatoria y qué ocurre si falta. No agregar dependencias solo para
compilar. Usar integración condicional y reflection controlada solo cuando sea necesaria y probada.





Coremods/IFMLLoadingPlugin/LaunchWrapper/ASM antiguos requieren un rediseño profundo; no
asumir que se pueden copiar.
Access Transformers deben portarse a la sintaxis y nombres del entorno destino y probarse contra
mappings/build exactos.

 Mixins deben tener configuraciones, refmaps, target names y compatibilidad Forge 1.20.1 adecuados. No



introducir Mixin para reemplazar una API pública existente.
Para cada dependencia opcional: prueba con dependencia presente y ausente; el mod base debe arrancar
sin ella si así era el contrato original.

8. Optimización: hacerlo mejor sin alterar la jugabilidad

La optimización debe ocurrir después de recuperar la equivalencia funcional. Primero medir, luego corregir.
La IA debe separar los cambios de migración obligatorios de los cambios de rendimiento para que cualquier
regresión pueda rastrearse.

8.1 CPU y ticks




Evitar loops en `tick` que recorren todo un chunk, radio grande o lista global sin caché.
Preferir eventos de cambio, scheduled ticks, índices, listas de trabajo o caches invalidables en lugar de
polling constante.

 No consultar bloques o BlockEntities de chunks no cargados. Comprobar `Level#hasChunkAt` antes de

acceder cuando la operación no deba forzar carga.
Usar estructuras eficientes y evitar crear objetos temporales masivos en el tick/render loop.



Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

18

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

 No ejecutar escaneo, IO, cálculo pesado o serialización grande en hilo principal si puede delegarse de

forma segura; nunca acceder al mundo desde un hilo arbitrario.

 Medir el costo por instancia y por cantidad de jugadores/bloques/entidades, no solo con un caso mínimo.

8.2 Memoria y persistencia

 No duplicar NBT completo en memoria si se puede derivar de datos existentes.
 No guardar referencias a Level, Player, BlockEntity o ItemStack dentro de caches globales que sobrevivan




a su ciclo de vida.
Invalidar referencias y LazyOptional; limpiar listeners y caches al descargar entidad, chunk o mundo.
Sincronizar únicamente lo que el cliente necesita para mostrar; los datos internos pueden quedarse en
servidor.

 No usar NBT por stack como reemplazo de variantes discretas.

8.3 Red y chunks

 Minimizar frecuencia y payload de paquetes; agrupar cambios próximos cuando sea razonable.
 No enviar inventarios completos cada tick ni repetir estados inmutables.
 No disparar cargas de chunks desde paquetes/clientes o tareas visuales.


Validar rate, tamaño, dirección y permiso de mensajes entrantes.

8.4 Renderizado

Reutilizar buffers y recursos conforme al ciclo de render; no crear un objeto por vértice o por frame.


 Mantener clases gráficas aisladas del servidor.



Evitar llamadas sin necesidad a `getBlockState`, ray tracing o cálculo de iluminación en cada frame.
Usar la capa de render correcta para opaco, cutout y translucent; verificar transparencia y orden de
dibujo.

 No usar GL directo para saltarse el pipeline si un buffer/render type resuelve la necesidad.

8.5 Protocolo de optimización

  ☐ Crear baseline de FPS/tick time/memoria/red con una escena reproducible.

  ☐ Perfilar el problema real con herramientas del juego, Java Flight Recorder o profiler compatible.

  ☐ Identificar top hotspots y cuantificar frecuencia/costo.

  ☐ Cambiar una cosa por commit y medir de nuevo.

  ☐ Comparar resultados y demostrar que el gameplay no cambió.

  ☐ Eliminar microoptimizaciones sin evidencia y código complejo que empeora el mantenimiento.

9. Plan de ejecución por fases

Fase

0. Resguardo

1. Inventario

2. Especificación

3. Workspace nuevo

Trabajo

Salida obligatoria / criterio de cierre

Copiar y hashear artefactos; entorno original
reproducible si es posible.

Baseline inmutable, versión, hashes,
dependencias y evidencia de comportamiento.

Descompilar, clasificar, mapear símbolos,
listar recursos/API.

Matriz completa de
clases/registros/recursos/integraciones.

Describir comportamiento y pruebas por
feature.

Contrato funcional del mod: entradas, salidas,
estado, persistencia y red.

Crear proyecto desde MDK Forge 1.20.1/Java
17.

Mod ejemplo compila y arranca en cliente y
servidor.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

19

Fase

4. Esqueleto

5. Registros y recursos

6. Gameplay

7. Red/persistencia/GUI

8. Worldgen

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

Trabajo

Salida obligatoria / criterio de cierre

@Mod, config, deferred registers, logs y
estructura packages.

Mod vacío carga limpiamente; no hay
dependencias antiguas.

Bloques, ítems, sonidos, partículas, modelos,
lang y creative tabs.

Todo el contenido aparece sin missing
mappings/assets.

Bloques, items, entidades, eventos, máquinas,
comandos.

Cada feature del inventario está migrada con
prueba básica.

SimpleChannel, menus/screens, capabilities y
SavedData.

Cliente-servidor funcional y persistencia tras
reinicio.

Features, biomes, structures,
dimensions/datapack.

Mundo nuevo genera como se espera; no
bloquea/rompe chunks.

9. Integraciones

APIs opcionales, mixins, AT y compatibilidad.

Pruebas con y sin dependencias opcionales.

10. QA y optimización

11. Release

Pruebas cliente, dedicado, mundo
nuevo/antiguo, perfilado.

Criterios de aceptación cumplidos; regresiones
corregidas.

Build limpio, inspección JAR, hashes, notas y
matriz final.

JAR reproducible, instrucciones, limitaciones y
cobertura 100% justificada.

10. Matriz de pruebas y validación

10.1 Pruebas de compilación y arranque

  ☐ `./gradlew --version` muestra Gradle y JVM esperados; la JVM es Java 17.

  ☐ `./gradlew clean build` termina sin errores.

  ☐ `./gradlew runClient` inicia Minecraft 1.20.1 con Forge fijado y sin stack traces del mod.

  ☐ `./gradlew runServer` inicia un servidor dedicado; no intenta cargar clases de cliente.

  ☐ `./gradlew runData` genera o valida assets/data cuando se configuró datagen.

  ☐ No hay referencias a clases 1.12.2, mappings MCP antiguos o bibliotecas eliminadas en el build.

  ☐ El JAR final contiene `META-INF/mods.toml`, recursos esperados y clases propias; no contiene

workspace/runs/archivos privados.

10.2 Pruebas funcionales mínimas

Dominio

Registros

Bloques

Ítems

Máquinas/BlockEntities

Entidades

Red

Casos a comprobar

Carga de todos los registry objects; no duplicados; IDs correctos;
creative tabs.

Colocar, destruir, orientar, actualizar vecinos, colisión, luz, agua,
drops y tool requirements.

Usar en cada contexto, stack size, durabilidad, reparación, tags,
tooltip, recetas.

Inventario, sided IO, energía/fluido, progreso, break/re-place,
guardar/cargar y sincronización.

Spawn natural/manual, atributos, IA, navegación, daño, muerte,
drops, guardar/cargar, renderer.

Singleplayer integrado, LAN/servidor dedicado, reconexión,
acciones inválidas, lag, paquetes repetidos.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

20

Dominio

GUI

Worldgen

Recursos

Compatibilidad

Persistencia

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

Casos a comprobar

Abrir/cerrar, slots, shift-click, drag, botones, sincronización y
permisos.

Mundo nuevo, múltiples seeds, límites de altura, biomas
esperados, chunks fronterizos y rendimiento.

Modelos, blockstates, texturas, traducciones, sonidos, partículas,
loot, tags y advancements.

Mods requeridos, opcionales, ausentes y conflicto controlado con
registros/recursos.

Salir/entrar, reiniciar servidor, cargar mundo, guardar chunk y
probar copia de save antiguo.

10.3 Pruebas de save y compatibilidad histórica

Si el mod contiene bloques, ítems, entidades, máquinas o datos guardados, probar como mínimo: mundo
nuevo, mundo nuevo tras guardar/reiniciar, mundo con todas las features antiguas, mundo con bloques viejos
colocados, inventarios de jugador/cofres, máquinas con progreso y NBT, entidades vivas y datos globales.
Mantener backups antes y después. Registrar exactamente qué datos no pueden trasladarse de 1.12.2.

10.4 Revisión automática de restos de 1.12.2

Una búsqueda global al final debe revisar al menos los símbolos y patrones del catálogo de la sección 3.3. No
todos los textos antiguos indican un error (por ejemplo, un nombre de una clase en documentación histórica),
así que clasificar las coincidencias. Cada coincidencia de código ejecutable que sobreviva debe estar
justificada.

10.5 Definition of Done: qué significa 100%

100% NO SIGNIFICA  Que no quede ni una palabra vieja ni que cada clase tenga una clase nueva con el
mismo nombre. Significa que el 100% de elementos y comportamientos identificados tiene una disposición
explícita: migrado y probado, reemplazado por diseño equivalente y probado, o declarado no
aplicable/bloqueado con razón, impacto y decisión del usuario.

  ☐ 100% de las clases/métodos relevantes están clasificados; no hay código funcional original ignorado.

  ☐ 100% de los registros antiguos están mapeados a un registro nuevo, alias/remap, conversión o descarte

justificado.

  ☐ 100% de los recursos referenciados están migrados, generados o documentados como no utilizados.

  ☐ 100% de los flujos de gameplay identificados tienen al menos un caso de prueba.

  ☐ 100% de las rutas de red y persistencia han sido revisadas por seguridad y corrección.

  ☐ No quedan stubs, `TODO` críticos ni errores conocidos ocultos.

  ☐ Cliente integrado y servidor dedicado arrancan correctamente.

  ☐ El informe final enumera funcionalidades no equivalentes, límites de compatibilidad de mundo y pruebas

no ejecutadas.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

21

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

11. Errores típicos que la IA debe evitar

Error

Por qué está mal

Respuesta correcta

Traducir nombres de clase y esperar que
compile.

Las APIs y el modelo de datos cambiaron, no
solo las firmas.

Reconstruir el contrato de cada feature y usar
API destino.

Copiar el build.gradle antiguo.

Gradle/ForgeGradle y mappings de 1.12 son
obsoletos.

Crear MDK nuevo y mover únicamente
contenido revisado.

Mantener un único ítem con 20 meta variantes
en NBT.

Pierde compatibilidad con recipes/tags y
cuesta más sincronización.

Registrar IDs separados para variantes
discretas.

Usar NBT como solución para cualquier dato.

NBT no sustituye tags, blockstates, capabilities
o registros.

Elegir el sistema que corresponde al tipo de
dato.

Poner `Minecraft.getInstance()` en una clase
común.

Puede romper servidor dedicado durante
classloading.

Separar cliente y servidor; registrar handlers
cliente.

Modificar el mundo directamente desde un
packet handler.

El handler puede ejecutarse en el hilo Netty.

enqueueWork y validación del lado servidor.

Hacer worldgen con Random global.

No determinista y potencialmente inseguro en
generación concurrente.

Usar contexto/seed y generación pura.

Sincronizar NBT completo cada tick.

Produce congestión y costo de CPU/red.

Sincronización incremental y solo datos
visibles.

Migrar a APIs 1.21 porque un tutorial es
reciente.

El target es 1.20.1; las APIs posteriores no son
equivalentes.

Verificar cada ejemplo contra docs y source de
Forge 1.20.1.

Decir que el mod está listo porque `build` pasó.

No prueba carga, visual, server, worldgen, red
ni saves.

Aplicar Definition of Done y matriz de
pruebas.

12. Prompt maestro para entregarle a la IA de trabajo

Copiar el bloque siguiente y usarlo como instrucción de proyecto. Ajustar únicamente rutas de entrada/salida
y límites de herramientas. El prompt obliga a la IA a investigar primero y a dejar evidencia en vez de
improvisar conversiones.

Actúa como ingeniero senior especializado en Minecraft Java Edition, Forge, Java 17,

reverse engineering, migraciones de mods y pruebas automatizadas.

OBJETIVO FIJO

Migrar el mod proporcionado de Minecraft Forge 1.12.2 a Minecraft Java 1.20.1

con Minecraft Forge 47.x y Java 17. No cambiar el target a Fabric, NeoForge, 1.20.2,

1.20.5 o 1.21+. Debes conservar la funcionalidad original y optimizar sin alterar

el gameplay, salvo decisión documentada.

REGLAS NO NEGOCIABLES

1. No edites el original. Haz una copia de trabajo y conserva hashes/backups.

2. No traduzcas el código línea por línea. Primero recupera la intención funcional.

3. No inventes métodos, clases, dependencias, eventos ni firmas. Compruébalos en

   documentación Forge 1.20.1, el MDK exacto, mappings fijados y fuentes/Javadocs.

4. Usa Java 17 y un proyecto nuevo creado desde el MDK Forge 1.20.1 seleccionado.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

22

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

   No reutilices el build Gradle/ForgeGradle de 1.12.2.

5. Mantén una matriz de migración con cada clase, método, registro, recurso,

   dependencia, flujo de gameplay y dato persistente detectado.

6. No elimines características para lograr compilar. No dejes stubs, TODO críticos,

   métodos vacíos ni funcionalidades simuladas.

7. No mezcles APIs de versiones posteriores a 1.20.1. En particular, 1.20.1 conserva

   ItemStack NBT y no usa el sistema de Data Components de 1.20.5+.

8. Mantén el mod ID y registry names existentes siempre que sea posible; trata los

   IDs como parte del contrato de guardado. No supongas que MissingMappingsEvent

   convierte automáticamente variantes antiguas basadas en metadata.

9. Separa código client-only del común; prueba servidor dedicado real.

10. Toda modificación del mundo debe ocurrir en el hilo correcto y ser autoritativa

    del servidor. Toda entrada de red debe validarse.

11. No realices generación de mundo no determinista ni fuerces cargas de chunks

    desde handlers de red/render.

12. No declares 100% de éxito sin cumplir la Definition of Done de este manual.

FASE A - INVENTARIO SIN MODIFICAR

- Inspecciona JAR/fuentes, metadatos, paquetes, dependencias, recursos y configuraciones.

- Descompila con herramienta adecuada; distingue artefactos del decompilador de lógica real.

- Identifica entrypoints, buses, registros, eventos, bloques, ítems, entidades,

  BlockEntities, GUIs, networking, capabilities, worldgen, render, comandos,

  partículas, sonidos, configs, persistencia, mixins/coremods/AT e integraciones.

- Describe cada feature como flujo observable: trigger -> validación -> mutación ->

  efectos -> sincronización -> persistencia.

- Entrega `MIGRATION_INVENTORY.md`, `FEATURE_SPEC.md`, `DEPENDENCIES.md` y una matriz

  CSV/Markdown con IDs únicos. No empieces la reescritura hasta que el inventario

  tenga cobertura razonable y las incertidumbres estén anotadas.

FASE B - WORKSPACE DESTINO

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

23

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

- Descarga/usa el MDK oficial Forge 1.20.1 de la versión 47.x elegida y fija esa versión.

- Configura toolchain Java 17 y mappings oficiales consistentes.

- Ejecuta clean build, runClient y runServer con el ejemplo limpio.

- Registra versiones Java, Gradle, Forge y hash del MDK en `BUILD_ENVIRONMENT.md`.

FASE C - MIGRACIÓN POR CAPAS

1. Clase @Mod, config, event buses y DeferredRegisters.

2. IDs/BlockStates/ítems/creative tabs/sonidos/partículas.

3. Assets, blockstates, modelos, texturas, traducciones y datagen.

4. Recetas JSON, loot tables, advancements y tags.

5. Bloques, items y comportamiento común.

6. BlockEntities, inventarios, capabilities y persistencia.

7. Menus/Screens y sincronización.

8. Entidades, atributos, spawn, IA, renderers y datos sincronizados.

9. SimpleChannel, validación y protocolos de red.

10. Worldgen moderno, features, placement, biome modifiers y estructuras.

11. Comandos, teclas y todas las integraciones externas.

12. Mixin/AT/coremod solo si la feature no tiene API pública equivalente.

Para cada lote: busca todas las llamadas relacionadas, implementa el reemplazo,

compila, ejecuta pruebas focalizadas, inspecciona logs y actualiza la matriz.

No hagas refactors cosméticos mezclados con cambios de comportamiento.

FASE D - PRUEBAS Y OPTIMIZACIÓN

- Ejecuta clean build, runClient, runServer y runData.

- Prueba los flujos del FEATURE_SPEC en cliente, servidor dedicado y multijugador.

- Prueba guardado/carga, inventarios, entidades, chunks y mundo nuevo.

- Si se solicita compatibilidad con mundos 1.12.2, trabaja únicamente sobre copias;

  identifica datos convertibles automáticamente y datos que requieren DataFixer,

  remap o herramienta de conversión. No prometas compatibilidad sin probarla.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

24

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

- Perfila antes de optimizar. Evita polling caro, cargas de chunks, paquetes redundantes,

  NBT repetido y trabajo en hilo incorrecto. Demuestra que optimizar no alteró gameplay.

SALIDAS OBLIGATORIAS

- Código fuente completo del mod Forge 1.20.1.

- JAR release y comando exacto para reconstruirlo.

- `MIGRATION_INVENTORY.md` con cada elemento y estado.

- `FEATURE_SPEC.md` con la equivalencia funcional de cada feature.

- `MIGRATION_DECISIONS.md` con cambios inevitables y justificación.

- `TEST_REPORT.md` con entorno, pruebas, logs/resumen y fallos abiertos.

- `COMPATIBILITY.md` con dependencias y límites de save/world migration.

- Lista de elementos PENDIENTE/BLOQUEADO/NO APLICA y razón.

CRITERIO FINAL

El trabajo solo se declara completo cuando el 100% de los elementos inventariados

está MIGRADO Y VALIDADO, o cuando una excepción está identificada, cuantificada y

explicada. Compilar no es suficiente. No ocultes fallos ni reemplaces una función

por un placeholder.

13. Plantillas de entregables que la IA debe mantener

13.1 MIGRATION_DECISIONS.md

# Decisiones de migración

## DEC-001 - <título>

- Elemento original:

- Evidencia en el mod 1.12.2:

- Comportamiento que debe conservarse:

- Cambio inevitable en 1.20.1:

- API destino consultada:

- Alternativas evaluadas:

- Decisión:

- Riesgo para saves/compatibilidad:

- Pruebas asociadas:

- Estado: aprobado / pendiente

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

25

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

13.2 TEST_REPORT.md

# Informe de pruebas

- Minecraft: 1.20.1

- Forge: 1.20.1-47.4.xx

- Java: 17.x, 64-bit

- Gradle/wrapper:

- SO:

- Hash JAR:

| Prueba | Resultado | Evidencia/log | Incidencia |

|---|---|---|---|

| clean build | PASS/FAIL | ... | ... |

| runClient | PASS/FAIL | ... | ... |

| runServer | PASS/FAIL | ... | ... |

| runData | PASS/FAIL | ... | ... |

| multiplayer | PASS/FAIL | ... | ... |

| save/reload | PASS/FAIL | ... | ... |

| worldgen | PASS/FAIL | ... | ... |

13.3 Regla para el estado de la cobertura

La IA debe informar porcentaje por categoría (clases, registros, recursos, features, integraciones, pruebas),
indicando el denominador. No usar un único porcentaje calculado contando archivos Java: un archivo grande
puede contener muchas funciones y un JSON puede ser crítico para una feature. Todo elemento sin
clasificación debe contarse como pendiente.

14. Referencias técnicas y documentación

Las APIs de Minecraft y Forge cambian entre subversiones. Consultar primero la documentación fijada a
1.20.1, después el código del Forge exacto y sus Javadocs. El sitio oficial indica que la documentación de 1.20.1
cubre aproximadamente el 90% de la documentación esperada, por lo que puede ser necesario contrastar
firmas y detalles con el MDK y las fuentes. No usar un tutorial de otra versión como única autoridad.
















R1. Forge 1.20.1 - Getting Started / Java 17 / MDK / build y pruebas
R2. Descargas oficiales Forge 1.20.1 (Latest/Recommended y MDK)
R3. Forge 1.20.1 - Registries y DeferredRegister
R4. Forge 1.20.1 - Events y event buses
R5. Forge 1.20.1 - Mod Lifecycle y eventos paralelos
R6. Forge 1.20.1 - Sides
R7. Forge 1.20.1 - ResourceLocation, assets y data
R8. Forge 1.20.1 - Blocks y BlockStates
R9. Forge 1.20.1 - Items y Creative Tabs
R10. Forge 1.20.1 - Block Entities
R11. Forge 1.20.1 - Capabilities
R12. Forge 1.20.1 - SimpleImpl / SimpleChannel
R13. Forge 1.20.1 - Menus
R14. Forge 1.20.1 - Configurations

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

26

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT












R15. Forge 1.20.1 - Data Generation
R16. Forge 1.20.1 - Saved Data
R17. Forge 1.20.1 - Render Types
R18. Forge 1.20.1 - Porting primer index
R19. Williewillus - 1.13/1.14 update primer (especialmente útil para 1.12
R20. Minecraft Wiki - The Flattening (1.13)
R21. Oracle - Migrating from JDK 8 to later JDK releases
R22. Oracle - Java language changes through Java 17
R23. MinecraftForge - MDK examples, 1.20.1 build.gradle
R24. Forge legacy documentation status / completeness

→

 1.13)

Fecha de consulta de las referencias: 13 de noviembre de 2026. Las páginas de descargas y los repositorios pueden cambiar; registrar

las versiones exactas utilizadas en cada migración.

Apéndice A. Checklist de auditoría del JAR final

  ☐ El archivo se construye desde el workspace limpio con `gradlew build`.

  ☐ El JAR solo incluye clases/resources necesarios; no incluye archivos `runs/`, `.gradle/`, fuentes sensibles ni

dumps.

  ☐ `mods.toml` identifica el mod y rangos reales de Minecraft, Forge y dependencias.

  ☐ No se empaquetan APIs de Forge/Minecraft como si fueran librerías privadas.

  ☐ No hay recursos rotos, rutas en mayúsculas, traducciones faltantes o JSON inválido.

  ☐ No quedan nombres placeholder (`examplemod`), versiones antiguas o referencias de desarrollo.

  ☐ El servidor dedicado carga y el mod no intenta inicializar clases cliente.

  ☐ Las dependencias opcionales no bloquean el arranque cuando están ausentes.

  ☐ El JAR final tiene hash y notas de versión; se conservaron backups del original y del save de prueba.

Apéndice B. Guía de diagnóstico según el tipo de fallo

Síntoma

Primera zona a inspeccionar

No encuentra clase/método en compilación

Mappings elegidos, imports, API 1.20.1, dependencia y versión de
Forge.

Crash durante mod loading

Crash solo en servidor dedicado

Se ve missing texture/model

Clase @Mod, registro temprano, static initialization, event bus,
`RegistryObject#get` antes de tiempo.

Clase cliente cargada desde código común; renderer, Minecraft
instance, Screen, Model/GL import.

Ruta assets, modelo JSON, blockstate JSON, registry name y
namespace.

Ítem aparece pero no se puede craftear

Recipe JSON, ingredient/tag y data pack namespace.

Bloque desaparece al recargar mundo

Máquina funciona en singleplayer pero no en MP

Lag al usar máquina o al explorar

Worldgen duplica o falta en biomas

ID de registro cambiado, MissingMappings, NBT persistente y
migración de metadata.

Autoridad del servidor, paquetes, sincronización, lógica cliente-
only y race conditions.

Ticks por entidad, scans de bloques/chunks, worldgen, IO,
paquetes y caches.

Biome modifier, placed feature, orden/fase, tags, registry keys y
datapack reload.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

27

MANUAL TÉCNICO  |  MIGRACIÓN DE MODS MINECRAFT

Síntoma

Primera zona a inspeccionar

GUI visualiza valor pero no lo guarda

El build funciona pero falla al iniciar

Menu DataSlot/packet, server-side mutation y
setChanged/serialization.

Classpath/runtime, versión del loader, dependencias transitivas,
reflexión y recursos.

CONCLUSIÓN  Una migración fiable es un proyecto de recuperación de comportamiento y reconstrucción
sobre una plataforma nueva. La IA debe usar la descompilación para descubrir qué existía, la
documentación 1.20.1 para decidir cómo se implementa ahora y las pruebas para demostrar que el
resultado conserva lo importante.

Minecraft Java 1.12.2

→

 1.20.1  •  Forge  •  13 nov 2026  |  Página

28

