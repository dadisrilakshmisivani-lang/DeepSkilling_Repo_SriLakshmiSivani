# Account Service Microservice

## Overview

The **Account Service** is a Spring Boot microservice developed using the Microservices Architecture. It manages bank account information by providing REST APIs to create and retrieve account details.

This project uses:

- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Maven
- Java 21

---

## Features

- Create a new bank account
- Retrieve all account details
- RESTful APIs
- H2 In-Memory Database
- Layered Architecture

---

## Technologies Used

- Java 21
- Spring Boot 3.5.x
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## Project Structure

```
account-service
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.bank.account_service
│   │   │       ├── controller
│   │   │       │     └── AccountController.java
│   │   │       ├── entity
│   │   │       │     └── Account.java
│   │   │       ├── repository
│   │   │       │     └── AccountRepository.java
│   │   │       ├── service
│   │   │       │     └── AccountService.java
│   │   │       └── AccountServiceApplication.java
│   │   │
│   │   └── resources
│   │         └── application.properties
│
├── pom.xml
└── README.md
```

---

## Dependencies

- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Spring Boot Test

---

The application starts at:

```
http://localhost:8080
```

---

## REST APIs

### Create Account

**POST**

```
http://localhost:8080/accounts
```

Request Body

```json
{
    "customerName": "Sivani",
    "accountType": "Savings",
    "balance": 50000
}
```

Response

```json
{
    "accountNumber": 1,
    "customerName": "Sivani",
    "accountType": "Savings",
    "balance": 50000.0
}
```

---

### Get All Accounts

**GET**

```
http://localhost:8080/accounts
```

Response

```json
[
    {
        "accountNumber": 1,
        "customerName": "Sivani",
        "accountType": "Savings",
        "balance": 50000.0
    }
]
```

---

