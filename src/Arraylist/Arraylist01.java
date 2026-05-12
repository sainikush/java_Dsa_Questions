package Arraylist;

import java.util.ArrayList;

public class Arraylist01 {
    public static void main(String[] args) {
        // wrapper class
        Integer i = Integer.valueOf(4);
        System.out.println(i);

        Float f = Float.valueOf(4.5f);
        System.out.println(f);

        ArrayList<Integer> li = new ArrayList<>();

        // common methods

        //   add a mew element
        li.add(5);
        li.add(4);
        li.add(8);
        li.add(5);
        li.add(7);
        System.out.println(li);
        // get an element at index i
        System.out.println(li.get(4));//5

        // print with loop
        for (int j = 0; j < li.size(); j++) {
            System.out.println(li.get(j));//5,4,8,5,7
        }

        // to print the array list directly
        System.out.println(li);

        // adding element at some index i
        li.add(1,2);
        System.out.println(li);


        // modifying the element at index i
        System.out.println("modifing the element:" + li.set(1,23));
        // removing an element at index i
        System.out.println("removing at index i : "+ li.remove(3));

        // removing an element in the list
        System.out.println("removing an element from list :" + li.remove(Integer.valueOf(5)));

        // checking if an element exists or not
        System.out.println("checking if an element exits :" + li.contains(7));

        //  if you dont specify the class , you can put anything inside the arraylist
        ArrayList vk  = new ArrayList();
        vk.add("name");
        vk.add(2);
        vk.add(true);
        System.out.println(vk);





    }

}
