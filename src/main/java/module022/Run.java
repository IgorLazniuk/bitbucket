package module022;

import java.util.Scanner;

/**
 * Created by IGOR.LAZNIUK on 02.06.2017.
 */
public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input size: ");
        int size = sc.nextInt();
        MyQueue myQueue = new MyQueue(size);

        try {

            for (int i = 0; i < size; i++) {
                System.out.print("input element No." + i + " ");
                myQueue.myAdd(sc.nextInt());
            }


        } catch (MyException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println(myQueue);
        }


    }
}
