# 📇 Address Book Development

A **Spring Boot REST API** for managing an Address Book containing contacts with details such as name, phone, email, and address.  
This project demonstrates clean architecture, proper CRUD operations, DTO usage, validation, and exception handling.

---

## 🚀 Features

- Create, read, update, and delete contacts
- Validation for input data
- DTO-based request and response
- Global exception handling
- Uses Spring Data JPA for persistence
- In-memory H2 database for development/testing
- Swagger UI for interactive documentation

---

## 🛠 Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 17 | Programming language |
| Spring Boot | Application framework |
| Spring Data JPA | ORM layer |
| H2 / MySQL | Database |
| Maven | Build & dependency management |
| Jakarta Validation | Input validation |
| Springdoc OpenAPI | Swagger documentation |
| Lombok | Boilerplate reduction |

---
## 🧠 API Overview

| Method | Endpoint                | Description |
|--------|-------------------------|-------------|
| `GET`  | `/contacts`             | Get all contacts |
| `GET`  | `/contacts/{id}`        | Get a contact by ID |
| `POST` | `/contacts`             | Create a new contact |
| `PUT`  | `/contacts/{id}`        | Update contact |
| `DELETE`| `/contacts/{id}`       | Delete contact |
