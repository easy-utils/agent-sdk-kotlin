plugins {
    kotlin("jvm") version "2.2.21"
}

group = "agentsdk"
version = "0.1.0"

repositories { mavenCentral() }

dependencies {
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.google.protobuf:protobuf-javalite:4.34.0")
    implementation("com.google.protobuf:protobuf-kotlin-lite:4.34.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation(files("/home/user/easy-utils/easy-rpc-kotlin/build/libs/easy-rpc-kotlin-0.1.0.jar"))
}

kotlin { jvmToolchain(17) }

tasks.register<JavaExec>("live") {
    mainClass.set("agentsdk.LiveKt")
    classpath = sourceSets["main"].runtimeClasspath
}
