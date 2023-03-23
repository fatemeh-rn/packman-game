package packman;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;



public class My_frame extends JFrame{
	Dimension d;
	My_Panel bp;
  public My_frame(){
	  d=Toolkit.getDefaultToolkit().getScreenSize();
	 // setSize((int)d.getWidth()/2 ,(int) d.getHeight()/2);
	  setSize((int)d.getWidth()/2,(int)d.getHeight()/2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation((int)d.getWidth()/4 ,(int) d.getHeight()/4);
		setResizable(false);/////?
		setTitle("packman");
		bp = new My_Panel(d,this);
		(new Thread(bp)).start();
		this.getContentPane().add(bp);
		setVisible(true);
  }
}
