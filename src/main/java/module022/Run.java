package module022;

import module031.MyException;

/**
 * Created by IGOR.LAZNIUK on 02.06.2017.
 */
public class Run {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue(3);


        try {
            myQueue.myAdd(1);
            myQueue.myAdd(2);
            myQueue.myAdd(3);
            myQueue.myAdd(4);
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }



        System.out.println(myQueue);
    }
}
