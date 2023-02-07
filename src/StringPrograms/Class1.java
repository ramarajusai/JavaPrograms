package StringPrograms;

public class Class1 {

	public static void main(String[] args) {
		
		
		String name="Rama";
name.concat("raju");

System.out.println(name);//Rama as string is immutable

// TO PRINT "Ramaraju" as output follow below

name=name.concat("raju");

System.out.println(name);//Ramaraju
		
	}

}
