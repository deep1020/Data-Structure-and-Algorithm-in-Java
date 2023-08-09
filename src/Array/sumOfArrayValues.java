package Array;
public class sumOfArrayValues {

    static void sumArray(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
//        return sum;
    }
	public static void main(String args[]) {
        int arr[] = { 3, 1, 2, 5, 4 };
        sumArray(arr);
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
