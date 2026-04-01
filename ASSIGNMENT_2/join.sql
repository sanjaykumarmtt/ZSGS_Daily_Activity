create table customers(customerID int primary key,
					   Name varchar(20),
					   city varchar(20),
					   phone varchar(20));

create table Orders(OrderID int primary key,
				    CustomerID int,
				    OrderDate date,
				    TotalAmount DECIMAL(5,2),
				    foreign key (CustomerID) references customers(customerID));
				    
create table OrderItems(OrderItemID int primary key,
						OrderID int,
						ProductName varchar(20),
						Quantity int,
						Price decimal(5,2),
						foreign key (OrderID) references Orders(OrderID));

--Simple Queries

--1. Display Customer Name and Order Date
select customers.name,Orders.OrderDate from customers join Orders on customers.customerID=Orders.CustomerID;

--2. Display Customer Name, City, and TotalAmount.

select c.name,c.city,o.TotalAmount from customers c join Orders o on c.customerID=o.customerID;

--3. Display all products ordered by each customer.
select c.name,o.OrderDate,oI.ProductName from customers c join Orders o on c.customerID=o.customerID join OrderItems oI on o.OrderID=oI.OrderID;

--4. Display orders placed after ‘2026-02-10’.

select c.name,o.OrderDate,oI.ProductName from customers c join Orders o on c.customerID=o.customerID join OrderItems oI on o.OrderID=oI.OrderID where o.OrderDate>'2026-02-10';

--5. Display customers from Chennai and their order amount.

select c.name,c.city,o.TotalAmount from customers c join orders o on c.customerID=o.customerID where c.city="Chennai";

--6. Display OrderID and number of products in each order.

select Orders.OrderID,count(OrderItems.ProductName) from Orders join OrderItems on Orders.OrderID=OrderItems.OrderID group by Orders.OrderID;

--7. Display Customer Name and total quantity purchased.

select c.name,sum(oi.Quantity) from customers c join orders o on c.customerID=o.customerID join orderitems oi on o.OrderID=oi.OrderID group by c.name;

--8. Display all orders with product name and price.

select o.*,oi.ProductName,oi.Price from orders o join orderitems oi on o.OrderID=oi.OrderID;

--9. Display distinct cities of customers who placed orders
				--distinct
select distinct c.city from customers c join orders o on c.customerID=o.customerID;

--10. Display customers who ordered more than 2 products in a single order.

select c.name,o.OrderID,sum(oi.Quantity) from customers c join orders o on c.customerID=o.customerID join orderitems oi on o.OrderID=oi.OrderID group by c.name,o.OrderID having sum(oi.Quantity)>=2;
