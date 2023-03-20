import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
//		TEST CASES	
//		Amount: .67, Tendered: .50, Result: Error message
//		Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//		Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//		Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//		Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.
// 		----------------------------------------------------------
//		HINT: add 0.005 to truncate or use Math.round((num] / 100);
//		/Users/spencercomputer/SD/Java/workspace/MakeChangeProject
//		git add .
//		git commit -m "[insert message]"
//		git push [will push updates]

		Scanner sc = new Scanner(System.in);	//Scanner to capture inputs(doubles)
		System.out.println("How much is the item? ");
		double cost = sc.nextDouble();
		System.out.println("How much did the customer give you? ");
		double paid = sc.nextDouble();
		
		sc.close();
		
		double change = paid - cost;			//determine amount of change to give
		
		if (change < 0.0) {						//if too little change = error
			System.out.println("Error! Customer did not pay enough.");
			return;								//return(s) allow output to flow properly. For example stops the output from printing this line & "provide customer change" together. 
		}
		else if (change == 0.0) {				//if exact change = end
			System.out.println("No change needed.");
			return;
		}
		
		
		int twentyDollar = (int) (change / 20);	//cast doubles to ints. determine how many of variable is in change
		change %= 20;							//mod for remainder
//			System.out.println(twentyDollar);   //This shows how many $20 there are change :: change ( paid - cost)
//			System.out.println(change);			//This shows how much change is left
		int tenDollar = (int) (change / 10);
		change %= 10;
//			System.out.println(tenDollar); 		//shows # of $10 in change..
//			System.out.println(change);			//... shows change remaining
		int fiveDollar = (int) (change / 5);
		change %= 5;
		int oneDollar = (int) (change / 1);
		change %= 1;
		int quarter = (int) (change / 0.25);
		change %= 0.25;
		int dime = (int) (change / 0.10);
		change %= 0.10;
		int nickel = (int) (change / 0.05);
		change %= 0.05;
		int penny = (int) (change / 0.01 + 0.005);		//+0.005 to round properly
		change %= 0.01;
		
		System.out.println("Provide customer change: ");
		if (twentyDollar > 0 ) {				//if statements in descending order to print output from calculations above if true
			System.out.println(twentyDollar + " twenty dollar bill(s) ");
		}
		if (tenDollar > 0 ) {
			System.out.println(tenDollar + " ten dollar bill(s) ");
		}
		if (fiveDollar > 0 ) {
			System.out.println(fiveDollar + " five dollar bill(s) ");
		}
		if (oneDollar > 0 ) {	
			System.out.println(oneDollar + " one dollar bill(s) ");
		}
		if (quarter > 0 ) {
			System.out.println(quarter + " quarter(s) ");
		}
		if (dime > 0 ) {
			System.out.println(dime + " dime(s) ");
		}
		if (nickel > 0 ) {
			System.out.println(nickel + " nickel(s) ");
		}
		if (penny > 0 ) {
			System.out.println(penny + " penny(pennies) ");
		}
		
	}	
}
