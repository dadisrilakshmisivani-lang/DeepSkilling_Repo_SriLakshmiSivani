use bank;

CREATE TABLE accounts (account_id INT PRIMARY KEY,account_type VARCHAR(20),balance DECIMAL(10,2));

INSERT INTO accounts VALUES(1,'Savings',10000),(2,'Savings',20000),(3,'Current',15000);

DELIMITER //

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_type = 'Savings';
END //
DELIMITER ;
CALL ProcessMonthlyInterest();
SELECT * FROM accounts;


CREATE TABLE employees (employee_id INT PRIMARY KEY,employee_name VARCHAR(50),department VARCHAR(50),salary DECIMAL(10,2));
INSERT INTO employees VALUES
(1,'Ramesh','IT',50000),
(2,'Suresh','IT',60000),
(3,'Anitha','HR',45000);
DELIMITER //

CREATE PROCEDURE UpdateEmployeeBonus(
    IN dept_name VARCHAR(50),
    IN bonus_percent DECIMAL(5,2)
)
BEGIN
    UPDATE employees
    SET salary = salary + (salary * bonus_percent / 100)
    WHERE department = dept_name;
END //

DELIMITER ;

select * from employees;

CALL UpdateEmployeeBonus('IT',10);
select * from employees;

DELIMITER //

CREATE PROCEDURE TransferFunds(
    IN from_account INT,
    IN to_account INT,
    IN transfer_amount DECIMAL(10,2)
)
BEGIN
    DECLARE source_balance DECIMAL(10,2);

    SELECT balance
    INTO source_balance
    FROM accounts
    WHERE account_id = from_account;

    IF source_balance >= transfer_amount THEN

        UPDATE accounts
        SET balance = balance - transfer_amount
        WHERE account_id = from_account;

        UPDATE accounts
        SET balance = balance + transfer_amount
        WHERE account_id = to_account;

        SELECT 'Transfer Successful' AS Message;

    ELSE

        SELECT 'Insufficient Balance' AS Message;

    END IF;

END //

DELIMITER ;

CALL TransferFunds(1,2,2000);

SELECT * FROM accounts;