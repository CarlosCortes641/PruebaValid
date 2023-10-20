# Proyecto de Automatización con Serenity BDD y Patrón Screenplay

Este proyecto de automatización utiliza Serenity BDD y el patrón de diseño Screenplay para llevar a cabo pruebas
de software de manera eficiente y mantenible. Con un enfoque en la legibilidad y organización del código, esta
automatización permite realizar pruebas de calidad con facilidad.

## Características

- Está escrito en lenguaje JAVA
- Utiliza el patrón de diseño Screenplay para escribir pruebas más expresivas y mantenibles.
- Configurado con Maven para la gestión de dependencias y la ejecución de pruebas.
- Genera informes detallados de las pruebas automatizadas para una fácil revisión.
- Incluye pruebas escritas en lenguaje Gherkin.


## Requisitos

Asegúrate de tener instalados los siguientes requisitos en tu sistema:

- Java Development Kit (JDK)
- Maven
- Un IDE de desarrollo como IntelliJ IDEA o Eclipse (opcional pero recomendado)


## Configuración

1. Clona este repositorio a tu máquina local utilizando el siguiente comando:
git clone https://github.com/CarlosCortes641/PruebaValid.git

2. Abre el proyecto en tu IDE.


## Ejecución de Pruebas

Puedes ejecutar las pruebas automatizadas utilizando Maven con el siguiente comando desde la raíz del proyecto:
mvn clean verify

Los informes generados se encontrarán en la carpeta `target/site/serenity`.


## Estructura del Proyecto

El proyecto se organiza de la siguiente manera:
- `src/test/java`: Contiene los paquetes de runners y steps definitions, donde se definen las pruebas y sus pasos.
- `src/main/java`: Contiene clases y componentes de Screenplay, como: UI, interactions, tasks, questions, exceptions y utils.
- `src/main/resources`: Contiene los controladores de Chrome necesarios para la automatización, así como las características
                        (features) escritas en Gherkin que definen el comportamiento de las pruebas.
- `target`: Directorio de salida con informes y resultados generados por las pruebas automatizadas.

Con esta estructura, el proyecto se mantiene organizado y facilita la expansión y mantenimiento de las pruebas.




