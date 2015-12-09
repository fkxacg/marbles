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
		setText("��Ϸ");
		add(new restartmenu());
		add(new level());
		add(new exitmenu());
	}

}

class restartmenu extends JMenuItem{
	restartmenu(){
		setText("���¿�ʼ   F2");
		
		addActionListener( new ActionListener(){public void actionPerformed(ActionEvent e){			
		restart.restart();
		}});
	}}
	
class level extends JMenu{
	level(){
		setText("�Ѷ�ѡ��");
		add(new level1m());
		add(new level2m());
		add(new level3m());
		add(new level4m());
	}
	
}

class level1m extends JMenuItem{
	level1m(){
		setText("����");
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
		setText("��ʿ");
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
		setText("˹�ʹ���");
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
		setText("��");
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
		setText("�˳�            ESC");
		
		addActionListener( new ActionListener(){public void actionPerformed(ActionEvent e){			
			exit.exit();
			}});
	}
}

class helpmenu extends JMenu{
	helpmenu(){
		setText("����");
		add(new helpitem());
		add(new aboutmenu());	
	}
}


class helpitem extends JMenuItem{
	helpitem(){
		setText("����");
		addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){
				exit.stop();
				JOptionPane.showConfirmDialog(null, "ESC:�˳���Ϸ\nF2:���¿�ʼ\nP:��ͣ/������Ϸ","����", JOptionPane.CLOSED_OPTION,JOptionPane.DEFAULT_OPTION);	
			    if(gameover.gameover==0&&constant.stop==1) exit.start();
			}
		} );
	}
}

class aboutmenu extends JMenuItem{
	aboutmenu(){
		setText("����");
		
		addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){
				exit.stop();
				JOptionPane.showConfirmDialog(null, "������:s1025������\n��ַ��www.s1025.com\n������Ա�������� ��˼��\n������������","����", JOptionPane.CLOSED_OPTION,JOptionPane.DEFAULT_OPTION);	
			    if(gameover.gameover==0&&constant.stop==1) exit.start();
			}
		} );
	}
}