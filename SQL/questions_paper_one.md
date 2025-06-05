

> ✅ Topics Covered:



Datatypes

Constraints

DQL (Data Query Language):

SELECT

Selection (WHERE)

Projection (selecting specific columns)

Expressions

Operators (Arithmetic, Logical, Special)




---

🧾 Set 1: Easy Level

Consider the following table:

CREATE TABLE Employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50) NOT NULL,
    age INT,
    salary DECIMAL(10,2),
    joining_date DATE
);

🔹 Questions:

1. Write a query to display all columns from the Employees table.


2. Write a query to display only emp_name and salary from the Employees table.


3. Write a query to display the names of employees whose salary is greater than 30000.


4. Write a query to display employees who joined after '2022-01-01'.


5. Write a query to show the emp_name and salary where salary is between 20000 and 50000.




---

📋 Set 2: Medium Level

Consider the following table:

CREATE TABLE Products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL,
    quantity INT CHECK (quantity >= 0),
    price_per_unit DECIMAL(10,2),
    added_date DATE
);

🔸 Questions:

1. Write a query to show the total price for each product (quantity * price_per_unit) along with product_name.


2. Write a query to display products whose price_per_unit is less than 50 OR quantity is more than 100.


3. Display product names where the product_name contains the word 'Pen'.


4. Display products that were added in the month of January (regardless of year).


5. Write a query to show products where quantity is NOT NULL and price_per_unit is NOT NULL.




---

🧠 Set 3: Hard Level

Consider the following table:

CREATE TABLE Students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL,
    dob DATE NOT NULL,
    total_marks INT CHECK (total_marks BETWEEN 0 AND 500),
    grade CHAR(1),
    enrolled_on DATE
);

🔺 Questions:

1. Write a query to calculate the age of each student as of today using their dob.


2. Write a query to display student names whose total marks are more than average total_marks.


3. Write a query to find students whose names start with 'A' and total_marks is a multiple of 10.


4. Write a query to find students who enrolled in the last 30 days.


5. Write a query to display all students who either:

Have grade 'A' and total_marks > 450
OR

Have grade 'B' and marks between 350 and 400




