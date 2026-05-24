package Hashing;

import java.util.HashMap;

public class hashmap01 {
    //Hashing is a process or technique that converts an input of any size (like a string,
    // a number, or an entire file) into a fixed-size string of characters or a fixed-size integer value.
    //
    //The function that performs this transformation is called a Hash Function, and the output
    // it generates is called a Hash Value, Hash Code, or Digest.
    //
    //The fundamental rule of hashing is that it is a one-way function: you can easily generate a hash from an input,
    // but you cannot reverse the process to find the original input from the hash value.
    public static void main(String[] args) {
        HashMap<String,Integer> hashmap = new HashMap<>();
        // insert
        hashmap.put("india",100);
        hashmap.put("china",99);
        hashmap.put("korea",199);
        hashmap.put("japan",929);

        System.out.println(hashmap);

        //get -
        int ranking = hashmap.get("india");
        System.out.println(ranking);

        System.out.println(hashmap.get("Nepal"));// return null because it is not present in map

        // Containskey : check if the key exist in the map and returns boolean values
        System.out.println(hashmap.containsKey("india")); // true
        System.out.println(hashmap.containsKey("tiwan"));// false

        // Remove
        System.out.println(hashmap.remove("china"));
        System.out.println(hashmap);

        // size :
        System.out.println(hashmap.size());

        // is empty
        System.out.println(hashmap.isEmpty());
//        hashmap.clear();// used to clear the hashmap






    }
}
