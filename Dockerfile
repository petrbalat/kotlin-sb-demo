FROM openjdk:jre-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} demo.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo.jar"]

# docker build --tag kotlintest/demo --build-arg JAR_FILE=./build/libs/sb-demo-0.0.1-SNAPSHOT.jar --no-cache .
# docker run -p 8080:8080 -t kotlintest/demo