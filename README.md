Student Management REST API <br>

A simple and clean Spring Boot RESTful API for managing student records.<br>
Built using layered architecture with DTOs, validation, and global exception handling.<br>

Features<br> <br>

Create, Read, Update, Delete (CRUD) student records<br>

DTO-based request & response handling<br>

Input validation using Jakarta Validation<br>

Global exception handling<br>

RESTful API design<br>

Clean package structure (Controller, Service, Repository, Model)<br>

Tech Stack<br>

Java<br>

Spring Boot<br>

Spring Web<br>

Spring Data JPA<br>

Maven<br>

Hibernate<r>

MySQL / H2 (configurable)<br>
<br><br>
📁 Project Structure<br>
src/main/java/com/example/studentapi<br>
│
├── controller<br>
│ └── StudentController.java<br>
│
├── service<br>
│ └── StudentService.java<br>
│
├── repository<br>
│ └── StudentRepository.java<br>
│
├── model<br>
│ └── Student.java<br>
│
├── dto<br>
│ └── StudentDTO.java<br>
│
├── exception<br>
│ └── GlobalExceptionHandler.java<br>
│
└── StudentApplication.java<br>

API Endpoints<br>
Create Student<br>
POST /api/students<br>

Request Body<br>

{
"name": "John Doe",
"email": "john@example.com",
"age": 21
}<br>

Validation Rules<br>

Name must not be empty<br>

Email must be valid<br>

Age must be greater than 0<br>

Validation errors are handled globally and return meaningful responses.<br>

Database Configuration<br>

Update application.properties:<br>

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb<br>
spring.datasource.username=root<br>
spring.datasource.password=your_password<br>

spring.jpa.hibernate.ddl-auto=update<br>
spring.jpa.show-sql=true<br>

(H2 can be used for testing)<br>

Running the Application<br>
mvn spring-boot:run

Application will start at:<br>

http://localhost:7777

Learning Outcomes<br>

Understood DTO vs Entity separation<br>

Implemented clean service-based architecture<br>

Gained hands-on experience with Spring Boot REST APIs<br>

Learned exception handling and validation in real projects<br>

Future Enhancements<br>

PATCH API for partial updates<br>

Pagination & sorting<br>

Swagger (OpenAPI) documentation<br>

Authentication & Authorization (JWT)<br>

Deployment using Docker / Cloud<br>

Author:<br>
Marthala Muni<br>
B.Tech Student | Backend Developer (Spring Boot)
