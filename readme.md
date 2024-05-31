## Spring Boot Boilerplate

Spring Boot Boilerplate is a starter kit using Java 21 with basic CRUD operations on Postgres DB using Jooq

### Technologies
- Spring Boot (v3.1.0)
- Spring Data JPA
- Postgres DB
- Jooq
- Flyway DB Migration
- Maven
- Lombok

### Pre-Requisites
- Java 21 ([Sdkman](https://sdkman.io/install))
- Spring 3
- Postgres 15 ([Download](https://www.postgresql.org/download/))


### Customization

#### 1. Update `application.properties`

```
spring.datasource.url=jdbc:postgresql://localhost:5432/<your-db-name>
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>
```

#### 2. Update Jooq Codegen config in `pom.xml` build
```
<!-- Jooq Codegen Plugin -->
            <plugin>
                <groupId>org.jooq</groupId>
                <artifactId>jooq-codegen-maven</artifactId>
                <version>3.15.5</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                            <jdbc>
                                <driver>org.postgresql.Driver</driver>
                                <url>jdbc:postgresql://localhost:5432/<your-db-name></url>
                                <user>your-username</user>
                                <password>your-password</password>
                            </jdbc>
                            <generator>
                                <database>
                                    <name>org.jooq.meta.postgres.PostgresDatabase</name>
                                    <inputSchema>public</inputSchema>
                                </database>
                                <target>
                                    <packageName>spring.boiler.plate.spring-boilerplate.jooq</packageName>
                                    <directory>src/main/java</directory>
                                </target>
                            </generator>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
```

### Run Application

```
//Install all the required maven dependencies
mvn clean install

//Run Spring Boot Application
mvn spring-boot:rum
```
