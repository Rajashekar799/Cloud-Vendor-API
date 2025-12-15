# ☁️ Cloud Vendor REST API

A **Spring Boot REST API** for managing Cloud Vendor details using standard CRUD operations.  
This project demonstrates **RESTful web services**, **layered architecture**, and **Spring Data JPA** integration.

---

## 🚀 Features
- Create, Read, Update, Delete (CRUD) Cloud Vendor details
- RESTful API design
- Clean layered architecture (Controller, Service, Repository)
- Uses Spring Boot & Spring Data JPA
- JSON-based request & response
- Integrated with MySQL database
- Swagger annotations for API documentation

---

## 🛠️ Tech Stack

- **Backend:** Java, Spring Boot
- **REST:** Spring Web
- **Database:** MySQL
- **ORM:** Spring Data JPA (Hibernate)
- **Build Tool:** Maven
- **Testing Tool:** Postman
- **API Docs:** Swagger

---

## 📂 Project Structure
Cloud-Vendor-API
│── controller
│── service
│ └── impl
│── repository
│── model
│── exception
│── response
│── resources
│ ├── application.properties
│ └── application.yaml


---

## 🔗 API Endpoints

### ➕ Create Cloud Vendor
POST /cloudvendor

**Request Body**
```json
{
  "vendorId": "123",
  "vendorName": "Rajashekar",
  "vendorAddress": "Hyderabad",
  "vendorPhoneNumber": "79935xxxxx"
}

📄 Get All Cloud Vendors
GET /cloudvendor

🔍 Get Cloud Vendor by ID
GET /cloudvendor/{vendorId}

✏️ Update Cloud Vendor
PUT /cloudvendor

❌ Delete Cloud Vendor
DELETE /cloudvendor/{vendorId}

⚙️ Configuration

Update application.properties with your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/cloud_vendor_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

▶️ How to Run the Project

Clone the repository

git clone https://github.com/Rajashekar799/Cloud-Vendor-API.git


Open the project in IntelliJ IDEA

Update database credentials

Run:

mvn spring-boot:run


Access APIs at:

http://localhost:8080/cloudvendor

🧪 Testing

Use Postman to test REST endpoints

JSON format supported

HTTP status codes handled properly

📘 Learning Outcomes

REST API design principles

Spring Boot project structuring

JPA & Hibernate usage

Exception handling

Clean backend architecture

👨‍💻 Author

Rajashekar Rikkula

GitHub: https://github.com/Rajashekar799

⭐ If you find this project useful, give it a star!
