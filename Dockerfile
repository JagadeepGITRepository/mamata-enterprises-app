FROM openjdk:17

COPY target/mamata-enterprises-app.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "mamata-enterprises-app.jar"]
 