package marbles;
import javax.swing.*;
class lose {
	static void lose(){
	
		int yesorno= JOptionPane.showConfirmDialog(null, "������!!!!�Ƿ����¿�ʼ��","��Ϸ����:", JOptionPane.YES_NO_OPTION,JOptionPane.DEFAULT_OPTION);
		if(yesorno==JOptionPane.NO_OPTION){constant.first();}
		if(yesorno==JOptionPane.YES_OPTION){
			restart.restart();;
			}
	}
	

			
	}

class win {
	static void win(){
	
		int yesorno= JOptionPane.showConfirmDialog(null, "��Ӯ��!!!!�Ƿ����¿�ʼ��","��Ϸ����:", JOptionPane.YES_NO_OPTION,JOptionPane.DEFAULT_OPTION);
		if(yesorno==JOptionPane.NO_OPTION){constant.first();}
		if(yesorno==JOptionPane.YES_OPTION){
			restart.restart();;
			}
	}
	

			
	}


class restart{
	static ball ball0=ball.getball();
	static void restart(){
		gameover.gameover=0;
		exit.stop();
		 constant.first();
		exit.start();
	
}
}