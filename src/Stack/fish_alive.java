package Stack;

import java.util.Stack;

public class fish_alive {
    static int aliveFish(int A[],int B[]){
        int N = A.length;
        int count = 0; // Number of surviving fish
        Stack<Integer> stack = new Stack<>(); // Stack to keep track of downstream fish
        for (int i = 0; i < N; i++) {
            if (B[i] == 1) {
                // Current fish is flowing downstream, push it onto the stack
                stack.push(A[i]);
            } else {
                // Current fish is flowing upstream
                while (!stack.isEmpty()) {
                    // Fight between upstream and downstream fish
                    if (stack.peek() > A[i]) {
                        // Downstream fish wins, current upstream fish is eaten
                        break;
                    } else {
                        // Upstream fish wins, downstream fish is eaten
                        stack.pop();
                    }
                }
                if (stack.isEmpty()) {
                    // No downstream fish left, current upstream fish survives
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int A[] = {4, 3, 2, 1, 5};
        int B[] = {0, 1, 0, 0, 0};
        System.out.println(aliveFish(A,B));
    }
}
