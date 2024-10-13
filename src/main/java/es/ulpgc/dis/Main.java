package es.ulpgc.dis;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person Juan = new Person("Juan", LocalDate.of(2001, 2, 3));
        System.out.println(Juan);
    }
}
