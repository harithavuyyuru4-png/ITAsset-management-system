# IT Asset Management System

## Project Overview
The IT Asset Management System is a Spring Boot application designed to manage IT assets and employee information efficiently. It provides REST APIs to perform CRUD operations and maintains the relationship between employees and their assigned assets.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- REST API
- Swagger UI
- Maven

## Features
- Create, retrieve, update, and delete employee records.
- Manage IT asset information using CRUD operations.
- Maintain relationships between employees and assets using JPA.
- Store and retrieve data from a MySQL database.
- Enforce unique serial numbers for IT assets.
- Test and document REST API endpoints using Swagger UI.

## Database Entities

### Employee
- Employee ID
- Employee Name
- Email
- Department

### Asset
- Asset ID
- Asset Name
- Asset Type
- Serial Number
- Purchase Date
- Status
- Employee ID

## API Documentation
Swagger UI is used to explore and test the REST API endpoints.

Run the application and open:

http://localhost:7654/swagger-ui/index.html

## Database Configuration
Create a MySQL database named `sbdata` and configure the database username and password in `application.properties`.

## How to Run the Project
1. Clone or download this repository.
2. Open the project in Spring Tool Suite or Eclipse.
3. Configure MySQL credentials in `application.properties`.
4. Run the `ItAssetApplication.java` class.
5. Open the Swagger UI URL in your browser to test the APIs.

## Learning Outcomes
- Developed REST APIs using Spring Boot.
- Implemented database operations using Spring Data JPA.
- Established entity relationships using Hibernate.
- Integrated MySQL with a Spring Boot application.
- Tested REST APIs using Swagger UI.

## Author
Java Full Stack Developer – Fresher
