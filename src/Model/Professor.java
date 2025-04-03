package Model;

public class Professor extends Character
{
	public static String colour;
	/**Constructor:
	 * Postcondition:calls the super class Character with the parameters String category
	 * and the String colour.
	 * @param c
	 */
	Professor(int c)
	{
		super("Professor",setcolour(c));
	}
	/**
	 * Accessor:
	 * sets and returns the value of the String colour according to an integer
	 * Postcondition: sets and returns the value of the String colour according to an integer
	 * @param c
	 * @return the colour of the Character's card 
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
	 * Transformer: sets the power of the Character Professor
	 */
	public void Power()
	{
		
	}
}
