package play;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.ImageIcon;

import packman.My_Panel;
public class Player extends Thread implements Runnable,KeyListener {
private ImageIcon playpic;
private int x;
private int y;
private Rectangle playrec;
private int playsize;
private int score;
private int width;

//private
	public Player(int x,int y,int playsize,int width){
		score=0;
		this.x=x;
		this.y=y;
		this.width=width;
		this.playsize=playsize;
		playpic=new ImageIcon("player.jpg");
		playrec=new Rectangle(getX(),getY(),playsize,playsize);
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setScore(int score) {
		this.score += score;
	}
	public int getScore() {
		return score;
	}
	public ImageIcon getImageIcon() {
		return playpic;

	}

	public Rectangle getRectangle() {
		return playrec;

	}
	public void setX(int x) {
	     this.x=x;
	 	playrec.x = this.x;
		}

public void moveright(){	
	if(x<width-playsize){
         while(x<400){
            long d=System.currentTimeMillis();
            while(d+800000000<System.currentTimeMillis());
		x+=3;
}
	}
}

public void moveleft(){
	if(x>0)
		x-=3;
}
public void moveup(){
	if(y>0)
		y-=3;
}
public void movedown(){
	if(y<playsize)
		y+=3;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
