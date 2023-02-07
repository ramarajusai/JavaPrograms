package FindLargestNumber;

public class LargestNumWithoutIf {

	public static void main(String[] args) {

		
		int x=2;
		int y=100;
		int z=0;
		
		int num=(x>y)?(x>z?x:z):(y>z?y:z);
		
		System.out.println(num);
	}

}