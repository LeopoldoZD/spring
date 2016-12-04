
create table producto(id integer primary key auto_increment,
nombre varchar(30), precio float);


select * from producto;


--creamos la tabla departamento que sin que existan empleados
create table departamento(id integer primary key auto_increment, nombre varchar(40));

drop table departamento;
drop table empleado;

create table empleado(id integer primary key auto_increment, id_departamento integer, nombre varchar (40),
foreign key  (id_departamento) references departamento(id));
select * from departamento;
select * from empleado;
drop table empleado;
