import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int choice = 0; //Declaring a variable choice and set to 0
	
	while(choice != 3) { //While user hasn't entered 3, then the program will continue
	System.out.println("- Money Converter -");
	System.out.println("1. USD to IDR");
	System.out.println("2. JPY TO IDR");
	System.out.println("3. Exit");
	System.out.print("Choose your choice : ");
	choice = input.nextInt();
	System.out.println("");
	
	switch(choice) { //Using the switch case based on the choice output
	case 1:
		System.out.println("USD 1$ = 15.000 IDR"); //Assuming 1$ is 15.000 IDR
		System.out.println("1. IDR To USD");
		System.out.println("2. USD To IDR");
		System.out.print("Your choice : ");
		int choice1 = input.nextInt();
		System.out.println("");
		if(choice1 == 1) {
			System.out.print("Enter your money : ");
			float idr = input.nextFloat();
			float res = idr / 15000;
			System.out.println("Result is $" + res);
			System.out.println("");
		}
		else if(choice1 == 2) {
			System.out.print("Enter your money : ");
			float usd = input.nextFloat();
			float res = usd * 15000;
			System.out.println("Result is Rp " + res);
			System.out.println("");
		}
		else {
			System.out.println("Invalid");
			System.out.println("");
		}
		break;
	case 2:
		System.out.println("¥1 = 100 IDR");  //Assuming ¥1 is 100 IDR
		System.out.println("1. IDR To JPY");
		System.out.println("2. JPY To IDR");
		System.out.print("Your choice : ");
		System.out.println("");
		int choice2 = input.nextInt();
		if(choice2 == 1) {
			System.out.print("Enter your money : ");
			float idr = input.nextFloat();
			float res = idr / 100;
			System.out.println("Result is ¥" + res);
			System.out.println("");
		}
		else if(choice2 == 2) {
			System.out.print("Enter your money : ");
			float jpy = input.nextFloat();
			float res = jpy * 100;
			System.out.println("Result is Rp " + res);
			System.out.println("");
		}
		else {
			System.out.println("Invalid");
			System.out.println("");
		}
		break;
	case 3:
		System.out.println("Thank you for using currency converter");
		input.close();
		break;
		
	default: 
		System.out.println("Invalid");
		System.out.println("");
			}
		}
	}
}

//I declare "System.out.println("");" statement every end of code block for avoiding confusion
