package shoot;

import java.awt.Image;
import java.awt.image.BufferedImage;

//英雄飞行物
public class Hero extends FlyingObject {

	private int life;// 生命
    private int doubleFire;//火力值
    private BufferedImage[] images;
    private int index;//协助图片切换
    
    public Hero(){
    	image=shootGame.hero0;
    	//英雄机宽高无非是图片宽高
		width= image.getWidth();
		height=image.getHeight();
		x=150;//固定的初始坐标x
		y=400;//固定的初始坐标y
		life =3;
		doubleFire = 1;//为零代表单倍火力。
		images = new BufferedImage[] {shootGame.hero0,shootGame.hero1};
		index = 0;//协助切换图片（初始为0）
    }

    public Bullet[] shoot(){
  	  int xStep = this.width/4;//xStep为四分之一战斗机的宽度
  	  int yStep = 20;//yStep:固定的值
  	  if(doubleFire>0){	//处理双倍火力
  		  Bullet[] bs = new Bullet[2]; 
  		  bs[0]= new Bullet(this.x + 1 * xStep,this.y - yStep);
  		  bs[1]= new Bullet(this.x + 3 * xStep,this.y - yStep);
  		  doubleFire-=2;	//双倍火力值时每发一发子弹火力值减2
  		  return bs;
  	  }else{
  		  Bullet[] bs = new Bullet[1];
  		  bs[0]= new Bullet(this.x + 2 * xStep,this.y - yStep);
  		  return bs;
  	  }
    }
    
    public void step(){ //移动
    	  image = images[index++/10%images.length]; 
      }
    
    public void moveTo(int x,int y){
  	    this.x= x-this.width/2;
  	    this.y= y-this.height/2;
  	}
    
    public boolean outOfBounds(){
  		return false;
  	}
    
    public void addDoubleFire(){	//增加子弹
  	  doubleFire+=20;//火力值增40
    }
    
    public void clearDoubleFire(){	//当英雄机死亡，子弹归为单倍火力，doubleFire=0
  	  doubleFire=0;
    }
    
    public void addLive(){	//生命值增加，击中蜜蜂
  	   life++;
    }
    
    public void subtractLife(){
    	  life--;//命数减一
    }
    
    public int getLife(){	//将生命值输出到界面上
  	  return life;
    }
    
    public boolean hit(FlyingObject other){  //子弹击中敌机（普通+蜜蜂）
    	int x1 = other.x - this.width / 2;
		int x2 = other.x + other.width + this.width / 2;
		int y1 = other.y - this.height / 2;
		int y2 = other.y + other.height + this.height / 2;
		return 	(this.x + this.width / 2) > x1 && (this.x + this.width / 2) < x2
				&& (this.y + this.height / 2) > y1
				&& (this.y + this.width / 2) < y2;   //true表示击中
    }
}
