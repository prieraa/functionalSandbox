package com.tecnocampus.ES3.list2;

import java.util.function.Function;

abstract class AbstractMyList implements MyList {
/* abstract class because this is more related to the direct implementations
* but users of MyList don't need to know filterProtected exists */
    abstract protected MyList filterProtected(Function<Integer, Boolean> f, MyList newListSoFar);

}
