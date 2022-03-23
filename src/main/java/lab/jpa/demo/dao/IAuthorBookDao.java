package lab.jpa.demo.dao;

import lab.jpa.demo.entity.Author;
import lab.jpa.demo.entity.AuthorBookTable;
import lab.jpa.demo.entity.Book;


public interface IAuthorBookDao {

	Author getAuthorDetails(AuthorBookTable abt);

	Book getBookDetails(AuthorBookTable abt);

	AuthorBookTable addAuthorBook(AuthorBookTable abt);

	AuthorBookTable deleteAuthorBookByBookId(int id);

}