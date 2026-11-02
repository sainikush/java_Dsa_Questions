package ThirdTime.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

    public static void main(String[] args) {
        // List or collection --> Interface

        // ArrayList --> Concrete Class
        ArrayList<Integer> arr = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        Collections<Integer> collections = new Arraylist<>();

        arr.add(10);
        arr.add(45);
        arr.add(56);
        System.out.println(arr);

        arr.remove(1);
        boolean contains = arr.contains(34);
        System.out.println(arr);

        // addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(455);
        list2.add(4562);
        System.out.println(list2);

        arr.addAll(list2);
        System.out.println(arr);
        list2.add(55);
        list2.size();
        System.out.println(list2);
        arr.removeAll(list2);
        System.out.println(arr);


        // to traverse list using iterator
        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()){// hasnext check if your list has next element
            System.out.println("Element : "+ iterator.next());
        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(44);
        list3.add(22);
        list3.add(33);
        list3.add(55);
        list3.add(77);
        System.out.println(list3.get(2));
        System.out.println("before set :"+ list3);
        list3.set(2,100);
        System.out.println("After set :"+ list3);

        // to Array
//        list3.toArray(); convert into array
        Object[] arr1 = list3.toArray();
        for(Object obj : arr1){
            System.out.println(obj);
        }


         // contains
        System.out.println(list3.contains(100));

        // sort an arrayList
        Collections.sort(list3);
        System.out.println(list3);

        // clone() : does a shallow copy
        ArrayList<Integer> newList = new ArrayList<>(list3);
        System.out.println("Printing the new list : "+newList);
        System.out.println("checking is empty: "+newList.isEmpty());
    }
}
