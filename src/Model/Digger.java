package Model;

public class Digger extends Character
{
	public static String colour;
	/**Constructor:
	 * Postcondition: calls the super class Character with the parameters String category
	 * and the String colour
	 * @param c
	 */
	Digger(int c)
	{
		super("Digger",setcolour(c));
	}
	/**
	 * Accessor:
	 * sets and returns the value of the String colour according to an integer
	 * Postcondition: sets and returns the value of the string colour according to an integer
	 * @param c
	 * @return the value of the string colour according to an integer
	 */
	public static String setcolour(int c)
	{
		if(c==1)
		{
			colour = "Red";
		}
		if(c==2)
		{
			colour = "Green";
		}
		if(c==3)
		{
			colour = "Blue";
		}
		if(c==4)
		{
			colour = "Black";
		}
		return colour;
	}
	/**
	 * Transformer: sets the power of the Character Digger
	 */
	public void Power()
	{
		
	}
}


