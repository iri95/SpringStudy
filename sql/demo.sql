create schema Trip;
use Trip;
drop table user;
create table user(
	user_id varchar(40) primary key,
    user_pw varchar(40),
    user_name varchar(40),
    email varchar(40),
    phone varchar(20),
    address varchar(100),
    date varchar(40)
    );

drop table board;
create table board(
	bno int auto_increment primary key,
    user_id varchar(40),
    title varchar(200),
    content varchar(10000),
    cnt int default 0,
    board_like int default 0,
    write_date varchar(40),
    foreign key (user_id)
    references user(user_id)
    )
    