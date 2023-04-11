package Array;
public class SubarraySum {
	public void subArraySum(int arr[], int n, int sum)
    {
        int currentSum, i, j;
        for (i = 0; i < n; i++) {
            currentSum = arr[i];
            for (j = i + 1; j <= n; j++) {
                if (currentSum == sum) {
                    int p = j - 1;
                    System.out.println("Sum found between indexes " + i + " and " + p);
                }
                if (currentSum > sum || j == n)
                    break;
                currentSum = currentSum + arr[j];
            }
        }
        System.out.println("No subarray found");
    }

    public static void main(String[] args)
    {
        SubarraySum arraysum = new SubarraySum();
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 17;
        arraysum.subArraySum(arr, n, sum);
    }
}
