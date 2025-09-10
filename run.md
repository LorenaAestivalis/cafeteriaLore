# Manual de ejecucion Tienda API

Este documento explica cómo levantar el servidor de la API y cómo interactuar con los diferentes endpoints utilizando la interfaz de Swagger.

## 0. Requisitos

## 1. Levantar el Servidor de la API

Para que la API sea accesible, primero debes iniciar el servidor. Basado en la URL proporcionada en Swagger (`https://127.0.0.1:8443`), parece que la aplicación está diseñada para ejecutarse localmente.

**Instrucciones generales (pueden variar según tu configuración específica del proyecto):**

1.  **Navega al directorio raíz del proyecto:** Abre tu terminal o línea de comandos y cambia al directorio donde se encuentra tu proyecto.
    ```bash
    cd /ruta/a/tu/proyecto
    ```
2.  **Ejecuta la aplicación:** Dependiendo del lenguaje y framework utilizado (por ejemplo, Java con Spring Boot, Node.js con Express, Python con Flask/Django), el comando para iniciar el servidor será diferente. Algunos ejemplos comunes son:
    *   **Java (Spring Boot):**
        ```bash
        ./mvnw spring-boot:run
        ```
        o si tienes un archivo JAR ejecutable:
        ```bash
        java -jar tu-aplicacion.jar
        ```
    *   **Node.js:**
        ```bash
        npm start
        ```
        o
        ```bash
        node app.js
        ```
    *   **Python (Flask):**
        ```bash
        flask run
        ```
        o (Django):
        ```bash
        python manage.py runserver
        ```

Una vez que el servidor se esté ejecutando, deberías ver mensajes en la consola indicando que la aplicación ha iniciado y está escuchando en el puerto configurado (en este caso, `8443`).

## 2. Acceder a la Documentación de Swagger

Una vez que el servidor está corriendo, puedes acceder a la interfaz interactiva de Swagger para probar los endpoints de la API.

1.  Abre tu navegador web.
2.  Introduce la siguiente URL en la barra de direcciones:
    `https://127.0.0.1:8443/swagger-ui.html` (o la ruta específica de Swagger si es diferente).

Deberías ver una interfaz similar a la siguiente:
