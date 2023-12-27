package Hashmap;

import java.util.HashMap;

public class Hashmap {
    public void hashmapMain() {
        HashMap<String, Integer> map = new HashMap<>();

        // Method 1: Add an item
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println(map);

        // Method 2: Access an item
        System.out.println("Access an item: " + map.get("Two"));

        // Method 3: Remove an item
        System.out.println("Remove an item: " + map.remove("Three"));

        // Method 4: Clear the hashmap
        map.clear();
        System.out.println("After clearing hashmap: " + map);

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Method 5: Get hashmap's size
        System.out.println("Hashmap has size of " + map.size());

        // Method 6: Loop through a HashMap (keySet())
        // -> if you only want keys
        for (String strKey : map.keySet()) {
            System.out.println("KeySet: " + strKey);
        }

        // Method 7: Loop through a HashMap (values())
        // -> if you only want values
        for (int strVal : map.values()) {
            System.out.println("Values: " + strVal);
        }
    }
}
