
# 🛒 Ecommerce Web Application

## 📌 Overview
The **Ecommerce Web Application** is a modern, full-stack monolithic solution designed to facilitate online shopping experiences for users. It includes features such as product browsing, cart management, secure login, order checkout, and user profile management.

## 🚀 Features
- **User Authentication**: Login/logout and session-based security.
- **Product Listing**: Browse through available products.
- **Category Menu**: Filter products by category.
- **Search**: Quickly find products by keyword.
- **Product Details**: View full details of individual products.
- **Cart System**: Add, update, and remove products from cart.
- **Checkout**: Simple and secure checkout process.
- **Member Area**: Personalized dashboard for registered users.

## 🏠 Architecture
This project is built using a **monolithic architecture**, with front-end and back-end components tightly integrated for ease of development and deployment.

### Modules:
1. **Login Module** – User authentication and session handling.
2. **Product Module** – Handles product listing, categories, and search.
3. **Cart Module** – Manages shopping cart logic and status.
4. **Checkout Module** – Handles order processing and payment.
5. **User Module** – Manages user details and member page.

## 🛠️ Tech Stack
- **Frontend**: Angular  
- **Backend**: Java (Spring Boot)  
- **Database**: MySQL  
- **Authentication**: Spring Security  

## 🏁 Getting Started

### Prerequisites
- Java 17  
- Node.js & npm  
- Angular CLI  
- MySQL  

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/sumit70707/Ecommerce.git
   cd Ecommerce
   ```

2. **Backend Setup**:
   - Navigate to the backend folder.
   - Configure `application.properties` for DB connection.
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

3. **Frontend Setup**:
   - Navigate to the Angular project folder.
   ```bash
   npm install
   ng serve
   ```

## 🤝 Contributing
Contributions are welcome! Feel free to fork this repo, raise issues, and submit PRs to improve the application.
