package Queue;
// Don't prefer implementing queue using array as array is fixed size and takes O(n) time during removal

public class queue_using_array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1; // Don't need to take front as it is always 0 when we implement through array
        Queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        // enqueue
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        // dequeue - O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            // First-In element will be removed first
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--; // shift all elements to previous place
            return front;
        }
        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}