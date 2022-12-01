package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to my store");
		
		char input = 0;
		ProductDAL dal = new ProductDAL();
		
		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Please make your selection");
			System.out.println("Press a to add product");
			System.out.println("Press u to update product");
			System.out.println("Press s to search for prduct");
			System.out.println("Press g to Show all product");
			System.out.println("Press q to quit");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			//get user input
			Scanner kb = new Scanner(System.in);
			input = kb.next().charAt(0);
			System.out.println("Your selection is: " + input + "\n");
			
			
			if (input == 'A' || input =='a') {
				
			}else if (input == 'U' || input =='u') {
				
			}else if (input == 'S' || input == 's') {
				
			}else if (input =='G' || input =='g') {
		
				dal.getAll();
			}
			else if (input =='Q' || input =='q') {
				System.out.println("Thank you for using online inventory system");
			}
			
		}while (input != 'q');

	} 
	
}
