package Divide_and_Conquer;

public class largest_rectangle_area_in_histogram {
    static public int largestRectangleArea(int heights[]){
        if(heights.length==0){
            return 0;
        }
        return calculateArea(heights,0, heights.length-1);
    }
    static public int calculateArea(int heights[],int start,int end){
        if(start>end){
            return 0;
        }
        int minIndex=start;
        for(int i=start;i<=end;i++){
            if(heights[i]<heights[minIndex]){
                minIndex=i;
            }
        }
        int area1=heights[minIndex]*(end-start+1);
        int area2=calculateArea(heights,start,minIndex-1);
        int area3=calculateArea(heights,minIndex+1,end);
        return Math.max(area1,Math.max(area2,area3));
    }
    public static void main(String[] args) {
        int heights[]={6,2,5,4,5,1,6};
        System.out.println("Largest Rectangle Area: "+largestRectangleArea(heights));
    }
}
