create database bank;
use bank;
CREATE TABLE customers (customer_id INT PRIMARY KEY,customer_name VARCHAR(50),age INT,balance DECIMAL(10,2),isvip BOOLEAN,interest_rate DECIMAL(5,2));
CREATE TABLE loans (loan_id INT PRIMARY KEY,customer_id INT,due_date DATE,FOREIGN KEY (customer_id) REFERENCES customers(customer_id));
INSERT INTO customers VALUES
(1,'Ravi',65,15000,FALSE,10),
(2,'Priya',45,8000,FALSE,12),
(3,'Kiran',70,20000,FALSE,11);
INSERT INTO loans VALUES
(101,1,DATE_ADD(CURDATE(), INTERVAL 15 DAY)),
(102,2,DATE_ADD(CURDATE(), INTERVAL 40 DAY)),
(103,3,DATE_ADD(CURDATE(), INTERVAL 20 DAY));
SELECT * FROM customers;
SET SQL_SAFE_UPDATES = 0;
UPDATE customers
SET interest_rate = interest_rate - 1
WHERE age > 60;

SELECT * FROM customers;

SET SQL_SAFE_UPDATES = 0;

UPDATE customers
SET isvip = TRUE
WHERE balance > 10000;

SELECT * FROM customers;


SELECT c.customer_name,l.loan_id,l.due_date FROM customers c JOIN loans l ON c.customer_id = l.customer_id
WHERE l.due_date BETWEEN CURDATE()
                     AND DATE_ADD(CURDATE(), INTERVAL 30 DAY);
