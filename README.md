<center>
<h1> Music Streaming API </h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/Maven-3.0.6-brightgreen.svg" />
</a>
   <a >
    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-blue.svg">
  </a>
</center>
This project is a basic web application that allows users to sign in, sign up, and manage their profile information.
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok
* Validation
* Swagger

<br>

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

## Language Used
* Java

---
<br>

## Data Model

The Job data model is defined in the Job class, which has the following attributes:
<br>

* User Model
```
userId : long
userFullName : string
email : string
password : string
phoneNumber : string
```

* Admin Model
```
adminId : long
adminFullName : string
email : string
password : string
phoneNumber : string

```

## API End Points 

The following endpoints are available in the API:

* User Controller:
```
POST /user/signup: create a new user account
POST /user/signin: authenticate a user and receive an authentication token

```

* Post Controller
```
POST /post: create a new post
GET /post: get all posts
```

<br>

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
<br>

## Project Summary

The project is a basic web application built using Java and the Spring framework. It allows users to sign up, sign in, and manage their profile information. 
