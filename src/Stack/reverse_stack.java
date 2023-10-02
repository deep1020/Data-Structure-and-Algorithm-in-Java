package Stack;

import java.util.Stack;

public class reverse_stack {
    public static void pushAtBottom(int data, Stack<Integer> stk){
        if(stk.isEmpty()){  // Base case
            stk.push(data);
            return;
        }
        int top=stk.pop();
        pushAtBottom(data,stk);
        stk.push(top);
    }
    public static void reverse(Stack<Integer> stk){
        // remove the top elements until we get empty stack. Then push those elements at bottom of stack
        if(stk.isEmpty()){
            return;
        }
        int top=stk.pop();
        reverse(stk);
        pushAtBottom(top,stk);
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);

        reverse(stk);

        while (!stk.isEmpty()) {
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}
