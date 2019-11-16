package pl.mzlnk.bitjava.designpatterns.misc.dao;

import org.junit.jupiter.api.Test;

class BookDaoTest {

    @Test
    void test() {
        BookDao bookDao = new LibraryDetectiveStoriesDao();

        System.out.println("************** books **************");
        bookDao.findAllBooks()
                .forEach(System.out::println);

        bookDao.findBookByIsbn(2).ifPresent(book -> {
            book.setAuthor("Anonymous Author");
            bookDao.createOrUpdateBook(book);
        });

        System.out.println("************** books **************");
        bookDao.findAllBooks()
                .forEach(System.out::println);
    }

}