package Array;

public class array_insertion_static {

	public static void main(String[] args) {
		
		 int arr[]= {2,4,3,7,5};
		 int n=5;
		 int pos=4;
		 int x=50;
		 int i;
		 System.out.println("Before Insertion");
		 for(i=0;i<n;i++)
		 {
			 System.out.println(arr[i]);
		 }
		 n++;
		 
		 for(i=n-1;i>=pos;i--)
		 {
			arr[i]=arr[i-1];
		 }
		arr[pos-1]=x;
		System.out.println("After Insertion");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
