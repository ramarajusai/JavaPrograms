package StringPrograms;

public class Class2 {

	public static void main(String[] args) {

		
		
		String n1="Hello";
		String n2="Hello";
		String n3=new String("Hello");
		
		
		System.out.println(n1==n2); //true
		System.out.println(n1==n3);//false
		System.out.println(n2==n3);//false
		

		System.out.println(n1.equals(n2));//true
		System.out.println(n1.equals(n3));//true
		System.out.println(n2.equals(n3));//true
	
		
	}

}
