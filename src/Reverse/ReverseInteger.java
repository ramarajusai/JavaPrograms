package Reverse;

public class ReverseInteger {

	public static void main(String[] args) {

		int num=432;//43 //4//0
		int rev=0;//2 //23//234

		while(num!=0){//43//4//0

	int	rem=num%10;//2 //3 //4 //0
		rev=rev*10+rem;//2 //23//234
		num=num/10;//43 //4 //0

		}

		System.out.println(rev);
		
	}

}
