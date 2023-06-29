plugins {
    java
}

java {
    sourceCompatibility = JavaVersion.toVersion("11")
    targetCompatibility = JavaVersion.toVersion("11")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("jakarta.inject:jakarta.inject-api:2.0.1")
}