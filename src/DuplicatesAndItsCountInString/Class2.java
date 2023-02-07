package DuplicatesAndItsCountInString;

import java.util.HashMap;
import java.util.Set;

public class Class2 {

	public static void main(String[] args) {

		String name = "NAGA";

		char[]c=name.toCharArray();
		
		
		HashMap<Character,Integer>hs=new HashMap<Character,Integer>();
		
		for(char c1:c) {
			
			if(hs.containsKey(c1)) {
				
				hs.put(c1, hs.get(c1)+1);
				
			}
			
			else {
				
				hs.put(c1, 1);
			}
			
		}
		
		
		Set<Character>ss=hs.keySet();
		
		for(char c2:ss) {
			
			if(hs.get(c2)>1) {
				
				System.out.println(c2+"========>"+hs.get(c2));
				
			}
			
			
		}
				
				
		
		
		
		}

}
