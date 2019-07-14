package _01_Lambda_Methods;

import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) -> {
			System.out.println(new StringBuilder(s).reverse().toString());
		}, "reverse");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			StringBuilder newString = new StringBuilder(s);
			for(int j = 0; j < s.length(); j++) {
				boolean upperCase = new Random().nextBoolean();
				
				
				if(upperCase == true) {
					newString.setCharAt(j, Character.toUpperCase(s.charAt(j)));
				}
				else {
					newString.setCharAt(j, Character.toLowerCase(s.charAt(j)));
				}
			}
			System.out.println(newString.toString());
		}, "Case Mix");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) -> {
			String newString = "";
			for(int j = 0; j < s.length(); j++) {
				newString = newString + s.charAt(j)+".";
			}
			System.out.println(newString);
		}, "Period Characters");
		//5. Call the printCustomMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s) -> {
			Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
			List<Character> list = Arrays.asList(vowels);
			
			String newString = "";
			for(int j = 0; j < s.length(); j++) {
				if(list.contains(s.charAt(j))) {
					//Do Nothing
				}
				else {
					newString = newString + s.charAt(j);
				}
			}
			System.out.println(newString);
			
		}, "No Vowels");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
