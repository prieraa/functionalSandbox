package com.tecnocampus.ES3.list2;

import java.util.function.Consumer;
import java.util.function.Function;

public interface MyList {

    MyList extend(int newHead);
    void forEach(Consumer<Integer> f);
    MyList filter(Function<Integer, Boolean> f);


    static MyList of(Integer firstHead) {
        return new MyRealList(firstHead, new EmptyList());
    }

    static MyList empty() {
        return new EmptyList();
    }
}
