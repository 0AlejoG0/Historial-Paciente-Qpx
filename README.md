# Proyecto: hacer consulta crear paciente

Este proyecto fue desarrollado como práctica para comprender el funcionamiento básico de **Spring Boot** y **JPA** mediante la creación de un CRUD sencillo.
El sistema permite **listar** y **registrar pacientes** en una base de datos, utilizando una estructura organizada por capas.

---

## Descripción

Este proyecto permite registrar, consultar, actualizar y eliminar pacientes de una base de datos usando Spring Boot y JPA.

Por ahora cuenta con las siguientes funciones principales:

* **Listar pacientes:** muestra todos los registros existentes en la base de datos.
* **Crear paciente:** permite agregar un nuevo paciente y guardar su información en la base de datos.
* **Buscar paciente por ID:** Permite obtener la información de un paciente específico utilizando su identificador único.
* **Actualizar paciente:** Permite modificar los datos de un paciente existente mediante su ID.
* **Eliminar paciente:** Elimina permanentemente el registro de un paciente de la base de datos.
  +
  
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

## 🚀 Cómo ejecutar el proyecto

1. Clona el repositorio:

   ```bash
   git clone https://github.com/0AlejoG0/Historial-Paciente.git
   ```
2. Abre el proyecto en IntelliJ IDEA o VS Code.
3. Configura tu base de datos en `application.properties`:

   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/historial_pacientes
   spring.datasource.username=postgres
   spring.datasource.password=tu_contraseña
   ```
4. Ejecuta la clase principal:

   ```
   HistorialApplication.java
   ```
5. La API estará disponible en:

   ```
   http://localhost:8080/historial
   ```

---

## 🧪 CRUD (Usar con Postman)

### 🟢 Crear un paciente

**POST:** `http://localhost:8080/historial`
**Body (JSON O TEXT):**

```json
{
  "nombre": "Alejandro García",
  "edad": 17,
  "historial": "Sin antecedentes",
  "tratamiento": "Ninguno",
  "fechaRegistro": "2025-11-06 14:00:00"
}
```

---

### 🟡 Listar todos los pacientes

**GET:** `http://localhost:8080/historial`

---

### 🔵 Buscar paciente por ID

**GET:** `http://localhost:8080/historial/{id}`
Ejemplo:
`http://localhost:8080/historial/3`

---

### 🟠 Actualizar paciente

**PUT:** `http://localhost:8080/historial/{id}`
**Body (UNICAMENTE JSON):**

```json
{
  "nombre": "Alejandro G. Actualizado",
  "edad": 18,
  "historial": "Revisado por control",
  "tratamiento": "Vitaminas",
  "fechaRegistro": "2025-11-06 16:30:00"
}
```

---

### 🔴 Eliminar paciente

**DELETE:** `http://localhost:8080/historial/{id}`
Ejemplo:
`http://localhost:8080/historial/4`

---


## Autor

**Alejandro García**
Proyecto realizado con fines académicos para practicar la lógica y estructura básica de un CRUD en Spring Boot, Readme hecho con ayuda de IA.
