# Ricord Rail Express

这是 `catmoon-train/StarRailExpress` 的附属模组项目。它保留本地 `Noellesroles`、`Harpymodloader`、`StupidExpress` 及其资源，并继续使用旧命名空间以兼容存档和配置。

| 项目 | 值 |
| --- | --- |
| Mod ID | `ricord_rail_express` |
| Java 包 | `io.HuaJiYa.ricordrailexpress` |
| 显示名 | `Ricord Rail Express` |
| 上游 | [StarRailExpress](https://github.com/catmoon-train/StarRailExpress) 的 `master` |
| 许可证 | `GPL-3.0-only` |

## 构建

```text
gradlew.bat compileJava jar --rerun-tasks --no-build-cache
```

产物在 `build/devlibs/ricord-rail-express-<版本>-dev.jar`。构建只把 `libs/starrailexpress.jar` 当作编译参考，运行时必须单独安装上游 `StarRailExpress` 及其依赖。

## 第一阶段边界

已完成附属入口、资源保留、旧 `noellesroles` 注册 ID 兼容，以及可独立注册内容所需的上游公开 API 接入。部分既有本地逻辑仍直接调用上游实现类；上游的 `io.wifi.*` 本体类不会复制进本项目。详细清单见 [`docs/附属化边界.md`](docs/附属化边界.md)。

上游跟随 `master`，更新上游后需要重新导出编译参考 JAR 并重新构建本项目。
