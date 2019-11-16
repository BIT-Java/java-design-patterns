package pl.mzlnk.bitjava.designpatterns.creational.builder;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class Person {

    private String name;
    private String surname;
    private int age;
    private boolean employee;
    private int childrens;


    private Person(String name, String surname, int age, boolean employee) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.employee = employee;
    }

    @Getter
    public static class PersonBuilder {

        // required
        private String name;
        private String surname;

        // optional
        private int age;
        private boolean employee;

        public PersonBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder employee(boolean employee) {
            this.employee = employee;
            return this;
        }

        public Person build() {
            return new Person(name, surname, age, employee);
        }

    }

}
