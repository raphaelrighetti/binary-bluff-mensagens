FROM amazoncorretto:17-al2023
RUN mkdir /app
WORKDIR /app
COPY . .
# ----
# Install Maven
RUN dnf install -y maven
ENTRYPOINT [ "bash", "entrypoint.sh" ]
