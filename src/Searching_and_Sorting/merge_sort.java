package Searching_and_Sorting;

public class merge_sort {
    int array[];
    int tempMergeArr[];
    int length;
    public static void main(String[] args) {
        int input_arr[] = {48,36,13,52,19,94,21};
        System.out.println("Given Array");
        for (int i:input_arr){
            System.out.print(i+" ");
        }
        System.out.println("\nAfter Sorting Array");
        merge_sort ms=new merge_sort();
        ms.sort(input_arr);
        for (int i:input_arr){
            System.out.print(i+" ");
        }
    }
    public void sort(int input_arr[]){
        // declare input_arr array in instance variable
        this.array=input_arr;
        this.length=input_arr.length;
        // create temp array and declare size
        this.tempMergeArr=new int[length];
        divideArray(0,length-1);
    }
    public void divideArray(int left,int right){
        if(left<right){
            int middle=left+(right-left)/2;
            // It will sort left side of array
            divideArray(left,middle);
            // It will sort right side of array
            divideArray(middle+1,right);
            mergeArray(left,middle,right);
        }
    }
    public void mergeArray(int left,int middle,int right){
        for(int i=left;i<=right;i++){
            tempMergeArr[i]=array[i];
        }
        int i=left;
        int j=middle+1;
        int k=left;
        while (i<=middle && j<=right){
            // Match temporary elements of array
            if(tempMergeArr[i]<=tempMergeArr[j]){
                // insert/replace values in original array
                array[k]=tempMergeArr[i];
                i++;
            }
            else {
                array[k]=tempMergeArr[j];
                j++;
            }
            // go through all values from left
            k++;
        }
        while(i<=middle){
            array[k]=tempMergeArr[i];
            k++;
            i++;
        }
    }

}
