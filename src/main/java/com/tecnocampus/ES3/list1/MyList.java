package com.tecnocampus.ES3.list1;

import java.util.function.Consumer;
import java.util.function.Function;

public class MyList {
    private final Integer head;
    private final MyList tail;

    public MyList(final int head) {
        this.head = head;
        this.tail = null;
    }

    public MyList(final int head, final MyList tail) {
        this.head = head;
        this.tail = tail;
    }

    private MyList() {
        this.head = Integer.MAX_VALUE;
        this.tail = null;
    }

    static public MyList empty() {
        return new MyList();
    }

    public void printMe() {
        System.out.print(this.head + " ");

        if (this.tail == null) {
            System.out.println("EOL");
            return;
        }

        this.tail.printMe();
    }

    public void forEach(Consumer<Integer> f) {
        f.accept(this.head);

        if (this.tail == null) return;

        this.tail.forEach(f);
    }

    private MyList filterWithTempList(Function<Integer, Boolean> f, final MyList newListSoFar) {
        final var newList = (f.apply(this.head)) ?
                new MyList(this.head, newListSoFar) :
                newListSoFar;

        if (this.tail == null) return newList;

        return this.tail.filterWithTempList(f, newList);
    }

    public MyList filter(Function<Integer, Boolean> f) {
        if (f.apply(this.head)) {
            final var tempList = new MyList(this.head);
            return (this.tail == null) ?
                tempList : this.tail.filterWithTempList(f, tempList);
        } else if (this.tail != null) {
            return this.tail.filter(f);
        }

        return empty();
    }



}
