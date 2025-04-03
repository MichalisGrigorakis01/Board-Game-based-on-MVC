package Model;

public class FindingTile extends Tile
{
	/**Constructor: 
	 * Postcondition: calls the super class Tile with one parameter: String category
	 * @param category
	 */
	FindingTile(String category)
	{
		super(category);
	}
	/**Constructor:
	 * Postcondition: calls the super class Tile with the parameters: String category
	 * and the String colour (this is only for AmphoraTiles and MosaicTiles)
	 * which have colours
	 * @param category
	 * @param colour
	 */
	FindingTile(String category,String colour)
	{
		super(category,colour);
	}
	/**
	 * Constructor:
	 * Postcondition: calls the super class Tile with parameters:
	 * String category, String part and int k. The integer is important in order 
	 * to let the program know which class we want to call. In this case this constructor
	 * is only for the class SkeletonTile.
	 * @param category
	 * @param part
	 * @param k
	 */
	FindingTile(String category,String part,int k)
	{
		super(category,part,k);
	}
	
}
