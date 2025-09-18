/*
 * TODO: Name
 * TODO: Date
 * TODO: Class Period
 * TODO: Program Description
 */
import java.util.Scanner; 
public class HelloWorld {

	public static void main(String[] args) {
		//TODO: Implement Program Requirements Here

		System.out.println("Welcome!  You have the following options: \n 1. Binary to Decimal \n 2. Decimal to Binary"); 
		System.out.println("What unit conversion would you like to perform? (Enter 1 or 2)"); 
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		while(choice != 1 && choice != 2) {
			System.out.println("Invalid choice. Please enter 1 or 2.");
			choice = scanner.nextInt();
		}
		





		
	}

}
