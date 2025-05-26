# qa-student-starter-kit
A reusable Java 17 automation framework template for UI/API testing. Built with Maven, Cucumber (BDD), TestNG, Aquality Selenium, and Allure for reporting. Designed for students and new QA engineers to practice professional-grade testing setups.

# 🧪 Java Test Automation Template (Student Edition)

A complete starter framework for UI and API test automation using Java 17 and industry-standard tools like Cucumber (BDD), TestNG, Allure, and Aquality Selenium.

---

## 🚀 Key Features

- ✅ Behavior-Driven Development (BDD) with Cucumber
- ✅ TestNG support for structured test execution
- ✅ Allure reports for test results and visualization
- ✅ Aquality Selenium for scalable UI automation
- ✅ Awaitility for smart waits in async environments
- ✅ Gson for working with JSON APIs
- ✅ Lombok to reduce boilerplate code
- ✅ Maven build and dependency management
- ✅ AspectJ for runtime instrumentation with Allure

---

## 🔧 Tech Stack

| Tool/Library        | Purpose                          |
|---------------------|----------------------------------|
| **Java 17**         | Programming language             |
| **Maven**           | Build and dependency manager     |
| **Cucumber**        | BDD and feature file support     |
| **TestNG**          | Test runner and lifecycle        |
| **Aquality Selenium** | UI test automation             |
| **Allure**          | Test reporting and visualization |
| **Awaitility**      | Fluent wait handling             |
| **Gson**            | JSON serialization/deserialization |
| **Lombok**          | Boilerplate code reduction       |
| **AspectJ**         | Instrumentation for Allure       |

---

## 🧱 Project Structure

```text
src
├── main
│   └── java
│       └── framework (page objects, utils)
├── test
│   └── java
│       └── stepdefinitions, tests, runners
└── resources
    └── features (Cucumber .feature files)
