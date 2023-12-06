plugins {
	java
	id("org.springframework.boot") version "3.2.0"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.tma"
version = "0.0.1-SNAPSHOT"

val postgresVersion = "42.7.0"
val lombokVersion = "1.18.30"
val junitVersion = "5.10.1"
val postgreTestContainerVersion = "1.19.3"
val flywayVersion = "10.1.0"

java {
	sourceCompatibility = JavaVersion.VERSION_19
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//	implementation("org.springframework.boot:spring-boot-starter-data-redis")

	runtimeOnly("org.postgresql:postgresql:$postgresVersion")
	runtimeOnly("org.flywaydb:flyway-database-postgresql:$flywayVersion")
	implementation("org.flywaydb:flyway-core:$flywayVersion")
	compileOnly("org.projectlombok:lombok:$lombokVersion")
	annotationProcessor("org.projectlombok:lombok:$lombokVersion")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.boot:spring-boot-testcontainers")
	testImplementation("org.testcontainers:junit-jupiter:$junitVersion")
	testImplementation("org.testcontainers:postgresql:$postgreTestContainerVersion")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
