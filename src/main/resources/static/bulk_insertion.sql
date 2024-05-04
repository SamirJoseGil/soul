USE soul;

-- Insertar datos dummy en la tabla users
INSERT INTO users (name, last_name, email, phone, password)
VALUES ('John', 'Doe', 'john@example.com', '1234567890', 'hashed_password_1'),
       ('Jane', 'Doe', 'jane@example.com', '0987654321', 'hashed_password_2');


-- Insertar datos dummy en la tabla courses
INSERT INTO courses (name, description, duration, level)
VALUES ('Introduction to Frontend Development', 'Learn the basics of frontend development', '4 weeks', 'Beginner'),
       ('Backend Development Essentials', 'Master the fundamentals of backend development', '6 weeks', 'Intermediate');


-- Insertar datos dummy en la tabla lessons
INSERT INTO lessons (course_id, title, description, content)
VALUES (1, 'HTML Basics', 'Learn the basics of HTML', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.'),
       (1, 'CSS Fundamentals', 'Master the fundamentals of CSS', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.'),
       (2, 'Introduction to Node.js', 'Get started with Node.js', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.');


-- Insertar datos dummy en la tabla user_progress
INSERT INTO user_progress (user_id, lesson_id, date)
VALUES (1, 1, '2024-04-01'),
       (1, 2, '2024-04-05'),
       (2, 1, '2024-04-02');


-- Insertar datos dummy en la tabla comments
INSERT INTO comments (user_id, course_id, content)
VALUES (1, 1, 'Great course! Really enjoyed it.'),
       (2, 2, 'This course helped me a lot.'),
       (1, 2, 'Looking forward to more lessons.');
