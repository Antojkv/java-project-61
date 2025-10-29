plugins {
    id("application")
    id("se.patrikerdes.use-latest-versions") version "0.2.19"
    id("com.github.ben-manes.versions") version "0.53.0"
    id("com.diffplug.spotless") version "7.2.1"
    id("org.sonarqube") version "6.3.1.5724"
    id("checkstyle")
}

checkstyle {
    toolVersion = "10.12.4"
}

sonar {
    properties {
        property("sonar.projectKey", "Antojkv_java-project-61")
        property("sonar.organization", "antojkv")
    }
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.19.0")
}

application { mainClass.set("hexlet.code.App") }


tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}

tasks.withType<JavaExec> {
    jvmArgs("--enable-preview")
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
