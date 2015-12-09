package marbles;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.MalformedURLException;

import javax.swing.*;


public class main extends JFrame{
	Timer rTime;
	Timer rGame;
	Timer rBackground;

	//Timer rBalla;
	static Timer aitime;
	menubar bar=new menubar();
	
	JPanel boardpanel0=new boardpanel();
	
	repaintEvent repaintEvent0=new repaintEvent(boardpanel0);
	game game0 =new game();
	setbackground setbackground0=new setbackground();
	gameover  gameover0;
	music music0=new music();
    //ballA rballa=new ballA();
	
	main(){
		this.setTitle("弹弹乐");
		this.setSize(433,700);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
	
		music0.start();
		//rBalla=new Timer(2000,rballa);
		//rBalla.start();
		
		rTime =new Timer(constant.repaintTime,repaintEvent0);
		rTime.start();
		
		rGame=new Timer(constant.setTime,game0);
		rGame.start();
		
		new Timer(constant.PlayerTime,new moveboard()).start();
		
		rBackground=new Timer(constant.panelbackgroundTime,setbackground0);
		rBackground.start();
		
		gameover0=new gameover();
		
		aitime=new Timer(constant.aitime*10,new level4());
		aitime.start();
		
		new Timer(constant.repaintTime,gameover0).start();
			
		setJMenuBar(bar);
		
		
		this.add(boardpanel0);//去问
		
		boardpanel0.requestFocus();//必须先给面板焦点
		
		
		this.addWindowListener(new WindowAdapter() {
	          public void windowClosing(WindowEvent e) {
	             exit.exit();
	          }
	      });
		
	}
}



//刷新面板事件
class repaintEvent implements ActionListener{
	JPanel boardpanel0;
	repaintEvent(JPanel b){this.boardpanel0=b;}
	public void actionPerformed(ActionEvent e){
		boardpanel0.repaint();
	}
	
}