FROM amazoncorretto:17
COPY ./ /app
WORKDIR /app
RUN apt-get update \
    && apt-get install maven -y --no-install-recommends maven \
    && mvn clean install
EXPOSE 8081
ENTRYPOINT java -jar /app/target/mensagens-0.0.1-SNAPSHOT.jar