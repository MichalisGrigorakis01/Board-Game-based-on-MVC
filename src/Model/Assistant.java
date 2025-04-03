package Model;

public class Assistant extends Character
{
	private static String colour;
	/**Constructor:
	 * Postcondition: calls the super class Character with the  parameters the String
	 * category and the String colour.
	 * Also it has an integer which let the program know which colour we want to use.
	 * @param c
	 */
	Assistant(int c)
	{
		super("Assistant",setcolour(c));
	}
	/**
	 * Accessor:
	 * sets the value of the String colour and returns its value.
	 * the integer c is to let the program know which colour we want to use.
	 * Postcondition: sets the colour of a character's card.
	 * @param c
	 * @return the colour of a character's card
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
	 * sets the power of the Character Assistant
	 */
	public void Power()
	{
		
	}
}
