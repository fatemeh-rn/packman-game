package play;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import packman.My_Panel;


public class Food4 extends Food {

	public Food4(int x, int y, int fruit_size,Player myplayer, My_Panel parent) {

		super(x, y, fruit_size,myplayer, parent);
		// TODO Auto-generated constructor stub
		foodpic = new ImageIcon("f4.png");
		
	}
}
