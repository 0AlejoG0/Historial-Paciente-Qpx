# Proyecto: hacer consulta crear paciente

Este proyecto fue desarrollado como práctica para comprender el funcionamiento básico de **Spring Boot** y **JPA** mediante la creación de un CRUD sencillo.
El sistema permite **listar** y **registrar pacientes** en una base de datos, utilizando una estructura organizada por capas.

---

## Descripción

La aplicación tiene como objetivo administrar los datos de pacientes, guardando información como su nombre, edad, historial médico, tratamiento y fecha de registro.

Por ahora cuenta con las siguientes funciones principales:

* **Listar pacientes:** muestra todos los registros existentes en la base de datos.
* **Crear paciente:** permite agregar un nuevo paciente y guardar su información en la base de datos.

---

## Estructura del proyecto

El proyecto está dividido en las siguientes capas:

* **Entity:** contiene la clase `PacienteEntity`, que representa la tabla `pacientes` en la base de datos.
* **Repository:** maneja la conexión con la base de datos utilizando `JpaRepository`.
* **Service:** implementa la lógica del negocio y utiliza el repositorio para realizar las operaciones necesarias.
* **Controller:** expone los endpoints para que el usuario pueda interactuar con la aplicación desde el navegador o herramientas como Postman.

---

## Tecnologías usadas

* **Java 21**
* **Spring Boot**
* **Spring Data JPA**
* **PostgreSQL** (base de datos)
* **Lombok**
* **Maven**

---

## Autor

**Alejandro García**
Proyecto realizado con fines académicos para practicar la lógica y estructura básica de un CRUD en Spring Boot, Readme hecho con ayuda de IA.
