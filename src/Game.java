import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		
		Scanner myScanner;
		myScanner = new Scanner(System.in);
		
//		String playerName;
//		
//		System.out.println("Please enter your name:");
//		
//		playerName = myScanner.nextLine();
//		
//		System.out.println("Hello " + playerName);
		
		int number;
		
		System.out.println("Please enter a number:");
		
		number = myScanner.nextInt();
		
		System.out.println("The number you typed is " + number);
		
	}

}
