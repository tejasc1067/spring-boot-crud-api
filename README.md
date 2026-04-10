
# Spring Boot CRUD API

This project is a beginner-friendly backend application built using **Spring Boot**.  
It demonstrates how to build REST APIs with proper structure, exception handling, and validation.

---

## Features

| Method   | Endpoint       | Description     |
|----------|----------------|-----------------|
| `POST`   | `/users`       | Create User     |
| `GET`    | `/users`       | Get All Users   |
| `GET`    | `/users/{id}`  | Get User by ID  |
| `PUT`    | `/users/{id}`  | Update User     |
| `DELETE` | `/users/{id}`  | Delete User     |

---

## Concepts Covered

- REST API development using Spring Boot
- CRUD operations (Create, Read, Update, Delete)
- Exception Handling (Custom + Global)
- JSON to Java Object Mapping

---

## Tech Stack

| Technology  | Version / Details |
|-------------|-------------------|
| Java        | 17                |
| Spring Boot | 3.x.x            |
| Maven       | Build Tool        |
| REST APIs   | HTTP / JSON       |

---

## How to Run

1. Clone the repository

   ```bash
   git clone https://github.com/tejasc1067/spring-boot-crud-api.git
   ```

2. Open in IntelliJ / VS Code

3. Run the application:

   ```
   DemoApplication.java
   ```

4. Server will start on:

   ```
   http://localhost:8080
   ```

---

## API Testing (Postman / Browser)

### Create User

`POST /users`

```json
{
  "id": 1,
  "name": "Tejas",
  "email": "tejas@gmail.com"
}
```

---

### Get All Users

`GET /users`

---

### Get User by ID

`GET /users/1`

---

### Update User

`PUT /users/1`

```json
{
  "name": "Updated Name",
  "email": "updated@gmail.com"
}
```

---

### Delete User

`DELETE /users/1`

---

## Error Handling

Example:

```json
{
  "error": "User not found with id: 100"
}
```

> **Status Code:** `404 NOT FOUND`

---

## Future Improvements

- Database integration (MySQL + JPA)
- Swagger (API documentation)
- Microservices architecture
- Authentication (JWT)