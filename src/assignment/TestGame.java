package assignment;

import java.util.Scanner;

public class TestGame {
	public static void main(String[] arg)
	{
	SimulateDie die1,die2;
	die1 = new SimulateDie();
	die2 = new SimulateDie();
	die1.roll();
	die2.roll();
	int HiddenTotal;
	HiddenTotal = 0;
	int player2Total;
	int sum;
	String Roll ="roll";
	String input = new String();
    Scanner keyboard = new Scanner(System.in);
	
    
	
	
    // roll
	for(player2Total=0;player2Total<=21; player2Total+=0)
	{
		
		//player1
		
		die1.roll();
		die2.roll();
		HiddenTotal+= die1.getValue() + die2.getValue();
		
		
		//ask player2 to continue or not
		 System.out.println("Do you want to contine? :");
			System.out.print("type roll or stop");
			input = keyboard.nextLine();
			Roll = input.trim();
			
			System.out.println(Roll);
			
			if(Roll.equals("roll"))
			{
				die1.roll();
				die2.roll();
				System.out.println("Score for user2 is :" + (die1.getValue() + die2.getValue()));
				sum = die1.getValue()+die2.getValue();
				System.out.println("You got " + sum + "point!!");
				player2Total +=sum;
				System.out.println("player2 total" +player2Total);
			}
			else {
				break;
			}
			
	}
	
	if(player2Total >HiddenTotal)
	{
		System.out.println("HiddenScore for player1 is "+HiddenTotal);
		System.out.println("Score for player2 is "+player2Total);
		System.out.println("player2 won a game");
		
	}
	else if (player2Total < HiddenTotal)
	{
		System.out.println("HiddenScore for player1 is "+HiddenTotal);
		System.out.println("Score for player2 is "+player2Total);
		System.out.println("player1 won a game");
	}
	
	else{
		System.out.println("HiddenScore for player1 is "+HiddenTotal);
		System.out.println("Score for player2 is "+player2Total);
		System.out.println("Tie");
	}
	
	}
}
