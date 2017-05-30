package module021;


/**
 * Created by IGOR.LAZNIUK on 12.05.2017.
 */
public class Run {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        myCollection.myAdd(0);
        myCollection.myAdd(10);
        System.out.println(myCollection);
        myCollection.myAdd(2);
        System.out.println(myCollection);
        myCollection.myAdd(5);
        System.out.println(myCollection);
        myCollection.myDel(17);
        System.out.println(myCollection);
        System.out.println(myCollection.myMax());
        System.out.println(myCollection.myAver());
        System.out.println(myCollection.myGet(2));
        System.out.println(myCollection.myIndexOf(-10));


    }
}
