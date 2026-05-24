package Hashing;

import java.util.HashMap;
import java.util.Set;

public class hashmap02 {

    // Iteration on HashMap
    // Set<Integer> keys = hm.keySet(); basics Syntax




    public static void main(String[] args) {

        HashMap<String,Integer> hashmap = new HashMap<>();
        // insert
        hashmap.put("india",100);
        hashmap.put("china",99);
        hashmap.put("korea",199);
        hashmap.put("japan",929);

        System.out.println(hashmap);

        // iterate
        // Entry set : give key vallue pairs
        Set<String> keys = hashmap.keySet();
        System.out.println(keys);

        // abb keys pr hmm loops implement krege
        for (String k : keys){
            System.out.println("keys : "+k+ "," + "values : "+hashmap.get(k));
        }

    }
}
