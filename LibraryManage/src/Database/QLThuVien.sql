CREATE DATABASE QLThuVien
GO

USE QLThuVien

drop DATABASE QLThuVien

CREATE TABLE Book
(
    IDBook NVARCHAR(9) PRIMARY KEY NOT NULL,
    NameBook NVARCHAR(30),
    Author NVARCHAR(30),
    Types NVARCHAR(30),
    Descriptions NVARCHAR(1000),
    Amount INT
)
GO

CREATE TABLE UserAccount
(
    UserName NVARCHAR(50) PRIMARY KEY NOT NULL,
    PassWords NVARCHAR(50),
    Roles NVARCHAR(10)
)
GO

INSERT INTO Book
VALUES
('B001', N'Đắc nhân tâm', 'DALE CARNEGIE', 'Self-Help', N'Là tác phẩm nổi tiếng nhất thế giới và có tầm ảnh hưởng mạnh mẽ nhất mọi thời đại',100)
GO

INSERT INTO UserAccount
VALUES
('customer','customer','KH'),
('staff1','123','NV')
GO


