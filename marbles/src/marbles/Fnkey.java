package marbles;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Fnkey extends KeyAdapter implements  KeyListener{
	Fnkey(JPanel panel0){}
	public void keyPressed(KeyEvent e){
		switch(e.getKeyCode()){
		case KeyEvent.VK_ESCAPE:exit.exit();break;
		case KeyEvent.VK_F2:restart.restart();break;
		case KeyEvent.VK_P: if(constant.stop==1&&gameover.gameover==0)
			                       {exit.stop();
			                       constant.stop=0;}
		                     else if(constant.stop==0&&gameover.gameover==0)
		                           {exit.start();
		                           constant.stop=1;}break;
		}

}
	}
