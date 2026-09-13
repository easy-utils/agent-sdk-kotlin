plugins {
    kotlin("jvm") version "2.2.21"
    `maven-publish`
}

group = "agentsdk"
version = "0.1.0"

repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.github.com/easy-utils/easy-rpc-kotlin")
        credentials {
            username = System.getenv("GITHUB_ACTOR") ?: ""
            password = System.getenv("GITHUB_TOKEN") ?: ""
        }
    }
}

dependencies {
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.google.protobuf:protobuf-javalite:4.34.0")
    implementation("com.google.protobuf:protobuf-kotlin-lite:4.34.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("io.github.easy-utils:easy-rpc-kotlin:0.2.0")
}

kotlin { jvmToolchain(17) }

tasks.register<JavaExec>("live") {
    mainClass.set("agentsdk.LiveKt")
    classpath = sourceSets["main"].runtimeClasspath
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            groupId = "io.github.easy-utils"
            artifactId = "agent-sdk-kotlin"
            version = "0.13.0"
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/easy-utils/agent-sdk-kotlin")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: ""
                password = System.getenv("GITHUB_TOKEN") ?: ""
            }
        }
    }
}
