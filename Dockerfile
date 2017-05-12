FROM maven:3.2-jdk-8-onbuild
MAINTAINER Dennis Peitersen

RUN mkdir /app
COPY . /app

RUN cd app
RUN ./mvnw spring-boot:run

EXPOSE 8080
