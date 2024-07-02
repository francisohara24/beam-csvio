plugins {
    java
    id("com.diffplug.spotless") version "6.8.0"
}

val autoValueVersion = "1.10"
val beamVersion = "2.56.0"
val junitVersion = "5.10.0"
val slf4jVersion = "1.7.36"
val truthyVersion = "1.4.2"
val commonsCSVVersion = "1.8"

spotless {
    java {
        importOrder()
        removeUnusedImports()
        googleJavaFormat()
    }
}

repositories {
    mavenCentral()
    maven {
        // Required for Beam to resolve confluent dependency error
        url = uri("https://packages.confluent.io/maven/")
    }
}

dependencies {
    implementation(platform("org.apache.beam:beam-sdks-java-bom:$beamVersion"))
    implementation("org.apache.beam:beam-runners-direct-java")
    implementation("org.apache.beam:beam-runners-google-cloud-dataflow-java")
    implementation("org.apache.beam:beam-sdks-java-io-google-cloud-platform")

    implementation("org.slf4j:slf4j-simple:$slf4jVersion")

    compileOnly("com.google.auto.value:auto-value-annotations:$autoValueVersion") // because we're using java annotations. Autovalue makes java objects serializable by getting a well defined hash function and equals function automatically.
    annotationProcessor("com.google.auto.value:auto-value:$autoValueVersion")

    testImplementation(platform("org.junit:junit-bom:$junitVersion"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    testImplementation("com.google.truth:truth:$truthyVersion")

    implementation("org.apache.commons:commons-csv:$commonsCSVVersion")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}