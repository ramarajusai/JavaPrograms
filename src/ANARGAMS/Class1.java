package ANARGAMS;

import java.util.Arrays;

public class Class1 {

	public static void main(String[] args) {
		
		
		String name1="BAT";
		String name2="TAB";
		
		char[]c1=name1.toCharArray();
		char[]c2=name2.toCharArray();
		
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.toString(c1).equals(Arrays.toString(c2)));
		
		
	}

}
