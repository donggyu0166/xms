package hello;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6) {
			System.out.println("1. Add Member");
			System.out.println("2. Delete Member");
			System.out.println("3. Edit Date");
			System.out.println("4. View Date Remaining");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 6: ");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("Member name:");
				String name = input.next();
				System.out.print("Member Phone number:");
				int number = input.nextInt();
				break;
				
			case 2:
			case 3:
			case 4:
			}
		}
	}
}
