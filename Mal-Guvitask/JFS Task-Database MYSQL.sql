CREATE TABLE `employees` (
  `id` int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `empno` int(10) NOT NULL,
  `ename` varchar(50) NOT NULL,
  `job` varchar(25) NOT NULL,
  `mgr` int(10) DEFAULT NULL,
  `hiredate` date NOT NULL,
  `sal` decimal(10,2) NOT NULL,
  `comm` decimal(10,2) DEFAULT NULL,
  `deptno` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- add data to table

INSERT INTO `employees` (`empno`, `ename`, `job`, `mgr`, `hiredate`, `sal`, `comm`, `deptno`) VALUES
(8369, 'SMITH', 'CLERK', 8902, '1990-12-18', 800.00, 0.00, 20),
(8499, 'ANYA', 'SALESMAN', 8698, '1991-02-20', 1600.00, 300.00, 30),
(8521, 'SETH', 'SALESMAN', 8698, '1991-02-22', 1250.00, 500.00, 30),
(8566, 'MAHADEVAN', 'MANAGER', 8839, '1991-04-02', 2985.00, 0.00, 20),
(8654, 'MOMIN', 'SALESMAN', 8698, '1991-09-28', 1250.00, 1400.00, 30),
(8698, 'BINA', 'MANAGER', 8839, '1991-05-01', 2850.00, 0.00, 30),
(8882, 'SHIVANSH', 'MANAGER', 8839, '1991-06-09', 2450.00, 0.00, 10),
(8888, 'SCOTT', 'ANALYST', 8566, '1992-12-09', 3000.00, 0.00, 20),
(8839, 'AMIR', 'PRESIDENT', 0, '1991-01-18', 5000.00, 0.00, 10),
(8844, 'KULDEEP', 'SALESMAN', 8698, '1991-09-08', 1500.00, 0.00, 30);

-- 1-a) 
select ename, sal from employees where sal >= 2200;
-- 1-b) 
select * from employees where comm = 0;
-- 1-c) 
select ename, sal from employees where sal between 2500 and 4000;
-- 1-d) 
select ename, job, sal from employees where mgr = '';
-- 1-e) 
select ename from employees where ename like '__A%'; -- or 
select ename from employees where substring(ename, 3, 1) = 'A';
-- 1-f) 
select ename from employees where ename like '%T';

use employee;
CREATE TABLE `employee` (
  `id` int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `empcode` int(10) NOT NULL,
  `empname` varchar(50) NOT NULL,
  `empage` int(10) NOT NULL,
  `esalary` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `employee` (`empcode`, `empname`, `empage`, `esalary`) VALUES
(101, 'Jenny', '25', 10000),
(102, 'Jacky', '30', 20000),
(103, 'Joe', '20', 40000),
(104, 'John', '40', 80000),
(105, 'Shameer', '25', 90000);

select * from employee;