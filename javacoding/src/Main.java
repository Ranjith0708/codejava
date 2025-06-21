import Practise.MyGenericList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        MyGenericList<Integer> myGenericList = new MyGenericList<>();
        myGenericList.add(2);
        myGenericList.add(3);
        myGenericList.add(1);
        MyGenericList<String> strList = new MyGenericList<>();
        strList.add("Hello");
        strList.add("I am");
        strList.add("from");
        strList.add("Ranjith's list");
        Iterator<String> iterator = strList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}