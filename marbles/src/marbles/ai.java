package marbles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class ai implements ActionListener{
	
  ball ball0=ball.getball();
  static int level=1;
  abstract public void actionPerformed(ActionEvent e);
}

class level4 extends ai implements ActionListener{
	  public void actionPerformed(ActionEvent e){
		  if(ball0.getx()+constant.ballSize/2<boardpanel.board2.getx()+constant.boardWidth/2){
				  boardpanel.board2.setdx(constant.LEFT);
				  boardpanel.board2.setx(boardpanel.board2.getx()-boardpanel.board2.getvx()+4);
			  }
		  if(ball0.getx()+constant.ballSize/2>boardpanel.board2.getx()+constant.boardWidth/2){
				  boardpanel.board2.setdx(constant.RIGHT);
				  boardpanel.board2.setx(boardpanel.board2.getx()+boardpanel.board2.getvx()-4);
		      }
		}
	  }
class level3 extends ai implements ActionListener{
	  public void actionPerformed(ActionEvent e){
		  if(ball0.getx()<=constant.WIDTH-constant.boardWidth)
			  boardpanel.board2.setx(ball0.getx());
	  }
}
class level2 extends ai implements ActionListener{
	  public void actionPerformed(ActionEvent e){
		  if(ball0.getx()<=constant.WIDTH-constant.boardWidth)
			  boardpanel.board2.setx(ball0.getx());

	  }
}
class level1 extends ai implements ActionListener{
	  public void actionPerformed(ActionEvent e){
		  if(ball0.getx()<=constant.WIDTH-constant.boardWidth)
			  boardpanel.board2.setx(ball0.getx());

	  }
}