# Scape and Run: Parasites — Migración 1.12.2 → 1.20.1

Proyecto de migración del mod **Scape and Run: Parasites** (Dhanantry, v1.9.21) de
Minecraft 1.12.2 (Forge 14.23.x) a Minecraft 1.20.1 (Forge 47.4.10), Java 17.

## Estructura

- `MIGRATION_INVENTORY.md` — inventario maestro Fase A (590 clases, 125 entidades, etc.)
- `BUILD_ENVIRONMENT.md` — entorno fijado y validado (Fase B).
- `DEPENDENCIES.md` — dependencias y APIs a migrar.
- `manual/manual_migracion.md` — manual de migración en texto.
- `manual/Manual_Migracion_Minecraft_Forge_1.12.2_a_1.20.1.pdf` — manual original (PDF).
- `reports/` — análisis por subsistema (entities, client, config, world) y `FEATURE_SPEC.md`.
- `workspace/` — workspace Forge 1.20.1 (MDK) con código fuente en `src/`.
- `decompiled/` — descompilación CFR del JAR 1.12.2 (`mcp/` legible, `srg/` crudo).
- `extracted/` — JAR extraído (assets, `mcmod.info`, `pack.mcmeta`).

## Origen

- JAR: `SRParasites-1.12.2v1.9.21.jar` (SHA-256 `F803AB3882BC8047858A23E2376AAA8FB87D7E54A324B9183B4A033EE076DDEA`)
- URL: https://www.curseforge.com/minecraft/mc-mods/scape-and-run-parasites

## Estado

Fase A (inventario) y Fase B (entorno) completadas. Fase C (migración real del código) pendiente.

## Autor

Kevin Aguilar (Maselit)
