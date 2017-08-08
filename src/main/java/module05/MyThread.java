package module05;

import java.util.Arrays;

/**
 * Created by IGOR.LAZNIUK on 08.08.2017. 
 */
public class MyThread extends Thread {
    int i;
    Integer[] myArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public MyThread(int i) {
        this.i = i;
    }

    public void run() {
        synchronized (myArray) {
            for (int j = 0; j < 10; j++) {
                myArray[j] = myArray[j] * i;
            }
            System.out.println(Arrays.toString(myArray));

        }

    }

    public static void main(String args[]) {
        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(2);
        MyThread thread3 = new MyThread(3);
        MyThread thread4 = new MyThread(4);
        MyThread thread5 = new MyThread(5);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }
}
