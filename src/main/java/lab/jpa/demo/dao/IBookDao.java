package lab.jpa.demo.dao;

import lab.jpa.demo.entity.Book;

public interface IBookDao {

	Book addBook(Book book);

	Book updateBookPrice(int isbn, double price);
    Book deleteBookById(int isbn);

	Book getBookById(int isbn);
}