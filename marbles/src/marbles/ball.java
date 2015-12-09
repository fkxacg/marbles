package marbles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ball {
	private static ball ball0=new ball();
	private ball(){
		
	}
	public static ball getball(){
		return ball0;
	}
	//单例模式，提供一个ball对象
	
	private int x=constant.WIDTH/2,y=constant.HIGTH/2;//球的坐标
	private boolean dx=constant.RIGHT;//球的水平方向
	private boolean dy=constant.UP;//球的垂直方向
	private int vx=3;//球的水平速率
	private int vy=3;//球的垂直速率
	private int size=constant.ballSize;//球的尺寸
	private int lastx=-1;
	private int lasty=-1;
	
	public int getx() {//获得球的横坐标
		return this.x;
	}
	
	public void setx(int x0) {//使得外部函数能修改球的坐标
		this.lastx=this.x;
		this.x=x0;
	}
	
	public int gety() {//获得球的纵坐标
		return this.y;
	}

	public void sety(int y0) {
		this.lasty=this.y;
		this.y=y0;
	}
	
	public boolean getdx() {//获得球的水平方向
		return this.dx;
	}
	
	public void setdx(boolean dx) {
	   this.dx=dx;
	}
	
	
	public void setdx() {//修改球的水平方向
		if(this.dx==constant.RIGHT)
			this.dx=constant.LEFT;
		else
			this.dx=constant.RIGHT;
	}
	
	public boolean getdy() {//获得球的垂直方向
		return this.dy;
	}
	
	public void setdy(boolean dy) {
		   this.dy=dy;
		}
	
	public void setdy() {//修改球的垂直方向
		if(this.dy==constant.UP)
			this.dy=constant.DOWN;
		else
			this.dy=constant.UP;
	}
	
	public int getvx() {//获得球的水平速率
		return this.vx;
	}
	
	public void setvx(int vx0) {//修改球的水平速率
		this.vx=vx0;
	}
	
	public int getvy() {//获得球的垂直速率
		return this.vy;
	}
	
	public void setvy(int vy0) {//修改球的垂直速率
		this.vy=vy0;
	}
	
	public int getlastx() {//上一次横坐标
		return this.lastx;
	}
	
	public int getlasty() {//上一次纵坐标
		return this.lasty;
	}
}

class ballA implements ActionListener{
	  ball ball0;
	  ballA(){
		  ball0=ball.getball();
	  }
	  public void actionPerformed(ActionEvent e){
		  ball0.setvx(ball0.getvx()+1);
		  ball0.setvy(ball0.getvy()+1);
	  }
}