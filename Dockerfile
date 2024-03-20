# Usa una imagen base con Java 8
FROM openjdk:8-jdk-alpine

# Copia el archivo JAR de la aplicación a la imagen
COPY target/intech.jar /app.jar

# Expone el puerto 8080 para la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "/app.jar"]
