FROM maven:3.8.4-openjdk-17-slim AS build

ADD target/VimalMavenProjectJenkins-0.0.1-SNAPSHOT.jar latest-image-created.jar

ENTRYPOINT ["java", "-jar", "latest-image-created.jar"]



