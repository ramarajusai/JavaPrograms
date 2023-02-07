package NONREPEATEDCHARS;

public class Class1 {

	public static void main(String[] args) {

		
		String name="RAMARAJU";
		
		for(char c:name.toCharArray()) {
			System.out.println(name.indexOf(c) + " "+name.lastIndexOf(c));
			if(name.indexOf(c)==name.lastIndexOf(c)) {
			
				
				System.out.println(c);
			}
			
			
		}
		
		
	}

}
