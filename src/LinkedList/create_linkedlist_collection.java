package LinkedList;
import java.util.Iterator;
import java.util.LinkedList;
public class create_linkedlist_collection {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>(); // String, Integer etc are generic
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        list.addLast("list"); // It automatically add node at last
        System.out.println(list);

        // size of linkedlist
        System.out.println(list.size());

        // print linkedlist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

        // remove
//        list.removeFirst();
//        System.out.println(list);
//        list.removeLast();
//        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        Iterator itr=list.descendingIterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" -> ");
        }
        System.out.println("null");
    }
}
