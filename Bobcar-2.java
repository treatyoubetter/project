import java.util.Scanner;

public class Bobcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Available Cars: 1 for Economy, 2 for Compact, 3 for Standard");
		System.out.print("Please Choose the rental car: ");
		Scanner input = new Scanner(System.in);	
		int car = input.nextInt();
		System.out.print("Please enter the number of rental days: ");
		int days = input.nextInt();
		System.out.print("Club member?: 1 for yes, 0 for no: ");
		int club = input.nextInt();
		int package1 = 0,packageCost = 0;
		if(club == 1){
			System.out.print("Platinum Executive Package?: 1 for yes, 0 for no: ");
			package1 = input.nextInt();
		}
		String choice;
		int price,discount = 0,cost;
		if(car == 1){
			choice ="Economy";
			cost = 25;
			price = 25 * days;
			if (club == 1)
				discount = (days / 5) * 25;
			
		}
		else if (car == 2){
			choice = "Compact";
			cost = 55;
			price = 55 * days;
			if (club == 1)
				discount = (days / 5) *55;
		}
		else{
			choice = "Standard";
			cost = 100;
			price = 100 * days;
			if (club == 1)
				discount = (days / 5) * 100;
		}
		if (package1 == 1){
			packageCost = (int) (0.2 * price);
		}
		System.out.println();
		System.out.println("Base: "+ days +" days for a "+ choice +" @  $" + cost + " per day:                       "+ "$ "+ price);
		if (club == 1)
		System.out.println("Club Member Discount :                                         - $ "+ discount);
		if(package1 == 1)
		System.out.println("Platinum Executive Package:                                    + $ " + packageCost);
		System.out.println();
		System.out.println("Total Estimate for Rental:                                       " + "$ " + (price-discount+packageCost));
		
		input.close();
	}

}
