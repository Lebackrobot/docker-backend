FROM openjdk
COPY . .
ENTRYPOINT ["java","-jar","target/crud-0.0.1-SNAPSHOT.war"]

EXPOSE 4000