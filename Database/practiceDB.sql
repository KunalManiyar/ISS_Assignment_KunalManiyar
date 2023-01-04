use practicedb;

-- Create Table
Create Table Employee(
	EmployeeID int Primary Key Auto_Increment,
    FirstName varchar(255) Not Null,
    LastName varchar(255) Not Null,
    Age int Not Null,
    City varchar(255) Not Null,
    DeptId int,
    Foreign Key (DeptId) References Dept(DeptId),
    Check (Age>=18)
);
Create Table Salary(
	Id int Primary Key Auto_Increment,
    EmployeeId int,
	Foreign Key (EmployeeID) References Employee(EmployeeID),
    Salary int Not Null
);
Create Table Dept(
	DeptId int,
    DeptName varchar(255) Not Null,
    Primary Key(DeptId)
);

Drop table Employee;
Drop table Dept;
Drop table Salary;

Insert into Employee(FirstName,LastName,Age,City,DeptId) 
Values ("Raj","Sheth",22,"Mumbai",1) ,
("Mitesh","Shah",25,"Jaipur",2),
("Virag","Kapadia",23,"Mumbai",3),
("Vikram","Sharma",22,"Pune",1),
("Vishal","Trivedi",30,"Ahmedabad",2);

Insert into Salary(EmployeeID,Salary) 
values(1,20000),(2,40000),(3,15000),(4,10000),(5,50000);

Insert into Dept(DeptId,DeptName) 
Values(1,"IT"),(2,"Finance"),(3,"Marketing");


Select * from Employee;
select EmployeeID,FirstName,LastName from Employee;

select  Distinct City from Employee;

-- Employee Names whose age is greater than or equal to 23
select FirstName,LastName,age from employee where age>=23 ;

-- And/Or
 select FirstName,LastName from employee where age<=25 and city="Mumbai";
 select FirstName,LastName from employee where age<=25 or city="Mumbai";
 
 -- Order By
 select FirstName,LastName,age from employee order by age,FirstName;
 
 -- IN
 select * from employee where EmployeeID IN (select EmployeeID from Salary where salary <=25000);
 
 -- Between
 select * from employee where EmployeeID IN (select EmployeeID from Salary where salary Between 10000 and 30000) Order By Age;
 
 -- Alias
 select FirstName as fname from employee;
 
 -- Wildcard 
 select * from employee where FirstName Like "V%";
  select * from employee where FirstName Like "V%l";
  select * from employee where FirstName Like "V____";
  
  
-- Top
select * from employee limit 3;

-- Update
Update Salary Set Salary = 30000 where EmployeeID = 1;
select * from Salary;

-- Delete
Insert into Employee(FirstName,LastName,Age,City,DeptId) 
Values ("Kunal","Kathrani",22,"Mumbai",1);
select count(*) from employee;
select * from employee;
delete from employee where EmployeeID=6;
select count(*) from employee;


-- Inner Join
Insert into Employee(FirstName,LastName,Age,City,DeptId) 
Values ("Kunal","Kathrani",22,"Mumbai",1),("Mayank","Agarwal",35,"Chennai",3),("Manan","Savla",27,"Mumbai",2);

Select Employee.FirstName,Employee.LastName,Salary.Salary 
from Employee 
INNER JOIN Salary 
ON Employee.EmployeeID=Salary.EmployeeID;

Select Employee.FirstName,Employee.LastName,Salary.Salary,Dept.DeptName 
from Employee 
INNER JOIN Salary ON Employee.EmployeeID=Salary.EmployeeID
INNER JOIN Dept ON Employee.DeptID=Dept.DeptID;

-- Left Join, will show all the columns of Employee whether any columns are null or not
Select Employee.FirstName,Employee.LastName,Salary.Salary 
from Employee 
LEFT JOIN Salary 
ON Employee.EmployeeID=Salary.EmployeeID;

-- Right Join, will show all the columns of Salary whether any columns are null or not
Select Employee.FirstName,Employee.LastName,Salary.Salary 
from Employee 
RIGHT JOIN Salary 
ON Employee.EmployeeID=Salary.EmployeeID;


-- Full Join
Select Employee.DeptId,Dept.DeptName
from Employee FULL JOIN Dept
ON Employee.DeptId=Dept.DeptId;

-- Group By
select Count(EmployeeID),city from Employee group by city;

-- Having
select Count(EmployeeID),city from Employee group by city HAVING Count(EmployeeID)=1;

-- Alter(renaming column firsname to fname)
Alter table Employee Rename Column FirstName to fname;
select * from employee;




-- view 
Create View EmployeeSalary AS
Select Employee.fname,Employee.LastName,Salary.Salary 
from Employee 
RIGHT JOIN Salary 
ON Employee.EmployeeID=Salary.EmployeeID;

select * from EmployeeSalary;

-- Creating a stored procedure
DELIMITER //
Create Procedure EmployeeHavingSalary(IN sal int)
BEGIN
	select * from EmployeeSalary where salary=sal;
END//
DELIMITER ;
CALL EmployeeHavingSalary(50000);


-- Insert Into
Create Table EmployeeCopy(
    FirstName varchar(255) Not Null,
    LastName varchar(255) Not Null,
    Age int Not Null
);

Insert into EmployeeCopy (FirstName,LastName,age)
Select fname,LastName,age from Employee LIMIT 5;


select * from EmployeeCopy;

-- Prepared Statement
Prepare EmployeeInCity From 'Select * from Employee where city=?';
Set @City="Mumbai";
Execute EmployeeInCity Using @City;

