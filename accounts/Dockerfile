#Start with a base image containing Java runtime
FROM openjdk:22-jdk

LABEL "org.opencontainers.image.authors"="https://github.com/holandavinicius"

# Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]