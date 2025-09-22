/*
 * TODO: Name: Leo Wang
 * TODO: Date 9/19/25
 * TODO: Class Period: 6
 * TODO: Program Description: Decimal to Binary & Binary to Decimal conversions 
 */
import java.util.Scanner; 
public class HelloWorld {

	public static void main(String[] args) {
		//TODO: Implement Program Requirements Here
		Scanner scanner = new Scanner(System.in);

		boolean c = true; 

		while(c){

		System.out.println("Welcome!  You have the following options: \n 1. Binary to Decimal \n 2. Decimal to Binary"); 
		System.out.println("What unit conversion would you like to perform? (Enter 1 or 2)"); 
		
		int choice = scanner.nextInt();

		while(choice != 1 && choice != 2) {
			System.out.println("Invalid choice. Please enter 1 or 2.");
			choice = scanner.nextInt();
		} // end while loop 
		
		if(choice == 1){
			System.out.println("What is the binary number?"); 
			scanner.nextLine(); 
			int decimal = convertBintoDec(scanner.nextLine());
			System.out.println("The decimal equivalent is:" + decimal); 
			} // end if statement 

		else if(choice == 2){
			System.out.println("What is the decimal number?"); 
			String binary = convertDectoBin(scanner.nextInt()); 
			System.out.println("The binary equivalent is:" + binary); 
			scanner.nextLine(); 
		} // end if statement 
		System.out.println("Do you want to continue - yes or no?");
		String answer = scanner.nextLine(); 
		if(answer.equals("yes"))
			c = true; 
		else if(answer.equals("no"))
			c = false; 
		} // end while loop 
	} // end main 
	public static int convertBintoDec(String b){
		int d = 0; 
		for(int i = 0; i < b.length(); i++){
			if(b.substring(i, i + 1).equals("1")){
				d += Math.pow(2, b.length() - (i +1));
			} // end if statement 
		} // end for loop 

		return d; 
	} // end conversion from Binary to Decimal 

	public static String convertDectoBin(int d){
		String b = ""; 
		while(d>0){
			b = d % 2 + b; 
			d /=2; 
		} // end while loop 
		while(b.length() < 8){
			b = "0" + b;
		} // end while loop 
		return b; 
	} // end Decimal to Binary conversion 



		
	} // end class


