# 🔐 Spring Boot MVC Security Project

A simple and practical example of building a secure web application using **Spring Boot**, **Spring MVC**, and **Spring Security**.

This project demonstrates authentication, authorization, and secure endpoint handling in a clean and structured way.

---

## 🚀 Features

- 🔑 User Authentication (Login / Logout)
- 🛡️ Role-Based Authorization (Admin / User)
- 🌐 Spring MVC Web Application
- 🔒 Secure Endpoints using Spring Security
- 📦 Clean layered architecture (Controller - Service - Repository)
- ⚙️ Configurable security settings
- 💾 Database integration (JPA / Hibernate)

---

## 🏗️ Tech Stack

- Java
- Spring Boot
- Spring MVC
- Spring Security
- Spring Data JPA
- Maven

> Spring Boot simplifies development by providing auto-configuration and embedded servers. :contentReference[oaicite:1]{index=1}

---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/
│   │       ├── controller/     # Handles HTTP requests
│   │       ├── service/        # Business logic
│   │       ├── repository/     # Database access layer
│   │       ├── entity/         # JPA Entities
│   │       ├── config/         # Security & App configuration
│   │       └── security/       # Security classes (filters, config)
│   └── resources/
│       ├── application.properties
│       └── templates/          # Thymeleaf pages (if exists)
```

---

## ⚙️ How to Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/Sasatayea/spring-boot-spring-mvc-security.git
cd spring-boot-spring-mvc-security
```

### 2. Build the project

```bash
mvn clean install
```

### 3. Run the application

```bash
mvn spring-boot:run
```

---

## 🌐 Application URLs

| Endpoint        | Description              |
|----------------|--------------------------|
| `/login`       | Login page               |
| `/home`        | Public page              |
| `/admin`       | Admin-only page          |
| `/user`        | User-only page           |

---

## 🔐 Security Overview

This project uses **Spring Security** to:

- Authenticate users using username & password
- Restrict access based on roles
- Protect endpoints from unauthorized access
- Manage login/logout flow

---

## 👤 Roles & Access

| Role   | Access Level                  |
|--------|------------------------------|
| USER   | Basic access                 |
| ADMIN  | Full access (admin endpoints)|

---

## 🧪 Example Credentials (if configured)

```text
Username: user
Password: password

Username: admin
Password: admin
```

---

## 🧠 Learning Objectives

This project helps you understand:

- How Spring Security works internally
- How to configure security filters
- How to protect routes/endpoints
- Difference between authentication & authorization
- Role-based access control (RBAC)

---

## 🛠️ Future Improvements

- JWT Authentication
- OAuth2 Login (Google / GitHub)
- REST API version
- Docker support
- Frontend integration (React / Angular)

---

## 🤝 Contributing

Feel free to fork the project and submit pull requests.

---

## 📜 License

This project is open-source and available under the MIT License.

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub!
