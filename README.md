# Santander Dev Week 2023 - API Simplificada

Este projeto é uma implementação **básica** de uma API REST utilizando **Java** e **Spring Boot**, criada como parte do desafio proposto na **Santander Dev Week 2023** da DIO.

O objetivo aqui é apresentar um exemplo funcional, mesmo que simplificado, para fins de estudo e aprendizado.

---

## 🚀 Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3**
- **Maven**

---

## 📌 Estrutura do Projeto
- `User` (modelo simples com nome e conta)
- `UserController` (endpoint GET que retorna um usuário fixo)

---

## 🔗 Endpoint Disponível
- **GET** `http://localhost:8080/users/1`  
Retorna um usuário com dados mockados (fixos):
```json
{
  "name": "Raul Pereira",
  "account": "12345-6"
}
