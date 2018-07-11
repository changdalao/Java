package shoot;

import java.awt.image.BufferedImage;

//飞行物类 父类
public abstract class FlyingObject {
	 protected BufferedImage image;//图片信息
     protected int width;	//宽
     protected int height;	//高
     protected int x;	//x坐标
     protected int y;	//y坐标
	 public void step() {
	}
     public abstract  boolean outOfBounds() ;//越界处理

     public boolean shootBy(Bullet bullet){ //子弹击中处理
    	 int x1= this.x;
    	 int x2=this.x+this.width;
    	 int y1=this.y;
    	 int y2= this.y+this.height;
    	 int x=bullet.x;
    	 int y= bullet.y;
    	 return x>x1 && x<x2 && y>y1 && y<y2;//同时满足说明击中，返回true
     }
}
