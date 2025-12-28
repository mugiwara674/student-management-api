Student Management REST API

A simple and clean Spring Boot RESTful API for managing student records.
Built using layered architecture with DTOs, validation, and global exception handling.

Features

Create, Read, Update, Delete (CRUD) student records

DTO-based request & response handling

Input validation using Jakarta Validation

Global exception handling

RESTful API design

Clean package structure (Controller, Service, Repository, Model)

Tech Stack

Java

Spring Boot

Spring Web

Spring Data JPA

Maven

Hibernate

MySQL / H2 (configurable)

📁 Project Structure
src/main/java/com/example/studentapi
│
├── controller
│ └── StudentController.java
│
├── service
│ └── StudentService.java
│
├── repository
│ └── StudentRepository.java
│
├── model
│ └── Student.java
│
├── dto
│ └── StudentDTO.java
│
├── exception
│ └── GlobalExceptionHandler.java
│
└── StudentApplication.java

API Endpoints
Create Student
POST /api/students

Request Body

{
"name": "John Doe",
"email": "john@example.com",
"age": 21
}

Validation Rules

Name must not be empty

Email must be valid

Age must be greater than 0

Validation errors are handled globally and return meaningful responses.

Database Configuration

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

(H2 can be used for testing)

Running the Application
mvn spring-boot:run

Application will start at:

http://localhost:7777

Learning Outcomes

Understood DTO vs Entity separation

Implemented clean service-based architecture

Gained hands-on experience with Spring Boot REST APIs

Learned exception handling and validation in real projects

Future Enhancements

PATCH API for partial updates

Pagination & sorting

Swagger (OpenAPI) documentation

Authentication & Authorization (JWT)

Deployment using Docker / Cloud

Author:
Marthala Muni
B.Tech Student | Backend Developer (Spring Boot)
