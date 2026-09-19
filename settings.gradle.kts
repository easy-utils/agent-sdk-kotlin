pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}

rootProject.name = "agent-sdk-kotlin"

// Consume the easy-rpc Kotlin KMP core from the sibling checkout (composite
// build) so a local change to easy-rpc-kotlin is picked up without publishing.
includeBuild("../easy-rpc-kotlin") {
    dependencySubstitution {
        substitute(module("io.github.easy-utils:easy-rpc-kotlin"))
            .using(project(":"))
    }
}
