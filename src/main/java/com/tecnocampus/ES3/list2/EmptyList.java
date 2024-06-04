package com.tecnocampus.ES3.list2;

import java.util.function.Consumer;
import java.util.function.Function;

public class EmptyList extends AbstractMyList {

    @Override
    public MyList extend(int newHead) {
        return new MyRealList(newHead, this);
    }

    @Override
    public void forEach(Consumer<Integer> f) {

    }

    @Override
    public MyList filter(Function<Integer, Boolean> f) {
        return this;
    }

    @Override
    protected MyList filterProtected(Function<Integer, Boolean> f, MyList newListSoFar) {
        return newListSoFar;
    }
}
