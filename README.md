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

```markdown
### Postman Test Result

The API was successfully tested using Postman.

![Postman API Test](https://github.com/user-attachments/assets/fb19e527-40cb-4699-b702-e6f1cccf5bc8)

<img width="959" height="560" alt="image" src="https://github.com/user-attachments/assets/0ad98779-9920-40d2-a06d-d3f73eae05cc" />

