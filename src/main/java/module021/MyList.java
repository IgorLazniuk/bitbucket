package module021;

import java.util.ArrayList;

/**
 * It is necessary to implement a collection of integers that allows you to perform operations:
 *Add
 *Delete
 *Search element by value
 *Search element by index
 *Search maximum
 *Search minimum.
 *Search arithmetic mean of all elements
 *NOTE:
 *When you add a new element, all items increase their value to the added element.
 *When you remove element, all items decrease the value on a removed element
 *It is not allowed to enter null, characters, and other values ​​into the collection, except integers.
 */

/**
 * Resizable-array extends of the ArrayList class.  Extends
 * all optional list operations, and does not permit any elements exept
 * Integer.  In addition to extending of the ArrayList class,
 * this class provides additional methods: myAdd, myDel, myMax, myAver
 * myGet, myIndexOf.
 */
public class MyList extends ArrayList<Integer> {

    public void myAdd(Integer element) {
        if (element != null) {
            for (int i = 0; i < this.size(); i++) {

                this.set(i, this.get(i) + element);
            }
            this.add(element);
        }

    }

    public void myDel(Integer element) {
        if (element != null) {
            if (this.contains(element)) {
                this.remove(element);
                for (int i = 0; i < this.size(); i++) {

                    this.set(i, this.get(i) - element);
                }

            }
        }

    }

    public Integer myMax() {

        Integer max = this.get(0);
        for (int i = 1; i < this.size(); i++) {
            if (max < this.get(i)) {
                max = this.get(i);
            }

        }
        return max;

    }

    public double myAver() {

        Integer aver = 0;
        for (int i = 0; i < this.size(); i++) {
            aver += this.get(i);
        }

        return aver / this.size();

    }

    public Integer myGet(int index) {

        return this.get(index);


    }

    public Integer myIndexOf(Integer element) {
        if (element != null) {
            return this.indexOf(element);

        }
        return null;
    }


}
