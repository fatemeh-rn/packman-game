package packman;
import play.Enemy;
import play.Food;
import play.Food1;
import play.Food2;
import play.Food3;
import play.Food4;
import play.Player;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class My_Panel  extends JPanel implements KeyListener, Runnable{
    private Player myplayer;
	private int playsize;
	private Vector<Food> myfood;
	private int foodsize;
	private Dimension d;
	int[][] b = new int[46][40];
	ImageIcon[] img = new ImageIcon[2];
	File map = new File("map.txt");
	//private ImageIcon im;
	FileInputStream fi;
	
	public My_Panel(Dimension d, My_frame mf){
		img[1] = new ImageIcon("brown.png");
		img[0] = new ImageIcon("blue.png");
		setFocusable(true);//////?
	   // im=new ImageIcon("j.png");
		addKeyListener(this);
		setLayout(null);
		setSize(mf.WIDTH, mf.HEIGHT);
		setVisible(true);
		setLocation((int) d.getWidth() / 4, (int)d.getHeight() /4);

		foodsize=(d.width/200);
		playsize = (int) (d.height / 50);
		myplayer = new Player((int) (4 * d.width / 200),/////////
				(int) (8 * d.height / 200), playsize , (int)(d.getWidth()/5));
		myfood=new Vector<Food>();
		food();
		setVisible(true);
        try {
			fi=new FileInputStream(map);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        byte[]bu=new byte[42];
    	for (int i = 0; i < 46; i++) {
			try {
				fi.read(bu);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			for (int j = 0; j < 40; j++) {
				 b[i][j] = bu[j]-48;
				 System.out.println(b[i][j]);
			}
		}
    
	}
	public void food(){
		

			Food1 f1 = new Food1((int) (5 * d.width / 200), (int)(9*d.height/200), foodsize,myplayer, this);
			Food2 f2 = new Food2((int) (6 * d.width / 200), (int)(10*d.height/200), foodsize, myplayer,this);
			Food3 f3 = new Food3((int) (7 * d.width / 200), (int)(11*d.height/200),foodsize,myplayer,this);
			Food4 f4= new Food4((int) (8* d.width / 200), (int)(12*d.height/200), foodsize, myplayer,this);

			myfood.add(f1);
			myfood.add(f2);
			myfood.add(f3);
			myfood.add(f4);

//			for (Fruit i : my_fruits) {
//				(new Thread(i)).start();
//
//			}

		}

	@Override
	public void run() {
//		// TODO Auto-generated method stub
//		while(true){
//			try {
//				Thread.sleep(5);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
			myplayer.moveright();;
			repaint();
		}

		if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
			myplayer.moveleft();
			repaint();
		}
		if(arg0.getKeyCode()==KeyEvent.VK_UP){
			myplayer.moveup();
			repaint();
		}
		if(arg0.getKeyCode()==KeyEvent.VK_DOWN){
			myplayer.movedown();
			repaint();
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public int[][] getB() {
		return b;
	}

	public void setB(int[][] b) {
		this.b = b;
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void paint(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paint(arg0);
		System.out.println("paint");
		for (int i = 0; i < 46; i++) {
			for (int j = 0; j < 40; j++) {				
			  arg0.drawImage(img[b[i][j]].getImage(), j*10, i*10, null);
	}
		}
		arg0.drawImage(myplayer.getImageIcon().getImage(), myplayer.getX(),
				myplayer.getY(), playsize, playsize, null);
		arg0.drawString(Integer.toString(myplayer.getScore()), 20, 40);
	
		
	}
	private void result() {

		int finish = JOptionPane.showConfirmDialog(null,
				"Do you want to play again?", "PLAY AGAIN",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
		if (finish == 1)
			System.exit(0);
		
		if (finish == 0) {
			//mf.setVisible(false);
			this.setVisible(false);
			My_frame m = new My_frame();
		}

	}

//	@Override
//	protected void processComponentKeyEvent(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		System.out.println(arg0);
//		super.processComponentKeyEvent(arg0);
//	}
//	
}
