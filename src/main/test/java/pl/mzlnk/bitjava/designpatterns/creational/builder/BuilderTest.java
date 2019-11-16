package pl.mzlnk.bitjava.designpatterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    @Test
    void test() {
        Person person = new Person.PersonBuilder("John", "Smiths")
                .age(1)
                .employee(false)
                .build();

    }

}