package Model;

import java.util.ArrayList;

public class Board
{
	public ArrayList<B_Position> Mosaic =  new ArrayList<B_Position>();
	public ArrayList<B_Position> Amphora =  new ArrayList<B_Position>();
	public ArrayList<B_Position> Sphinx =  new ArrayList<B_Position>();
	public ArrayList<B_Position> Caryatid =  new ArrayList<B_Position>();
	public ArrayList<B_Position> Skeletons =  new ArrayList<B_Position>();
	public ArrayList<B_Position> Landslides =  new ArrayList<B_Position>();
	private Bag bag = new Bag();
	/**
	 * Constructor:
	 * Postconditions:
	 */
	public Board()
	{
		
	}
}

