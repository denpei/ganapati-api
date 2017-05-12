FROM maven:3.2-jdk-8-onbuild
MAINTAINER Dennis Peitersen

RUN mkdir /app
COPY . /app

WORKDIR /app

RUN mvn clean package
RUN mwnw spring-boot:run

EXPOSE 8080
