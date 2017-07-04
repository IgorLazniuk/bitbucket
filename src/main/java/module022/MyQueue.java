package module022;

import java.util.LinkedList;

/**
 * It is necessary to implement a collection that has a fixed size.
 * The size is set:
 * The default is 16
 * As directed by the user.
 * The size of the collection after initialization can not change.
 * Each new element is added to the end. After the number of elements has reached a maximum - when you add a new item, the collection "moves" to the left.
 * The first element is deleted, and the next one is moved one element to the left.
 * The result of the job should be a repository with a collection, a class testing this collection, a job description, and a README file with an instruction to run the application
 **/
public class MyQueue<E> extends LinkedList {

    private int limit;

    public MyQueue() {
        this.limit = 16;

    }

    public MyQueue(int size) {

        this.limit = size;
    }

    public void myAdd(E element) throws MyException {

if (!(element instanceof Integer)){
    throw new MyException();

}


        if (this.size() >= this.limit) {

                this.remove(0);

            }
            this.addLast(element);

    }


}


