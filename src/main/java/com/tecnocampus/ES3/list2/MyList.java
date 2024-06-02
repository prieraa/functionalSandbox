package com.tecnocampus.ES3.list2;

import java.util.function.Consumer;
import java.util.function.Function;

public abstract class MyList {

    public abstract MyList extend(int newHead);
    public abstract void forEach(Consumer<Integer> f);
    public abstract MyList filter(Function<Integer, Boolean> f);

    abstract protected MyList filterProtected(Function<Integer, Boolean> f, MyList newListSoFar);

    static MyList of(Integer firstHead) {
        return new MyRealList(firstHead, new EmptyList());
    }

    static MyList empty() {
        return new EmptyList();
    }
}
