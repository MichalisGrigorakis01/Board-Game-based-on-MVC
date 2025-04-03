package Model;

public class Archaeologist extends Character
{
	public static String colour;
	/**Constructor:
	 * Postcondition: calls the super class Character with the parameters String category
	 * and the string colour
	 * @param c
	 */
	Archaeologist(int c)
	{
		super("Archaeologist",setcolour(c));
	}
	/**
	 * Accessor:
	 * sets and returns the String colour according to an integer.
	 * Postcondition:sets and returns the colour of a character's card
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
	 * Transformer:
	 * sets the power of the character Archaeologist
	 */
	public void Power()
	{
		
	}
}

