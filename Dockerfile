FROM openjdk:8-jdk-alpine

EXPOSE 8080 29999

ADD target/demo-0.0.1-SNAPSHOT.jar my-sprbootapp.jar

ENTRYPOINT ["java", "-jar", "/my-sprbootapp.jar"]

