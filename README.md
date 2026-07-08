# 🚗 Rent A Car - Enterprise RESTful API

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![OpenAPI](https://img.shields.io/badge/OpenAPI-3.0-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)

An enterprise-grade RESTful API designed for a Rent-A-Car system, developed utilizing **Java 17** and **Spring Boot 3**. The architecture strictly adheres to **S.O.L.I.D. principles** and the **N-Tier (Layered) Architecture** pattern to ensure high cohesion and loose coupling.

## 🏗️ System Architecture & Design

The system is decoupled into isolated layers, communicating exclusively through interfaces and DTOs to prevent domain model leakage and ensure modularity.

*   **Presentation Layer (Controllers):** Implements RESTful constraints. Returns standardized JSON responses via Spring's `ResponseEntity`.
*   **Business Logic Layer (Services):** Encapsulates core business rules. Utilizes **Dependency Injection (IoC)** via constructor injection for deterministic testing and immutability.
*   **Data Access Layer (Repositories):** Implements the **Repository Design Pattern** via Spring Data JPA, abstracting the underlying relational database persistence mechanism.
*   **Domain Model (Entities):** POJOs (Plain Old Java Objects) mapped to relational tables utilizing Hibernate ORM.

## ⚙️ Technical Specifications & Best Practices

*   **Data Transfer Object (DTO) Pattern:** Decouples the API contract from the internal database schema, optimizing payload size and preventing over-posting vulnerabilities.
*   **OpenAPI 3.0 Specification:** API endpoints are fully documented and interactive via Swagger UI, providing clear and standardized contracts for client-side consumption.
*   **Inversion of Control (IoC):** Spring's `ApplicationContext` manages bean lifecycles (Singleton by default), reducing memory footprint and enforcing structural modularity.
*   **Build & Dependency Management:** Maven is utilized for build lifecycle management, resolving transitive dependencies, and compiling the executable JAR.

## 🛠️ Tech Stack

*   **Core:** Java 17, Spring Boot 3.x
*   **Persistence:** Spring Data JPA, Hibernate, MS SQL Server (Configurable via `application.properties`)
*   **API Documentation:** Springdoc OpenAPI (Swagger UI)
*   **Boilerplate Reduction:** Project Lombok

## 🚀 Local Development Setup

1. Clone the repository to your local machine:
   ```bash
   git clone [https://github.com/ahmet-cann/rent-a-car-backend.git](https://github.com/ahmet-cann/rent-a-car-backend.git)