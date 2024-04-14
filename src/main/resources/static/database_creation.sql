-- Crear la base de datos "soul" MariaDB
CREATE DATABASE soul 
COLLATE = 'uca1400_spanish_ai_ci';

-- Usar la base de datos "soul"
USE soul;

-- Tabla de usuarios
CREATE TABLE Users (
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name NVARCHAR(255) NOT NULL,
    Lastname NVARCHAR(255) NOT NULL,
    Email NVARCHAR(255) NOT NULL,
    Phone NVARCHAR(20) NOT NULL,
    Passhash NVARCHAR(255) NOT NULL,
    INDEX email_idx(Email)
);

-- Tabla de cursos
CREATE TABLE Courses (
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name NVARCHAR(255) NOT NULL,
    Description NVARCHAR(255) NOT NULL,
    Duration NVARCHAR(255) NOT NULL,
    Level NVARCHAR(255) NOT NULL
);

-- Tabla de lecciones
CREATE TABLE Lessons (
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    CourseId INT UNSIGNED,
    Title NVARCHAR(255) NOT NULL,
    Description NVARCHAR(255) NOT NULL,
    Content TEXT,
    FOREIGN KEY (CourseId) REFERENCES Courses(Id)
);

-- Tabla de progreso del usuario
CREATE TABLE UserProgress (
    UserId INT UNSIGNED,
    LessonId INT UNSIGNED,
    Fecha DATE,
    FOREIGN KEY (UserId) REFERENCES Users(Id),
    FOREIGN KEY (LessonId) REFERENCES Lessons(Id)
);

-- Tabla de comentarios
CREATE TABLE Comments (
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    UserId INT UNSIGNED,
    CourseId INT UNSIGNED,
    Content TEXT,
    FOREIGN KEY (UserId) REFERENCES Users(Id),
    FOREIGN KEY (CourseId) REFERENCES Courses(Id)
);