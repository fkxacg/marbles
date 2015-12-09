package marbles;
import javax.swing.*;
class lose {
	static void lose(){
	
		int yesorno= JOptionPane.showConfirmDialog(null, "你输了!!!!是否重新开始？","游戏结束:", JOptionPane.YES_NO_OPTION,JOptionPane.DEFAULT_OPTION);
		if(yesorno==JOptionPane.NO_OPTION){constant.first();}
		if(yesorno==JOptionPane.YES_OPTION){
			restart.restart();;
			}
	}
	

			
	}

class win {
	static void win(){
	
		int yesorno= JOptionPane.showConfirmDialog(null, "你赢了!!!!是否重新开始？","游戏结束:", JOptionPane.YES_NO_OPTION,JOptionPane.DEFAULT_OPTION);
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