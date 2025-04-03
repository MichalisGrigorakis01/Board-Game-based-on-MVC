package Model;

import java.util.ArrayList;

public class Bag 
{
	public static ArrayList<Tile> tiles;
	/**Constructor:
	 * Postcondition: calls all the Tile classes and puts them in an ArrayList of type
	 *  Tile
	 */
	public Bag()
	{
		tiles = new ArrayList<Tile>();
		for(int i=0;i<135;i++)
		{
			if(i<24)
			{
				LandslideTile L = new LandslideTile();
				tiles.add(L);
			}
			else if(i<51)
			{
				if(i<33)
				{
					MosaicTile M = new MosaicTile(1);//Green
					tiles.add(M);
				}
				else if(i<42)
				{
					MosaicTile M = new MosaicTile(2);//Red
					tiles.add(M);
				}
				else
				{
					MosaicTile M = new MosaicTile(3);//Yellow
					tiles.add(M);
				}
			}
			else if(i<81)
			{
				if(i<56)
				{
					AmphoraTile A = new AmphoraTile(1);//Blue
					tiles.add(A);
				}
				else if(i<61)
				{
					AmphoraTile A =  new AmphoraTile(2);//Brown
					tiles.add(A);
				}
				else if(i<66)
				{
					AmphoraTile A = new AmphoraTile(3);//Red
					tiles.add(A);
				}
				else if(i<71)
				{
					AmphoraTile A = new AmphoraTile(4);//Green
					tiles.add(A);
				}
				else if(i<76)
				{
					AmphoraTile A = new AmphoraTile(5);//Yellow
					tiles.add(A);
				}
				else if(i<81)
				{
					AmphoraTile A = new AmphoraTile(6);//Purple
					tiles.add(A);
				}
			}
			else if(i<105)
			{
				if(i<93)
				{
					CaryatidTile C =  new CaryatidTile();
					tiles.add(C);
				}
				else
				{
					SphinxTile S = new SphinxTile();
					tiles.add(S);
				}
			}
			else if(i<135)
			{
				if(i<115)
				{
					SkeletonTile Sk = new SkeletonTile(1);
					tiles.add(Sk);
				}
				else if(i<125)
				{
					SkeletonTile Sk =  new SkeletonTile(2);
					tiles.add(Sk);
				}
				else if(i<130)
				{
					SkeletonTile Sk = new SkeletonTile(3);
					tiles.add(Sk);
				}
				else
				{
					SkeletonTile Sk = new SkeletonTile(4);
					tiles.add(Sk);
				}
			}
		}
	}
}
