package marbles;

public class board {

	private int x,y;//�������
	private int vx=13;//���ˮƽ����
	private int vy=10;//��Ĵ�ֱ����
	private boolean dx=true;
	private boolean dy=false;
	private int width=constant.boardWidth;
	private int hight=constant.boardHight;
	
	board(){}
	
	board(int x0,int y0){
		this.x=x0;
		this.y=y0;
	}
	
	public int getx() {//��ð��ӵĺ�����
		return this.x;
	}
	
	public void setx(int x0) {//ʹ���ⲿ�������޸İ�ĺ�����
		this.x=x0;
	}
	
	public int gety() {//��ð��������
		return this.y;
	}

	public void sety(int y0) {
		this.y=y0;
	}
	
	public int getvx() {//��ð��ӵ�ˮƽ�ٶ�
		return this.vx;
	}
	
	public void setvx(int vx0) {
		this.vx=vx0;
	}
	
	public int getvy() {//��ð��ӵĴ�ֱ�ٶ�
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