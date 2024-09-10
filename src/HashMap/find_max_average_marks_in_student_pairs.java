package HashMap;

import java.util.HashMap;
import java.util.Map;

public class find_max_average_marks_in_student_pairs {

    static int findHighestAverage(String studentMarks[][]){
        Map<String,int[]> map=new HashMap<>();
        for(String entry[]:studentMarks){
            String name=entry[0];
            int score=Integer.parseInt(entry[1]);
            if(map.containsKey(name)){ // when same student appears in map
                map.get(name)[0]+=score; // Add to sum of scores
                map.get(name)[1]+=1; // Increment count, which helps to find average score then
            }
            else{
                map.put(name,new int[]{score,1});
            }
        }
        double highestAverage=0;
        for(Map.Entry<String,int[]> entry:map.entrySet()){
            int scores[]=entry.getValue();
            double average=scores[0]/scores[1];
            if(average>highestAverage){
                highestAverage=average;
            }
        }
        return (int)highestAverage;
    }
    public static void main(String[] args) {
        String studentMarks[][]={
                {"Bob", "87"}, {"Mike", "35"}, {"Bob", "52"}, {"Jason", "35"},
                {"Mike", "55"}, {"Jessica", "99"}
        };
        System.out.println(findHighestAverage(studentMarks));
    }
}
// T.C -> O(n)
// S.C -> O(n)
// Bob: (87+52)/2 = 139/2 = 69
// Mike: (35+55)/2 = 90/2 = 45
// Jason: (35/1) = 35
// Jessica: (99/1) = 99