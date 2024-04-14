-- MariaDB
CREATE DATABASE soul
COLLATE = `uca1400_spanish_ai_ci`; 
-- Accent Insensitive Case Insensitive

Use soul;

CREATE TABLE Users
(
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name NVARCHAR(255) NOT NULL,
    Lastname NVARCHAR(255) NOT NULL,
    Email NVARCHAR(255) NOT NULL,
    Phone NVARCHAR(20) NOT NULL,
    Passhash NVARCHAR(255) NOT NULL,
    INDEX email_idx(Email)
);

CREATE TABLE Courses
(
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name NVARCHAR(255) NOT NULL,
    Description NVARCHAR(255) NOT NULL,
    Duration NVARCHAR(255) NOT NULL,
    level NVARCHAR(255) NOT NULL,
);

CREATE TABLE Lessons
(
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Title NVARCHAR(255) NOT NULL,
    Description NVARCHAR(255) NOT NULL,
    Content TEXT,
    Curso al que pertenece,
)

CREATE TABLE UserProgress
(
    ID de usuario,
    ID de lección,
    fecha en que se completó la lección
)

CREATE TABLE Comments
(
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    usuario que comento,
    id del curso al que se refiere,
    Content TEXT
)