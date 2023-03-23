package play;

import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.RepaintManager;
import packman.My_Panel;
public class Food implements Runnable {

	private int x;
	private int y;
	private boolean exist;
	public Rectangle foodRec;
	private int foodsize;
	private int speed;
	protected ImageIcon foodpic;

	private Player myplayer;
	private int value;
	My_Panel parent;

	public Food(int x, int y, int foodsize,Player myplayer, My_Panel parent) {
		// TODO Auto-generated constructor stub

		this.parent = parent;
		this.x = x;
		this.y = y;
		this.myplayer = myplayer;
		exist= true;
		this.foodsize = foodsize;
		foodRec = new Rectangle(x, y, foodsize, foodsize);

	}

	public ImageIcon getImageIcon() {
		return foodpic;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y += y;
	}

	

	@Override
	public void run() {

//		while (exist) {
//
//			if (myplayer.getRectangle().intersects(foodRec)) {
//				
//				setExist(false);
//			}
//			
//			if (getY() > parent.getHeight()) {
//				setExist(false);
//
//			}
//			parent.repaint();
//
//		}

		
	}

	public boolean isExist() {
		return exist;
	}

	public void setExist(boolean exist) {
		this.exist = exist;
	}

}
