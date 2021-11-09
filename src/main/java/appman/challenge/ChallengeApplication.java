package appman.challenge;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeApplication {

	public static void main(String[] args) {
		// This is spring application run command //
		SpringApplication.run(ChallengeApplication.class, args);
		
		// Import scanner from scanner class to receive user input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your string: "); 
		String str = scanner.nextLine(); // Create a String variable to store user input
		scanner.close();
		
		System.out.println(stringToIntConverter(str)); // Print return integer from method
		
	}

	private static int stringToIntConverter(String str) {
		int convertedInt = 0;
		int baseCount = 0;
		// Looping through the string from the last character to first character
		for (int i = str.length()-1; i >= 0; i--) {
			// Get a character from each index of string
			char current = str.charAt(i);
			// Check whether current char between char 0 to 9
			if(current >= '0' && current <= '9') {
				/* Because char is holding value(int) of each character 			*
				 * I making a int variable to collect the number char [0-9] value	*
				 * minus value of character 0 so it will become 0-9 in integer 		*/
				int convInt = current-'0';
				// int convInt = charToIntConverter(current); // Converting char to int function but not used.
				
				// Each number multiply by each base(10^n) and summary of them should be the integer in given string
				convertedInt += convInt * Math.pow(10, baseCount++);
			}
		}
		return convertedInt;
	}
	
/* Not used char2int converter. The reason for created is because I thinking of how to convert char value 
 * to integer but the code above might be better performance than this switch-case
 * 
	private static int charToIntConverter(char c) {
		switch (c) {
		case '0':
			return 0;
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9':
			return 9;
		default:
			return -1;
		}
	} 
*/
}
