FROM maven:3.2-jdk-8-onbuild
MAINTAINER Dennis Peitersen

RUN mkdir /app
COPY . /app

EXPOSE 8080
