package Array;
public class sumOfArrayValues {
	
	public static void main(String args[])
    {
        int arr[] = { 3, 1, 2, 5, 4 };
        int sum = 0;        
        for (int i = 0; i < arr.length; i++) {
        	sum += arr[i];
        }
        System.out.println("sum of array values : " + sum);
    }  
}
