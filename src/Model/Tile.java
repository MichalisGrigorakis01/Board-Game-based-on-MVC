package Model;


public abstract class Tile 
{
	private String category;
	private String colour;
	private String part;
	/**
	 * Constructor:
	 * Postcondition: sets the value of the String category
	 * @param category
	 */
	public Tile(String category)
	{
		this.category = category;
	}
	/**
	 * Constructor:
	 * Postcondition: sets the value of the String category and the String colour
	 * @param category
	 * @param colour
	 */
	public Tile(String category,String colour)
	{
		this.colour = colour;
		this.category = category;
	}
	/**Constructor:
	 * Postcondition: sets the value of the String category and the String part
	 * this constructor is only for the subclass SkeletonTile and thats why i have the
	 * variable temp.
	 * @param category
	 * @param part
	 * @param temp
	 */
	public Tile(String category,String part,int temp)
	{
		this.category = category;
		this.part =  part;
	}
	/**
	 *Accessor:
	 * returns the value of the category
	 * @return the category of a tile 
	 */
	public String getcategory()
	{
		return this.category;
	}
	/**
	 * Accessor:
	 * returns the value of the colour
	 * @return the colour of a tile 
	 */
	public String getcolour()
	{
		return colour;
	}
	/**
	 * Accessor:
	 * returns the part of a tile (only for skeletonTiles)
	 * @return the part of a tile (only for skeleton tiles) 
	 */
	public String getpart()
	{
		return part;
	}
}
