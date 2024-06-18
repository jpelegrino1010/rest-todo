FROM openjdk:17-alpine
COPY target/rest-todo.jar rest-todo.jar
EXPOSE 8022
ENTRYPOINT ["java","-jar", "rest-todo.jar"]
