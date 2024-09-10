package Array;

import java.util.Arrays;

public class array_insertion_static {

	static int[] insertElement(int arr[],int element,int position){
		if(position<0 || position>arr.length){
			throw new IndexOutOfBoundsException("Invalid Position");
		}
		int result[]=new int[arr.length+1];
		for(int i=0;i<arr.length+1;i++){
			if(i<position){
				result[i]=arr[i];
			}
			else if(i==position){
				result[i]=element;
			}
			else {
				result[i]=arr[i-1];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[]={2,4,3,7,5};
		int insert=10;
		int position=3;
		int result[]=insertElement(arr,insert,position);
		System.out.println(Arrays.toString(result));
	}
}
