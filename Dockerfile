FROM maven:3.8.5-openjdk-17 AS build
COPY . . 
run mvn clean package -DskipTests
FROM openjdk:17.0.1-jdk
COPY --from=build /target/corner-0.0.1-SNAPSHOT.jar corner.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","corner.jar"]