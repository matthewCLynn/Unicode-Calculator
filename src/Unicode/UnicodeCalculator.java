//Matt Lynn
//Unit 1 Unicode Calculator

package Unicode;
import java.util.Scanner;

public class UnicodeCalculator {

	public static void main(String[] args) {
		// variables
		String string1 = "test";
		String string2 = "test";
		Boolean playing = true;
		int round = 2;
		System.out.println("Hello, and welcome to WORD WARS!");
		do {
		int total1 = 0;
		int total2 = 0;
		
		System.out.print("Please enter the first word that will be entering the arena: ");
		Scanner userEntry = new Scanner(System.in);
		string1 = userEntry.nextLine();
		System.out.print("\nThank you! Please input the second word that wishes to do battle: ");
		string2 = userEntry.nextLine();
		total1 = calcValue(string1);
		total2 = calcValue(string2);
		System.out.println(string1 + " swings with a mighty force of " + total1 + "!");
		System.out.println(string2 + " fights back with a total power of " + total2 + "!");
		System.out.println("The difference in power was " + Math.abs(total1-total2) + "!");
		if(total1 == total2) {
			System.out.println("\nAmazing, an even match!");
		}
		//Check for playing again.
		System.out.print("If you want to play round " + round + " press Y: ");
		if(!userEntry.nextLine().equalsIgnoreCase("y")  ) {
			playing = false;
			System.out.println("Goodbye!");
		}
		
		round++;
		
		} while(playing == true);
		
		
	}
//	Finds unicode value of word
	public static int calcValue(String battleWord) {
		int total = 0;
		char currentChar = ' ';
		for(int i=0; i<battleWord.length(); i++)
		{
			currentChar = battleWord.charAt(i);
			total+=currentChar;
		}
		return (total);
	}
	

}
