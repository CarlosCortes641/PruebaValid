# PruebaValid
# Proyecto de Automatización con Serenity BDD y Patrón Screenplay

Este proyecto de automatización utiliza la herramienta Serenity BDD y el patrón de diseño Screenplay para automatizar pruebas de software. Con Serenity BDD, puedes crear pruebas automatizadas con un enfoque en la legibilidad y mantenibilidad del código.

## Características

- Utiliza el patrón de diseño Screenplay para escribir pruebas más expresivas y mantenibles.
- Configurado con Maven para la gestión de dependencias y la ejecución de pruebas.
- Genera informes detallados de las pruebas automatizadas para una fácil revisión.
- Incluye pruebas a wikiPedia.

## Requisitos

Asegúrate de tener instalados los siguientes requisitos en tu sistema:

- Java Development Kit (JDK)
- Maven
- Un IDE de desarrollo como IntelliJ IDEA o Eclipse (opcional pero recomendado)

## Configuración

1. Clona este repositorio a tu máquina local:
git clone https://github.com/CarlosCortes641/PruebaValid.git

2. Abre el proyecto en tu IDE.

## Ejecución de Pruebas

Puedes ejecutar las pruebas automatizadas utilizando Maven con el siguiente comando:
mvn clean verify


Los informes generados se encontrarán en la carpeta `target/site/serenity`.

## Estructura del Proyecto

- `src/test/java`: Contiene los paquetes runners y stepsdefinitions.
- `src/main/java`: Contiene clases y componentes de Screenplay, como ui, interactions, tasks, questions, exceptions y utils.
- `src/main/resources`: Archivos de configuración, como propiedades y datos de prueba - features.
- `target`: Directorio de salida con informes y resultados.
