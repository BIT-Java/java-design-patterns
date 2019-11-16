package pl.mzlnk.bitjava.designpatterns.misc.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    private int isbn;
    private String title;
    private String author;

}
