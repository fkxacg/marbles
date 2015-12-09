package marbles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class game implements ActionListener{
	ball ball0=ball.getball();
	public void actionPerformed(ActionEvent e){
		pushboard(boardpanel.board1,1);
		pushboard(boardpanel.board2,2);
		
		if(ball0.getx()<=0&&ball0.getdx()==constant.LEFT||(ball0.getx()+constant.ballSize>=constant.WIDTH&&ball0.getdx()==constant.RIGHT)){
			ball0.setdx();
			if(ball0.getvy()<constant.maxv)
				ball0.setvy(ball0.getvy ()+constant.a);
		}

		
		if(ball0.gety()<=0||ball0.gety()>=constant.HIGTH-constant.ballSize){
			ball0.setdy();	
		}

		
		if(ball0.getdx()==constant.RIGHT)
			ball0.setx(ball0.getx()+ball0.getvx());
		else
			ball0.setx(ball0.getx()-ball0.getvx());
		
		if(ball0.getdy()==constant.DOWN)
			ball0.sety(ball0.gety()+ball0.getvy());
		else
			ball0.sety(ball0.gety()-ball0.getvy());
	}

	void pushboard(board board0,int number){
		if(number==1){	
			if((ball0.gety()+constant.ballSize>=board0.gety()&&ball0.gety()+constant.ballSize<=board0.gety()+constant.boardHight)
				     &&(ball0.getx()<=board0.getx()&&ball0.getx()+constant.ballSize>=board0.getx()||
			         ball0.getx()<=board0.getx()+constant.boardWidth&&ball0.getx()+constant.ballSize>=board0.getx()+constant.boardWidth)
				     &&chkLastXY(ball0.getlastx(),ball0.getlasty(),board0)==true){
			    ball0.setdx();
	        if((ball0.getx()>=boardpanel.board1.getx()||ball0.getx()+constant.ballSize<=boardpanel.board1.getx()+constant.boardWidth)&&ball0.gety()>=boardpanel.board1.gety())
	        	ball0.setdx();
		   }
		}
			
		if(number==2){
			if((ball0.gety()>=board0.gety()&&ball0.gety()<=board0.gety()+constant.boardHight)
					&&(ball0.getx()<=board0.getx()&&ball0.getx()+constant.ballSize>=board0.getx()||
					ball0.getx()<=board0.getx()+constant.boardWidth&&ball0.getx()+constant.ballSize>=board0.getx()+constant.boardWidth)
					&&chkLastXY(ball0.getlastx(),ball0.getlasty(),board0)==true){
				ball0.setdx();
			}
		}
		if((ball0.getx()>=board0.getx()&&ball0.getx()<=board0.getx()+constant.boardWidth||
				ball0.getx()+constant.ballSize>=board0.getx()&&ball0.getx()+constant.ballSize<=board0.getx()+constant.boardWidth)
				&&(ball0.gety()<=board0.gety()&&ball0.gety()+constant.ballSize>=board0.gety()||
				ball0.gety()<=board0.gety()+constant.boardHight&&ball0.gety()+constant.ballSize>=board0.gety()+constant.boardHight)
				&&chkLastXY(ball0.getlastx(),ball0.getlasty(),board0)==true){
			if(number==1){
				if(ball0.getvx()==0){
					if(setmoveboard.keystate==2){
						ball0.setdx(constant.RIGHT);
						ball0.setvx(ball0.getvx()+1);
					}
					if(setmoveboard.keystate==1){
						ball0.setdx(constant.LEFT);
						ball0.setvx(ball0.getvx()+1);
					}
				}
				else{
					if(ball0.getdx()==constant.RIGHT&&setmoveboard.keystate==2&&board0.getx()+constant.boardWidth<constant.WIDTH) ball0.setvx(ball0.getvx()+1);
					if(ball0.getdx()==constant.LEFT&&setmoveboard.keystate==2&&board0.getx()>0) ball0.setvx(ball0.getvx()-1);
					if(ball0.getdx()==constant.RIGHT&&setmoveboard.keystate==1&&board0.getx()+constant.boardWidth<constant.WIDTH) ball0.setvx(ball0.getvx()-1);
					if(ball0.getdx()==constant.LEFT&&setmoveboard.keystate==1&&board0.getx()>0) ball0.setvx(ball0.getvx()+1);
				}
			}
			if(number==2){
				if(ball0.getvx()==0){
					if(boardpanel.board2.getdx()==constant.RIGHT){
						ball0.setdx(constant.RIGHT);
						ball0.setvx(ball0.getvx()+1);
					}
					if(boardpanel.board2.getdx()==constant.LEFT){
						ball0.setdx(constant.LEFT);
						ball0.setvx(ball0.getvx()+1);
					}
				}
				else{
					if(ball0.getdx()==constant.RIGHT&&boardpanel.board2.getdx()==constant.RIGHT&&board0.getx()+constant.boardWidth<constant.WIDTH) ball0.setvx(ball0.getvx()+1);
					if(ball0.getdx()==constant.LEFT&&boardpanel.board2.getdx()==constant.RIGHT&&board0.getx()>0) ball0.setvx(ball0.getvx()-1);
					if(ball0.getdx()==constant.RIGHT&&boardpanel.board2.getdx()==constant.LEFT&&board0.getx()+constant.boardWidth<constant.WIDTH) ball0.setvx(ball0.getvx()-1);
					if(ball0.getdx()==constant.LEFT&&boardpanel.board2.getdx()==constant.LEFT&&board0.getx()>0) ball0.setvx(ball0.getvx()+1);
				}
				
			}
			ball0.setdy();
		}

	}
	private boolean chkLastXY(int x,int y,board board0){
		if((y>=board0.gety()&&y<=board0.gety()+constant.boardHight||
				y+constant.ballSize>=board0.gety()&&y+constant.ballSize<=board0.gety()+constant.boardHight)
				&&(x<=board0.getx()&&x+constant.ballSize>=board0.getx()||
				x<=board0.getx()+constant.boardWidth&&x+constant.ballSize>=board0.getx()+constant.boardWidth)||
				(x>=board0.getx()&&x<=board0.getx()+constant.boardWidth||
				x+constant.ballSize>=board0.getx()&&x+constant.ballSize<=board0.getx()+constant.boardWidth)
				&&(y<=board0.gety()&&y+constant.ballSize>=board0.gety()||
				y<=board0.gety()+constant.boardHight&&y+constant.ballSize>=board0.gety()+constant.boardHight))
			return false;
		else
			return true;
	}

}


class setmoveboard extends KeyAdapter implements KeyListener{
	static int keystate=0;
	
	public void keyPressed(KeyEvent e){
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT:keystate=1;break;
		case KeyEvent.VK_RIGHT:keystate=2;break;
		default:keystate=0;break;
		}
		
	}
	public void keyReleased(KeyEvent d){
		keystate=0;
	
	}
}


class moveboard  implements ActionListener{
	ball ball0=ball.getball();
	public void actionPerformed(ActionEvent e){
		switch(setmoveboard.keystate){
		case 1:if(boardpanel.board1.getx()>0&&!(ball0.getx()>=boardpanel.board1.getx()&&ball0.gety()>=boardpanel.board1.gety()))
			boardpanel.board1.setx(boardpanel.board1.getx()-boardpanel.board1.getvx());break;
		case 2:if(boardpanel.board1.getx()+constant.boardWidth<constant.WIDTH)
			boardpanel.board1.setx(boardpanel.board1.getx()+boardpanel.board1.getvx());break;
		default:break;
		}
	}
}


class gameover implements ActionListener{	

	ball ball0;
	static int gameover=0;//0为游戏进行，1为输，2为赢
	gameover(){

		ball0=ball.getball();}
	public void actionPerformed(ActionEvent e){
		if(ball0.gety()+constant.ballSize>=constant.HIGTH)
		{ 
			exit.stop();
		    gameover=1;
		    lose.lose();
		    }
		if(ball0.gety()<=0)
		{
			exit.stop();
		    gameover=2;
		    win.win();
		}

	}
}
	