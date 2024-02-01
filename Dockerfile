FROM openjdk
COPY target/docker-backend-0.0.1-SNAPSHOT.jar application.jar

EXPOSE 4000

ENTRYPOINT ["java","-jar","application.jar"]
