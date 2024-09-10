package ArrayList;

import java.util.*;

public class sort_pair_accordingto_ith_index {
    static void sortList(int pair[][],int idx){
        List<int[]> list=new ArrayList<>(Arrays.asList(pair));
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                for(int i=idx-1;i>=0;i--){
                    int cmp=Integer.compare(a[i],b[i]);
                    return cmp;
                }
                return 0;
            }
        });
        for(int i=0;i<pair.length;i++){
            pair[i]=list.get(i);
        }
    }
    public static void main(String[] args) {
        int pair[][]={{3,1,4},{2,0,3},{1,0,1},{3,2,2}};
        int idx=1;
        sortList(pair,idx);
        for(int arr[]:pair){
            System.out.println(Arrays.toString(arr));
        }
    }
}
