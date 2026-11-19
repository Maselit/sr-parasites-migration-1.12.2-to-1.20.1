# BUILD_ENVIRONMENT — Scape and Run: Parasites (port a 1.20.1)

**Fase B del manual:** *WORKSPACE DESTINO* — entorno fijado y validado.

## 1. Plataforma

| Componente | Valor |
|---|---|
| SO | Windows (win32) |
| Minecraft | 1.20.1 |
| Forge | 1.20.1-47.4.10 (ForgeGradle 6.0.x) |
| Java (toolchain) | 17.0.16 (Eclipse Adoptium Temurin) — `C:\Program Files\Eclipse Adoptium\jdk-17.0.16.8-hotspot` |
| Gradle (wrapper) | 8.8 (`gradle-8.8-bin.zip`) |
| Mappings | `official` (1.20.1) |
| Mod id (workspace) | `examplemod` (plantilla; se reemplazará por `srparasites` en Fase C) |
| Java toolchain (build.gradle) | `JavaLanguageVersion.of(17)` |

## 2. Workspace

| Item | Ruta |
|---|---|
| Workspace (copia del MDK) | `C:\Users\Kevin Aguilar\Documents\Proyecto predeterminado\srparasites\workspace` |
| Fuente del MDK | `C:\Users\Kevin Aguilar\Documents\FORGE\MK2` (plantilla Forge 1.20.1 MDK, conservada intacta) |
| Gradle user home | `C:\Users\Kevin Aguilar\.gradle` (cache compartido) |
| Run dir | `workspace\run` (EULA aceptada: `eula=true`) |

## 3. Validaciones ejecutadas

| Prueba | Resultado | Evidencia |
|---|---|---|
| `gradlew clean build` (ejemplo limpio) | **PASS** | BUILD SUCCESSFUL in 48s; 8 tasks |
| `gradlew runServer` (headless, `--nogui`) | **PASS** | "Done (7.255s)! For help, type help"; "HELLO from server starting"; EULA aceptada |
| `gradlew runClient` | **NO EJECUTADO** | Requiere display (OpenGL); entorno headless. Pendiente de validar en máquina con GUI o vía Xvfb. |

## 4. Artefacto de validación

| Item | Valor |
|---|---|
| JAR de ejemplo | `workspace\build\libs\examplemod-1.0.0.jar` (10 385 bytes) |
| SHA-256 | `DE94EF4A33A5A1B019EA7A8E907B65730971D70F35478A6E4588A9331192F432` |

## 5. Comandos de referencia

```powershell
$env:JAVA_HOME = "C:\Program Files\Eclipse Adoptium\jdk-17.0.16.8-hotspot"
$env:PATH = "$env:JAVA_HOME\bin;$env:PATH"
cd "C:\Users\Kevin Aguilar\Documents\Proyecto predeterminado\srparasites\workspace"
.\gradlew.bat clean build
.\gradlew.bat runServer   # headless (--nogui ya configurado en run config)
.\gradlew.bat runClient   # requiere display
.\gradlew.bat runData     # data gen
```

## 6. Notas

- La caché de Gradle ya contenía Forge 47.3.0/47.3.11 y 47.4.10 se descargó correctamente desde maven.minecraftforge.net (red disponible).
- La plantilla original `FORGE\MK2` se conserva intacta; el workspace de trabajo es la copia en `srparasites\workspace`.
- El mod id aún es `examplemod` (plantilla). En Fase C se reemplazará por `srparasites`, el paquete por `com.dhanantry.scapeandrunparasites` y se migrará el código del JAR descompilado.
- Versiones fijadas: Minecraft 1.20.1, Forge 47.4.10, Java 17, Gradle 8.8, mappings official 1.20.1. No cambiar sin registrar en este archivo.
