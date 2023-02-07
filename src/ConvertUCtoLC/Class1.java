package ConvertUCtoLC;

public class Class1 {

	public static void main(String[] args) {

		
		String name="RamaRaju";

		StringBuffer sbf=new StringBuffer(name);

		char[]c=name.toCharArray();

		for(int i=0;i<c.length;i++){

		if(Character.isLowerCase(c[i])){

		sbf.setCharAt(i,Character.toUpperCase(c[i]));

		}

		else{

		sbf.setCharAt(i,Character.toLowerCase(c[i]));
		}



		}

		System.out.println(sbf);
		}
	}

