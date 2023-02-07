package Swapping;

public class CharacterSwapppingInString {

	public static void main(String[] args) {
		
		String name="Ramaraju";
	
		
		System.out.println(	swapping(name, 0, name.length()-1));
		
	}
	




public static char[] swapping(String n, int i1, int i2) {
	
	char[]c=n.toCharArray();
	        char temp=c[i1];
			c[i1]=c[i2];
			c[i2]=temp;
	
	return c;
	
	
}

}
