package Greedy;

import java.util.ArrayList;
import java.util.List;

public class activity_selection_problem {
    public static List<Integer> selectActivities(int[] startTimes, int[] finishTimes) {
        List<Integer> selectedActivities = new ArrayList<>();
        if(startTimes.length != finishTimes.length || startTimes.length == 0){
            return selectedActivities;
        }
        int n=startTimes.length;
        selectedActivities.add(1); // Add the first activity
        int lastFinishTime = finishTimes[0];
        for (int i = 1; i < n; i++) {
            if (startTimes[i] >= lastFinishTime) {
                selectedActivities.add(i);
                lastFinishTime = finishTimes[i];
            }
        }
        return selectedActivities;
    }
    public static void main(String[] args) {
        int[] startTimes = {1,3,0,5,3,5,6,8,8,2,12};
        int[] finishTimes = {4,5,6,7,8,9,10,11,12,13,14};
        System.out.println("Activities Selected at Index: "+selectActivities(startTimes, finishTimes));
    }
}