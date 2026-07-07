# 🚗 Rent A Car - Enterprise Backend API

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)

This project is an enterprise-grade **Rent-A-Car Backend API** developed with modern software engineering practices.

The primary goal of this project is to implement **Layered Architecture** and **S.O.L.I.D principles** to ensure a scalable, maintainable, and clean codebase.

## 🏗️ Architecture (Layered Design)

The project is built upon a layered architecture to minimize dependencies between components (Loose Coupling).

*   **Web API (Controllers):** Handles incoming HTTP requests from the client, routes them, and returns responses in JSON format.
*   **Business (Services):** The core layer where business rules are executed. Data validation and DTO-Entity mapping operations are handled here.
*   **Data Access (Repositories):** The layer responsible for direct communication with the database and CRUD operations, abstracted using Spring Data JPA.
*   **Entities:** The Object-Oriented (OOP) representations of the database tables.

## ⚙️ Core Features & Principles

*   **DTO (Data Transfer Object) Pattern:** Instead of exposing database entities directly to the outside world, DTOs are used to transfer only the necessary data for security and performance.
*   **Dependency Injection (IoC):** Transitions between layers are provided via interfaces and managed by Spring's IoC Container.
*   **API Documentation:** Integrated with Swagger (OpenAPI) for seamless testing and exploration of API endpoints.

## 🛠️ Technologies & Tools

*   **Language:** Java 17+
*   **Framework:** Spring Boot
*   **ORM:** Hibernate & Spring Data JPA
*   **Database:** In-Memory Database (for development) / MS SQL Server
*   **Tools:** Maven, Lombok, Swagger/OpenAPI UI

## 🚀 How to Run

1. Clone the repository to your local machine:
   ```bash
   git clone [https://github.com/ahmet-cann/rent-a-car-backend.git](https://github.com/ahmet-cann/rent-a-car-backend.git)