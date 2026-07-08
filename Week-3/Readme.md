# Spring Web Project

This repository contains hands-on exercises implemented using **Spring Boot**, **Spring Core**, **Spring Security**, and **RESTful Web Services** as part of the Cognizant Digital Nurture Program.

## Technologies Used

- Java 21
- Spring Boot 3.5.16
- Spring Core
- Spring MVC (REST APIs)
- Spring Security
- JWT (JSON Web Token)
- Maven
- Postman

## Exercises Completed

### 1. Spring Boot Maven Project
- Created a Spring Boot application using Maven.
- Configured and executed the project using Spring Initializr.
- Understood `@SpringBootApplication` and `SpringApplication.run()`.

### 2. Spring Core – Bean Configuration
- Loaded beans from `beans.xml`.
- Used `ApplicationContext` and `ClassPathXmlApplicationContext`.
- Demonstrated constructor injection and setter injection.
- Explored singleton and prototype bean scopes.

### 3. Hello World RESTful Web Service
- Developed a simple REST API that returns a "Hello World" response.
- Used `@RestController` and `@GetMapping`.

### 4. Country REST Web Service
- Created a REST endpoint to return India country details.
- Loaded the `Country` bean from Spring XML configuration.
- Returned Java objects as JSON responses.

### 5. Spring Security
- Added Spring Security to secure REST endpoints.
- Configured URL authorization using `SecurityFilterChain`.
- Allowed public access to selected endpoints.

### 6. JWT Authentication
- Implemented a basic authentication service that generates JWT tokens.
- Created request and response models for authentication.
- Generated JWT tokens using the JJWT library.
- Tested authentication endpoints using Postman.

## REST Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/hello` | Returns a Hello World message |
| GET | `/country` | Returns India country details |
| POST | `/authenticate` | Returns a JWT token after successful authentication |

## How to Run

```bash
mvn spring-boot:run
```

The application starts on the configured server port and can be tested using a browser or Postman.

## Learning Outcomes

- Spring Boot application development
- Dependency Injection and IoC
- XML-based bean configuration
- RESTful API development
- JSON response handling
- Spring Security configuration
- JWT-based authentication
- Maven project management

