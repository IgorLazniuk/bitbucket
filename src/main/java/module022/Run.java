package module022;

/**
 * Created by IGOR.LAZNIUK on 02.06.2017.
 */
public class Run {
    public static void main(String[] args) {
        MyQueue <Integer> myQueue  = new MyQueue(2);
        myQueue.myAdd(1);
        myQueue.myAdd(2);
        myQueue.myAdd(3);
        System.out.println(myQueue);
    }
}
