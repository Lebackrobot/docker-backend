FROM openjdk
COPY . .

EXPOSE 4000

ENTRYPOINT ["java","-jar","target/docker-backend-0.0.1-SNAPSHOT.jar"]
