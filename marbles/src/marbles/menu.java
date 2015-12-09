package marbles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing .*;
class menubar extends JMenuBar{
	
	menubar()
	{
		add(new gamemenu());
		add(new helpmenu());
	}

}

class gamemenu extends JMenu {
	gamemenu(){
		setText("游戏");
		add(new restartmenu());
		add(new level());
		add(new exitmenu());
	}

}

class restartmenu extends JMenuItem{
	restartmenu(){
		setText("重新开始   F2");
		
		addActionListener( new ActionListener(){public void actionPerformed(ActionEvent e){			
		restart.restart();
		}});
	}}
	
class level extends JMenu{
	level(){
		setText("难度选择");
		add(new level1m());
		add(new level2m());
		add(new level3m());
		add(new level4m());
	}
	
}

class level1m extends JMenuItem{
	level1m(){
		setText("凡人");
		addActionListener( new ActionListener(){public void actionPerformed(ActionEvent e){			
			constant.maxv=5;
			constant.a=1;
			main.aitime.setDelay(constant.aitime*10);
			restart.restart();
			}});
	}
	
}

class level2m extends JMenuItem{
	level2m(){
		setText("勇士");
		addActionListener( new ActionListener(){public void actionPerformed(ActionEvent e){			
			constant.maxv=8;
			constant.a=1;
			main.aitime.setDelay(constant.aitime*5);
			restart.restart();
			}});
	}
	
}

class level3m extends JMenuItem{
	level3m(){
		setText("斯巴达人");
		addActionListener( new ActionListener(){public void actionPerformed(ActionEvent e){			
			constant.maxv=10;
			constant.a=2;
			main.aitime.setDelay(constant.aitime*4);
			boardpanel.board2.setvx(10);
			restart.restart();
			}});
	}
	
}

class level4m extends JMenuItem{
	level4m(){
		setText("神");
		addActionListener( new ActionListener(){public void actionPerformed(ActionEvent e){			
			constant.maxv=16;
			constant.a=3;
			main.aitime.setDelay(constant.aitime);
			restart.restart();
			}});
	}
	
}

class exitmenu extends JMenuItem{
	exitmenu(){
		setText("退出            ESC");
		
		addActionListener( new ActionListener(){public void actionPerformed(ActionEvent e){			
			exit.exit();
			}});
	}
}

class helpmenu extends JMenu{
	helpmenu(){
		setText("帮助");
		add(new helpitem());
		add(new aboutmenu());	
	}
}


class helpitem extends JMenuItem{
	helpitem(){
		setText("帮助");
		addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){
				exit.stop();
				JOptionPane.showConfirmDialog(null, "ESC:退出游戏\nF2:重新开始\nP:暂停/继续游戏","帮助", JOptionPane.CLOSED_OPTION,JOptionPane.DEFAULT_OPTION);	
			    if(gameover.gameover==0&&constant.stop==1) exit.start();
			}
		} );
	}
}

class aboutmenu extends JMenuItem{
	aboutmenu(){
		setText("关于");
		
		addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){
				exit.stop();
				JOptionPane.showConfirmDialog(null, "制作组:s1025工作室\n网址：www.s1025.com\n制作人员：付凯轩 张思浩\n美工：汪泠沣","关于", JOptionPane.CLOSED_OPTION,JOptionPane.DEFAULT_OPTION);	
			    if(gameover.gameover==0&&constant.stop==1) exit.start();
			}
		} );
	}
}