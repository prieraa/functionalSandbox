package com.tecnocampus.ES3.list2;

import java.util.function.Consumer;
import java.util.function.Function;

public class MyRealList extends MyList {

    private final int head;
    private final MyList tail;

    public MyRealList (int head, MyList tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public MyList extend(int newHead) {
        return new MyRealList(newHead, this);
    }

    @Override
    public void forEach(Consumer<Integer> f) {
        f.accept(this.head);
        this.tail.forEach(f);
    }

    @Override
    protected MyList filterProtected(Function<Integer, Boolean> f, MyList newListSoFar) {
        final var newList = (f.apply(this.head)) ? newListSoFar.extend(this.head) : newListSoFar;
        return this.tail.filterProtected(f, newList);
    }

    @Override
    public MyList filter(Function<Integer, Boolean> f) {
        return filterProtected(f, MyList.empty());
    }

}
