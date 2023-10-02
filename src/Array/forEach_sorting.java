package Array;
import java.util.Arrays;
import java.util.Collections;
public class forEach_sorting {

	public static void main(String[] args) {
		Integer arr[] = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nArray elements in ascending order is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
//      we have defined an array as Integer. Because the reverseOrder() method does not work 
//      for the primitive data type.
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("\nArray elements in decending order is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}

}
