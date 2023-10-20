FROM maven:3.9.5-amazoncorretto-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM amazoncorretto:17-al2023
ENV MENSAGENS_PORT=8081
RUN mkdir /app
WORKDIR /app
COPY --from=build target/mensagens-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE ${MENSAGENS_PORT}
ENTRYPOINT [ "java", "-jar", "app.jar" ]
