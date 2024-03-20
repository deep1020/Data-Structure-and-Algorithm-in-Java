package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arraylist_methods {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// add elements -> append the specified element at the end of a list.
		list.add(2);
		list.add(5);
		list.add(6);

		System.out.println("Elements Added: "+list);
		
		// get elements -> Returns the element at the specified position
		int element = list.get(0);
		System.out.println("Get element at index 0 is: "+element);
		
		// add elements in between
		list.add(1, 3);
		list.add(1, 4);
		System.out.println("Add elements at index 1: "+list);
		
		// set elements -> Replaces the element at the specified position
		list.set(0,8);
		System.out.println("Set Element at index 0: "+list);
		
		// delete element
		list.remove(3);
		System.out.println(list);

		// toArray() -> return an array containing all of the elements in this list in the correct order
		Object obj[]=list.toArray();
		System.out.print("Using toArray(): ");
		for(Object ob:obj){
			System.out.print(ob+" ");
		}
		System.out.println();

		// size -> Returns the number of elements
		System.out.println("Size of above array: "+list.size());
		
		// For loop
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		// for each loop
		for(Integer num:list) {
			System.out.print(num+" ");
		}
		System.out.println();

		// for each method
		list.forEach((n) -> System.out.print(n+" "));
		System.out.println();

		// indexOf() method -> return the index in this list of the first occurrence of the specified element
		int pos=list.indexOf(4);
		System.out.println("Element 4 is at index: "+pos);
		
		// sorting
		Collections.sort(list);
		System.out.println(list);
		
		// addAll method
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(11);
		list2.add(12);
		list2.add(13);
		list.addAll(list2);
		System.out.println(list);
		
		//remove
		list.remove(5);
		System.out.print(list);
		System.out.println();

		//removeIf
		list.removeIf(n->(n>12));
		System.out.println("Remove if n>12"+list);

		//isEmpty -> check if a list is empty or not
		boolean ans=list.isEmpty();
		System.out.println("List is empty: "+ans);

		// using iterator
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

}
