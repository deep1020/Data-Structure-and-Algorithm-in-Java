package Array;
import java.util.Arrays;
public class count_frequency_elements {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 2, 7, 2, 8, 3};
        for(int i=0;i<arr.length;i++){
            System.out.print("Entered elements are: "+arr[i]);
        }
		boolean visited[] = new boolean[arr.length];
//	    Arrays.fill(visited, false);
	    
        System.out.println("Count frequency in given array: ");  
  
        for(int i = 0; i < arr.length; i++) {  
        	if (visited[i] == true)
                continue;
        	int count = 1;
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) {  
                	visited[j] = true;
                	count++;
                }
            }  
            System.out.println(arr[i] +" is repeated "+count+" times in given array");
        }
	}

}
