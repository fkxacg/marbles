package marbles;

import javax.swing.JOptionPane;

public class exit {

	public static void exit(){
		
		stop();
		  int choose=JOptionPane.showConfirmDialog(null, "是否退出游戏？","系统提示:", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);//弹出对话框
		  if(choose==JOptionPane.YES_OPTION){
			  System.exit(0);
		  }
		if(gameover.gameover==0&&constant.stop==1) start();
	}
    public static void start(){
    	  start.main0.rTime.start();
		  start.main0.rGame.start();
		  start.main0.rBackground.start();
    }
    public static void stop(){
    	  start.main0.rTime.stop();
		  start.main0.rGame.stop();
		  start.main0.rBackground.stop();
    }

}
