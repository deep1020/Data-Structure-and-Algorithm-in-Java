package Dynamic_Programming;

public class egg_dropping_problem {
    static int eggDrop(int egg, int floor) {
        // If there are no floors, then no trials needed. OR if there is one floor, one trial needed.
        if (floor == 1 || floor == 0){
            return floor;
        }
        // We need k trials for one egg and k floors
        if (egg == 1){
            return floor;
        }
        int min = Integer.MAX_VALUE;
        int res;
        // Consider all droppings from 1st floor to kth floor and return the minimum of these values plus 1.
        for (int i = 1; i <= floor; i++) {
            res = Math.max(eggDrop(egg - 1, i - 1), eggDrop(egg, floor - i));
            if (res < min){
                min = res;
            }
        }
        return min + 1;
    }
    public static void main(String[] args) {
        int egg = 2, floor = 10;
        System.out.print("Minimum number of trials in worst case with " + egg
                + " eggs and " + floor + " floors is " + eggDrop(egg, floor));
    }
}
