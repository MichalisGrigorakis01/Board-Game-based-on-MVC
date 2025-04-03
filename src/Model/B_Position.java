package Model;

import java.util.ArrayList;

public class B_Position
{
	private String category;
	private String colour;
	private String part;
	/**
	 * Constructor:
	 * Postcondition: sets the value of the String category and the String colour.
	 *  Its only for AmphoraTiles and MosaicTiles
	 * @param category
	 * @param colour
	 */
	public B_Position(String category,String colour)
	{
		this.category =  category;
		this.colour = colour;
	}
	/**
	 * Constructor:
	 * Postcondition: sets the value of the String category.
	 * Its only for the StatueTiles SphinxTile and CaryatidTile
	 * @param category
	 */
	public B_Position(String category)
	{
		this.category = category;
	}
	/**
	 * Constructor:
	 * Postcondition:sets the value of the String category,colour and part.
	 * Its only the the SkeletonTiles.
	 * The integer k let us know which constructor we are referring to.
	 * @param category
	 * @param part
	 * @param k
	 */
	public B_Position(String category,String part,int k)
	{
		this.category = category;
		this.part =  part;
	}
	/**
	 * Accessor:
	 * returns the value of the String category
	 * Postcondition: sets the value of the String category
	 * @return the category of one position on the Board
	 */
	public String getcategory()
	{
		return this.category;
	}
	/**
	 * Accessor:
	 * returns the value of the String colour
	 * Postcondition:sets the value of the String colour
	 * @return the colour of a tile which is on the board.
	 */
	public String getcolour()
	{
		return this.colour;
	}
	/**
	 * Accessor:
	 * returns the value of the String part
	 * Postcondition:sets the value of the String part
	 * @return the part of a skeleton tile which is on the board.
	 */
	public String getpart()
	{
		return this.part;
	}
	
}
