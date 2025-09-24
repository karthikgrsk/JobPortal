ZidioConnect – Job Finding Platform

ZidioConnect is a backend job portal application that connects job seekers with employers efficiently. Job seekers can register, create profiles, browse and apply for jobs, while employers can post jobs and track applications. The project demonstrates strong backend development skills using Java, Spring Boot, MySQL, and Spring Security, making it suitable to showcase in interviews.

Features

User Registration & Authentication: Secure login and registration system for job seekers and employers.

Profile Management: Users can create and update their profiles with personal and professional details.

Job Listings: Employers can post job openings with detailed descriptions.

Application Tracking: Job seekers can apply for positions and track their application status.

Admin Panel: Admins can manage users, job postings, and applications.

Technologies Used

Java: Core programming language.

Spring Boot: Framework for building the backend application.

Spring Security: For authentication and authorization.

JPA/Hibernate: Database interaction.

MySQL: Database management system.

Project Structure

The project follows a standard Maven directory layout:

ZidioConnect/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── JobFindingPlatform/
│                   ├── controller/
│                   ├── model/
│                   ├── repository/
│                   ├── security/
│                   └── service/
└── resources/
    └── application.properties


controller/: Contains the REST controllers handling HTTP requests.

model/: Holds the entity classes representing database tables.

repository/: Interfaces for database operations.

security/: Configuration classes for Spring Security.

service/: Business logic and service classes.

Setup Instructions

Clone the Repository:

git clone https://github.com/karthikgrsk/ZidioConnect.git
cd ZidioConnect


Configure Database:

Update src/main/resources/application.properties with your MySQL database credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/zidioconnect
spring.datasource.username=root
spring.datasource.password=yourpassword


Build the Project:

mvn clean install


Run the Application:

mvn spring-boot:run


The backend server will start on http://localhost:8080
.
