package DuplicatesAndItsCountInString;

import java.util.HashMap;
import java.util.Set;
public class Class1 {

    public static void main(String[] args) {

        String name = "RAMARAJU";
       

        // Converting given string to char array
        char[] c = name.toCharArray();

        // Creating HashMap containing char as key and it's occurrences as value
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();

        System.out.println(m);
        // Checking each character of c
        for (Character ch : c) {

            if (m.containsKey(ch)) {

            	//System.out.println(m.get(ch));
                m.put(ch, m.get(ch) + 1);
               

            } else {

                m.put(ch, 1);

            }

        }

        // getting a set which containing all keys of m hashmap
        Set<Character> s = m.keySet();

        for (Character c1 : s) {

            if (m.get(c1) > 1) {

                System.out.println(c1 + "-->" + m.get(c1));

            }

        }
    }
}