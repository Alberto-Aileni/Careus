# Careus

## 📌 Project Overview

This is an academic project designed to categorize notable historical and intellectual figures by their respective disciplines and countries. 
By linking individuals, locations, and areas of study within a relational model, the application provides a straightforward way to explore and visualize how these figures and concepts are interconnected.

> ⚠️ **Project Disclaimer**
> 
> * **Visual Interface:** The user interface and CSS styling are currently **under active development**. The layout is functional but intentionally minimal.
> * **In-Development Features:** Additional features, refinements to state management, and visual enhancements are being implemented Gradually.

## 🛠️ Technologies

* **React**
* **React Router Dom**
* **Vite**
* **JavaScript**
* **HTML5 & CSS3**
* **Java**
* **Spring Boot**
* **Spring Data JPA & Hibernate**
* **Docker**
* **Docker Compose**
* **PostgreSQL**
* **Maven**
  
## 🚀 Features

* **Multi-entity Browsing:** Clean navigation across character, country, and discipline view listings.
* **Dynamic Routing:** Individual view pages accessible via parameterized paths (`/character/:id`, `/country/:id`, `/discipline/:id`).
* **Custom React Hooks:** Encapsulated state management handling async data fetching, loading flags, and basic error catching.
* **Relational Database Model:** PostgreSQL schema supporting entities and M:N relationships managed via Spring Data JPA/Hibernate.
* **Database Migrations:** Versioned schema updates and seed data managed automatically with Flyway.
* **Containerized Local Setup:** Quick database environment launch using Docker Compose.

## 🚀 Prerequisites

Be sure to have the following installed before tiying to run the project:
- **Node.js v18+** 
- **Java JDK v17+** 
- **Docker** 

## ⚙️ How to Run the Project

Follow these steps in order to start the entire development environment:

### 1. Start the Database with Docker
Navigate to the backend directory and launch the Docker containers:

```
bash
cd backend
docker compose up -d
```

### 2. Run the Backend
Start the Spring Boot application server:

```
./mvnw spring-boot:run
```

### 3. Run the Frontend
Open a separate terminal, navigate to the frontend directory, and launch the Vite development server:

```
cd frontend
npm run dev
```
