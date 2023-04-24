create schema springstudy;
use springstudy;
select * from user;
create table user(
	userid varchar(40) primary key,
    userpw varchar(40),
    username varchar(40),
    phonenum varchar(14)
    );

select * from board;
create table board(
	bno int auto_increment primary key,
	title varchar(100), 
    content varchar(15000),
    date varchar(40),
    cnt int default 0);
    