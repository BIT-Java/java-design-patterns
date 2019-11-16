package pl.mzlnk.bitjava.designpatterns.misc.dao;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface BookDao {

    Collection<Book> findAllBooks();
    Optional<Book> findBookByIsbn(int isbn);
    void createOrUpdateBook(Book book);
    void deleteBook(Book book);

}
