package Model;

public class AmphoraTile extends FindingTile
{
	private static String colour;
	/**Constructor
	 * Postcondition: calls the super class FindingTile with 2 parameters: 
	 * the category which is AmphoraTile and the colour of these Tiles
	 * @param c
	 */
	AmphoraTile(int c)
	{
		super("AmphoraTile",setcolour(c));
	}
	/**
	 * Accessor:
	 * sets the colour according to the given integer (this integer will be given later
	 * from the class Bag) and returns its value
	 * Postcondition: sets the colour according to a given integer.
	 * @param c
	 * @return the colour of the tile
	 */
	public static String setcolour(int c)
	{
		if(c==1)
		{
			colour = "Blue";
		}
		if(c==2)
		{
			colour = "Brown";
		}
		if(c==3)
		{
			colour = "Red";
		}
		if(c==4)
		{
			colour = "Green";
		}
		if(c==5)
		{
			colour = "Yellow";
		}
		if(c==6)
		{
			colour = "Purple";
		}
		return colour;
	}
}
