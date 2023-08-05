FROM eclipse-temurin:17-jdk-alpine

MAINTAINER trideep90@gmail.com
WORKDIR /workspace/app


COPY ./build/libs/spring-boot-demo-app-0.0.1-SNAPSHOT.jar /workspace/app/spring-boot-demo-app-1.0.0.jar

ENTRYPOINT ["java","-jar","./spring-boot-demo-app-1.0.0.jar"]