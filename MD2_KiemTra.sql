CREATE DATABASE MD2_KiemTra;
USE MD2_KiemTra;
CREATE TABLE BookType(
	TypeId int primary key auto_increment,
    TypeName varchar(50) not null unique,
    Description text,
    IsDeleted bit default 0
);

create table Book (
	BookId int primary key auto_increment,
    BookName varchar(100) not null unique,
    Title varchar(200) not null,
    Author Varchar(200) not null,
    TotalPages  int not null, check(TotalPages > 0),
    Content text not null,
    Publisher  varchar(100) not null,
    Price decimal(10,2) not null, check(Price > 0),
    TypeId int not null, foreign key (TypeId) references BookType(TypeId),
    IsDeleted bit default 0
);
