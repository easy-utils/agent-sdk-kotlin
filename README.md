# agent-sdk-kotlin

Kotlin Multiplatform SDK for the abc agent (`agent.v1.AgentService` +
`agent.v1.AdminService`). **Generated code only** plus a thin `AgentClient`
facade; the typed messages + clients are produced by `protoc` with
`protoc-gen-pbandk` (messages) and `protoc-gen-easyrpc-kotlin` (clients).

Targets: `jvm`, `js`, `wasmJs`, `linuxX64`, `linuxArm64` (the shared
`easy-rpc-kotlin` core also declares `android`/Apple source sets for later).

The caller owns the transport via `easyrpc.connect(baseUrl, token)`, which
selects the platform default (OkHttp on JVM, Ktor CIO on native, Ktor JS on
web):

```kotlin
import agentsdk.AgentClient

val agent = AgentClient(baseUrl = "https://agent.example.com", token = "…")
val sessions = agent.client().listSessions(ListSessionsRequest())
```

## Regenerate

Messages come from `agent-proto/agent/v1/agent.proto` (source of truth):

```bash
protoc -I ../agent-proto \
  --plugin=protoc-gen-pbandk=/tmp/opencode/bin/protoc-gen-pbandk \
  --pbandk_out=src/commonMain/kotlin --proto_path=... agent/v1/agent.proto
EASYRPC_KT_PKG=agentsdk protoc -I ../agent-proto \
  --plugin=protoc-gen-easyrpc-kotlin=../easy-rpc-kotlin/tool/gen.py \
  --easyrpc-kotlin_out=src/commonMain/kotlin agent/v1/agent.proto
```

## Consumed from GitHub Packages

```kotlin
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/easy-utils/agent-sdk-kotlin")
        credentials {
            username = System.getenv("GITHUB_ACTOR")
            password = System.getenv("GITHUB_TOKEN")
        }
    }
}
dependencies {
    implementation("io.github.easy-utils:agent-sdk-kotlin:0.18.0")
}
```
