FROM amazoncorretto:17-al2023
ENV MENSAGENS_PORT=8081
RUN mkdir /app
WORKDIR /app
COPY . .
# ----
# Install Maven
RUN dnf install -y maven
EXPOSE ${MENSAGENS_PORT}
ENTRYPOINT [ "bash", "entrypoint.sh" ]
