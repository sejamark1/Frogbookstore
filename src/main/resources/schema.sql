create table if not exists bookstore(
    id int primary key auto_increment,
    isbn_no varchar(17),
    book_name varchar(255),
    author_name varchar(255)
);

INSERT INTO BOOKSTORE (isbn_no, book_name, author_name) VALUES ('0-7475-3269-9', 'Harry Potter and the Philosopher''s Stone', 'J. K. Rowling');
INSERT INTO BOOKSTORE (isbn_no, book_name, author_name) VALUES ('0-7475-3269-9', 'Harry Potter and the Philosopher''s Stone', 'J. K. Rowling');

