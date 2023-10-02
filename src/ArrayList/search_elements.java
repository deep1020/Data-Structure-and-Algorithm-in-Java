package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class search_elements {
    public static List<Integer> searchElement(ArrayList<String> list, String element) {
        List<Integer> indices = new ArrayList<Integer>();

        // Iterating over the ArrayList to search for the element
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element)) {
                indices.add(i);
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Mango");
        fruits.add("Orange");

        // Searching for an element using the searchElement() method
        List<Integer> indices = searchElement(fruits, "Mango");

        // Checking if the element exists in the ArrayList
        if (!indices.isEmpty()) {
            System.out.println("Found Mango at indices " + indices);
        } else {
            System.out.println("Mango not found");
        }
    }
}

