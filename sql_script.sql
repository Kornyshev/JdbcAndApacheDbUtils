-- Delete all data from the 'students' table
DELETE FROM public.students;

-- Drop the 'students' table if it exists
DROP TABLE IF EXISTS public.students;

-- Create the 'students' table
CREATE TABLE public.students (
    studentid INTEGER PRIMARY KEY,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    age INTEGER,
    gpa NUMERIC(3, 2)
);

-- Populate 'students' table with some test data
INSERT INTO public.students (studentid, firstname, lastname, age, gpa) VALUES
(1, 'John', 'Doe', 20, 3.50),
(2, 'Jane', 'Smith', 22, 3.20),
(3, 'Michael', 'Johnson', 21, 3.90),
(4, 'Emily', 'Brown', 19, 3.80),
(5, 'David', 'Lee', 23, 3.60),
(6, 'Sarah', 'Wilson', 20, 3.10),
(7, 'William', 'Anderson', 22, 3.40),
(8, 'Olivia', 'Miller', 21, 3.70),
(9, 'James', 'Davis', 20, 3.20),
(10, 'Sophia', 'Moore', 19, 3.90),
(11, 'Liam', 'Taylor', 20, 3.50),
(12, 'Ava', 'Harris', 22, 3.20),
(13, 'Noah', 'Clark', 21, 3.90),
(14, 'Ella', 'Lewis', 19, 3.80),
(15, 'Mason', 'White', 23, 3.60),
(16, 'Grace', 'Hall', 20, 3.10),
(17, 'Benjamin', 'Turner', 22, 3.40),
(18, 'Chloe', 'Martin', 21, 3.70),
(19, 'Henry', 'Adams', 20, 3.20),
(20, 'Lily', 'Parker', 19, 3.90),
(21, 'Ethan', 'Evans', 20, 3.50),
(22, 'Mia', 'Bennett', 22, 3.20),
(23, 'Alexander', 'King', 21, 3.90),
(24, 'Avery', 'Wright', 19, 3.80),
(25, 'Sofia', 'Cooper', 23, 3.60),
(26, 'Daniel', 'Hill', 20, 3.10),
(27, 'Madison', 'Ross', 22, 3.40),
(28, 'Jackson', 'Nelson', 21, 3.70),
(29, 'Aria', 'Murphy', 20, 3.20),
(30, 'Elijah', 'Gonzalez', 19, 3.90);
