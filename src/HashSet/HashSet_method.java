package HashSet;

import java.util.HashSet;
import java.util.Iterator;

// HashSet is used for avoiding duplicate data and to find value with the fast method.
public class HashSet_method {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("X");
        set.add("B");
        set.add("A");
        set.add("");
        set.add("C");
        System.out.println("HashSet: "+set);

        if(set.contains("B")){
            System.out.println("set contains B");
        }
        set.remove("B");
        if(!set.contains("B")){
            System.out.println("Not contains B");
        }
        System.out.println("New HashSet: "+set);
        System.out.println(set.size());

        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            if(set.contains("X")){
                itr.remove();
            }
        }
    }
}
