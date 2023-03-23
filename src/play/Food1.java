package play;

import javax.swing.ImageIcon;

import packman.My_Panel;

import javax.swing.JPanel;

public class Food1 extends Food{

	public Food1(int x, int y, int fruit_size, Player myplayer, My_Panel parent) {

		super(x, y, fruit_size, myplayer, parent);
		// TODO Auto-generated constructor stub
		 foodpic= new ImageIcon("f1.png");
		
	}
}
