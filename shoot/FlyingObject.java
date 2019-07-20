package shoot;

import java.awt.image.BufferedImage;

//�������� ����
public abstract class FlyingObject {
	 protected BufferedImage image;//ͼƬ��Ϣ
     protected int width;	//��
     protected int height;	//��
     protected int x;	//x����
     protected int y;	//y����
	 public void step() {
	}
     public abstract  boolean outOfBounds() ;//Խ�紦��

     public boolean shootBy(Bullet bullet){ //�ӵ����д���
    	 int x1= this.x;
    	 int x2=this.x+this.width;
    	 int y1=this.y;
    	 int y2= this.y+this.height;
    	 int x=bullet.x;
    	 int y= bullet.y;
    	 return x>x1 && x<x2 && y>y1 && y<y2;//ͬʱ����˵�����У�����true
     }
}
