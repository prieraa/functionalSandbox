package com.tecnocampus.ES3;

import com.tecnocampus.ES3.list1.MyList;

public class Main {
    public static void main(String[] args) {
        final var a = new MyList(1, new MyList(2, new MyList(3)));
        final var b = new MyList(4, new MyList(5, new MyList(6, a)));

        b.filter(i -> i % 2 == 0)
         .filter(i -> i < 3)
         .forEach(i -> System.out.println(i + " "));

        final var c = new MyList(1, new MyList(2, new MyList(3)));
        final var d = new MyList(4, new MyList(5, new MyList(6, c)));

        // Result is incorrect
        d.filter(i -> i % 2 == 0)
         .filter(i -> i < 1)
         .forEach(i -> System.out.println(i + " "));

        // Result is incorrect too
        MyList.empty().filter(i -> i % 2 == 0)
                .filter(i -> i < 1)
                .forEach(i -> System.out.println(i + " "));
    }
}