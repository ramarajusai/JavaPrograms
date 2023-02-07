package StringContainsUniqueChars;

import java.util.Set;
import java.util.TreeSet;

public class Class1 {

	public static void main(String[] args) {

		
		String name="RAM";
		
		char[]c=name.toCharArray();
		
		
		Set<Character>sc=new TreeSet<Character>();
		
		for(char c1: c) {
			
			sc.add(c1);
			
		}
		
if(sc.size()==name.length()) {
	
	System.out.println("TRUE");
	
}
		
	}

}
