# 📌 ATS — Applicant Tracking System (Java Web App)

A lightweight Java-based **Applicant Tracking System** built using **JSP, Servlets, JDBC, MySQL, and Apache Tomcat**.  
Provides **User Registration**, **Login**, **Session Management**, and a simple **Dashboard**.

---

## 🚀 Features

-  User Registration  
-  Login with Sessions  
-  Dashboard Page  
-  MySQL Database Integration  
-  MVC-Style Java Web App  
-  Deployable on Apache Tomcat (v10+)  
-  Built with Maven  

---

## 🛠 Tech Stack

| Layer            | Technology            |
|------------------|------------------------|
| Language         | Java (JDK 17+)         |
| Backend          | JSP, Servlets          |
| Framework        | Jakarta Servlet API    |
| Database         | MySQL                  |
| Database Access  | JDBC                   |
| Server           | Apache Tomcat 10       |
| Build Tool       | Maven                  |

---

# 📥 Installation & Setup

## **1️⃣ Clone the Repository**

```bash
git clone https://github.com/Sidhardha36/ATS.git
cd ATS

2️⃣ Configure Database (MySQL)
Create database:
CREATE DATABASE ats_db;
USE ats_db;
Create users table:

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) DEFAULT 'user',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
Insert test user:

INSERT INTO users (name, email, password)
VALUES ('Test User', 'test@gmail.com', '12345');

3️⃣ Update Database Connection
Open:
src/main/java/com/ats/util/DBConnection.java

Update your MySQL credentials:
private static final String URL = "jdbc:mysql://localhost:3306/ats_db";
private static final String USER = "root";
private static final String PASSWORD = "your_password";

4️⃣ Build WAR File Using Maven
bash
mvn clean package

WAR file will be created at:
target/ATS.war

5️⃣ Deploy on Apache Tomcat
target/ATS.war

Paste into:
tomcat/webapps/

6️⃣ Start Tomcat
Windows:
catalina.bat run

Linux / macOS:
./catalina.sh run

7️⃣ Access the Application
Open browser:
👉 http://localhost:8080/ATS/

You will see:
1.HomePage
2.Register Page
3.Login Page
4.Dashboard

📂 Project Structure

ATS/
│── src/
│   └── main/
│       ├── java/
│       │   └── com/ats/
│       │       ├── model/
│       │       │   └── User.java
│       │       ├── dao/
│       │       │   └── UserDAO.java
│       │       ├── servlet/
│       │       │   ├── RegisterServlet.java
│       │       │   └── LoginServlet.java
│       │       └── util/
│       │           └── DBConnection.java
│       │
│       ├── webapp/
│       │   ├── index.jsp
│       │   ├── register.jsp
│       │   ├── login.jsp
│       │   ├── dashboard.jsp
│       │   └── WEB-INF/
│       │       └── web.xml
│       └── resources/
│
├── pom.xml
└── target/
    └── ATS.war
    
## Author
Sidhardha Varma
