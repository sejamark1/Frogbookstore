create table if not exists bookstore(
    id int primary key auto_increment,
    isbn_no varchar(17),
    book_name varchar(255),
    author_name varchar(255)
);

INSERT INTO BOOKSTORE (isbn_no, book_name, author_name) VALUES ('0-7475-3269-9', 'Harry Potter and the Philosopher''s Stone', 'J. K. Rowling');
INSERT INTO BOOKSTORE (isbn_no, book_name, author_name) VALUES ('9780450058868', 'Chapterhouse: Dune', 'Frank Herbert');
INSERT INTO BOOKSTORE (isbn_no, book_name, author_name) VALUES ('9780450057779', 'Heretics of Dune', 'Frank Herbert');
INSERT INTO BOOKSTORE (isbn_no, book_name, author_name) VALUES ('9780450022852', 'Dune Messiah', 'Frank Herbert');
INSERT INTO BOOKSTORE (isbn_no, book_name, author_name) VALUES ('9780340837450', 'The Road to Dune', 'Frank Herbert');
INSERT INTO BOOKSTORE (isbn_no, book_name, author_name) VALUES ('9780450052620', 'God Emperor of Dune', 'Frank Herbert');

INSERT INTO BOOKSTORE (isbn_no, book_name, author_name) VALUES ('0-7475-3269-9', 'Harry Potter and the Philosopher''s Stone', 'J. K. Rowling');
INSERT INTO BOOKSTORE (isbn_no, book_name, author_name) VALUES ('9780450058868', 'Chapterhouse: Dune', 'Frank Herbert');
INSERT INTO BOOKSTORE (isbn_no, book_name, author_name) VALUES ('9780450057779', 'Heretics of Dune', 'Frank Herbert');
INSERT INTO BOOKSTORE (isbn_no, book_name, author_name) VALUES ('9780450022852', 'Dune Messiah', 'Frank Herbert');
INSERT INTO BOOKSTORE (isbn_no, book_name, author_name) VALUES ('9780340837450', 'The Road to Dune', 'Frank Herbert');
INSERT INTO BOOKSTORE (isbn_no, book_name, author_name) VALUES ('9780450052620', 'God Emperor of Dune', 'Frank Herbert');

