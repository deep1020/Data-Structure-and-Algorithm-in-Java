package ArrayList;
import java.util.*;

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
		// If we directly return list without using toArray(), it gives error: List<int[]> cannot be converted to int[][]
		Object obj[]=list.toArray();
		System.out.print("toArray() method using Object: ");
		for(Object ob:obj){
			System.out.print(ob+" ");
		}
		System.out.println();

		// asList() -> return a fixed-size list backed by the specified array
		// This method acts as a bridge between array-based and collection-based APIs, in combination with Collection.toArray()
		Integer elements[]=new Integer[]{10,20,30,40};
		List<Integer> li= Arrays.asList(elements);
		System.out.println(li);


		System.out.print("toArray() method using new int[0][1]");
		ArrayList<int[]> list2=new ArrayList<>();
		list2.add(new int[]{1,3});
		list2.add(new int[]{4,6});
		list2.add(new int[]{7,9});
		int arr[][]=list2.toArray(new int[0][]); // Or you can write -> new int[0][1]
		for(int i[]:arr){
			System.out.println("["+i[0]+","+i[1]+"]");
		}

		// subList() -> return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
		List<Integer> sublist=list.subList(1,3);
		System.out.println("Sublist of list: "+sublist);

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
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(11);
		list3.add(12);
		list3.add(13);
		list.addAll(list3);
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
