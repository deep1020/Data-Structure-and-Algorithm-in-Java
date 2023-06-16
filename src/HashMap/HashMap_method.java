package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_method {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(null,"Guava");
        map.put(null,"Strawberry"); // trying multiple null keys
        map.put(1,"Grapes"); //trying duplicate key
        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        // get() -> access elements in the HashMap
        System.out.println("Get value of key '2' is: "+map.get(2)); // Output: Apple

        // putAll() -> copies all of the elements i.e., the mappings, from one map into another.
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(4,"Orange");
        map.putAll(hm);
        System.out.println("After invoking putAll() method ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        // remove() method
        System.out.println("Initial list of elements: "+map);
        map.remove(3);
        System.out.println("After remove elements: "+map);
        map.remove(2,"Apple");
        System.out.println("After remove elements: "+map);

        // replace() method
        map.replace(4,"Pineapple");
        System.out.println("After replace elements: "+map);

        // containsKey() -> check whether a particular key is being mapped into the HashMap or not
        System.out.println("Is the key '4' present? " + map.containsKey(4));

        // containsValue() -> check whether a particular value is being mapped into the HashMap or not
        System.out.println("Is the value 'Apple' present? " + map.containsValue("Apple"));

        // isEmpty() -> Checking for the emptiness of Map
        System.out.println("Is the map empty? " + map.isEmpty());

        // size() -> Displaying the size of the map
        System.out.println("The size of the map is " + map.size());

        // values() -> Using values() to get the set view of values
        System.out.println("The collection is: " + map.values());

        // equals() -> Checking the equality
        System.out.println("Equality of two objects of hashmap: map and hm: " + map.equals(hm));

        System.out.println("HashMap: "+map.toString());

//      getOrDefault() -> To get the value mapped with specified key.
//      If no value is mapped with the provided key then the default value is returned.
        String str=map.getOrDefault(2, "Juice");
        System.out.println("Returned Value: " + str);
    }
}
