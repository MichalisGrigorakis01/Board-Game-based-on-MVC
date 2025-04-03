package Model;

import java.util.ArrayList;



public class Player 
{
	private String name;
	private int points;
	private int ID;
	protected ArrayList<Character> character1;
	protected ArrayList<Character> character2;
	protected ArrayList<Character> character3;
	protected ArrayList<Character> character4;
	
	/**	Constructor:
	 * Postcondition: sets the name of a Player
	 * @param name
	 * @param c
	 */
	public Player(String name)
	{
		this.name = name;
		this.points = 0;
	}
	/**
	 * Transformer(mutative):It initializes a player for a new round 
	 * Postcondition:initialize some variables.
	 * @param id
	 */
	public void init_player(int id)
	{
		this.ID = id;
	}
	/**Accessor:
	 * returns the name of the Player
	 * @return the name of the Player
	 */
	public String getname()
	{
		return this.name;
	}
	/**
	 * Transformer:sets the points of a Player
	 * Postconditions:sets the points of the given player. The parameter shows us on which player
	 * we are reffering to.
	 * @param Ptiles
	 */
	public void setpoints(ArrayList<B_Position> Ptiles)
	{
		//MosaicTiles
				int Mosaic_G = 0;//Green
				int Mosaic_R = 0;//Red
				int Mosaic_Y = 0;//Yellow
		//SkeletonTiles
				int B_U = 0;//Big_UP
				int B_D = 0;//Big_DOWN
				int S_U = 0;//Small_UP
				int S_D = 0;//Small_DOWN
		//AmphoraTiles
				int Amphora_B = 0;//Blue
				int Amphora_Br = 0;//Brown
				int Amphora_R = 0;//Red
				int Amphora_G = 0;//Green
				int Amphora_Y = 0;//Yellow
				int Amphora_P = 0;//Purple
				for(int i=0;i<Ptiles.size();i++)
				{
				//MosaicTiles	
					if(Ptiles.get(i).getcategory()=="MosaicTile")
					{
						if(Ptiles.get(i).getcolour()=="Green")
						{
							Mosaic_G = Mosaic_G + 1;
						}
						else if(Ptiles.get(i).getcolour()=="Red")
						{
							Mosaic_R =  Mosaic_R + 1;
						}
						else
						{
							Mosaic_Y =  Mosaic_Y + 1;
						}
					}
				//SkeletonTiles
					else if(Ptiles.get(i).getcategory()=="SkeletonTile")
					{
						if(Ptiles.get(i).getpart()=="Big_UP")
						{
							B_U = B_U + 1;
						}
						else if(Ptiles.get(i).getpart()=="Big_DOWN")
						{
							B_D = B_D + 1;
						}
						else if(Ptiles.get(i).getpart()=="Small_UP")
						{
							S_U = S_U + 1;
						}
						else if(Ptiles.get(i).getpart()=="Small_DOWN")
						{
							S_D = S_D + 1;
						}
					}
				//AmphoraTiles
					else if(Ptiles.get(i).getcategory()=="AmphoraTile")
					{
						if(Ptiles.get(i).getcolour()=="Blue")
						{
							Amphora_B =  Amphora_B + 1;
						}
						else if(Ptiles.get(i).getcolour()=="Brown")
						{
							Amphora_Br =  Amphora_Br + 1;
						}
						else if(Ptiles.get(i).getcolour()=="Red")
						{
							Amphora_R =  Amphora_R + 1;
						}
						else if(Ptiles.get(i).getcolour()=="Green")
						{
							Amphora_G = Amphora_G + 1;
						}
						else if(Ptiles.get(i).getcolour()=="Yellow")
						{
							Amphora_Y =  Amphora_P + 1;
						}
						else if(Ptiles.get(i).getcolour()=="Purple")
						{
							Amphora_P =  Amphora_P + 1;
						}
					}
				}
				//Amphora
			//6 AmphoraTiles
				while(Amphora_B>0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P>0)
				{
					Amphora_B = Amphora_B - 1;
					Amphora_Br = Amphora_Br - 1;
					Amphora_R = Amphora_R - 1;
					Amphora_G = Amphora_G - 1;
					Amphora_Y = Amphora_Y - 1;
					Amphora_P = Amphora_P - 1;
					this.points =  this.points + 6;
				}
				if(Amphora_B>0||Amphora_Br>0||Amphora_R>0||Amphora_G>0||Amphora_Y>0||Amphora_P>0)
				{
			//5 AmphoraTiles
					if(Amphora_B==0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_Br = Amphora_Br - 1;
						Amphora_R = Amphora_R - 1;
						Amphora_G = Amphora_G - 1;
						Amphora_Y = Amphora_Y - 1;
						Amphora_P = Amphora_P - 1;
						this.points = this.points + 4;
					}
					else if(Amphora_B>0&&Amphora_Br==0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_R = Amphora_R - 1;
						Amphora_G = Amphora_G - 1;
						Amphora_Y = Amphora_Y - 1;
						Amphora_P = Amphora_P - 1;
						this.points = this.points + 4;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R==0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_Br = Amphora_Br - 1;
						Amphora_G = Amphora_G - 1;
						Amphora_Y = Amphora_Y - 1;
						Amphora_P = Amphora_P - 1;
						this.points = this.points + 4;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G==0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_Br = Amphora_Br - 1;
						Amphora_R = Amphora_R - 1;
						Amphora_Y = Amphora_Y - 1;
						Amphora_P = Amphora_P - 1;
						this.points = this.points + 4;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y==0&&Amphora_P>0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_Br = Amphora_Br - 1;
						Amphora_R = Amphora_R - 1;
						Amphora_G = Amphora_G - 1;
						Amphora_P = Amphora_P - 1;
						this.points = this.points + 4;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P==0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_Br = Amphora_Br - 1;
						Amphora_R = Amphora_R - 1;
						Amphora_G = Amphora_G - 1;
						Amphora_Y = Amphora_Y - 1;
						this.points = this.points + 4;
					}
			//4 AmphoraTiles
					else if(Amphora_B==0&&Amphora_Br==0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_P = Amphora_P - 1;
						Amphora_Y = Amphora_Y - 1;
						Amphora_R = Amphora_R - 1;
						Amphora_G = Amphora_G - 1;
						this.points = this.points + 2;
					}
					else if(Amphora_B==0&&Amphora_Br>0&&Amphora_R==0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_P = Amphora_P - 1;
						Amphora_Y = Amphora_Y - 1;
						Amphora_Br = Amphora_Br - 1;
						Amphora_G = Amphora_G - 1;
						this.points = this.points + 2;
					}
					else if(Amphora_B==0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G==0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_P = Amphora_P - 1;
						Amphora_Y = Amphora_Y - 1;
						Amphora_Br = Amphora_Br - 1;
						Amphora_R = Amphora_R - 1;
						this.points = this.points + 2;
					}
					else if(Amphora_B==0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y==0&&Amphora_P>0)
					{
						Amphora_P = Amphora_P - 1;
						Amphora_G = Amphora_G - 1;
						Amphora_Br = Amphora_Br - 1;
						Amphora_R = Amphora_R - 1;
						this.points = this.points + 2;
					}
					else if(Amphora_B==0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P==0)
					{
						Amphora_Y = Amphora_Y - 1;
						Amphora_G = Amphora_G - 1;
						Amphora_Br = Amphora_Br - 1;
						Amphora_R = Amphora_R - 1;
						this.points = this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br==0&&Amphora_R==0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_Y = Amphora_Y - 1;
						Amphora_G = Amphora_G - 1;
						Amphora_B = Amphora_B - 1;
						Amphora_P = Amphora_P - 1;
						this.points = this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br==0&&Amphora_R>0&&Amphora_G==0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_Y = Amphora_Y - 1;
						Amphora_P = Amphora_P - 1;
						Amphora_B = Amphora_B - 1;
						Amphora_R = Amphora_R - 1;
						this.points = this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br==0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y==0&&Amphora_P>0)
					{
						Amphora_G = Amphora_G - 1;
						Amphora_P = Amphora_P - 1;
						Amphora_B = Amphora_B - 1;
						Amphora_R = Amphora_R - 1;
						this.points = this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br==0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P==0)
					{
						Amphora_G = Amphora_G - 1;
						Amphora_Y = Amphora_Y - 1;
						Amphora_B = Amphora_B - 1;
						Amphora_R = Amphora_R - 1;
						this.points = this.points + 2;
					}
					else if(Amphora_B==0&&Amphora_Br>0&&Amphora_R==0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_G = Amphora_G - 1;
						Amphora_Y = Amphora_Y - 1;
						Amphora_P = Amphora_P - 1;
						Amphora_Br = Amphora_Br - 1;
						this.points = this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br==0&&Amphora_R==0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_G =  Amphora_G - 1;
						Amphora_Y =  Amphora_Y - 1;
						Amphora_P =  Amphora_P - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R==0&&Amphora_G==0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_Br =  Amphora_Br - 1;
						Amphora_Y =  Amphora_Y - 1;
						Amphora_P =  Amphora_P - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R==0&&Amphora_G>0&&Amphora_Y==0&&Amphora_P>0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_G =  Amphora_G - 1;
						Amphora_Br =  Amphora_Br - 1;
						Amphora_P =  Amphora_P - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R==0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P==0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_G =  Amphora_G - 1;
						Amphora_Y =  Amphora_Y - 1;
						Amphora_Br =  Amphora_Br - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B==0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G==0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_P = Amphora_P - 1;
						Amphora_R =  Amphora_R - 1;
						Amphora_Y =  Amphora_Y - 1;
						Amphora_Br =  Amphora_Br - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br==0&&Amphora_R>0&&Amphora_G==0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_R =  Amphora_R - 1;
						Amphora_Y =  Amphora_Y - 1;
						Amphora_P =  Amphora_P - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R==0&&Amphora_G==0&&Amphora_Y>0&&Amphora_P>0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_Br =  Amphora_Br - 1;
						Amphora_Y =  Amphora_Y - 1;
						Amphora_P =  Amphora_P - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G==0&&Amphora_Y==0&&Amphora_P>0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_Br =  Amphora_Br - 1;
						Amphora_R =  Amphora_R - 1;
						Amphora_P =  Amphora_P - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G==0&&Amphora_Y>0&&Amphora_P==0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_Br =  Amphora_Br - 1;
						Amphora_R =  Amphora_R - 1;
						Amphora_Y =  Amphora_Y - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B==0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y==0&&Amphora_P>0)
					{
						Amphora_P = Amphora_P - 1;
						Amphora_Br =  Amphora_Br - 1;
						Amphora_R =  Amphora_R - 1;
						Amphora_G =  Amphora_G - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br==0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y==0&&Amphora_P>0)
					{
						Amphora_P = Amphora_P - 1;
						Amphora_B =  Amphora_B - 1;
						Amphora_R =  Amphora_R - 1;
						Amphora_G =  Amphora_G - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R==0&&Amphora_G>0&&Amphora_Y==0&&Amphora_P>0)
					{
						Amphora_P = Amphora_P - 1;
						Amphora_B =  Amphora_B - 1;
						Amphora_Br =  Amphora_Br - 1;
						Amphora_G =  Amphora_G - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G==0&&Amphora_Y==0&&Amphora_P>0)
					{
						Amphora_P = Amphora_P - 1;
						Amphora_B =  Amphora_B - 1;
						Amphora_Br =  Amphora_Br - 1;
						Amphora_R =  Amphora_R - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y==0&&Amphora_P==0)
					{
						Amphora_G = Amphora_G - 1;
						Amphora_B =  Amphora_B - 1;
						Amphora_Br =  Amphora_Br - 1;
						Amphora_R =  Amphora_R - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B==0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P==0)
					{
						Amphora_Br = Amphora_Br - 1;
						Amphora_R =  Amphora_R - 1;
						Amphora_G =  Amphora_G - 1;
						Amphora_Y =  Amphora_Y - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br==0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P==0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_R =  Amphora_R - 1;
						Amphora_G =  Amphora_G - 1;
						Amphora_Y =  Amphora_Y - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R==0&&Amphora_G>0&&Amphora_Y>0&&Amphora_P==0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_Br =  Amphora_Br - 1;
						Amphora_G =  Amphora_G - 1;
						Amphora_Y =  Amphora_Y - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G==0&&Amphora_Y>0&&Amphora_P==0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_Br =  Amphora_Br - 1;
						Amphora_R =  Amphora_R - 1;
						Amphora_Y =  Amphora_Y - 1;
						this.points =  this.points + 2;
					}
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R>0&&Amphora_G>0&&Amphora_Y==0&&Amphora_P==0)
					{
						Amphora_B = Amphora_B - 1;
						Amphora_Br =  Amphora_Br - 1;
						Amphora_R =  Amphora_R - 1;
						Amphora_G =  Amphora_G - 1;
						this.points =  this.points + 2;
					}
			//3AmphoraTiles
					else if(Amphora_B>0&&Amphora_Br>0&&Amphora_R>0)
					{
						
					}
						
				}
				//Mosaic
				while(Mosaic_G>4)
				{
					Mosaic_G = Mosaic_G - 4;
					this.points = this.points + 4;
				}
				while(Mosaic_R>4)
				{
					Mosaic_R = Mosaic_R - 4;
					this.points = this.points + 4;
				}
				while(Mosaic_Y>4)
				{
					Mosaic_Y = Mosaic_Y - 4;
					this.points = this.points + 4;
				}
				if(Mosaic_G!=0||Mosaic_R!=0||Mosaic_Y!=0)
				{
					if(Mosaic_G==3)
					{
						if(Mosaic_R==3||Mosaic_R==2||Mosaic_R==1)
						{
							Mosaic_R = Mosaic_R - 1;
							Mosaic_G = 0;
							this.points =  this.points + 2;
						}
						else if(Mosaic_Y==3||Mosaic_Y==2||Mosaic_Y==1)
						{
							Mosaic_Y = Mosaic_Y - 1;
							Mosaic_G = 0;
							this.points = this.points + 2;
						}
					}
					else if(Mosaic_G==2)
					{
						if(Mosaic_R==3||Mosaic_R==2)
						{
							Mosaic_R = Mosaic_R - 2;
							Mosaic_G = 0;
							this.points =  this.points + 2;
						}
						else if(Mosaic_Y==3||Mosaic_Y==2)
						{
							Mosaic_Y = Mosaic_Y - 2;
							Mosaic_G = 0;
							this.points = this.points + 2;
						}
					}
					else if(Mosaic_G==1)
					{
						if(Mosaic_R==3)
						{
							Mosaic_R = Mosaic_R - 3;
							Mosaic_G = Mosaic_G - 1;
							this.points =  this.points + 2;
						}
						else if(Mosaic_R==2&&Mosaic_Y!=0)
						{
							Mosaic_G = Mosaic_G - 1;
							Mosaic_R = Mosaic_R - 2;
							Mosaic_Y = Mosaic_Y - 1;
							this.points = this.points + 2;
						}
						else if(Mosaic_R==1&&Mosaic_Y>1)
						{
							Mosaic_G = Mosaic_G - 1;
							Mosaic_R =  Mosaic_R - 1;
							Mosaic_Y = Mosaic_Y - 2;
							this.points = this.points + 2;
						}
						else if(Mosaic_R==0&&Mosaic_Y>2)
						{
							Mosaic_G = Mosaic_G - 1;
							Mosaic_Y = Mosaic_Y - 3;
							this.points = this.points + 2;
						}
						else if(Mosaic_Y==3)
						{
							Mosaic_Y = Mosaic_Y - 3;
							Mosaic_G = Mosaic_G - 1;
							this.points = this.points + 2;
						}
					}
					else if(Mosaic_G==0)
					{
						if(Mosaic_R==3&&Mosaic_Y>0)
						{
							Mosaic_R = Mosaic_R - 3;
							Mosaic_Y = Mosaic_Y - 1;
							this.points = this.points + 2;
						}
						else if(Mosaic_R==2 && Mosaic_Y>1)
						{
							Mosaic_R = Mosaic_R - 2;
							Mosaic_Y =  Mosaic_Y - 2;
							this.points = this.points + 2;
						}
						else if(Mosaic_R==1&&Mosaic_Y>2)
						{
							Mosaic_R =  Mosaic_R - 1;
							Mosaic_Y =  Mosaic_Y - 3;
							this.points = this.points + 2;
						}
					}
				}
				//Full Family
				while(B_U>1 && B_D>1 && S_U!=0 && S_U !=0)
				{
					this.points = this.points + 6;
					S_U = S_U - 1;
					S_D = S_D - 1;
					B_U = B_U - 2;
					B_D = B_D - 2;
				}
				//One Big Skeleton
				while(B_U!=0 && B_D!=0&& (S_U==0 ||S_D==0))
				{
					this.points = this.points + 1;
					B_U = B_U - 1;
					B_D =  B_D - 1;
				}
				//One Small Skeleton
				while(S_U!=0 && S_D!=0 && (B_D==0||B_U==0))
				{
					this.points = this.points + 1;
					S_U = S_U - 1;
					S_D = S_D - 1;
				}
	}
	/**
	 * Accessor: returns the points of a Player
	 * Postcondition: returns the points of a Player
	 * @return points
	 */
	public int getpoints()
	{
		return this.points;
	}
	/**
	 * Accessor: returns the ID of a Player
	 * @return the ID of a Player
	 */
	public int getID()
	{
		return this.ID;
	}
	/**
	 * Transformer:
	 * Adds 4 character cards with the same colour to an arraylist in order
	 * to give them to a player. (The integer c let us know which colour we want to use)
	 * @param c
	 */
	public void get_characters(int c,Player p,ArrayList<Player>players)
	{
		if(p.getname()==players.get(0).getname())
		{
			character1 = new ArrayList<Character>();
			Assistant Ass = new Assistant(c);
			character1.add(Ass);
			
			Archaeologist Arc =  new Archaeologist(c);
			character1.add(Arc);
			
			Professor P =  new Professor(c);
			character1.add(P);
			
			Digger D = new Digger(c);
			character1.add(D);
		}
		else if(p.getname()==players.get(1).getname())
		{
			character2 = new ArrayList<Character>();
			Assistant Ass = new Assistant(c);
			character2.add(Ass);
			
			Archaeologist Arc =  new Archaeologist(c);
			character2.add(Arc);
			
			Professor P =  new Professor(c);
			character2.add(P);
			
			Digger D = new Digger(c);
			character2.add(D);
		}
		else if(p.getname()==players.get(2).getname())
		{
			character3 = new ArrayList<Character>();
			Assistant Ass = new Assistant(c);
			character3.add(Ass);
			
			Archaeologist Arc =  new Archaeologist(c);
			character3.add(Arc);
			
			Professor P =  new Professor(c);
			character3.add(P);
			
			Digger D = new Digger(c);
			character3.add(D);
		}
		else
		{
			character4 = new ArrayList<Character>();
			Assistant Ass = new Assistant(c);
			character4.add(Ass);
			
			Archaeologist Arc =  new Archaeologist(c);
			character4.add(Arc);
			
			Professor P =  new Professor(c);
			character4.add(P);
			
			Digger D = new Digger(c);
			character4.add(D);
		}
	}
}
