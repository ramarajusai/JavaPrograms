package DuplicatesAndItsCountInString;

import java.util.HashMap;
import java.util.Set;
//TESTING
public class Class3 {

	public static void main(String[] args) {

		
		
		String name="ramaraju";
		
		char []c=name.toCharArray();
		
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		
		for(char c1:c) {
			
			if(hm.containsKey(c1)) {
				
				hm.put(c1, hm.get(c1)+1);
				
			}
			
			else {
				
				hm.put(c1, 1);
				
			}
			
		}
		
		Set<Character>ss=hm.keySet();
		
		for(char c2:ss) {
			
			if(hm.get(c2)>1) {
				
				System.out.println(c2+"------->"+hm.get(c2));
				
				
			}
		}
	}

}
