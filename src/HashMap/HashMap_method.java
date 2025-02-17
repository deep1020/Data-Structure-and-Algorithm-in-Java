package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_method {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();

        // put() -> Insert specific key and value. If existing key is passed then previous value gets replaced by new value
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(null,"Guava");
        map.put(null,"Strawberry"); // trying multiple null keys
        map.put(1,"Grapes"); //trying duplicate key
        System.out.println("Iterating Hashmap...");
        // entrySet() -> create a new set and store map elements into them. Doesn't take any parameter returns a set having same elements as the hash map.
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
        // keySet() -> create a set out of the key elements contained in the hash map
        // It basically returns a set view of the keys or we can create a new set and store the key elements in them
        System.out.println("Key set is: "+map.keySet());
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

        // getOrDefault() -> To get the value mapped with specified key. If no value is mapped with the provided key then the default value is returned.
        String str=map.getOrDefault(2, "Juice");
        System.out.println("Returned Value: " + str);

        // putIfAbsent(key,value) -> map the specified key with the specified value,
        // only if no such key exists (or is mapped to null) in this HashMap instance.
        map.putIfAbsent(2,"Apple"); // Add
        map.putIfAbsent(4,"Kiwi");
        System.out.println("New HashMap after putIfAbsent: "+map);

        // computeIfAbsent(key,function) -> compute the value for a given key using the given mapping function
        // Store the computed value for the key in Hashmap if the key is not already associated with a value (or is mapped to null) else null.
        // Use putIfAbsent() when you have the value pre-calculated and want to avoid overwrites.
        // Use computeIfAbsent() when the value needs to be dynamically created based on the key or when complex logic is involved in calculating the value.
        map.computeIfAbsent(3,k->"Apple");
        System.out.println("New HashMap after computeIfAbsent: "+map);
    }
}
