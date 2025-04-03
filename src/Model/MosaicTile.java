package Model;

public class MosaicTile extends FindingTile
{
	private static String colour;
	/**Constructor:
	 * Postcondition: calls the super class FindingTile with 2 parameters:
	 * the category and the colour of the tile  
	 * @param c
	 */
	MosaicTile(int c)
	{
		super("MosaicTile",setcolour(c));
	}
	/**
	 * Accessor:
	 * sets and returns the value of the String colour according to an integer
	 * Postcondition: sets and returns the value of the string colour according to an integer
	 * @param c
	 * @return the value of the string colour
	 */
	public static String setcolour(int c)
	{
		if(c==1)
		{
			colour = "Green";
		}
		if(c==2)
		{
			colour = "Red";
		}
		if(c==3)
		{
			colour = "Yellow";
		}
		return colour;
	}
}
