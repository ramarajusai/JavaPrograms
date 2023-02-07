package SortingArrays;

import java.util.Arrays;

public class CharactersSorting {

	public static void main(String[] args) {
		String name="Ramaraju";

		char[]c=name.toCharArray();

		Arrays.sort(c);

		System.out.println(Arrays.toString(c)); //[R, a, a, a, j, m, r, u
		
		Arrays.toString(c);
		System.out.println(c);//Raaajmru

	}

}
