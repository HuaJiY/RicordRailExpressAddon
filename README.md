# Ricord Rail Express

This is an addon for `catmoon-train/StarRailExpress`. It keeps the local `Noellesroles`, `Harpymodloader`, `StupidExpress`, and their resources while retaining their original namespaces for save and configuration compatibility.

| Project | Value |
| --- | --- |
| Mod ID | `ricord_rail_express` |
| Java package | `io.HuaJiYa.ricordrailexpress` |
| Display name | `Ricord Rail Express` |
| Upstream | [StarRailExpress](https://github.com/catmoon-train/StarRailExpress), `master` |
| License | `GPL-3.0-only` |

## Build

Run this on Windows:

```text
gradlew.bat compileJava jar --rerun-tasks --no-build-cache
```

The artifact is written to `build/devlibs/ricord-rail-express-<version>-dev.jar`. `libs/starrailexpress.jar` is a compile-time reference only. The runtime must provide the upstream `StarRailExpress` mod and its dependencies; upstream classes are not bundled into this JAR.

## Current boundary

The first phase provides the addon entrypoint, local resources, old `noellesroles` registration IDs, and the public API integration needed by independently registered content. Some existing local logic still calls upstream implementation classes; see [`docs/附属化边界.md`](docs/附属化边界.md) for the exact dependency boundary.

The addon does not package upstream `io.wifi.*` classes. Local content uses upstream role APIs, CCA components, events, registries, network types, and client utilities. When upstream `master` changes, export a matching upstream JAR and rebuild this project.

## Development

- Read [`AGENT.md`](AGENT.md) and the relevant files in `docs/*.md` before changing code.
- Prefer upstream public APIs and keep registration in the existing centralized initialization path.
- Keep existing `noellesroles` and `stupid_express` resource namespaces unless a real upstream ID conflict requires migration.
