package demo2;

import java.util.Scanner;

public class Switchcasemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner obj = new Scanner(System.in);
		
		System.out.println("what day is it today");
		
		String day = obj.nextLine();
		
		switch (day) {
		
		case "monday":
		
		System.out.println("go to shopping");
		
		break;
			
		case "tuesday":
			
			System.out.println("go to mangal");
			
			break;
				
		case "wednsday":
			
			System.out.println("go to clinic");
			
			break;
				
		case "thursday":
			
			System.out.println("go to shoppers");
			
			break;
				
		
		
		}
		
		
		
		
		

	}

}
