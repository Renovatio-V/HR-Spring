# Human Resources System

This project is a Human Resources System developed with React for the front end and Spring Boot for the back end. The system allows users to view a list of employees, as well as add, edit, and delete employee records. Each employee has a unique ID that is generated automatically, and the system maintains information such as name, department, and salary.

## Technologies Used

### Front End
- **React**: A JavaScript library for building user interfaces.
- **React Components**: Used to build modular and reusable UI components.
- **Axios**: A promise-based HTTP client for making asynchronous requests.

### Back End
- **Spring Boot**: A framework for building Java-based applications.
- **REST Controller**: Used to handle HTTP requests and responses.
- **Service Layer**: Encapsulates the business logic of the application.
- **Data Layer**: Manages interactions with the database using Spring Data JPA.

### Database
- **MySQL**: A relational database management system used to store employee data.

## Spring Boot Version
- **v3.3.2**

## Dependencies
- **Lombok**: Used to reduce boilerplate code by generating getter, setter, and other methods.
- **Spring Web**: Provides tools for building web applications, including RESTful services.
- **MySQL**: The database used for storing employee information.
- **Spring Data JPA**: Provides easy integration with JPA (Java Persistence API) for data access.

## Node Version
- **v22.4.1**

## Features
- View a list of employees with columns for ID, name, department, and salary.
- Add new employees with a form.
- Edit existing employee details.
- Delete employees from the system.
- Automatically generated unique ID for each employee.

## Getting Started

### Prerequisites
- Node.js and npm installed on your machine.
- Java Development Kit (JDK) installed.
- MySQL database setup.

### Usage

1. Open your browser and navigate to `http://localhost:3000` to access the front end of the Human Resources System.
2. Use the interface to view, add, edit, and delete employee records.

## Project Structure

### Front End
- **components/**: Contains React components for the application.
- **services/**: Contains Axios services for making HTTP requests.

### Back End
- **controller/**: Contains REST controllers for handling HTTP requests.
- **service/**: Contains business logic.
- **repository/**: Contains data access logic using Spring Data JPA.
- **model/**: Contains entity classes representing the database schema.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## Generel View
![image](https://github.com/user-attachments/assets/2f014683-f1e3-4fc2-bac0-5a6290ce2468)
