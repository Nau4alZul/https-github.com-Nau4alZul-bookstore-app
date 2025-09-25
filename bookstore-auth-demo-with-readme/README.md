# 📚 Bookstore Application with Login (Spring Boot + PostgreSQL)

A simple **Spring Boot web application** with:
- ✅ User Registration & Login (Spring Security)
- ✅ Book Management (list books after login)
- ✅ PostgreSQL Database
- ✅ Thymeleaf Templates (browser-based, no Postman required)
- ✅ Maven Build (Eclipse/IntelliJ compatible)

---

## 🚀 Features
- User authentication system (register, login, logout)
- Passwords stored securely using BCrypt
- Auto-database table creation (via Hibernate/JPA)
- Web pages (HTML + Thymeleaf):
  - `/register` → user registration
  - `/login` → user login
  - `/books` → list of books (only after login)

---

## 🛠 Requirements
- Java **17** or later  
- Maven **3.6+**  
- PostgreSQL (running locally on port 5432)  
- Browser (Chrome/Edge/Firefox)

---

## ⚙️ Setup

### 1. Clone the Repository
```sh
git clone https://github.com/Nau4alZul/bookstore-app.git
cd bookstore-app
```

### 2. Setup PostgreSQL
```sql
CREATE DATABASE bookstoredb;
CREATE USER bookstore_user WITH PASSWORD 'password';
GRANT ALL PRIVILEGES ON DATABASE bookstoredb TO bookstore_user;
```

### 3. Configure Database in `src/main/resources/application.properties`
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/bookstoredb
spring.datasource.username=bookstore_user
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
```

---

## ▶️ Run the Application
Use Maven to build and run:

```sh
mvn spring-boot:run
```

When successful, you’ll see:
```
Tomcat started on port(s): 8080
Started BookstoreApplication in ...
```

---

## 🌐 Access in Browser
- 🔑 Register → [http://localhost:8080/register](http://localhost:8080/register)  
- 🔑 Login → [http://localhost:8080/login](http://localhost:8080/login)  
- 📚 Books → [http://localhost:8080/books](http://localhost:8080/books)  

---

## 📂 Project Structure
```
bookstore-app
 ├── src/main/java/com/example/bookstore
 │    ├── BookstoreApplication.java   # Main class
 │    ├── model/                      # Entities (User, Book)
 │    ├── repository/                 # JPA Repositories
 │    ├── controller/                 # Web Controllers
 │    └── config/                     # Security Config
 ├── src/main/resources
 │    ├── templates/                  # Thymeleaf HTML pages
 │    └── application.properties      # DB config
 └── pom.xml                          # Maven dependencies
```

---

## 📖 Notes
- Default port: `8080`
- Tables are auto-created by Hibernate
- Passwords stored with **BCrypt**

---

## 👨‍💻 Author
This project was built for **demo purposes**.  
You can extend it with more features:
- Add book CRUD operations
- Add user roles (ADMIN, USER)
- Deploy to cloud (Heroku/AWS/GCP)
