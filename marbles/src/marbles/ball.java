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
	//����ģʽ���ṩһ��ball����
	
	private int x=constant.WIDTH/2,y=constant.HIGTH/2;//�������
	private boolean dx=constant.RIGHT;//���ˮƽ����
	private boolean dy=constant.UP;//��Ĵ�ֱ����
	private int vx=3;//���ˮƽ����
	private int vy=3;//��Ĵ�ֱ����
	private int size=constant.ballSize;//��ĳߴ�
	private int lastx=-1;
	private int lasty=-1;
	
	public int getx() {//�����ĺ�����
		return this.x;
	}
	
	public void setx(int x0) {//ʹ���ⲿ�������޸��������
		this.lastx=this.x;
		this.x=x0;
	}
	
	public int gety() {//������������
		return this.y;
	}

	public void sety(int y0) {
		this.lasty=this.y;
		this.y=y0;
	}
	
	public boolean getdx() {//������ˮƽ����
		return this.dx;
	}
	
	public void setdx(boolean dx) {
	   this.dx=dx;
	}
	
	
	public void setdx() {//�޸����ˮƽ����
		if(this.dx==constant.RIGHT)
			this.dx=constant.LEFT;
		else
			this.dx=constant.RIGHT;
	}
	
	public boolean getdy() {//�����Ĵ�ֱ����
		return this.dy;
	}
	
	public void setdy(boolean dy) {
		   this.dy=dy;
		}
	
	public void setdy() {//�޸���Ĵ�ֱ����
		if(this.dy==constant.UP)
			this.dy=constant.DOWN;
		else
			this.dy=constant.UP;
	}
	
	public int getvx() {//������ˮƽ����
		return this.vx;
	}
	
	public void setvx(int vx0) {//�޸����ˮƽ����
		this.vx=vx0;
	}
	
	public int getvy() {//�����Ĵ�ֱ����
		return this.vy;
	}
	
	public void setvy(int vy0) {//�޸���Ĵ�ֱ����
		this.vy=vy0;
	}
	
	public int getlastx() {//��һ�κ�����
		return this.lastx;
	}
	
	public int getlasty() {//��һ��������
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