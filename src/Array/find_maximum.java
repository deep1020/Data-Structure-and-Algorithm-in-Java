package Array;

public class find_maximum {
    public static void main(String[] args) {
        int arr[]={3,2,6,8,4};
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[0]){
                arr[0]=arr[i];
            }
        }
        System.out.println("Largest element in an array: "+arr[0]);
    }
}
