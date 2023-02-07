package PrimeNumbers;

public class PrimeOrNot {

	public static void main(String[] args) {

		
		int count=0;
		int i=11;
		
		for(int j=2;j<i;j++) {
			
			if(i%j==0) {
				
				count++;
				
			}
			
			
		}
		
		
		if(count==0) {
			
			System.out.println("ITS IS A PRIME");
			
			
		}
		

				
				
		
	}

}
