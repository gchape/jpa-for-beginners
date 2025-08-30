# JPA for Beginners – Example Project

A simple project showing how to use **Jakarta Persistence (JPA)** with **Hibernate** and **PostgreSQL**.  
It was built while following Thorben Janssen’s *JPA for Beginners 2.0* course.

![Giorgi-Chapidze-JPA-for-Beginners-JPA-for-Beginners- -Participation-Certificate-New-Thorben-Janssen_page-0001](https://github.com/user-attachments/assets/e7d90df7-b8ad-4c6e-9032-a11127b96c6f)

---

## What’s Inside

- **Entities**
  - `Course` ↔ `Professor` (many-to-one)  
  - `Course` ↔ `Student` (many-to-many)  
  - `Course` ↔ `Curriculum` (one-to-one)  
  - Enum mapping with `StudentState`  

- **Persistence**
  - Configured in `persistence.xml`  
  - Hibernate as provider, PostgreSQL as database  

- **Service Layer**
  - Generic `CrudService<T>` with `save`, `findById`, `remove`  
  - Entity-specific services (`ProfessorService`, `CourseService`, etc.)  

- **Testing**
  - JUnit 5  
  - Example: persisting a `Professor` in `ProfessorServiceTest`  

---
## Schema

[2025-08-30_public.docx](https://github.com/user-attachments/files/22059085/2025-08-30_public.docx)
