create table Employee(EmpID int primary key,
 						EmpName varchar(20),
 						ManagerID int,Salary decimal(20,2),
 						Department varchar(20),
 						foreign key (ManagerID) references Employee(EmpID));
 						
select *from Employee;

desc Employee;

--1. List employees along with their manager name

select e.empname,e1.empname as ManagerName from employee e join employee e1 on e.ManagerID=e1.EmpID;

--2. Find employees who do not have a manager (top-level manager/CEO).

select *from Employee where ManagerID is null;

--3. Find all managers (employees who manage at least one employee).

select *from Employee where EmpID in (select ManagerID from Employee);

select distinct e2.EmpName as managersName,e2.EmpID as managersID from Employee e1 join Employee e2 on e1.ManagerID=e2.EmpID;

-- 4. Find employees who are not managers.

select *from Employee where EmpID!=(select ManagerID from Employee);

--5. Count number of employees under each manager.

select *from Employee where EmpID not in (select distinct ManagerID from Employee where ManagerID is not null);

--6. Find managers who manage more than 2 employees.

select  e1.EmpName,count(e2.ManagerID) from Employee e1 join Employee e2 on e1.EmpID=e2.ManagerID group by e1.EmpName having count(e2.ManagerID)>2;

--7. Find employees who earn more than their manager.

select e2.EmpName as EmployeeName,e2.Salary as EmployeeSalary,e1.EmpName as ManagerName,e1.Salary as ManagerSalary from 
				Employee e1 join Employee e2 on e1.EmpID=e2.ManagerID where e2.Salary>e1.Salary;
				
--8. Find employees working in the same department as their manager.

select E1.EmpName as EmployeeName,E1.Department as EmployeeDepartment,E2.EmpName as ManagerName,E2.Department as ManagerDepartment
					from Employee E1 join Employee E2 on E2.EmpID=E1.ManagerID where E1.Department=E2.Department;
					
--9. Find employees whose manager earns more than 80,000.

select E1.EmpName as EmployeeName,E1.Department as EmployeeDepartment,E2.EmpName as ManagerName,E2.Department as ManagerDepartment,E2.Salary as ManagerSalary
					from Employee E1 join Employee E2 on E2.EmpID=E1.ManagerID where E2.Salary>80000;
					
--10. Find the highest paid employee under each manager.

select EmpName,Salary as highestPaidEmployeeSalary 
						from (select )

