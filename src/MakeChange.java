import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
//		TEST CASES	
//		Amount: .67, Tendered: .50, Result: Error message
//		Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//		Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//		Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//		Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.
//		TO EDIT README OPEN WITH TEXT EDITOR
//		/Users/spencercomputer/SD/Java/workspace/MakeChangeProject
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How much is the item? ");
		double cost = sc.nextDouble();
		System.out.println("How much did the customer give you? ");
		double paid = sc.nextDouble();
		
		sc.close();
		
		
		
		
	}

}
