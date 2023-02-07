package SumOfNumbersFromString;

public class Class1 {

	public static void main(String[] args) {

		String n = "12d12d12";

		String temp = "0";
		int sum = 0;

		char[] c = n.toCharArray();

		for (int i = 0; i < c.length; i++) {

			if (Character.isDigit(c[i])) {
				temp = temp + c[i];

			}

			else {

				sum = sum + Integer.parseInt(temp);
				temp = "";//nospace

			}

		}

		System.out.println(sum + Integer.parseInt(temp));
	}

}
