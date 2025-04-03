package Model;

import java.util.ArrayList;

public abstract class Character 
{
	private String colour;
	private boolean Used = false;
	private String Player;
	private String category;
	/**Constructor:
	 * Postcondition: sets the colour of each character, the category of each character.
	 * Also shows the player that this card belongs to.
	 * @param category
	 * @param colour
	 */
	Character(String category,String colour)
	{
		
		this.category = category;
		this.colour = colour;
		
	}
	/**
	 * Observer:returns the value of the variable Used
	 * Postcondition: returns the value of the variable Used
	 * @return the value of the variable Used
	 */
	public boolean getUsage()
	{
		return this.Used;
	}
	/**
	 * Transformer: sets the value of the variable Used to true.
	 * Postcondition: sets the value of the variable Used to true.
	 */
	public void USED()
	{
		this.Used =  true;
	}
	/**
	 * Accessor:returns the category of the Character's card.
	 * Postcondition: returns the category of the Character's card.
	 * @return the category of the Character's card.
	 */
	public String getcategory()
	{
		return this.category;
	}
	/**
	 * Accessor:returns the colour of the Character's card.
	 * Postcondition: returns the colour of the Character's card
	 * @return the colour of the Character's card.
	 */
	public String getcolour()
	{
		return this.colour;
	}
}
