package appman.challenge;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your string: ");
		String str = scanner.nextLine();
		scanner.close();
		
		System.out.println(stringToIntConverter(str));
		
	}

	private static int stringToIntConverter(String str) {
		int convertedInt = 0;
		int baseCount = 0;
		for (int i = str.length()-1; i >= 0; i--) {
			char current = str.charAt(i);
			if(current >= '0' && current <= '9') {
				int convInt = current-'0';
//				int convInt = charToIntConverter(current);
				convertedInt += convInt * Math.pow(10, baseCount++);
			}
		}
		return convertedInt;
	}
	
/*
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
