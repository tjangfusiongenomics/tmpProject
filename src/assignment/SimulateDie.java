package assignment;

import java.util.Random;

public class SimulateDie {
	private int sides=6 ;
	Random rand = new Random();
	
	
	
	public SimulateDie()
	{
		
		roll();
	}
	public void roll()
	{
		sides =rand.nextInt(6)+1;
		
	}
	public int getValue()
	{
		return sides;
	}
}
