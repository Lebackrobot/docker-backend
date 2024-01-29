FROM openjdk
WORKDIR /app
COPY target/crud-0.0.1-SNAPSHOT.war app/crud-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","app/crud-0.0.1-SNAPSHOT.war"]

EXPOSE 4000