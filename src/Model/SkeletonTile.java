package Model;

public class SkeletonTile extends FindingTile
{
	private static String part;
	/**Constructor:
	 * Postcondition: calls the super class FindingTile with 2 parameters:
	 * the String category which is SkeletonTile and the part of the skeleton(Big_UP or
	 * Big_DOWN or Small_UP or Small_DOWN)
	 * @param p
	 */
	SkeletonTile(int p)
	{
		super("SkeletonTile",getpart(p),1);
	}
	/**
	 * Accessor:
	 * finds and returns the part of the skeleton according to the given integer
	 * (this integer will be given later from the Bag class)
	 * Postcondition: finds and returns the part of the skeleton according to the given
	 * integer.
	 * @param p
	 * @return the part of the skeleton according to the given integer
	 */
	public static String getpart(int p)
	{
		if(p==1) 
		{
			part = "Big_UP";
		}
		if(p==2)
		{
			part = "Big_DOWN";
		}
		if(p==3)
		{
			part = "Small_UP";
		}
		if(p==4)
		{
			part = "Small_DOWN";
		}
		return part;
	}
}
