package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> weekDays = new ArrayList <String>();
		//2. Add five Strings to your list
		weekDays.add("Monday");
		weekDays.add("Tuesday");
		weekDays.add("Wednesday");
		weekDays.add("Thursday");
		weekDays.add("Friday");
		//3. Print all the Strings using a standard for-loop
		for(int f = 0; f < weekDays.size(); f++) {
			String w = weekDays.get(f);
			System.out.println("String at element: " + f + " " + w);
			
		}
		
		System.out.println("\n");
		
		//4. Print all the Strings using a for-each loop
		for(String w : weekDays) {
			System.out.println(w);
		
		}
		
		System.out.println("\n");
		
		//5. Print only the even numbered elements in the list.
		System.out.println(weekDays.get(0));
		System.out.println(weekDays.get(2));
		System.out.println(weekDays.get(4));
		
		//6. Print all the Strings in reverse order.
		System.out.println("\n");
		System.out.println(weekDays.get(4));
		System.out.println(weekDays.get(3));
		System.out.println(weekDays.get(2));
		System.out.println(weekDays.get(1));
		System.out.println(weekDays.get(0));
		
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("\n");
		System.out.println(weekDays.get(1));
		System.out.println(weekDays.get(2));
	}
}
