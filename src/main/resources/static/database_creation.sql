-- Crear la base de datos "soul" MariaDB
CREATE DATABASE soul 
COLLATE = 'uca1400_spanish_ai_ci';

-- Usar la base de datos "soul"
USE soul;

-- Tabla de usuarios
CREATE TABLE users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name NVARCHAR(255) NOT NULL,
    last_name NVARCHAR(255) NOT NULL,
    email NVARCHAR(255) NOT NULL,
    phone NVARCHAR(20) NOT NULL,
    password NVARCHAR(255) NOT NULL,
    INDEX email_idx(email)
);

-- Tabla de cursos
CREATE TABLE courses (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name NVARCHAR(255) NOT NULL,
    description NVARCHAR(255) NOT NULL,
    duration NVARCHAR(255) NOT NULL,
    level NVARCHAR(255) NOT NULL
);

-- Tabla de lecciones
CREATE TABLE lessons (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    course_id INT UNSIGNED,
    title NVARCHAR(255) NOT NULL,
    description NVARCHAR(255) NOT NULL,
    content TEXT,
    FOREIGN KEY (course_id) REFERENCES courses(id)
);

-- Tabla de progreso del usuario
CREATE TABLE user_progress (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id INT UNSIGNED,
    lesson_id INT UNSIGNED,
    Date DATE,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (lesson_id) REFERENCES lessons(id)
);

-- Tabla de comentarios
CREATE TABLE comments (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id INT UNSIGNED,
    course_id INT UNSIGNED,
    content TEXT,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (course_id) REFERENCES courses(id)
);