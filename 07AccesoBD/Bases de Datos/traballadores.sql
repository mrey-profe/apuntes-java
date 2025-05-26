-- Creación da base de datos
create database if not exists traballadores
	character set utf8
	collate utf8_spanish_ci;
-- Activación da base de datos
use traballadores ;
-- Creación e carga de datos da táboa centro.
-- Contén datos dos centros de traballo da empresa 
create table  centro  (
	cenNumero  int(11) not null,
	cenNome  char(30) default null,
	cenEnderezo  char(30) default null,
	primary key (cenNumero),
    key  cenNome  (cenNome)
) engine=myisam ;
insert into centro  
	values (10,'SEDE CENTRAL','C/ ALCALA, 820-MADRID'),(20,'RELACION CON CLIENTES','C/ ATOCHA, 405-MADRID'),(30,'DELEGACION GALICIA','C/ MAIOR, 27-LUGO');
-- Creación e carga de datos da táboa departamento.
-- Contén información dos departamentos da empresa
 create table  departamento  (
	depNumero  int(11) not null,
	depNome  char(20) default null,   
	depDirector  int(11) not null,
	deptipoDirector  char(1) default null,
	depPresuposto  decimal(9,2) default null,
	depDepende  int(11) default null comment 'número de departamento do que depende',
	depCentro  int(11) default null comment 'número do centro ao que pertenece este departamento',
    depEmpregados smallint unsigned default null comment 'número de empregados que traballan no departamento', 
	primary key (depNumero),
    key  depDirector  (depDirector),
    key  depDepende  (depDepende),
    key  depCentro  (depCentro),
	key  depNome  (depNome)
) engine=myisam;
insert into  departamento (depNumero,depCentro,depDirector,deptipoDirector,depPresuposto,depDepende,depNome)
	values (122,30,350,'F','60000.00',120,'PROCESO DE DATOS'),(121,10,110,'P','200000.00',120,'PERSOAL'),(120,10,150,'P','30000.00',100,'ORGANIZACION'),(112,20,270,'F','90000.00',110,'SECTOR SERVICIOS'),(111,20,400,'P','111000.00',110,'SECTOR INDUSTRIAL'),(110,20,180,'P','15000.00',100,'DIRECCION COMERCIAL'),(130,10,310,'P','20000.00',100,'FINANZAS'),(200,20,600,'F','80000.00',100,'TRANSPORTES'),(100,10,260,'P','120000.00',null,'DIRECION XERAL');
-- Creación e carga de datos da táboa empregado.
-- Contén información dos traballadores da empresa
create table  empregado  (
	empNumero  int(11) not null auto_increment,
	empDepartamento  int(11) not null comment 'número de departamento no que traballa o empregado',
	empExtension smallint(6) not null comment 'extensión telefónica para o traballador',
	empDataNacemento  date default null,
	empDataIngreso  date default null comment 'data de ingreso na empresa',
	empSalario  decimal(6,2) default null,
	empComision  decimal(6,2) default null,
	empFillos  smallint(6) default null comment 'número de fillos que ten o traballador',
	empNome  char(20) not null,  
	primary key (empNumero),
	key  empDepartamento  (empDepartamento),
	key  empNome  (empNome)
) engine=myisam;
insert into  empregado ()
	values (510,110,550,'1953-03-12','1996-11-01','2000.00',null,1,'CAMPOS, ROMULO'),(500,111,750,'1975-08-17','2001-01-01','2000.00','100.00',0,'VAZQUEZ, HONORIA'),(490,112,880,'1984-04-15','2010-01-01','1800.00','100.00',0,'TORRES, HORACIO'),(480,111,760,'1955-02-11','1986-02-28','800.00','100.00',1,'PINO, DIANA'),(450,112,880,'1989-08-29','2014-02-28','600.00','100.00',0,'PEREZ, SABINA'),(440,111,760,'1980-08-04','2013-02-28','650.00','100.00',0,'DURAN, LIVIA'),(430,122,650,'1957-09-03','1988-11-19','500.00',null,1,'MORA, VALERIANA'),(420,130,450,'1955-08-30','1988-11-19','700.00',null,0,'FIERRO, CLAUDIA'),(410,122,660,'1956-05-23','2001-10-13','1750.00',null,0,'LOPEZ, AZUCENA'),(400,111,780,'1957-06-27','1987-11-01','2700.00',null,0,'LARA, LUCRECIA'),(390,110,500,'1956-12-29','1999-10-08','2150.00',null,1,'MORAN, CARMEN'),(380,112,880,'1955-02-06','1990-01-01','1800.00',null,0,'MARTIN, MICAELA'),(370,121,360,'1957-04-30','1987-01-20','1900.00',null,1,'RUIZ, FABIOLA'),(360,111,750,'1968-09-06','2002-10-10','2500.00','100.00',2,'LARA, DORINDA'),(350,122,610,'1959-02-10','1984-09-10','2250.00',null,1,'CAMPS, AURELIO'),(330,112,850,'1958-06-28','1992-03-01','800.00','90.00',0,'DIEZ, AMELIA'),(320,122,620,'1957-11-03','1978-02-05','1100.00',null,2,'SANZ, CORNELIO'),(310,130,480,'1956-09-29','2013-01-15','2100.00',null,0,'GARCIA, AUGUSTO'),(290,120,910,'1957-10-08','1995-02-14','1200.00',null,3,'GIL, GLORIA'),(285,122,620,'1959-09-03','1999-02-15','550.50',null,0,'POLO, OTILIA'),(280,130,410,'1958-08-20','1988-10-08','600.60',null,5,'FLOR, DOROTEA'),(270,112,800,'1955-03-30','1987-09-10','1900.00','80.00',3,'GARCIA, OCTAVIO'),(260,100,220,'1954-10-11','1992-07-12','3600.00',null,6,'LOPEZ, ANTONIO'),(250,100,250,'1956-09-04','1987-03-01','1550.50',null,0,'ALBA, ADRIANA'),(240,111,760,'1988-01-05','2014-02-24','800.25','100.00',3,'SANZ, LAVINIA'),(210,100,200,'1956-08-07','1995-01-22','1000.60',null,2,'GALVEZ, PILAR'),(190,121,350,'1957-03-21','1985-02-11','610.10',null,4,'VEIGA, JULIANA'),(180,110,508,'1959-08-26','1996-03-18','2200.00','50.00',2,'PEREZ, MARCOS'),(160,111,740,'1959-05-17','2012-11-11','1550.00','110.00',2,'AGUIRRE, AUREO'),(150,120,340,'1960-06-18','2000-01-15','2200.00',null,0,'PEREZ, JULIO'),(130,112,810,'1961-07-19','1996-02-01','1500.00','110.00',2,'TEROL, LUCIANO'),(120,112,840,'1950-04-17','1968-10-01','1200.00','110.00',1,'LASA, MARIO'),(110,121,350,'1951-09-19','2003-02-15','2000.00',null,3,'PONS, CESAR'),(550,111,780,'1952-11-19','1988-01-21','680.00','120.00',0,'SANTOS,SANCHO'),(600,200,500,'1954-03-21','1984-01-15','1500.00','100.00',2,'RUIZ, ANTONIO'),(650,111,880,'1953-11-19','1988-11-08','1200.00','120.00',2,'TELLO,LUIS'),(652,200,520,'1985-03-21','2001-01-15','900.00','100.00',1,'ARANGO, BERTA'),(653,200,112,'1979-10-11','2010-11-11','1100.00',null,0,'FERNANDEZ, CARMEN'),(654,120,88,'1989-08-14','2014-05-15','900.00','50.00',0,'SANCHEZ, MARCOS');

