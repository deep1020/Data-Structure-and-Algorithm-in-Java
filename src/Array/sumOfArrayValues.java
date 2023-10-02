package Array;
public class sumOfArrayValues {

    static int sumArray(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
	public static void main(String args[]) {
        int arr[] = { 3, 1, 2, 5, 4 };
        System.out.println(sumArray(arr));
    }  
}
// T.C -> O(n)
// S.C -> O(1)
//int arr[] = { 3, 1, 2, 5, 4 };
//int sum = 0;
//    for (int i = 0; i < arr.length; i++) {
//    sum += arr[i];
//    }
//    System.out.println("sum of array values : " + sum);
