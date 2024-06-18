package com.tecnocampus.ES3.list2;

public class Test {

    public static void main(String[] args) {
        final var a = MyList.of(3).extend(2).extend(1);
        final var b = a.extend(6).extend(5).extend(4);

        b.filter(i -> i % 2 == 0)
                .filter(i -> i < 3)
                .forEach(i -> System.out.println(i + " "));

        b.filter(i -> i % 2 == 0)
                .filter(i -> i < 1)
                .forEach(i -> System.out.println(i + " "));
        System.out.println("EOL");

        MyList.empty().filter(i -> i % 2 == 0)
                .filter(i -> i < 1)
                .forEach(i -> System.out.println(i + " "));
        System.out.println("EOL");
    }
}
