package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class insert_element_arrayList {
	private static void addElement(Integer[] arr, int element, int position)
    {
        List<Integer> list = new ArrayList<> (Arrays.asList(arr));
        list.add(position - 1, element);        
        System.out.println("Initial Array:\n" + Arrays.toString(arr));
        arr = list.toArray(arr);
        System.out.println("\nArray with " + element+ " inserted at position "+ position + ":\n"+ Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int element = 50;
        int position = 5;
        addElement(arr, element, position);
    }
}