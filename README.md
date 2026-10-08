# Bulk Certificate Generator API

A REST API built with Java and Spring Boot that generates certificates in bulk for multiple recipients.

## 🚀 Features

- Generate certificates for multiple recipients using a single API request
- RESTful POST API
- JSON request and response
- Input validation
- Automatic certificate file generation
- Simple service-based architecture

## 🛠️ Technologies Used

- Java 21
- Spring Boot
- Maven
- REST API
- Postman
- Git & GitHub

## 📁 Project Structure

```text
certificate-generator
│
├── src
│   └── main
│       └── java
│           └── certificate_generator
│               ├── controller
│               │   └── CertificateController.java
│               │
│               ├── dto
│               │   └── CertificateRequest.java
│               │
│               ├── service
│               │   └── CertificateService.java
│               │
│               └── CertificateGeneratorApplication.java
│
├── pom.xml
└── README.md

## 🧪 API Testing with Postman

The API was tested successfully using Postman.

### Request

**Method:** `POST`

**Endpoint:**

```text
http://localhost:8080/api/certificates/generate

<img width="959" height="566" alt="image" src="https://github.com/user-attachments/assets/4fbc3cd0-c440-4708-98a2-178b179a376e" />
