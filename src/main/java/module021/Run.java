package module021;


/**
 * Created by IGOR.LAZNIUK on 12.05.2017.
 */
public class Run {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.myAdd(0);
        myList.myAdd(10);
        System.out.println(myList);
        myList.myAdd(2);
        System.out.println(myList);
        myList.myAdd(5);
        System.out.println(myList);
        myList.myDel(17);
        System.out.println(myList);
        System.out.println(myList.myMax());
        System.out.println(myList.myAver());
        System.out.println(myList.myGet(2));
        System.out.println(myList.myIndexOf(-10));


    }
}
