package PalindromeOrNot;

public class StringPalandrome {

	public static void main(String[] args) {

		
		String name="ANNA";
		String Rev="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			Rev+=name.charAt(i);
			
			
		}
		
	
	System.out.println(name.equals(Rev));
	}
	}

