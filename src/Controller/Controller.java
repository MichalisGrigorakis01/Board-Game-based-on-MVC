package Controller;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.text.View;

import com.sun.tools.javac.Main;

import Model.B_Position;
import Model.Bag;
import Model.Board;
import Model.Player;
import Model.Tile;
import Main.main;

/**
 * Controller is the master of the game and controls all of the operations executed.
 */
public class Controller 
{
	private Player player1,player2,player3,player4;
	private ArrayList <Player> players =  new ArrayList<Player>();
	private Board board;
	private Bag bag;
	
	protected ArrayList<B_Position> P1tiles = new ArrayList<B_Position>(); //Player1 tiles
	protected ArrayList<B_Position> P2tiles = new ArrayList<B_Position>(); //Player2 tiles
	protected ArrayList<B_Position> P3tiles = new ArrayList<B_Position>();	//Player3 tiles
	protected ArrayList<B_Position> P4tiles = new ArrayList<B_Position>(); //Player4 tiles
	/**
	 * Constuctor:
	 * Controller is the master of the game and controls all the operations executed.
	 * Also initializes the Board and the 4 Players and checks if the game has started
	 * Postconditions: initializes the Board and the Players and checks if the game has 
	 * started.
	 */
	public Controller()
	{	
//Initializes the players		
		board = new Board();
		player1 = new Player("John");
		player2 = new Player("Mike");
		player3 = new Player("Alex");
		player4 = new Player("Andrew");
	//	System.out.println(player3.getname());
//Initializes the features of each player
		player1.init_player(0);
		player2.init_player(1);
		player3.init_player(2);
		player4.init_player(3);
	//	System.out.println(player4.getID());
//Intitializes the list of players.
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
	//	System.out.println(players.get(0).getname());
//Initializes the pack of characters for each player.
		player1.get_characters(1,player1,players);
		player2.get_characters(2,player2,players);
		player3.get_characters(3,player3,players);
		player4.get_characters(4,player4,players);
		
	}
/**
 * Accessor:sets the player whose turn is to play.
 * Postcondition: sets the Player who plays in this turn.
 * @param k
 * @return
 */
	public Player getPlayers(int k)
	{
		return players.get(k);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
