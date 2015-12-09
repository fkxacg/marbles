package marbles;

public class board {

	private int x,y;//板的坐标
	private int vx=13;//板的水平速率
	private int vy=10;//板的垂直速率
	private boolean dx=true;
	private boolean dy=false;
	private int width=constant.boardWidth;
	private int hight=constant.boardHight;
	
	board(){}
	
	board(int x0,int y0){
		this.x=x0;
		this.y=y0;
	}
	
	public int getx() {//获得板子的横坐标
		return this.x;
	}
	
	public void setx(int x0) {//使得外部函数能修改板的横坐标
		this.x=x0;
	}
	
	public int gety() {//获得板的纵坐标
		return this.y;
	}

	public void sety(int y0) {
		this.y=y0;
	}
	
	public int getvx() {//获得板子的水平速度
		return this.vx;
	}
	
	public void setvx(int vx0) {
		this.vx=vx0;
	}
	
	public int getvy() {//获得板子的垂直速度
		return this.vy;
	}
	
	public void setvy(int vy0) {
		this.vy=vy0;
	}
	
	public boolean getdx() {
		return this.dx;
	}
	
	public void setdx(boolean dx0) {
		this.dx=dx0;
	}
	
	public boolean getdy() {
		return this.dy;
	}
	
	public void setdy(boolean dy0) {
		this.dy=dy0;
	}
}


class AIboard extends board{
     AIboard(){super();}
	AIboard(int x0, int y0) {
		super(x0, y0);
	}
	
	
}