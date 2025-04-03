package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Color;
import java.awt.Container;

import javax.swing.SwingConstants;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import Controller.Controller;
import Model.B_Position;
import Model.Bag;
import Model.Board;
import Model.Player;
import Model.SkeletonTile;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;

public class View {

	public JFrame frame;
	public JFrame frame_W;
	private JLayeredPane layeredPane = new JLayeredPane();
	private JButton E_T_1 = new JButton("End Turn");
	private JButton E_T_2 = new JButton("End Turn");
	private JButton E_T_3 = new JButton("End Turn");
	private JButton E_T_4 = new JButton("End Turn");
	private JButton D_T_1 = new JButton("Draw Tiles");
	private JButton D_T_2 = new JButton("Draw Tiles");
	private JButton D_T_3 = new JButton("Draw Tiles");
	private JButton D_T_4 = new JButton("Draw Tiles");
	private final JLayeredPane layeredPane_1 = new JLayeredPane();
	//Player1
	private	JPanel panel = new JPanel();
	private JButton arch1 = new JButton("");
	private JButton ass1 = new JButton("");
	private JButton dig1 = new JButton("");
	private JButton prof1 = new JButton("");
	private final JPanel panel_P1 = new JPanel();
	JLabel Player1 = new JLabel("Player 1");
	//Player2
	private	JPanel panel_2 =  new JPanel();
	private JButton arch2 = new JButton("");
	private JButton ass2 = new JButton("");
	private JButton dig2 = new JButton("");
	private JButton prof2 = new JButton("");
	private final JPanel panel_P2 =  new JPanel();
	JLabel Player2 = new JLabel("Player 2");
	//Player3
	private	JPanel panel_3 =  new JPanel();
	private JButton arch3 = new JButton("");
	private JButton ass3 = new JButton("");
	private JButton dig3 = new JButton("");
	private JButton prof3 = new JButton("");
	private final JPanel panel_P3 =  new JPanel();
	JLabel Player3 = new JLabel("Player 3");
	//Player4
	private	JPanel panel_4 =  new JPanel();
	private JButton arch4 = new JButton("");
	private JButton ass4 = new JButton("");
	private JButton dig4 = new JButton("");
	private JButton prof4 = new JButton("");
	private final JPanel panel_P4 =  new JPanel();
	JLabel Player4 = new JLabel("Player 4");
	//Tiles
	private final JPanel panel_1 = new JPanel();//LandSlides
	private final JPanel panel_5 = new JPanel();//MosaicTiles
	private final JPanel panel_6 = new JPanel();//AmphoraTiles
	private final JPanel panel_7 = new JPanel();//SphinxTiles and CaryatidTiles
	private final JPanel panel_8 = new JPanel();//SkeletonTiles
	int num = 5;
	int [] j = new int[num];
	//LandSlide Coordinates
	int x = 0;
	int y = 0;
	//Mosaic Coordinates
	int z = 0;
	int k = 0;
	//Amphora Coordinates
	int g = 0;
	int l = 0;
	//Sphinx and Caryatid Coordinates
	int x1 = 0;
	int y1 = 0;
	//SkeletonTiles
	int x2 = 0;
	int y2 = 0;
	
	protected ArrayList<B_Position> P1tiles = new ArrayList<B_Position>(); //Player1 tiles
	protected ArrayList<B_Position> P2tiles = new ArrayList<B_Position>(); //Player2 tiles
	protected ArrayList<B_Position> P3tiles = new ArrayList<B_Position>();	//Player3 tiles
	protected ArrayList<B_Position> P4tiles = new ArrayList<B_Position>(); //Player4 tiles
	private final JLayeredPane layeredPane_2 = new JLayeredPane();
	private final JLayeredPane layeredPane_4 = new JLayeredPane();
	private final JPanel Ptiles_1 = new JPanel();
	private final JPanel Ptiles_2 = new JPanel();
	private final JPanel Ptiles_3 = new JPanel();
	private final JPanel Ptiles_4 = new JPanel();
	private JLayeredPane layeredPane_3 = new JLayeredPane();;
	private Controller c = new Controller();
	private Board B = new Board();
	private int temp;
	private int testM = 0;
	private int testSk = 0;
	private int testA = 0;
	private int testSph = 0;
	private int testC = 0;

	

	/**
	 * Create the application.
	 */
	public View() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 1258, 714);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	//Background
		JLabel BG = new JLabel("");
		Image img =  new ImageIcon(this.getClass().getResource("/background2.png")).getImage();
		BG.setIcon(new ImageIcon(img));
		BG.setBounds(0, 0, 600, 605);
		frame.getContentPane().add(BG);
		layeredPane.setBounds(828, 0, 448, 557);
		frame.getContentPane().add(layeredPane);
		layeredPane_1.setBounds(601, 0, 227, 48);
		frame.getContentPane().add(layeredPane_1);
		layeredPane.setLayout(new CardLayout(0, 0));
		layeredPane.add(panel, "Player1");
		layeredPane.add(panel_2, "Player2");
		layeredPane.add(panel_3, "Player3");
		layeredPane.add(panel_4, "Player4");
		//LandslideTiles
		panel_1.setBackground(new Color(255, 222, 173));
		panel_1.setForeground(Color.ORANGE);
		panel_1.setLayout(null);
		BG.add(panel_1,new GridBagConstraints());
		panel_1.setBounds(206, 260, 181, 180);
		
		//MosaicTiles
		panel_5.setBounds(10, 0, 227, 225);
		panel_5.setBackground(new Color(255, 222, 173));
		panel_5.setForeground(Color.ORANGE);
		panel_5.setLayout(null);
		BG.add(panel_5,new GridBagConstraints());
		//AmphoraTiles
		panel_6.setForeground(Color.ORANGE);
		panel_6.setBackground(new Color(255, 222, 173));
		panel_6.setBounds(0, 361, 204, 244);
		panel_6.setLayout(null);
		BG.add(panel_6,new GridBagConstraints());
		//SphinxTiles and CaryatidTiles
		panel_7.setBounds(336, 0, 260, 225);
		panel_7.setForeground(Color.ORANGE);
		panel_7.setBackground(new Color(255, 222, 173));
		panel_7.setLayout(null);
		BG.add(panel_7,new GridBagConstraints());
		//SkeletonTiles
		panel_8.setForeground(Color.ORANGE);
		panel_8.setBounds(388, 361, 212, 244);
		panel_8.setBackground(new Color(255, 222, 173));
		panel_8.setLayout(null);
		BG.add(panel_8,new GridBagConstraints());
		fill(j,j.length);
		//Player's Tiles
		layeredPane_2.setBounds(601, 48, 229, 582);
		frame.getContentPane().add(layeredPane_2);
		Ptiles_1.setBounds(0, 0, 229, 600);
		layeredPane_2.add(Ptiles_1);
		Ptiles_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Ptiles_2.setBounds(0, 0, 229, 600);
		layeredPane_2.add(Ptiles_2);
		Ptiles_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Ptiles_3.setBounds(0, 0, 229, 600);
		layeredPane_2.add(Ptiles_3);
		Ptiles_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Ptiles_4.setBounds(0, 0, 229, 600);
		layeredPane_2.add(Ptiles_4);
		Ptiles_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		layeredPane_4.setBounds(302, 599, 298, 67);
		
		E_T_1.setBounds(0, 0, 298, 67);
		layeredPane_4.add(E_T_1);
		frame.getContentPane().add(layeredPane_4);
		
		E_T_2.setBounds(0, 0, 298, 67);
		layeredPane_4.add(E_T_2);
		frame.getContentPane().add(layeredPane_4);
		
		E_T_3.setBounds(0, 0, 298, 67);
		layeredPane_4.add(E_T_3);
		frame.getContentPane().add(layeredPane_4);
		
		E_T_4.setBounds(0, 0, 298, 67);
		layeredPane_4.add(E_T_4);
		frame.getContentPane().add(layeredPane_4);
		
		layeredPane_3.setBounds(0, 599, 298, 67);
		frame.getContentPane().add(layeredPane_4);
		
		D_T_1.setBounds(0, 0, 298, 67);
		layeredPane_3.add(D_T_1);
		frame.getContentPane().add(layeredPane_3);
		
		D_T_2.setBounds(0, 0, 298, 67);
		layeredPane_3.add(D_T_2);
		frame.getContentPane().add(layeredPane_3);
		
		D_T_3.setBounds(0, 0, 298, 67);
		layeredPane_3.add(D_T_3);
		frame.getContentPane().add(layeredPane_3);
		
		D_T_4.setBounds(0, 0, 298, 67);
		layeredPane_3.add(D_T_4);
		frame.getContentPane().add(layeredPane_3);
		player1();
		
	}
	/**
	 * Transformer:fills the array j with 0
	 * Postconditions:fills the array j with 0
	 * @param j
	 * @param num
	 */
	public static void fill(int[] j, int num) 
	{
		for (int i = 0;i < num; i++)
		{
			j[i] = 0; 
		}
		
	}
	/**
	 * Transformer:switch the Buttons E_T according to the player's turn
	 * Postcondition:switch the Buttons E_T
	 * @param E_T
	 */
	public void switchE_T(JButton E_T)
	{
		layeredPane_4.removeAll();
		layeredPane_4.add(E_T);
		layeredPane_4.repaint();
		layeredPane_4.revalidate();
	}
	/**
	 * Transformer:Switch between D_T buttons
	 * Postcondition: switches the D_T buttons 
	 * @param D_T
	 */
	public void switchD_T(JButton D_T)
	{
		layeredPane_3.removeAll();
		layeredPane_3.add(D_T);
		layeredPane_3.repaint();
		layeredPane_3.revalidate();
	}
	/**
	 * Transformer:Switches between the panels of the player's characters
	 * Postcondition:switches between the panels of the player's characters
	 * @param panel
	 */
	public void switchPanels(JPanel panel)
	{
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	/**
	 * Transformer:switches between the panels of the Player's label
	 * Postcondition:switches between the panels of the Player's label
	 * @param panel_P
	 */
	public void switchPlayer(JPanel panel_P)
	{
		layeredPane_1.removeAll();
		layeredPane_1.add(panel_P);
		layeredPane_1.repaint();
		layeredPane_1.revalidate();
	}
	/**
	 * Transformer:switches between the panels of the Player's tiles
	 * Postcondition:switches between the panels of the Player's tiles
	 * @param panel_T
	 */
	public void switchTiles(JPanel panel_T)
	{
		layeredPane_2.removeAll();
		layeredPane_2.add(panel_T);
		layeredPane_2.repaint();
		layeredPane_2.revalidate();
	}
	/**
	 * Transformer:Tranfers the MosaicTile button from the board to the player's panel
	 * Postcondition:Transfers the MosaicTile button from the board to the player's panel 
	 * @param q
	 * @param MosaicTile
	 * @param BP
	 */
	public void MosaicTileP(int q,JButton MosaicTile,B_Position BP)
	{
		JButton MosaicTile1 = new JButton("");
		MosaicTile1 = MosaicTile;
		if(c.getPlayers(temp).getID()==0)
		{
			switchTiles(Ptiles_1);	
			Ptiles_1.add(MosaicTile1);
			if(BP.getcolour()=="Green")
			{
				for(int o=0;o<B.Mosaic.size();o++)
				{
					if(B.Mosaic.get(o).getcolour()=="Green")
					{
						P1tiles.add(B.Mosaic.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Red")
			{
				for(int o=0;o<B.Mosaic.size();o++)
				{
					if(B.Mosaic.get(o).getcolour()=="Red")
					{
						P1tiles.add(B.Mosaic.get(o));
						break;
					}
				}
			}
			else
			{
				for(int o=0;o<B.Mosaic.size();o++)
				{
					if(B.Mosaic.get(o).getcolour()=="Yellow")
					{
						P1tiles.add(B.Mosaic.get(o));
						break;
					}
				}
			}
		}
		else if(c.getPlayers(temp).getID()==1)
		{
			switchTiles(Ptiles_2);
			Ptiles_2.add(MosaicTile1);
			if(BP.getcolour()=="Green")
			{
				for(int o=0;o<B.Mosaic.size();o++)
				{
					if(B.Mosaic.get(o).getcolour()=="Green")
					{
						P2tiles.add(B.Mosaic.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Red")
			{
				for(int o=0;o<B.Mosaic.size();o++)
				{
					if(B.Mosaic.get(o).getcolour()=="Red")
					{
						P2tiles.add(B.Mosaic.get(o));
						break;
					}
				}
			}
			else
			{
				for(int o=0;o<B.Mosaic.size();o++)
				{
					if(B.Mosaic.get(o).getcolour()=="Yellow")
					{
						P2tiles.add(B.Mosaic.get(o));
						break;
					}
				}
			}
		}
		else if(c.getPlayers(temp).getID()==2)
		{
			switchTiles(Ptiles_3);
			Ptiles_3.add(MosaicTile1);
			if(BP.getcolour()=="Green")
			{
				for(int o=0;o<B.Mosaic.size();o++)
				{
					if(B.Mosaic.get(o).getcolour()=="Green")
					{
						P3tiles.add(B.Mosaic.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Red")
			{
				for(int o=0;o<B.Mosaic.size();o++)
				{
					if(B.Mosaic.get(o).getcolour()=="Red")
					{
						P3tiles.add(B.Mosaic.get(o));
						break;
					}
				}
			}
			else
			{
				for(int o=0;o<B.Mosaic.size();o++)
				{
					if(B.Mosaic.get(o).getcolour()=="Yellow")
					{
						P3tiles.add(B.Mosaic.get(o));
						break;
					}
				}
			}
			
		}
		else if(c.getPlayers(temp).getID()==3)
		{
			switchTiles(Ptiles_4);
			Ptiles_4.add(MosaicTile1);
			if(BP.getcolour()=="Green")
			{
				for(int o=0;o<B.Mosaic.size();o++)
				{
					if(B.Mosaic.get(o).getcolour()=="Green")
					{
						P4tiles.add(B.Mosaic.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Red")
			{
				for(int o=0;o<B.Mosaic.size();o++)
				{
					if(B.Mosaic.get(o).getcolour()=="Red")
					{
						P4tiles.add(B.Mosaic.get(o));
						break;
					}
				}
			}
			else
			{
				for(int o=0;o<B.Mosaic.size();o++)
				{
					if(B.Mosaic.get(o).getcolour()=="Yellow")
					{
						P4tiles.add(B.Mosaic.get(o));
						break;
					}
				}
			}
		}
	}
	/**
	 * Transformer:Tranfers the SkeletonTile button from the board to the player's panel
	 * Postcondition:Transfers the SkeletonTile button from the board to the player's panel 
	 * @param q
	 * @param SkeletonTile
	 * @param BP
	 */
	public void SkeletonTileP(int q,JButton SkeletonTile,B_Position BP)
	{
		JButton SkeletonTile1 = new JButton("");
		SkeletonTile1 = SkeletonTile;
		if(c.getPlayers(temp).getID()==0)
		{
			switchTiles(Ptiles_1);
			Ptiles_1.add(SkeletonTile1);
			if(BP.getpart()=="Small_DOWN")
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Small_DOWN")
					{
						P1tiles.add(B.Skeletons.get(o));
						break;
					}
				}
			}
			else if(BP.getpart()=="Small_UP")
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Small_UP")
					{
						P1tiles.add(B.Skeletons.get(o));
						break;
					}
				}
			}
			else if(BP.getpart()=="Big_DOWN")
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Big_DOWN")
					{
						P1tiles.add(B.Skeletons.get(o));
						break;
					}
				}
			}
			else 
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Big_UP")
					{
						P1tiles.add(B.Skeletons.get(o));
						break;
					}
				}
			}
		}
		else if(c.getPlayers(temp).getID()==1)
		{
			switchTiles(Ptiles_2);
			Ptiles_2.add(SkeletonTile1);
			if(BP.getpart()=="Small_DOWN")
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Small_DOWN")
					{
						P2tiles.add(B.Skeletons.get(o));
						break;
					}
				}
			}
			else if(BP.getpart()=="Small_UP")
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Small_UP")
					{
						P2tiles.add(B.Skeletons.get(o));
						break;
					}
				}
			}
			else if(BP.getpart()=="Big_DOWN")
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Big_DOWN")
					{
						P2tiles.add(B.Skeletons.get(o));
						break;
					}
				}
			}
			else 
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Big_UP")
					{
						P2tiles.add(B.Skeletons.get(o));
						break;
					}
				}
			}
		}
		else if(c.getPlayers(temp).getID()==2)
		{
			switchTiles(Ptiles_3);
			Ptiles_3.add(SkeletonTile1);
			if(BP.getpart()=="Small_DOWN")
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Small_DOWN")
					{
						P3tiles.add(B.Skeletons.get(o));
						break;
					}
				}
			}
			else if(BP.getpart()=="Small_UP")
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Small_UP")
					{
						P3tiles.add(B.Skeletons.get(o));
						break;
					}
				}
			}
			else if(BP.getpart()=="Big_DOWN")
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Big_DOWN")
					{
						P3tiles.add(B.Skeletons.get(o));
						break;
					}
				}
			}
			else 
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Big_UP")
					{
						P3tiles.add(B.Skeletons.get(o));
						break;
					}
				}
			}
			
		}
		else
		{
			switchTiles(Ptiles_4);
			Ptiles_4.add(SkeletonTile1);
			if(BP.getpart()=="Small_DOWN")
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Small_DOWN")
					{
						P4tiles.add(B.Skeletons.get(o));
						break;
					}
				}
			}
			else if(BP.getpart()=="Small_UP")
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Small_UP")
					{
						P4tiles.add(B.Skeletons.get(o));
				//		B.Skeletons.remove(o);
						break;
					}
				}
			}
			else if(BP.getpart()=="Big_DOWN")
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Big_DOWN")
					{
						P4tiles.add(B.Skeletons.get(o));
				//		B.Skeletons.remove(o);
						break;
					}
				}
			}
			else 
			{
				for(int o=0;o<B.Skeletons.size();o++)
				{
					if(B.Skeletons.get(o).getpart()=="Big_UP")
					{
						P4tiles.add(B.Skeletons.get(o));
				//		B.Skeletons.remove(o);
						break;
					}
				}
			}
			
		}
	}
	/**
	 * Transformer:Tranfers the AmphoraTile button from the board to the player's panel
	 * Postcondition:Transfers the AmphoraTile button from the board to the player's panel 
	 * @param q
	 * @param AmphoraTile
	 * @param BP
	 */
	public void AmphoraTileP(int q,JButton AmphoraTile,B_Position BP)
	{
		
		JButton AmphoraTile1 = new JButton("");
		AmphoraTile1 = AmphoraTile;
		if(c.getPlayers(temp).getID()==0)
		{
			switchTiles(Ptiles_1);	
			Ptiles_1.add(AmphoraTile1);
			if(BP.getcolour()=="Blue")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Blue")
					{
						P1tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Brown")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Brown")
					{
						P1tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Red")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Red")
					{
						P1tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Green")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Green")
					{
						P1tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Yellow")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Yellow")
					{
						P1tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Purple")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Purple")
					{
						P1tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
		}
		else if(c.getPlayers(temp).getID()==1)
		{
			switchTiles(Ptiles_2);
			Ptiles_2.add(AmphoraTile1);
			if(BP.getcolour()=="Blue")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Blue")
					{
						P2tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Brown")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Brown")
					{
						P2tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Red")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Red")
					{
						P2tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Green")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Green")
					{
						P2tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Yellow")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Yellow")
					{
						P2tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Purple")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Purple")
					{
						P2tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			
		}
		else if(c.getPlayers(temp).getID()==2)
		{
			switchTiles(Ptiles_3);
			Ptiles_3.add(AmphoraTile1);
			if(BP.getcolour()=="Blue")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Blue")
					{
						P3tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Brown")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Brown")
					{
						P3tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Red")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Red")
					{
						P3tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Green")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Green")
					{
						P3tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Yellow")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Yellow")
					{
						P3tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Purple")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Purple")
					{
						P3tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			
		}
		else if(c.getPlayers(temp).getID()==3)
		{
			switchTiles(Ptiles_4);
			Ptiles_4.add(AmphoraTile1);
			if(BP.getcolour()=="Blue")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Blue")
					{
						P4tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Brown")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Brown")
					{
						P4tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Red")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Red")
					{
						P4tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Green")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Green")
					{
						P4tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Yellow")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Yellow")
					{
						P4tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
			else if(BP.getcolour()=="Purple")
			{
				for(int o=0;o<B.Amphora.size();o++)
				{
					if(B.Amphora.get(o).getcolour()=="Purple")
					{
						P4tiles.add(B.Amphora.get(o));
						break;
					}
				}
			}
		}
		
	}
	/**
	 * Transformer:Tranfers the SphinxTile button from the board to the player's panel
	 * Postcondition:Transfers the SphinxTile button from the board to the player's panel 
	 * @param q
	 * @param SphinxTile
	 * @param BP
	 */
	public void SphinxTileP(int q,JButton SphinxTile,B_Position BP)
	{
		
		JButton SphinxTile1 = new JButton("");
		SphinxTile1 = SphinxTile;
		if(c.getPlayers(temp).getID()==0)
		{
			switchTiles(Ptiles_1);	
			Ptiles_1.add(SphinxTile1);
			P1tiles.add(BP);
		}
		else if(c.getPlayers(temp).getID()==1)
		{
			switchTiles(Ptiles_2);	
			Ptiles_2.add(SphinxTile1);
			P2tiles.add(BP);
		}
		else if(c.getPlayers(temp).getID()==2)
		{
			switchTiles(Ptiles_3);	
			Ptiles_3.add(SphinxTile1);
			P3tiles.add(BP);
		}
		else if(c.getPlayers(temp).getID()==3)
		{
			switchTiles(Ptiles_4);	
			Ptiles_4.add(SphinxTile1);
			P4tiles.add(BP);
		}
		
	}
	/**
	 * Transformer:Tranfers the CaryatidTile button from the board to the player's panel
	 * Postcondition:Transfers the CaryatidTile button from the board to the player's panel 
	 * @param q
	 * @param CaryatidTile
	 * @param BP
	 */
	public void CaryatidTileP(int q,JButton CaryatidTile,B_Position BP)
	{
		JButton CaryatidTile1 = new JButton("");
		CaryatidTile1 = CaryatidTile;
		if(c.getPlayers(temp).getID()==0)
		{
			switchTiles(Ptiles_1);	
			Ptiles_1.add(CaryatidTile1);
			P1tiles.add(BP);
		}
		else if(c.getPlayers(temp).getID()==1)
		{
			switchTiles(Ptiles_2);	
			Ptiles_2.add(CaryatidTile1);
			P2tiles.add(BP);
		}
		else if(c.getPlayers(temp).getID()==2)
		{
			switchTiles(Ptiles_3);	
			Ptiles_3.add(CaryatidTile1);
			P3tiles.add(BP);
		}
		else if(c.getPlayers(temp).getID()==3)
		{
			switchTiles(Ptiles_4);	
			Ptiles_4.add(CaryatidTile1);
			P4tiles.add(BP);
		}
	}
	/**
	 * Transformer:sets the position of each tile on the board and also contains the ActionListener methods of each tile. It is 
	 * basically the game by itself, since the game starts and finishes from this method.
	 * Postcondition:sets the position of each tile of the board and also contains the ActionListener methods.
	 * @param q
	 */
	private void DrawTiles(int q)
	{	
		//Draw Tiles
						int loop = 0;
						Random rand = new Random();
						int rand_int;
						
						//removing  4 tiles from the bag and putting them on the board.
						while(loop<4)
						{
							rand_int = rand.nextInt(Bag.tiles.size());
							
							for(int i=0;i<Bag.tiles.size();i++)
							{
								if(rand_int == i)
								{
								//LandSlideTiles
										if(Bag.tiles.get(i).getcategory() == "Landslide")
										{
											B_Position BP = new B_Position("Landslide");
											B.Landslides.add(BP);
											
											if(j[0]==0)
											{
												JLabel LandSlideTile = new JLabel("");
											    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
												LandSlideTile.setIcon(new ImageIcon(img));
												LandSlideTile.setBounds(x, y, 39, 38);
												panel_1.add(LandSlideTile);
												j[0] = j[0] + 1;
											}
											else if(j[0]<4)
											{
												if(j[0]==1)
												{
													x = x + 44;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													j[0] = j[0] + 1;
												}
												else if(j[0]==2)
												{
													x = x + 44;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													j[0] = j[0] + 1;
												}
												else if(j[0]==3)
												{
													x = x + 44;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													j[0] = j[0] + 1;
												}
											}
											else if(j[0]<8)
											{
												if(j[0]==4)
												{
													x = 0;
													y = 50;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													j[0] = j[0] + 1;
												}
												else if(j[0]==5)
												{
													x = x + 44;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													j[0] = j[0] + 1;
												}
												else if(j[0]==6)
												{
													x = x + 44;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													j[0] = j[0] + 1;
												}
												else if(j[0]==7)
												{
													x = x + 44;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													j[0] = j[0] + 1;
												}
												
											}
											else if(j[0]<12)
											{
												if(j[0]==8)
												{
													x = 0;
													y = 100;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													j[0] = j[0] + 1;
												}
												else if(j[0]==9)
												{
													x = x + 44;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													j[0] = j[0] + 1;
												}
												else if(j[0]==10)
												{
													x = x + 44;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													j[0] = j[0] + 1;
												}
												else if(j[0]==11)
												{
													x = x + 44;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													j[0] = j[0] + 1;
												}
											}
											else if(j[0]<16)
											{
												if(j[0]==12)
												{
													x = 0;
													y=150;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													j[0] = j[0] + 1;
												}
												else if(j[0]==13)
												{
													x = x + 44;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													j[0] = j[0] + 1;
												}
												else if(j[0]==14)
												{
													x = x + 44;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													j[0] = j[0] + 1;
												}
												else if(j[0]==15)
												{
													x = x + 44;
													JLabel LandSlideTile = new JLabel("");
												    Image img =  new ImageIcon(this.getClass().getResource("/landslide.png")).getImage();
													LandSlideTile.setIcon(new ImageIcon(img));
													LandSlideTile.setBounds(x, y, 39, 38);
													panel_1.add(LandSlideTile);
													
													frame.dispose();
													frame_W = new JFrame();
													frame_W.setBounds(100, 100, 1258, 714);
													frame_W.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
													frame_W.getContentPane().setLayout(null);
													frame_W.setVisible(true);
													
													c.getPlayers(0).setpoints(P1tiles);
													c.getPlayers(1).setpoints(P2tiles);
													c.getPlayers(2).setpoints(P3tiles);
													c.getPlayers(3).setpoints(P4tiles);
													int p1 = c.getPlayers(0).getpoints();
													int p2 = c.getPlayers(1).getpoints();
													int p3 = c.getPlayers(2).getpoints();
													int p4 = c.getPlayers(3).getpoints();
													String name;
													if(p1>p2&&p1>p3&&p1>p4)
													{
														 name = c.getPlayers(0).getname();
													}
													else if(p2>p1 && p2>p3 && p2>p4)
													{
														 name = c.getPlayers(1).getname();
													}
													else if(p3>p1 && p3>p2 && p3>p4)
													{
														 name = c.getPlayers(2).getname();
													}
													else if(p4>p1 && p4>p2 && p4>p3)
													{
														 name = c.getPlayers(3).getname();
													}
													else
													{
														 name = "Its A Draw";
													}
													JLabel helper =  new JLabel("The Winner Is: ");
													helper.setBounds(0, 0, 100, 100);
													frame_W.getContentPane().add(helper);
													JLabel Winner = new JLabel(name);
													Winner.setBounds(100, 0, 100, 100);
													frame_W.getContentPane().add(Winner);
												}
											}
											Bag.tiles.remove(i);
											break;
										}
							//MosaicTiles
										else if(Bag.tiles.get(i).getcategory() == "MosaicTile")
										{
											B_Position BP1 = new B_Position("MosaicTile",Bag.tiles.get(i).getcolour());
											B.Mosaic.add(BP1);
											JButton MosaicTile =  new JButton("");
											
											if(j[1]==0)
											{
												
												if(Bag.tiles.get(i).getcolour()=="Green")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_green.png")).getImage();
													MosaicTile.setIcon(new ImageIcon(img));
													MosaicTile.setBounds(z, k, 39, 38);
													panel_5.add(MosaicTile);
													j[1] = j[1] + 1;
													MosaicTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 1;
															testSk = 0;
															testA = 0;
															testSph = 0;
															testC = 0;
															if(testM==1)
															{
																MosaicTileP(q,MosaicTile,BP1);
															}
															testM = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getcolour()=="Red")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_red.png")).getImage();
													MosaicTile.setIcon(new ImageIcon(img));
													MosaicTile.setBounds(z, k, 39, 38);
													panel_5.add(MosaicTile);
													j[1] = j[1] + 1;
													
													MosaicTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 1;
															testSk = 0;
															testA = 0;
															testSph = 0;
															testC = 0;
															if(testM==1)
															{
																MosaicTileP(q,MosaicTile,BP1);
															}
															testM = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getcolour()=="Yellow")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_yellow.png")).getImage();
													MosaicTile.setIcon(new ImageIcon(img));
													MosaicTile.setBounds(z, k, 39, 38);
													panel_5.add(MosaicTile);
													j[1] = j[1] + 1;
													
													MosaicTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 1;
															testSk = 0;
															testA = 0;
															testSph = 0;
															testC = 0;
															if(testM==1)
															{
																MosaicTileP(q,MosaicTile,BP1);
															}
															testM = 0;
														}
													});
												}
											}
											else if(j[1]<5)
											{
												z = z + 40;
												if(Bag.tiles.get(i).getcolour()=="Green")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_green.png")).getImage();
													MosaicTile.setIcon(new ImageIcon(img));
													MosaicTile.setBounds(z, k, 39, 38);
													panel_5.add(MosaicTile);
													j[1] = j[1] + 1;
													
													MosaicTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 1;
															testSk = 0;
															testA = 0;
															testSph = 0;
															testC = 0;
															if(testM==1)
															{
																MosaicTileP(q,MosaicTile,BP1);
															}
															testM = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getcolour()=="Red")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_red.png")).getImage();
													MosaicTile.setIcon(new ImageIcon(img));
													MosaicTile.setBounds(z, k, 39, 38);
													panel_5.add(MosaicTile);
													j[1] = j[1] + 1;
													
													MosaicTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 1;
															testSk = 0;
															testA = 0;
															testSph = 0;
															testC = 0;
															if(testM==1)
															{
																MosaicTileP(q,MosaicTile,BP1);
															}
															testM = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getcolour()=="Yellow")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_yellow.png")).getImage();
													MosaicTile.setIcon(new ImageIcon(img));
													MosaicTile.setBounds(z, k, 39, 38);
													panel_5.add(MosaicTile);
													j[1] = j[1] + 1;
													
													MosaicTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 1;
															testSk = 0;
															testA = 0;
															testSph = 0;
															testC = 0;
															if(testM==1)
															{
																MosaicTileP(q,MosaicTile,BP1);
															}
															testM = 0;
														}
													});
												}
											}
											else if(j[1]<10)
											{
												if(j[1]==5)
												{
													z = 0;
													k = 39;
													if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_green.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_red.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_yellow.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
												}
												else
												{
													z = z + 40;
													if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_green.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_red.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_yellow.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
												}
											}
											else if(j[1]<15)
											{
												if(j[1]==10)
												{
													z = 0;
													k = k + 39;
													if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_green.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_red.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_yellow.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
												}
												else
												{
													z = z + 40;
													if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_green.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_red.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_yellow.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
												}
											}
											else if(j[1]<20)
											{
												if(j[1]==15)
												{
													z = 0;
													k = k + 39;
													if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_green.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_red.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_yellow.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
												}
												else
												{
													z = z + 40;
													if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_green.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_red.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_yellow.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
												}
											}
											else if(j[1]<25)
											{
												if(j[1]==20)
												{
													z = 0;
													k = k + 39;
													if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_green.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_red.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_yellow.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
												}
												else
												{
													z = z + 40;
													if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_green.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_red.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_yellow.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
												}
											}
											else if(j[1]<27)
											{
												if(j[1]==25)
												{
													z = 0;
													k = k + 39;
													if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_green.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_red.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_yellow.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
												}
												else
												{
													z = z + 40;
													if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_green.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_red.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
													else
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/mosaic_yellow.png")).getImage();
														MosaicTile.setIcon(new ImageIcon(img));
														MosaicTile.setBounds(z, k, 39, 38);
														panel_5.add(MosaicTile);
														j[1] = j[1] + 1;
														
														MosaicTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 1;
																testSk = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testM==1)
																{
																	MosaicTileP(q,MosaicTile,BP1);
																}
																testM = 0;
															}
														});
													}
												}
											}
											Bag.tiles.remove(i);
											break;
										}
								//AmphoraTiles
										else if(Bag.tiles.get(i).getcategory() == "AmphoraTile")
										{
											B_Position BP2 = new B_Position("AmphoraTile",Bag.tiles.get(i).getcolour());
											B.Amphora.add(BP2);
											JButton AmphoraTile = new JButton("");
											
											if(j[2]==0)
											{
												if(Bag.tiles.get(i).getcolour()=="Blue")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/amphora_blue.png")).getImage();
													AmphoraTile.setIcon(new ImageIcon(img));
													AmphoraTile.setBounds(g, l, 39, 38);
													panel_6.add(AmphoraTile);
													j[2] = j[2] + 1;
													
													AmphoraTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 1;
															testSph = 0;
															testC = 0;
															if(testA==1)
															{
																AmphoraTileP(q,AmphoraTile,BP2);
															}
															testA = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getcolour()=="Red")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/amphora_red.png")).getImage();
													AmphoraTile.setIcon(new ImageIcon(img));
													AmphoraTile.setBounds(g, l, 39, 38);
													panel_6.add(AmphoraTile);
													j[2] = j[2] + 1;
													
													AmphoraTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 1;
															testSph = 0;
															testC = 0;
															if(testA==1)
															{
																AmphoraTileP(q,AmphoraTile,BP2);
															}
															testA = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getcolour()=="Brown")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/amphora_brown.png")).getImage();
													AmphoraTile.setIcon(new ImageIcon(img));
													AmphoraTile.setBounds(g, l, 39, 38);
													panel_6.add(AmphoraTile);
													j[2] = j[2] + 1;
													
													AmphoraTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 1;
															testSph = 0;
															testC = 0;
															if(testA==1)
															{
																AmphoraTileP(q,AmphoraTile,BP2);
															}
															testA = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getcolour()=="Yellow")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/amphora_yellow.png")).getImage();
													AmphoraTile.setIcon(new ImageIcon(img));
													AmphoraTile.setBounds(g, l, 39, 38);
													panel_6.add(AmphoraTile);
													j[2] = j[2] + 1;
													
													AmphoraTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 1;
															testSph = 0;
															testC = 0;
															if(testA==1)
															{
																AmphoraTileP(q,AmphoraTile,BP2);
															}
															testA = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getcolour()=="Green")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/amphora_green.png")).getImage();
													AmphoraTile.setIcon(new ImageIcon(img));
													AmphoraTile.setBounds(g, l, 39, 38);
													panel_6.add(AmphoraTile);
													j[2] = j[2] + 1;
													
													AmphoraTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 1;
															testSph = 0;
															testC = 0;
															if(testA==1)
															{
																AmphoraTileP(q,AmphoraTile,BP2);
															}
															testA = 0;
														}
													});
												}
												else
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/amphora_purple.png")).getImage();
													AmphoraTile.setIcon(new ImageIcon(img));
													AmphoraTile.setBounds(g, l, 39, 38);
													panel_6.add(AmphoraTile);
													j[2] = j[2] + 1;
													
													AmphoraTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 1;
															testSph = 0;
															testC = 0;
															if(testA==1)
															{
																AmphoraTileP(q,AmphoraTile,BP2);
															}
															testA = 0;
														}
													});
												}
											}
											else if(j[2]<5)
											{
												g = g + 40;
												if(Bag.tiles.get(i).getcolour()=="Blue")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/amphora_blue.png")).getImage();
													AmphoraTile.setIcon(new ImageIcon(img));
													AmphoraTile.setBounds(g, l, 39, 38);
													panel_6.add(AmphoraTile);
													j[2] = j[2] + 1;
													
													AmphoraTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 1;
															testSph = 0;
															testC = 0;
															if(testA==1)
															{
																AmphoraTileP(q,AmphoraTile,BP2);
															}
															testA = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getcolour()=="Red")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/amphora_red.png")).getImage();
													AmphoraTile.setIcon(new ImageIcon(img));
													AmphoraTile.setBounds(g, l, 39, 38);
													panel_6.add(AmphoraTile);
													j[2] = j[2] + 1;
													
													AmphoraTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 1;
															testSph = 0;
															testC = 0;
															if(testA==1)
															{
																AmphoraTileP(q,AmphoraTile,BP2);
															}
															testA = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getcolour()=="Brown")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/amphora_brown.png")).getImage();
													AmphoraTile.setIcon(new ImageIcon(img));
													AmphoraTile.setBounds(g, l, 39, 38);
													panel_6.add(AmphoraTile);
													j[2] = j[2] + 1;
													
													AmphoraTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 1;
															testSph = 0;
															testC = 0;
															if(testA==1)
															{
																AmphoraTileP(q,AmphoraTile,BP2);
															}
															testA = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getcolour()=="Yellow")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/amphora_yellow.png")).getImage();
													AmphoraTile.setIcon(new ImageIcon(img));
													AmphoraTile.setBounds(g, l, 39, 38);
													panel_6.add(AmphoraTile);
													j[2] = j[2] + 1;
													
													AmphoraTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 1;
															testSph = 0;
															testC = 0;
															if(testA==1)
															{
																AmphoraTileP(q,AmphoraTile,BP2);
															}
															testA = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getcolour()=="Green")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/amphora_green.png")).getImage();
													AmphoraTile.setIcon(new ImageIcon(img));
													AmphoraTile.setBounds(g, l, 39, 38);
													panel_6.add(AmphoraTile);
													j[2] = j[2] + 1;
													
													AmphoraTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 1;
															testSph = 0;
															testC = 0;
															if(testA==1)
															{
																AmphoraTileP(q,AmphoraTile,BP2);
															}
															testA = 0;
														}
													});
												}
												else
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/amphora_purple.png")).getImage();
													AmphoraTile.setIcon(new ImageIcon(img));
													AmphoraTile.setBounds(g, l, 39, 38);
													panel_6.add(AmphoraTile);
													j[2] = j[2] + 1;
													
													AmphoraTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 1;
															testSph = 0;
															testC = 0;
															if(testA==1)
															{
																AmphoraTileP(q,AmphoraTile,BP2);
															}
															testA = 0;
														}
													});
												}
											}
											else if(j[2]<10)
											{
												if(j[2]==5)
												{
													g = 0;
													l = 39;
													if(Bag.tiles.get(i).getcolour()=="Blue")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_blue.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_red.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Brown")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_brown.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_yellow.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_green.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_purple.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
												}
												else
												{
													g = g + 40;
													if(Bag.tiles.get(i).getcolour()=="Blue")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_blue.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_red.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Brown")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_brown.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_yellow.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_green.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
													}
													else
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_purple.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
												}
											}
											else if(j[2]<15)
											{
												if(j[2]==10)
												{
													g = 0;
													l = l + 39;
													if(Bag.tiles.get(i).getcolour()=="Blue")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_blue.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_red.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Brown")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_brown.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_yellow.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_green.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_purple.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
												}
												else
												{
													g = g + 40;
													if(Bag.tiles.get(i).getcolour()=="Blue")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_blue.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_red.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Brown")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_brown.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_yellow.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_green.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_purple.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
												}
											}
											else if(j[2]<20)
											{
												if(j[2]==15)
												{
													g = 0;
													l = l + 39;
													if(Bag.tiles.get(i).getcolour()=="Blue")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_blue.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_red.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Brown")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_brown.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_yellow.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_green.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_purple.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
												}
												else
												{
													g = g + 40;
													if(Bag.tiles.get(i).getcolour()=="Blue")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_blue.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_red.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Brown")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_brown.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_yellow.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_green.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_purple.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
												}
											}
											else if(j[2]<25)
											{
												if(j[2]==20)
												{
													g = 0;
													l = l + 39;
													if(Bag.tiles.get(i).getcolour()=="Blue")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_blue.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_red.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Brown")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_brown.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_yellow.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_green.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_purple.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
												}
												else
												{
													g = g + 40;
													if(Bag.tiles.get(i).getcolour()=="Blue")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_blue.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_red.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Brown")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_brown.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_yellow.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_green.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_purple.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
												}
											}
											else if(j[2]<30)
											{
												if(j[2]==25)
												{
													g = 0;
													l = l + 39;
													if(Bag.tiles.get(i).getcolour()=="Blue")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_blue.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_red.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Brown")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_brown.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_yellow.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_green.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_purple.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
												}
												else
												{
													g = g + 40;
													if(Bag.tiles.get(i).getcolour()=="Blue")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_blue.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Red")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_red.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Brown")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_brown.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Yellow")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_yellow.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getcolour()=="Green")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_green.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
													else
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/amphora_purple.png")).getImage();
														AmphoraTile.setIcon(new ImageIcon(img));
														AmphoraTile.setBounds(g, l, 39, 38);
														panel_6.add(AmphoraTile);
														j[2] = j[2] + 1;
														AmphoraTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testM = 0;
																testSk = 0;
																testA = 1;
																testSph = 0;
																testC = 0;
																if(testA==1)
																{
																	AmphoraTileP(q,AmphoraTile,BP2);
																}
																testA = 0;
															}
														});
													}
												}
											}
											Bag.tiles.remove(i);
											break;
										}
								//SphinxTile
										else if(Bag.tiles.get(i).getcategory() == "SphinxTile")
										{
											JButton SphinxTile = new JButton("");
											B_Position BP3 = new B_Position("SphinxTile");
											B.Sphinx.add(BP3);
											
											if(j[3]==0)
											{
											    Image img =  new ImageIcon(this.getClass().getResource("/sphinx.png")).getImage();
												SphinxTile.setIcon(new ImageIcon(img));
												SphinxTile.setBounds(x1,y1 , 39, 38);
												panel_7.add(SphinxTile);
												j[3] = j[3] + 1;
												SphinxTile.addActionListener(new ActionListener() 
												{
													public void actionPerformed(ActionEvent e)
													{
														testM = 0;
														testSk = 0;
														testA = 0;
														testSph = 1;
														testC = 0;
														if(testSph==1)
														{
															SphinxTileP(q,SphinxTile,BP3);
														}
														testSph = 0;
													}
												});
											}
											else if(j[3]<6)
											{
												x1 = x1 + 40;
											    Image img =  new ImageIcon(this.getClass().getResource("/sphinx.png")).getImage();
												SphinxTile.setIcon(new ImageIcon(img));
												SphinxTile.setBounds(x1,y1 , 39, 38);
												panel_7.add(SphinxTile);
												j[3] = j[3] + 1;
												SphinxTile.addActionListener(new ActionListener() 
												{
													public void actionPerformed(ActionEvent e)
													{
														testM = 0;
														testSk = 0;
														testA = 0;
														testSph = 1;
														testC = 0;
														if(testSph==1)
														{
															SphinxTileP(q,SphinxTile,BP3);
														}
														testSph = 0;
													}
												});
											}
											else if(j[3]<12)
											{
												if(j[3]==6)
												{
													x1 = 0;
													y1 = 39;
												    Image img =  new ImageIcon(this.getClass().getResource("/sphinx.png")).getImage();
													SphinxTile.setIcon(new ImageIcon(img));
													SphinxTile.setBounds(x1,y1 , 39, 38);
													panel_7.add(SphinxTile);
													j[3] = j[3] + 1;
													SphinxTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 0;
															testSph = 1;
															testC = 0;
															if(testSph==1)
															{
																SphinxTileP(q,SphinxTile,BP3);
															}
															testSph = 0;
														}
													});
												}
												else
												{
													x1 = x1 + 40;
												    Image img =  new ImageIcon(this.getClass().getResource("/sphinx.png")).getImage();
													SphinxTile.setIcon(new ImageIcon(img));
													SphinxTile.setBounds(x1,y1 , 39, 38);
													panel_7.add(SphinxTile);
													j[3] = j[3] + 1;
													SphinxTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 0;
															testSph = 1;
															testC = 0;
															if(testSph==1)
															{
																SphinxTileP(q,SphinxTile,BP3);
															}
															testSph = 0;
														}
													});
												}
											}
											else if(j[3]<18)
											{
												if(j[3]==12)
												{
													x1 = 0;
													y1 = 78;
												    Image img =  new ImageIcon(this.getClass().getResource("/sphinx.png")).getImage();
													SphinxTile.setIcon(new ImageIcon(img));
													SphinxTile.setBounds(x1,y1 , 39, 38);
													panel_7.add(SphinxTile);
													j[3] = j[3] + 1;
													SphinxTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 0;
															testSph = 1;
															testC = 0;
															if(testSph==1)
															{
																SphinxTileP(q,SphinxTile,BP3);
															}
															testSph = 0;
														}
													});
												}
												else
												{
													x1 = x1 + 40;
												    Image img =  new ImageIcon(this.getClass().getResource("/sphinx.png")).getImage();
													SphinxTile.setIcon(new ImageIcon(img));
													SphinxTile.setBounds(x1,y1 , 39, 38);
													panel_7.add(SphinxTile);
													j[3] = j[3] + 1;
													SphinxTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 0;
															testSph = 1;
															testC = 0;
															if(testSph==1)
															{
																SphinxTileP(q,SphinxTile,BP3);
															}
															testSph = 0;
														}
													});
												}
											}
											else if(j[3]<24)
											{
												if(j[3]==18)
												{
													x1 = 0;
													y1 = 117;
												    Image img =  new ImageIcon(this.getClass().getResource("/sphinx.png")).getImage();
													SphinxTile.setIcon(new ImageIcon(img));
													SphinxTile.setBounds(x1,y1 , 39, 38);
													panel_7.add(SphinxTile);
													j[3] = j[3] + 1;
													SphinxTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 0;
															testSph = 1;
															testC = 0;
															if(testSph==1)
															{
																SphinxTileP(q,SphinxTile,BP3);
															}
															testSph = 0;
														}
													});
												}
												else
												{
													x1 = x1 + 40;
												    Image img =  new ImageIcon(this.getClass().getResource("/sphinx.png")).getImage();
													SphinxTile.setIcon(new ImageIcon(img));
													SphinxTile.setBounds(x1,y1 , 39, 38);
													panel_7.add(SphinxTile);
													j[3] = j[3] + 1;
													SphinxTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 0;
															testSph = 1;
															testC = 0;
															if(testSph==1)
															{
																SphinxTileP(q,SphinxTile,BP3);
															}
															testSph = 0;
														}
													});
												}
											}
											Bag.tiles.remove(i);
											break;
										}
								//CaryatidTile
										else if(Bag.tiles.get(i).getcategory()=="CaryatidTile")
										{
											B_Position BP4 = new B_Position("CaryatidTile");
											B.Caryatid.add(BP4);
											JButton CaryatidTile = new JButton("");
						
											if(j[3]==0)
											{
											    Image img =  new ImageIcon(this.getClass().getResource("/caryatid.png")).getImage();
												CaryatidTile.setIcon(new ImageIcon(img));
												CaryatidTile.setBounds(x1,y1 , 39, 38);
												panel_7.add(CaryatidTile);
												j[3] = j[3] + 1;
												CaryatidTile.addActionListener(new ActionListener() 
												{
													public void actionPerformed(ActionEvent e)
													{
														testM = 0;
														testSk = 0;
														testA = 0;
														testSph = 0;
														testC = 1;
														if(testC==1)
														{
															CaryatidTileP(q,CaryatidTile,BP4);
														}
														testC = 0;
													}
												});
											}
											else if(j[3]<6)
											{
												x1 = x1 + 40;
											    Image img =  new ImageIcon(this.getClass().getResource("/caryatid.png")).getImage();
												CaryatidTile.setIcon(new ImageIcon(img));
												CaryatidTile.setBounds(x1,y1 , 39, 38);
												panel_7.add(CaryatidTile);
												j[3] = j[3] + 1;
												CaryatidTile.addActionListener(new ActionListener() 
												{
													public void actionPerformed(ActionEvent e)
													{
														testM = 0;
														testSk = 0;
														testA = 0;
														testSph = 0;
														testC = 1;
														if(testC==1)
														{
															CaryatidTileP(q,CaryatidTile,BP4);
														}
														testC = 0;
													}
												});
											}
											else if(j[3]<12)
											{
												if(j[3]==6)
												{
													x1 = 0;
													y1 = 39;
												    Image img =  new ImageIcon(this.getClass().getResource("/caryatid.png")).getImage();
													CaryatidTile.setIcon(new ImageIcon(img));
													CaryatidTile.setBounds(x1,y1 , 39, 38);
													panel_7.add(CaryatidTile);
													j[3] = j[3] + 1;
													CaryatidTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 0;
															testSph = 0;
															testC = 1;
															if(testC==1)
															{
																CaryatidTileP(q,CaryatidTile,BP4);
															}
															testC = 0;
														}
													});
												}
												else
												{
													x1 = x1 + 40;
												    Image img =  new ImageIcon(this.getClass().getResource("/caryatid.png")).getImage();
													CaryatidTile.setIcon(new ImageIcon(img));
													CaryatidTile.setBounds(x1,y1 , 39, 38);
													panel_7.add(CaryatidTile);
													j[3] = j[3] + 1;
													CaryatidTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 0;
															testSph = 0;
															testC = 1;
															if(testC==1)
															{
																CaryatidTileP(q,CaryatidTile,BP4);
															}
															testC = 0;
														}
													});
												}
											}
											else if(j[3]<18)
											{
												if(j[3]==12)
												{
													x1 = 0;
													y1 = 78;
												    Image img =  new ImageIcon(this.getClass().getResource("/caryatid.png")).getImage();
													CaryatidTile.setIcon(new ImageIcon(img));
													CaryatidTile.setBounds(x1,y1 , 39, 38);
													panel_7.add(CaryatidTile);
													j[3] = j[3] + 1;
													CaryatidTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 0;
															testSph = 0;
															testC = 1;
															if(testC==1)
															{
																CaryatidTileP(q,CaryatidTile,BP4);
															}
															testC = 0;
														}
													});
												}
												else
												{
													x1 = x1 + 40;
												    Image img =  new ImageIcon(this.getClass().getResource("/caryatid.png")).getImage();
													CaryatidTile.setIcon(new ImageIcon(img));
													CaryatidTile.setBounds(x1,y1 , 39, 38);
													panel_7.add(CaryatidTile);
													j[3] = j[3] + 1;
													CaryatidTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 0;
															testSph = 0;
															testC = 1;
															if(testC==1)
															{
																CaryatidTileP(q,CaryatidTile,BP4);
															}
															testC = 0;
														}
													});
												}
											}
											else if(j[3]<24)
											{
												if(j[3]==18)
												{
													x1 = 0;
													y1 = 117;
												    Image img =  new ImageIcon(this.getClass().getResource("/caryatid.png")).getImage();
													CaryatidTile.setIcon(new ImageIcon(img));
													CaryatidTile.setBounds(x1,y1 , 39, 38);
													panel_7.add(CaryatidTile);
													j[3] = j[3] + 1;
													CaryatidTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 0;
															testSph = 0;
															testC = 1;
															if(testC==1)
															{
																CaryatidTileP(q,CaryatidTile,BP4);
															}
															testC = 0;
														}
													});
												}
												else
												{
													x1 = x1 + 40;
												    Image img =  new ImageIcon(this.getClass().getResource("/caryatid.png")).getImage();
													CaryatidTile.setIcon(new ImageIcon(img));
													CaryatidTile.setBounds(x1,y1 , 39, 38);
													panel_7.add(CaryatidTile);
													j[3] = j[3] + 1;
													CaryatidTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testM = 0;
															testSk = 0;
															testA = 0;
															testSph = 0;
															testC = 1;
															if(testC==1)
															{
																CaryatidTileP(q,CaryatidTile,BP4);
															}
															testC = 0;
														}
													});
												}
											}
											Bag.tiles.remove(i);
											break;
										}
						//SkeletonTiles
										else
										{
											JButton SkeletonTile = new JButton("");
											B_Position BP = new B_Position("SkeletonTile",Bag.tiles.get(i).getpart(),1);
											B.Skeletons.add(BP);
											
											if(j[4]==0)
											{
												if(Bag.tiles.get(i).getpart()=="Big_UP")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_top.png")).getImage();
													SkeletonTile.setIcon(new ImageIcon(img));
													SkeletonTile.setBounds(x2,y2 , 39, 38);
													panel_8.add(SkeletonTile);
													j[4] = j[4] + 1;
													
													SkeletonTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testSk = 1;
															testM = 0;
															testA = 0;
															testSph = 0;
															testC = 0;
															if(testSk==1)
															{
																SkeletonTileP(q,SkeletonTile,BP);
															}
															testSk = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getpart()=="Big_DOWN")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_bottom.png")).getImage();
													SkeletonTile.setIcon(new ImageIcon(img));
													SkeletonTile.setBounds(x2,y2 , 39, 38);
													panel_8.add(SkeletonTile);
													j[4] = j[4] + 1;
													
													SkeletonTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testSk = 1;
															testM = 0;
															testA = 0;
															testSph = 0;
															testC = 0;
															if(testSk==1)
															{
																SkeletonTileP(q,SkeletonTile,BP);
															}
															testSk = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getpart()=="Small_UP")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_top.png")).getImage();
													SkeletonTile.setIcon(new ImageIcon(img));
													SkeletonTile.setBounds(x2,y2 , 39, 38);
													panel_8.add(SkeletonTile);
													j[4] = j[4] + 1;
													
													SkeletonTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testSk = 1;
															testM = 0;
															testA = 0;
															testSph = 0;
															testC = 0;
															if(testSk==1)
															{
																SkeletonTileP(q,SkeletonTile,BP);
															}
															testSk = 0;
														}
													});
												}
												else
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_bottom.png")).getImage();
													SkeletonTile.setIcon(new ImageIcon(img));
													SkeletonTile.setBounds(x2,y2 , 39, 38);
													panel_8.add(SkeletonTile);
													j[4] = j[4] + 1;
													
													SkeletonTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testSk = 1;
															testM = 0;
															testA = 0;
															testSph = 0;
															testC = 0;
															if(testSk==1)
															{
																SkeletonTileP(q,SkeletonTile,BP);
															}
															testSk = 0;
														}
													});
												}
												
											}
											else if(j[4]<5)
											{
												x2 = x2 + 40;
												if(Bag.tiles.get(i).getpart()=="Big_UP")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_top.png")).getImage();
													SkeletonTile.setIcon(new ImageIcon(img));
													SkeletonTile.setBounds(x2,y2 , 39, 38);
													panel_8.add(SkeletonTile);
													j[4] = j[4] + 1;
													
													SkeletonTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testSk = 1;
															testM = 0;
															testA = 0;
															testSph = 0;
															testC = 0;
															if(testSk==1)
															{
																SkeletonTileP(q,SkeletonTile,BP);
															}
															testSk = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getpart()=="Big_DOWN")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_bottom.png")).getImage();
													SkeletonTile.setIcon(new ImageIcon(img));
													SkeletonTile.setBounds(x2,y2 , 39, 38);
													panel_8.add(SkeletonTile);
													j[4] = j[4] + 1;
													
													SkeletonTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testSk = 1;
															testM = 0;
															testA = 0;
															testSph = 0;
															testC = 0;
															if(testSk==1)
															{
																SkeletonTileP(q,SkeletonTile,BP);
															}
															testSk = 0;
														}
													});
												}
												else if(Bag.tiles.get(i).getpart()=="Small_UP")
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_top.png")).getImage();
													SkeletonTile.setIcon(new ImageIcon(img));
													SkeletonTile.setBounds(x2,y2 , 39, 38);
													panel_8.add(SkeletonTile);
													j[4] = j[4] + 1;
													
													SkeletonTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testSk = 1;
															testM = 0;
															testA = 0;
															testSph = 0;
															testC = 0;
															if(testSk==1)
															{
																SkeletonTileP(q,SkeletonTile,BP);
															}
															testSk = 0;
														}
													});
												}
												else
												{
												    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_bottom.png")).getImage();
													SkeletonTile.setIcon(new ImageIcon(img));
													SkeletonTile.setBounds(x2,y2 , 39, 38);
													panel_8.add(SkeletonTile);
													j[4] = j[4] + 1;
													
													SkeletonTile.addActionListener(new ActionListener() 
													{
														public void actionPerformed(ActionEvent e)
														{
															testSk = 1;
															testM = 0;
															testA = 0;
															testSph = 0;
															testC = 0;
															if(testSk==1)
															{
																SkeletonTileP(q,SkeletonTile,BP);
															}
															testSk = 0;
														}
													});
												}
											}
											else if(j[4]<10)
											{
												if(j[4]==5)
												{
													x2 = 0;
													y2 = 39;
													if(Bag.tiles.get(i).getpart()=="Big_UP")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Big_DOWN")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Small_UP")
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else
													{
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
												}
												else
												{
													x2 = x2 + 40;
													if(Bag.tiles.get(i).getpart()=="Big_UP")
													{
										//				JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
										//				frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Big_DOWN")
													{
										//				JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
										//				frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Small_UP")
													{
										//				JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
										//				frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else
													{
										//				JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
										//				frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
												}
											}
											else if(j[4]<15)
											{
												if(j[4]==10)
												{
													x2 = 0;
													y2 = y2 + 39;
													if(Bag.tiles.get(i).getpart()=="Big_UP")
													{
										//				JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
										//				frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Big_DOWN")
													{
										//				JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
										//				frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Small_UP")
													{
											//			JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
											//			frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else
													{
										//				JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
										//				frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													
												}
												else
												{
													x2 = x2 + 40;
													if(Bag.tiles.get(i).getpart()=="Big_UP")
													{
											//			JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
											//			frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Big_DOWN")
													{
											//			JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												//		frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Small_UP")
													{
										//				JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
											//			frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else
													{
										//				JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
									//					frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
												}
											}
											else if(j[4]<20)
											{
												if(j[4]==15)
												{
													x2 = 0;
													y2 =  y2 + 39;
													if(Bag.tiles.get(i).getpart()=="Big_UP")
													{
										//				JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
										//				frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Big_DOWN")
													{
										//				JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
										//				frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Small_UP")
													{
										//				JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
										//				frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else
													{
										//				JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
										//				frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
												}
												else
												{
													x2 = x2 + 40;
													if(Bag.tiles.get(i).getpart()=="Big_UP")
													{
										//				JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
										//				frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Big_DOWN")
													{
											//			JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
										//				frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Small_UP")
													{
											//			JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
											//			frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else
													{
											//			JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
											//			frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
												}
											}
											else if(j[4]<25)
											{
												if(j[4]==20)
												{
													x2 = 0;
													y2 =  y2 + 39;
													if(Bag.tiles.get(i).getpart()=="Big_UP")
													{
											//			JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
											//			frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Big_DOWN")
													{
											//			JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
											//			frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Small_UP")
													{
												//		JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												//		frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else
													{
												//		JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												//		frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
												}
												else
												{
													x2 = x2 + 40;
													if(Bag.tiles.get(i).getpart()=="Big_UP")
													{
												//		JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												//		frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Big_DOWN")
													{
												//		JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												//		frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Small_UP")
													{
												//		JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												//		frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else
													{
												//		JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												//		frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
												}
											}
											else if(j[4]<30)
											{
												if(j[4]==25)
												{
													x2 = 0;
													y2 =  y2 + 39;
													if(Bag.tiles.get(i).getpart()=="Big_UP")
													{
												//		JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												//		frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Big_DOWN")
													{
												//		JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												//		frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Small_UP")
													{
												//		JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												//		frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else
													{
												//		JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												//		frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
												}
												else
												{
													x2 = x2 + 40;
													if(Bag.tiles.get(i).getpart()=="Big_UP")
													{
												//		JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												//		frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Big_DOWN")
													{
													//	JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_big_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												//		frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else if(Bag.tiles.get(i).getpart()=="Small_UP")
													{
												//		JButton SkeletonTile = new JButton("");
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_top.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												//		frame.getContentPane().add(SkeletonTile);
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													else
													{
													
													    Image img =  new ImageIcon(this.getClass().getResource("/skeleton_small_bottom.png")).getImage();
														SkeletonTile.setIcon(new ImageIcon(img));
														SkeletonTile.setBounds(x2,y2 , 39, 38);
												
														panel_8.add(SkeletonTile);
														j[4] = j[4] + 1;
														
														SkeletonTile.addActionListener(new ActionListener() 
														{
															public void actionPerformed(ActionEvent e)
															{
																testSk = 1;
																testM = 0;
																testA = 0;
																testSph = 0;
																testC = 0;
																if(testSk==1)
																{
																	SkeletonTileP(q,SkeletonTile,BP);
																}
																testSk = 0;
															}
														});
													}
													
												}
												
											}
											Bag.tiles.remove(i);
											break;
										}
								}
							}
							loop++;
						}
					
	}
	
	/**
	 * Transformer:sets all the panels and the buttons for the Player1. Also it calls the action2() with the press of the 
	 * button E_T_1
	 * Postcondition:sets all the panels and the buttons for the Player1
	 */
	private void action1()
	{	
		temp = 0;
		D_T_1.setEnabled(true);	
		E_T_1.setEnabled(true);
		//Draw Tiles
			D_T_1.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					if(D_T_1.isEnabled())
					{
						DrawTiles(0);
						D_T_1.setEnabled(false);
					}
				}
				
			});
		
					//Archaeologist
						arch1.addMouseListener(new MouseAdapter() 
						{
							@Override
							public void mouseClicked(MouseEvent e) 
							{
								Image img =  new ImageIcon(this.getClass().getResource("/archaeologist (2).png")).getImage();
								arch1.setIcon(new ImageIcon(img));
								frame.getContentPane().add(arch1);
								panel.add(arch1);
								
								arch1.setEnabled(false);
							}
						});
					//Assistant
						ass1.addMouseListener(new MouseAdapter() 
						{
							@Override
							public void mouseClicked(MouseEvent e) 
							{
								Image img =  new ImageIcon(this.getClass().getResource("/assistant (2).png")).getImage();
								ass1.setIcon(new ImageIcon(img));
								frame.getContentPane().add(ass1);
								panel.add(ass1);
								ass1.setEnabled(false);
							}
						});
						//Digger
							dig1.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseClicked(MouseEvent e) 
								{
									Image img =  new ImageIcon(this.getClass().getResource("/digger (2).png")).getImage();
									dig1.setIcon(new ImageIcon(img));
									frame.getContentPane().add(dig1);
									panel.add(dig1);
									dig1.setEnabled(false);
								}
							});
							//Professor
								prof1.addMouseListener(new MouseAdapter() {
										@Override
										
										public void mouseClicked(MouseEvent e) 
										{
											Image img =  new ImageIcon(this.getClass().getResource("/professor (2).png")).getImage();
											prof1.setIcon(new ImageIcon(img));
											frame.getContentPane().add(prof1);
											panel.add(prof1);
											prof1.setEnabled(false);
										}
									});	
							//End Turn
								E_T_1.addMouseListener(new MouseAdapter() {
									@Override
									public void mouseClicked(MouseEvent e) 
									{
										if(E_T_1.isEnabled())
										{
											E_T_1.setEnabled(false);
											action2();
										}
									}
								});
	}
	/**
	 * Transformer:sets all the panels and the buttons for the Player2. Also it calls the action3() with the press of the
	 * button E_T_2
	 * Postcondition:sets all the panels and the buttons for the Player2
	 */
	private void action2()
	{
		temp = 1;
		D_T_2.setEnabled(true);
		E_T_2.setEnabled(true);
		switchE_T(E_T_2);
		switchD_T(D_T_2);
		switchTiles(Ptiles_2);
		switchPanels(panel_2);
		switchPlayer(panel_P2);
		//Draw Tiles
		D_T_2.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(D_T_2.isEnabled())
				{
					DrawTiles(1);
					D_T_2.setEnabled(false);
				}
			}
		});
	//Archaeologist
		arch2.addMouseListener(new MouseAdapter() 
		{
			
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Image img =  new ImageIcon(this.getClass().getResource("/archaeologist (2).png")).getImage();
				arch2.setIcon(new ImageIcon(img));
				frame.getContentPane().add(arch2);
				panel_2.add(arch2);
				arch2.setEnabled(false);
			}
		});
	//Assistant
		ass2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Image img =  new ImageIcon(this.getClass().getResource("/assistant (2).png")).getImage();
				ass2.setIcon(new ImageIcon(img));
				frame.getContentPane().add(ass2);
				panel_2.add(ass2);
				ass2.setEnabled(false);
			}
		});
	//Digger
		dig2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Image img =  new ImageIcon(this.getClass().getResource("/digger (2).png")).getImage();
				dig2.setIcon(new ImageIcon(img));
				frame.getContentPane().add(dig2);
				panel_2.add(dig2);
				dig2.setEnabled(false);
			}
		});
	//Professor
		prof2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Image img =  new ImageIcon(this.getClass().getResource("/professor (2).png")).getImage();
				prof2.setIcon(new ImageIcon(img));
				frame.getContentPane().add(prof2);
				panel_2.add(prof2);
				prof2.setEnabled(false);
			}
		});
	//End Turn 
		E_T_2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if(E_T_2.isEnabled())
				{
					E_T_2.setEnabled(false);
					action3();
				}
			}
		});
	}
	/**
	 *Transformer:sets all the panels and the buttons for the Player3. Also it calls the action4() with the press of the
	 * button E_T_3
	 * Postcondition:sets all the panels and the buttons for the Player3
	 */
	private void action3()
	{
		temp = 2;
		D_T_3.setEnabled(true);
		E_T_3.setEnabled(true);
		switchE_T(E_T_3);
		switchD_T(D_T_3);
		switchTiles(Ptiles_3);
		switchPanels(panel_3);
		switchPlayer(panel_P3);
		//Draw Tiles
		D_T_3.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(D_T_3.isEnabled())
				{
					DrawTiles(2);
					D_T_3.setEnabled(false);
				}
			}
		});
		
			//Archaeologist
				arch3.addMouseListener(new MouseAdapter() 
				{
					@Override
					public void mouseClicked(MouseEvent e) 
					{
						Image img =  new ImageIcon(this.getClass().getResource("/archaeologist (2).png")).getImage();
						arch3.setIcon(new ImageIcon(img));
						frame.getContentPane().add(arch3);
						panel_3.add(arch3);
						arch3.setEnabled(false);
					}
				});
			//Assistant
				ass3.addMouseListener(new MouseAdapter() 
				{
					@Override
					public void mouseClicked(MouseEvent e) 
					{
						Image img =  new ImageIcon(this.getClass().getResource("/assistant (2).png")).getImage();
						ass3.setIcon(new ImageIcon(img));
						frame.getContentPane().add(ass3);
						panel_3.add(ass3);
						ass3.setEnabled(false);
					}
				});
				//Digger
					dig3.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) 
						{
							Image img =  new ImageIcon(this.getClass().getResource("/digger (2).png")).getImage();
							dig3.setIcon(new ImageIcon(img));
							frame.getContentPane().add(dig3);
							panel_3.add(dig3);
							dig3.setEnabled(false);
						}
					});
					//Professor
						prof3.addMouseListener(new MouseAdapter() {
								@Override
								
								public void mouseClicked(MouseEvent e) 
								{
									Image img =  new ImageIcon(this.getClass().getResource("/professor (2).png")).getImage();
									prof3.setIcon(new ImageIcon(img));
									frame.getContentPane().add(prof3);
									panel_3.add(prof3);
									prof3.setEnabled(false);
								}
							});	
					//End Turn
						E_T_3.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) 
							{
								if(E_T_3.isEnabled())
								{
									E_T_3.setEnabled(false);
									action4();
								}
							}
						});
	}
	/**
	 *Transformer:sets all the panels and the buttons for the Player4. Also it calls the action1() with the press of the
	 * button E_T_4
	 * Postcondition:sets all the panels and the buttons for the Player4
	 */
	private void action4()
	{
		temp = 3;
		D_T_4.setEnabled(true);
		E_T_4.setEnabled(true);
		switchE_T(E_T_4);
		switchD_T(D_T_4);
		switchTiles(Ptiles_4);
		switchPanels(panel_4);
		switchPlayer(panel_P4);
		//Draw Tiles
		D_T_4.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(D_T_4.isEnabled())
				{
					DrawTiles(3);
					D_T_4.setEnabled(false);
				}
			}
		});
		
			//Archaeologist
				arch4.addMouseListener(new MouseAdapter() 
				{
					@Override
					public void mouseClicked(MouseEvent e) 
					{
						Image img =  new ImageIcon(this.getClass().getResource("/archaeologist (2).png")).getImage();
						arch4.setIcon(new ImageIcon(img));
						frame.getContentPane().add(arch4);
						panel_4.add(arch4);
						arch4.setEnabled(false);
					}
				});
			//Assistant
				ass4.addMouseListener(new MouseAdapter() 
				{
					@Override
					public void mouseClicked(MouseEvent e) 
					{
						Image img =  new ImageIcon(this.getClass().getResource("/assistant (2).png")).getImage();
						ass4.setIcon(new ImageIcon(img));
						frame.getContentPane().add(ass4);
						panel_4.add(ass4);
						ass4.setEnabled(false);
					}
				});
				//Digger
					dig4.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) 
						{
							Image img =  new ImageIcon(this.getClass().getResource("/digger (2).png")).getImage();
							dig4.setIcon(new ImageIcon(img));
							frame.getContentPane().add(dig4);
							panel_4.add(dig4);
							dig4.setEnabled(false);
						}
					});
					//Professor
						prof4.addMouseListener(new MouseAdapter() {
								@Override
								
								public void mouseClicked(MouseEvent e) 
								{
									Image img =  new ImageIcon(this.getClass().getResource("/professor (2).png")).getImage();
									prof4.setIcon(new ImageIcon(img));
									frame.getContentPane().add(prof4);
									panel_4.add(prof4);
									prof4.setEnabled(false);
								}
							});	
					//End Turn
						E_T_4.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) 
							{
								if(E_T_4.isEnabled())
								{
									E_T_4.setEnabled(false);
									switchE_T(E_T_1);
									switchD_T(D_T_1);
									switchTiles(Ptiles_1);
									switchPanels(panel);
									switchPlayer(panel_P1);
									action1();
								}
							}
						});
	}
	/**
	 * Transformer:Initializes all the panels and the buttons of the the player4
	 * Postcondition:Initializes all the panels and the buttons of the player4
	 */
	private void player4()
	{
	//Archaeologist
		panel_4.add(arch4);
		arch4.setBackground(Color.WHITE);
		arch4.setForeground(Color.BLACK);
		Image img =  new ImageIcon(this.getClass().getResource("/archaeologist.png")).getImage();
		arch4.setIcon(new ImageIcon(img));
	//Assistant
		panel_4.add(ass4);
		ass4.setBackground(Color.WHITE);
		ass4.setForeground(Color.BLACK);
		img =  new ImageIcon(this.getClass().getResource("/assistant.png")).getImage();
		ass4.setIcon(new ImageIcon(img));
	//Digger
		panel_4.add(dig4);
		dig4.setBackground(Color.WHITE);
		dig4.setForeground(Color.BLACK);
		img =  new ImageIcon(this.getClass().getResource("/digger.png")).getImage();
		dig4.setIcon(new ImageIcon(img));
	//Professor
		panel_4.add(prof4);
		prof4.setBackground(Color.WHITE);
		prof4.setForeground(Color.BLACK);
		img =  new ImageIcon(this.getClass().getResource("/professor.png")).getImage();
		prof4.setIcon(new ImageIcon(img));
	//Label for Player4
		panel_P4.setBounds(0, 0, 227, 48);
		layeredPane_1.add(panel_P4);
		panel_P4.add(Player4);
		Player4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		action1();
	}
	/**
	 * Transformer:Initializes all the panels and the buttons of the the player3
	 * Postcondition:Initializes all the panels and the buttons of the player3
	 */
	private void player3()
	{
			//Archaeologist
				panel_3.add(arch3);
				arch3.setBackground(Color.WHITE);
				arch3.setForeground(Color.BLACK);
				Image img =  new ImageIcon(this.getClass().getResource("/archaeologist.png")).getImage();
				arch3.setIcon(new ImageIcon(img));
			//Assistant
				panel_3.add(ass3);
				ass3.setBackground(Color.WHITE);
				ass3.setForeground(Color.BLACK);
				img =  new ImageIcon(this.getClass().getResource("/assistant.png")).getImage();
				ass3.setIcon(new ImageIcon(img));
			//Digger
				panel_3.add(dig3);
				dig3.setBackground(Color.WHITE);
				dig3.setForeground(Color.BLACK);
				img =  new ImageIcon(this.getClass().getResource("/digger.png")).getImage();
				dig3.setIcon(new ImageIcon(img));
			//Professor
				panel_3.add(prof3);
				prof3.setBackground(Color.WHITE);
				prof3.setForeground(Color.BLACK);
				img =  new ImageIcon(this.getClass().getResource("/professor.png")).getImage();
				prof3.setIcon(new ImageIcon(img));
			//Label for Player3
				panel_P3.setBounds(0, 0, 227, 48);
				layeredPane_1.add(panel_P3);
				panel_P3.add(Player3);
				Player3.setFont(new Font("Tahoma", Font.PLAIN, 26));
				player4();
	}
	/**
	 * Transformer:Initializes all the panels and the buttons of the the player2
	 * Postcondition:Initializes all the panels and the buttons of the player2 
	 */
	private void player2()
	{	
	//Archaeologist
		panel_2.add(arch2);
		arch2.setBackground(Color.WHITE);
		arch2.setForeground(Color.BLACK);
		Image img =  new ImageIcon(this.getClass().getResource("/archaeologist.png")).getImage();
		arch2.setIcon(new ImageIcon(img));
	//Assistant
		panel_2.add(ass2);
		ass2.setBackground(Color.WHITE);
		ass2.setForeground(Color.BLACK);
		img =  new ImageIcon(this.getClass().getResource("/assistant.png")).getImage();
		ass2.setIcon(new ImageIcon(img));
	//Digger
		panel_2.add(dig2);
		dig2.setBackground(Color.WHITE);
		dig2.setForeground(Color.BLACK);
		img =  new ImageIcon(this.getClass().getResource("/digger.png")).getImage();
		dig2.setIcon(new ImageIcon(img));
	//Professor
		panel_2.add(prof2);
		prof2.setBackground(Color.WHITE);
		prof2.setForeground(Color.BLACK);
		img =  new ImageIcon(this.getClass().getResource("/professor.png")).getImage();
		prof2.setIcon(new ImageIcon(img));
	//Label for Player2
		panel_P2.setBounds(0, 0, 227, 48);
		layeredPane_1.add(panel_P2);
		panel_P2.add(Player2);
		Player2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		player3();
		
	}
	/**
	 * Transformer:Initializes all the panels and the buttons of the the player1
	 * Postcondition:Initializes all the panels and the buttons of the player1
	 */
	private void player1()
	{
	//Archaeologist
		panel.add(arch1);
		arch1.setBackground(Color.WHITE);
		arch1.setForeground(Color.BLACK);
		Image img =  new ImageIcon(this.getClass().getResource("/archaeologist.png")).getImage();
		arch1.setIcon(new ImageIcon(img));
	//Assistant
		panel.add(ass1);
		ass1.setBackground(Color.WHITE);
		ass1.setForeground(Color.BLACK);
		img =  new ImageIcon(this.getClass().getResource("/assistant.png")).getImage();
		ass1.setIcon(new ImageIcon(img));
	//Digger
		panel.add(dig1);
		dig1.setBackground(Color.WHITE);
		dig1.setForeground(Color.BLACK);
		img =  new ImageIcon(this.getClass().getResource("/digger.png")).getImage();
		dig1.setIcon(new ImageIcon(img));
	//Professor
		panel.add(prof1);
		prof1.setBackground(Color.WHITE);
		prof1.setForeground(Color.BLACK);
		img =  new ImageIcon(this.getClass().getResource("/professor.png")).getImage();
		prof1.setIcon(new ImageIcon(img));
	//Label of Player1
		panel_P1.setBounds(0, 0, 227, 48);
		layeredPane_1.add(panel_P1);
		panel_P1.add(Player1);
		Player1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		
		player2();
	}
}
