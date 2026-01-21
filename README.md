# AutomationExercise UI Automation Framework

## 📌 Project Overview
This project is a UI automation framework built for the **AutomationExercise** website using **Selenium WebDriver** and **TestNG**.  
The framework follows **Page Object Model (POM)** design pattern and automates critical user flows of an e-commerce application.

The project is developed in **modules**, and each module is added incrementally, similar to real-world automation projects.

---

## 🛠 Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Git & GitHub

---

## 📁 Framework Design
- Page Object Model for maintainability and reusability
- Explicit waits for stable execution
- Independent test cases
- Scalable structure for future modules
- CI/CD ready design

---

## 🚀 Automated Modules

### ✅ Module 1 – User Authentication
The following user authentication scenarios are automated:

- User Registration
- Login with valid credentials
- Login with invalid credentials
- Logout
- Delete Account

**Validations performed:**
- Successful account creation
- Error message validation for invalid login
- Logged-in user verification
- Successful logout
- Account deletion confirmation

---

### ✅ Module 2 – Product Search & Details
The following product-related scenarios are automated:

- Product listing page navigation
- Search a product using keyword
- Validate searched products results
- Click on **View Product** from search results
- Validate product details page:
  - Product Name
  - Category
  - Reviewes
  - Price
  - Availability
  - Condition
  - Brand

---

## ▶ How to Run the Tests
1. Clone the repository:
   ```bash
   git clone <repository-url>
2.Import the project as a Maven Project in your IDE
3.Run tests using:
testng.xml
OR
Individual TestNG test classes

---

🔮 Future Enhancements
Add to Cart & Cart Validation
Checkout flow automation
Parallel execution support
Extent Reports integration
CI/CD pipeline (GitHub Actions / Jenkins)
