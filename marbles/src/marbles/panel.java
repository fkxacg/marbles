package marbles;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;



class boardpanel extends JPanel {
	ball ball0=ball.getball();//获得ball的单例对象
	static board board1=new board(constant.WIDTH/2-constant.boardWidth/2,constant.HIGTH-50);//创建一个板子对象并设置初始位置
	static board board2=new AIboard(constant.WIDTH/2-constant.boardWidth/2,50);
	
	boardpanel(){
		this.setSize(constant.WIDTH,constant.HIGTH);
		this.addKeyListener(new setmoveboard());
		this.addKeyListener(new Fnkey(this));

}
	public void paint(Graphics g) {
		  super.paint(g);
		  ImageIcon iconBackground=new ImageIcon(constant.panelbackground);
		  g.drawImage(iconBackground.getImage(),0,0,this);
		  ImageIcon iconball=new ImageIcon("image/ball.png");
		  g.drawImage(iconball.getImage(),ball0.getx(),ball0.gety(),this);
		  ImageIcon iconboard1=new ImageIcon("image/board3.png");
		  ImageIcon iconboard2=new ImageIcon("image/board3.png");
		  g.drawImage(iconboard1.getImage(),board1.getx(),board1.gety(),this);
		  g.drawImage(iconboard2.getImage(),board2.getx(),board2.gety(),this);
	}
	
}

class setbackground implements ActionListener{	
	public void actionPerformed(ActionEvent e){
		switch(constant.panelbackground){
		case"image/bj1.jpg":constant.panelbackground="image/bj2.jpg";break;
		case"image/bj2.jpg":constant.panelbackground="image/bj3.jpg";break;
		case"image/bj3.jpg":constant.panelbackground="image/bj1.jpg";break;
		}
	}
}