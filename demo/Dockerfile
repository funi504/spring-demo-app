# Build stage
FROM maven:3.9.1-eclipse-temurin-21 AS build
WORKDIR /home/app
COPY .mvn .mvn
COPY mvnw .
COPY src src
COPY pom.xml .
RUN chmod +x mvnw && ./mvnw clean package

# Package stage
FROM eclipse-temurin:21-jre
WORKDIR /usr/local/lib
COPY --from=build /home/app/target/getyourway-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/local/lib/demo.jar"]
