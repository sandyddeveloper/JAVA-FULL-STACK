

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



---

🧾 Set 4: Advanced Level

🔹 Schema

CREATE TABLE Orders (
    order_id INT PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    product_name VARCHAR(100) NOT NULL,
    quantity INT CHECK (quantity > 0),
    price DECIMAL(10,2) NOT NULL,
    order_date DATE NOT NULL,
    delivery_date DATE,
    payment_status VARCHAR(10) CHECK (payment_status IN ('Paid', 'Pending', 'Failed'))
);


---

🔥 Complex Questions

1. Find the total revenue (quantity × price) grouped by each product_name, only for those orders that were delivered and paid.

> Hint: Use WHERE clause with payment_status and delivery_date IS NOT NULL.




2. Find customers who placed multiple orders for the same product with a total quantity > 100.

> Hint: Use GROUP BY with HAVING clause.




3. Display all orders where the delivery took more than 7 days from the order_date.

> Hint: Use DATEDIFF() or delivery_date - order_date depending on your DBMS.




4. Show the list of customers who have not made any payment or whose payment failed and the order was placed more than 30 days ago.

> Hint: Use logical operators with payment_status and date comparison.




5. Display the customer name, product name, and a discounted price assuming a 10% discount on orders with quantity >= 50.

> Hint: Use CASE in SELECT clause.




6. Find the number of orders per month where the order amount is above the average order amount of all orders.

> Hint: Use AVG() in a subquery and MONTH(order_date).




7. Write a query to find all orders where the product_name contains at least two vowels next to each other.

> Hint: Use LIKE '%aa%' OR LIKE '%ee%' ... or REGEXP if supported.




8. Find customers whose first and last order had more than 60 days gap.

> Hint: Use MIN(order_date) and MAX(order_date) with GROUP BY.




9. Display all customers who placed an order on a weekend and the order was successfully delivered.

> Hint: Use date functions like DAYOFWEEK() or TO_CHAR() to find weekends.




10. Show a list of unique products where the average delivery time is less than 3 days and more than 5 orders have been placed.



> Hint: Use GROUP BY product_name, HAVING, and average date differences.




---




