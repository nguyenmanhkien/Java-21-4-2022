USE ebookshop;

CREATE TABLE Music(
                      id int PRIMARY KEY,
                      name varchar(50),
                      author varchar(50),
                      year int
);

INSERT INTO Music VALUES (1,'Khong ten','Ngo',2019);
INSERT INTO Music VALUES (2,'Suy','Ngo',2020);
INSERT INTO Music VALUES (3,'Chung ta khong thuoc ve nhau','Son Tung',2018);
INSERT INTO Music VALUES (4,'Thang tu la loi noi doi cua em','Bui Anh Tuan',2017);
INSERT INTO Music VALUES (5,'Tien nhieu de lam gi','G Ducky',2021);