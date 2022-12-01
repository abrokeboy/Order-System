package project;

import java.util.Scanner;

public class order {
	// created a list to choose from
	
	public static Scanner input = new Scanner(System.in);//import the scanner
	public static String again;
	public static int choose,quantity=1;
	public static double total=0,pay;
	//list for the options
	public static void list() {
		System.out.println("Watches");
		System.out.println("1. Dusk           Price.150.00");
		System.out.println("2. Warm           Price.175.00");
		System.out.println("3. Goku           Price.200.00");
		System.out.println("4. Cancel");
	}

	public static void orders() {
		System.out.println("Press 1 for Dusk , Press 2 for Warm , Press 3 for Goku and Press 4 to Cancel");
		
		choose = input.nextInt();
		//conditions
		if (choose ==1) {
			System.out.println("You choose Dusk");
			System.out.println("How many watches you want to buy? :");
			quantity = input.nextInt();
			total = total +(quantity* 150);
			
			System.out.println("You want to buy again? ");
			System.out.println("Press Y for Yes and N for No: ");
			again = input.next();
			if (again.equalsIgnoreCase("Y")) {
				orders();//call the method i created
			}
			else {
				System.out.println("Your Total is " + total);
				System.out.println("Enter a payment ");
				pay = input.nextDouble();
				if(pay <= total) {
				  System.out.println("Not Enough payment");
				}
				total = pay - total;
				System.out.println("Your change is  " + total);
				
			}
		} else if (choose ==2) {
			System.out.println("You choose Warm");
			System.out.println("How many watches you want to buy? :");
			quantity = input.nextInt();
			total = total +(quantity* 175.00);
			
			System.out.println("You want to buy again? ");
			System.out.println("Press Y for Yes and N for No: ");
			again = input.next();
			if (again.equalsIgnoreCase("Y")) {
				orders();
			}
		else {
			System.out.println("Your Total is " + total);
			System.out.println("Enter a payment ");
			pay = input.nextDouble();
			if(pay <= total) {
			System.out.println("Not Enough payment");
			}
			total = pay - total;
			System.out.println("Your change is  " + total);
			}
		}else if (choose ==3) {
			System.out.println("You choose Goku");
			System.out.println("How many watches you want to buy? :");
			quantity = input.nextInt();
			total = total +(quantity* 200.00);
			
			System.out.println("You want to buy again? ");
			System.out.println("Press Y for Yes and N for No: ");
			again = input.next();
			if (again.equalsIgnoreCase("Y")) {
				orders();
			}
			//created a payment method 
		else {
			System.out.println("Your Total is " + total);
			System.out.println("Enter a payment ");
			pay = input.nextDouble();
			if(pay <= total) {
			System.out.println("Not Enough payment");
			}
			total = pay - total;
			System.out.println("Your change is  " + total);
			}
			//option to cancel program
		}else if (choose == 4) {
			System.out.println("Canceled Purchase ");
			System.exit(0);
			//error can only choose 1-4
		}else {
			System.out.println("Choose 1 through 4 only!");
			orders();
		}
	}
	public static void main(String[] args) {
		//call the list to see the items and place one order
		list();
		orders();
	}

}
