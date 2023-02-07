package FibinocciSeries;

public class FibinocciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=1;

		for(int i=0;i<=10;i++){


		a=b;
		b=c;
		c=a+b;

		System.out.println(a);

	}

}
	
}


//OUTPUT:
/*
 * 0 1 1 2 3 5 8 13 21 34 55
 */
