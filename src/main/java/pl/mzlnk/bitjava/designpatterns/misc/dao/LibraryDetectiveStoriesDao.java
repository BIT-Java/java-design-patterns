package pl.mzlnk.bitjava.designpatterns.misc.dao;

import java.util.*;

public class LibraryDetectiveStoriesDao implements BookDao {

    // as database here
    private Map<Integer, Book> books = new HashMap<>();

    public LibraryDetectiveStoriesDao() {
        books.put(1, new Book(1, "Title 1", "Author 1"));
        books.put(2, new Book(2, "Title 2", "Author 2"));
        books.put(3, new Book(3, "Title 3", "Author 3"));
        books.put(4, new Book(4, "Title 4", "Author 4"));
    }

    @Override
    public Collection<Book> findAllBooks() {
        return books.values();
    }

    @Override
    public Optional<Book> findBookByIsbn(int isbn) {
        return Optional.ofNullable(books.get(isbn));
    }

    @Override
    public void createOrUpdateBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    @Override
    public void deleteBook(Book book) {
        books.remove(book);
    }


}
