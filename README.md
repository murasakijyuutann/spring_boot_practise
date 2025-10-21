# 🌱 spring_boot_practise

A hands-on Spring Boot practice project focused on learning the essentials of building modern web applications using the Spring Framework.

---

## 🚀 Overview

This project serves as a sandbox for experimenting with core Spring Boot features such as:

- 🧭 Controller and Routing (`@GetMapping`, `@RequestParam`, etc.)
- 🛠️ MVC structure using Thymeleaf templates
- 🧪 Simple form handling and parameter passing
- 🗂️ Project structure and configuration basics

It is intended for beginner-to-intermediate developers who want to learn Spring Boot by doing.

---

## 🧰 Tech Stack

- **Spring Boot 3.x**
- **Java 17+**
- **Maven**
- **Thymeleaf**
- **Spring MVC**
- (Optional) **Lombok**, **DevTools**, etc.

---

## 📂 Project Structure

```
spring_boot_practise/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── spring_boot/
│ │ │ └── mjyuu/
│ │ │ └── controller/
│ │ │ └── parameter/
│ │ │ └── ControllerEx01.java
│ │ └── resources/
│ │ ├── templates/
│ │ │ └── pages/
│ │ │ └── viewPage01.html
│ │ └── application.yml or application.properties
│ └── test/...
└── pom.xml
```

---

## 🛠️ How to Run

1. **Clone the repo:**
   ```bash
   git clone https://github.com/yourusername/spring_boot_practise.git
   cd spring_boot_practise

2. Import into IntelliJ / Eclipse as a Maven project.
3. Run the application: 
```
./mvnw spring-boot:run

```

4. Access it via browser:
```
http://localhost:8080/ex01?id=hello&pw=world
```

To test the /ex01 endpoint:

http://localhost:8080/ex01?id=miku&pw=1234


You should see an HTML page rendered with the values displayed dynamically.

🤝 Contributing

This is a personal practice project, but if you'd like to contribute with improvements or examples, feel free to fork the repo and open a pull request!

📌 License

This project is open-source and free to use for educational purposes.

💡 Author

Created by [Your Name or GitHub Handle]
Focus: Learning and experimenting with Spring Boot basics.


---

