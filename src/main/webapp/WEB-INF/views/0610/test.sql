show tables;

create table ddd (
	idx int not null auto_increment primary key,
	mid varchar(20) not null,
	pwd varchar(20) not null,
	name varchar(20) not null,
	age int default 20
);

desc ccc;

insert into ddd values (default, 'admin', '1234', '관리자', default);

select * from ddd;