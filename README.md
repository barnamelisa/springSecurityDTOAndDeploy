# 🎉 Event Management System with Security & Deployment  

![Contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg)  

📌 This repository contains the implementation of an **Event Management System** using **Spring Boot**, with added features such as **Spring Security**, **Lombok**, and **deployment using Railway**. The system allows users to **create, view, and delete events**, as well as **manage categories and tags**, while also ensuring secure authentication and authorization. The application follows **SOLID principles**, **Layered Architecture**, and **Clean Code** principles to ensure maintainability and scalability.  

---  

## 📖 Table of Contents  
- [📌 About](#-about)  
- [🚀 Features](#-features)  
- [💻 How to Use](#-how-to-use)  
- [🔹 How the Application Works](#-how-the-application-works)  
- [ℹ️ More Information about Implementation](#ℹ️-more-information-about-implementation)  

---  

## 📌 About  

This **Event Management System** allows users to **create, delete, and manage events**, along with their associated **categories and tags**. Users can also **view all existing events, categories, and tags** while ensuring secure access via **Spring Security**.  

### Core Features:
- **Spring Boot** framework for easy backend development.  
- **Spring MVC** for handling web requests.  
- **Spring Data JPA** for database management.  
- **Thymeleaf** templating engine for rendering the UI.  
- **Spring Security** for authentication and authorization.  
- **Lombok** to reduce boilerplate code.  
- **Railway** for easy deployment.  

---  

## 🚀 Features  

### 📅 **Event Management**  
✔️ View all events  
✔️ Create new events  
✔️ Delete events  

### 📂 **Category Management**  
✔️ View all categories  
✔️ Create new categories  

### 🏷️ **Tag Management**  
✔️ View all tags  
✔️ Create new tags  

### 🔐 **Security Features**  
✔️ User authentication and authorization using **Spring Security**  
✔️ Secure password storage with **BCrypt hashing**  
✔️ Role-based access control  

### 🚀 **Deployment Features**  
✔️ Automated deployment using **Railway**  
✔️ Environment variable support for secure configuration  

---  

## 💻 How to Use  

### 🔹 **Clone the Repository**  
```sh  
git clone https://github.com/barnamelisa/springSecurityDTOAndDeploy.git  
cd springSecurityDTOAndDeploy  
```  

### 🔹 **Run the Application**  
1. Configure **MySQL Database** and update `application.properties`.  
2. Build and run the Spring Boot application.  
```sh  
mvn spring-boot:run  
```  
3. Access the application at `http://localhost:8080/`.  

---  

## 🔹 How the Application Works  

- **Events**: Users can create events by providing a name, description, organizer email, and selecting a category. They can also view and delete events.  
- **Categories**: Users can see all available categories and create new ones.  
- **Tags**: Users can view and create tags that can be assigned to events.  
- **Authentication**: Users must log in to access functionalities. Passwords are securely hashed.  
- **Role-based Access Control**: Different user roles have different permissions.  
- **Deployment**: The application is deployed on **Railway**, making it accessible online.  

---  

## ℹ️ More Information about Implementation  

This application follows best practices in software development:  

- **Spring Boot**: Used for quick setup and streamlined backend development.  
- **Spring MVC**: Implements the Model-View-Controller (MVC) pattern to separate business logic, data, and UI.  
- **Spring Data JPA**: Handles database interactions and simplifies CRUD operations.  
- **Thymeleaf**: Provides a dynamic frontend by rendering views with data from the backend.  
- **Spring Security**: Manages user authentication and authorization securely.  
- **Lombok**: Reduces boilerplate code, making the project cleaner and more maintainable.  
- **Password Hashing**: User passwords are securely hashed using **BCrypt** to enhance security.  
- **MySQL Database**: Stores all event-related data. The system automatically creates tables such as events, categories, and tags.  
- **Railway Deployment**: The application is deployed on **Railway**, allowing it to be accessed online.  

