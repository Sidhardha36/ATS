ATS – Applicant Tracking System (JSP + Servlets + MySQL)

A lightweight Applicant Tracking System (ATS) built using Java Servlets, JSP, JDBC, MySQL, and deployed on Apache Tomcat.
This project allows users to Register, Login, and access a simple Dashboard.


⭐ Features

1.User Registration

2.User Login

3.Session-based Authentication

4.MySQL Database Integration

5.MVC Architecture (DAO → Servlet → JSP)

6.WAR Packaging + Tomcat Deployment

🚀 Installation & Setup
1. Clone the Repository
git clone https://github.com/Sidhardha36/ATS.git
cd ATS

2. Configure the Database
Create Database
CREATE DATABASE ats_db;

Use the Database
USE ats_db;

Create Users Table
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(255),
    role VARCHAR(50) DEFAULT 'user',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

Insert sample test user
INSERT INTO users(name, email, password)
VALUES ('Test User', 'test@gmail.com', '12345');

3. Update Database Credentials


src/com/ats/util/DBConnection.java


Set your MySQL username & password:

private static final String URL = "jdbc:mysql://localhost:3306/ats_db";
private static final String USER = "root";
private static final String PASSWORD = "your_password";

4. Build the WAR File
mvn clean package


The WAR file will be created:

target/ATS.war

5. Deploy on Apache Tomcat

target/ATS.war → tomcat/webapps/

Start Tomcat (Windows):
catalina.bat run

Start Tomcat (Linux/macOS):
./catalina.sh run

6. Access the Application

Visit in browser:

http://localhost:8080/ATS/


You will see:

- Homepage
- Register Page
- Login Page
- Dashboard


📁 Project Structure
ATS/
 ├── src/
 │   └── com/ats/
 │       ├── model/
 │       │   └── User.java
 │       ├── dao/
 │       │   └── UserDAO.java
 │       ├── servlet/
 │       │   ├── RegisterServlet.java
 │       │   └── LoginServlet.java
 │       └── util/
 │           └── DBConnection.java
 ├── webapp/
 │   ├── index.jsp
 │   ├── register.jsp
 │   ├── login.jsp
 │   ├── dashboard.jsp
 │   └── WEB-INF/
 │       └── web.xml
 ├── pom.xml
 └── target/ATS.war

🛠 Tech Stack
----------------------------------------
Component	  |    Technology
----------------------------------------
Backend	      |    Java Servlets, JSP
Build Tool	  |    Maven
Server	      |    Apache Tomcat
Database	  |    MySQL
Architecture  |    MVC
Packaging	  |    WAR

📌 Future Improvements

1.Add resume upload.

2.Add admin dashboard.

3.Add job posting module.

4.Add filters and candidate search.



📄 License

MIT License.

Author

Siddhardha Varma