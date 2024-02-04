FROM openjdk
COPY target/docker-backend-0.0.1-SNAPSHOT.jar application.jar

EXPOSE 4000

CMD ["sh", "-c", "java -jar application.jar & while true; do sleep 86400; done"]