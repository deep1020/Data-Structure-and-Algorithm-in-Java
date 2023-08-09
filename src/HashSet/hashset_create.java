package HashSet;
import java.util.*;

public class hashset_create {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();  
		  set.add("A");  
		  set.add("B");  
		  set.add("A");  
		  set.add("C");  
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}
