📦 Inventory Management System
A full-stack web application built with Spring Boot, Thymeleaf, and MySQL that provides complete inventory management with role-based access control, product CRUD operations, and export functionality.

https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white
https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white
https://img.shields.io/badge/Bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white
https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white

🚀 Features
🔐 Authentication & Authorization
Role-Based Access Control (ROLE_ADMIN)

Secure login/logout functionality

Spring Security integration

Password encryption with BCrypt

📦 Product Management
Complete CRUD Operations (Create, Read, Update, Delete)

Real-time product search functionality

Product catalog with descriptions, prices, and quantities

Responsive product listing with Bootstrap styling

💼 Business Features
Excel Export Ready - Export product data to Excel

Inventory tracking with quantity management

Professional admin dashboard

MySQL database persistence

🎨 User Interface
Responsive Bootstrap UI

Clean, professional design

Intuitive navigation

Mobile-friendly interface

🛠️ Technology Stack
Layer	Technology
Backend	Spring Boot 3.2.5, Spring Security, Spring Data JPA
Frontend	Thymeleaf, Bootstrap 5, Bootstrap Icons
Database	MySQL, Hibernate JPA
Build Tool	Maven
Export	Apache POI (Excel export)
📋 Prerequisites
Before running this application, ensure you have:

Java 17+ JDK installed

MySQL 8.0+ server running

Maven 3.6+ for dependency management

Git (for cloning the repository)

⚙️ Installation & Setup
1. Clone the Repository
bash
git clone https://github.com/tzzlabs/inventory-management-system.git
cd inventory-management-system
2. Configure Database
Create MySQL database and user:

sql
CREATE DATABASE inventory_db;
CREATE USER 'inventory_user'@'localhost' IDENTIFIED BY 'password123';
GRANT ALL PRIVILEGES ON inventory_db.* TO 'inventory_user'@'localhost';
FLUSH PRIVILEGES;
3. Configure Application
Update src/main/resources/application.properties with your database credentials:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=inventory_user
spring.datasource.password=password123
4. Build and Run
bash
# Using Maven
mvn clean spring-boot:run

# Or run directly from IDE
# The application will start on http://localhost:8080
🔐 Default Login Credentials
The system automatically creates an admin user on first startup:

Username: admin

Password: admin123

🖥️ Usage
Access the Application
Open your browser and navigate to http://localhost:8080

Login with the default credentials

You'll be redirected to the admin dashboard

Managing Products
View Products: Click "Manage Products" from the dashboard

Add Product: Click "Add New Product" button

Edit Product: Click "Edit" next to any product

Delete Product: Click "Delete" (with confirmation)

Search Products: Use the search bar to filter products

Export Functionality
Navigate to the products list page

Click "Export Excel" to download product data as Excel file

🚀 API Endpoints
Method	Endpoint	Description
GET	/	Admin dashboard
GET	/login	Login page
GET	/products	Product list
GET	/products/new	Add product form
POST	/products/save	Save product
GET	/products/edit/{id}	Edit product form
GET	/products/delete/{id}	Delete product
GET	/products/search	Search products
GET	/products/export	Export to Excel
🔧 Customization
Adding New Roles
Update DataInitializer.java to create new roles

Modify SecurityConfig.java for role-based access

Update user-role relationships as needed

Modifying Product Fields
Update Product.java entity

Modify products/form.html for new fields

Update ProductService for business logic
