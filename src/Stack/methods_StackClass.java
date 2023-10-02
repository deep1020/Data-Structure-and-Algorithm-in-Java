package Stack;

import java.util.Stack;

public class methods_StackClass {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        System.out.println("stack: " + stk);
        // checking stack is empty or not
        boolean result = stk.empty();
        System.out.println("Is stack is empty? " + result);

        // push() -> insert an element onto the top of the stack
        push_elements(stk,16);
        push_elements(stk,20);
        push_elements(stk,13);
        push_elements(stk,7);
        push_elements(stk,15);

        // pop() -> remove an element from the top of the stack
        pop_elements(stk);
        pop_elements(stk);

        // peek() -> look at the top element in the stack
        peek_element(stk);

        // search() -> searches the object in the stack from the top.
        // It returns the object location from the top of the stack
        // It returns -1 if object is not on the stack
        search_element(stk,16);

        // size() -> returns the total number of elements in the stack
        int stk_size=stk.size();
        System.out.println("Stack size is "+stk_size);


    }
    static void push_elements(Stack stk,int x){
        stk.push(x);
        System.out.println("push -> "+x);
        System.out.println("stack: "+stk);
    }
    static void pop_elements(Stack stk){
        Integer x=(Integer) stk.pop();
        System.out.println("pop -> "+x);
        System.out.println("stack: "+stk);
    }
    static void peek_element(Stack stk){
        Integer x=(Integer) stk.peek();
        System.out.println("Elements at top: "+x);
    }
    static void search_element(Stack stk,int element){
        Integer pos=(Integer) stk.search(element);
        if(pos==-1){
            System.out.println("Element not found");
        }
        else {
            System.out.println(element+" is found at position: "+pos);
        }
    }

}
