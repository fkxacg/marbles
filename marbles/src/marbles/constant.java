package marbles;

public class constant {
    static ball ball0=ball.getball();
    static board board1= boardpanel.board1;
    static board board2= boardpanel.board2;
 
	
	
	static final int WIDTH=427;
	static final int HIGTH=647;
	static final boolean UP=true;
	static final boolean DOWN=false;
	static final boolean LEFT=false;
	static final boolean RIGHT=true;
	static final int ballSize=20;
	static final int repaintTime=1;
	static final int setTime=12;
	static final int PlayerTime=24;
	static final int boardWidth=90;
	static final int boardHight=20;
	static final int deviation=0;
	static int stop=1;// 0为停止，1为进行
	static String panelbackground="image/bj1.jpg";
	static final int panelbackgroundTime=10000;
	static int aitime=2;
	static int maxv=5;
	static int a=1;
	
	static  void first(){
        
		ball0.setx(constant.WIDTH/2);
		ball0.sety(constant.HIGTH/2);
		ball0.setdx(RIGHT);
		ball0.setdy(UP);
		ball0.setvx(3);
		ball0.setvy(3);
		board1.setx(constant.WIDTH/2-constant.boardWidth/2);
		board1.sety(constant.HIGTH-50);
		board2.setx(constant.WIDTH/2-constant.boardWidth/2);
		board2.sety(50);
		setmoveboard.keystate=0;
	}
}
