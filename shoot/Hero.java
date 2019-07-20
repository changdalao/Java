package shoot;

import java.awt.Image;
import java.awt.image.BufferedImage;

//Ӣ�۷�����
public class Hero extends FlyingObject {

	private int life;// ����
    private int doubleFire;//����ֵ
    private BufferedImage[] images;
    private int index;//Э��ͼƬ�л�
    
    public Hero(){
    	image=shootGame.hero0;
    	//Ӣ�ۻ�����޷���ͼƬ���
		width= image.getWidth();
		height=image.getHeight();
		x=150;//�̶��ĳ�ʼ����x
		y=400;//�̶��ĳ�ʼ����y
		life =3;
		doubleFire = 1;//Ϊ�������������
		images = new BufferedImage[] {shootGame.hero0,shootGame.hero1};
		index = 0;//Э���л�ͼƬ����ʼΪ0��
    }

    public Bullet[] shoot(){
  	  int xStep = this.width/4;//xStepΪ�ķ�֮һս�����Ŀ��
  	  int yStep = 20;//yStep:�̶���ֵ
  	  if(doubleFire>0){	//����˫������
  		  Bullet[] bs = new Bullet[2]; 
  		  bs[0]= new Bullet(this.x + 1 * xStep,this.y - yStep);
  		  bs[1]= new Bullet(this.x + 3 * xStep,this.y - yStep);
  		  doubleFire-=2;	//˫������ֵʱÿ��һ���ӵ�����ֵ��2
  		  return bs;
  	  }else{
  		  Bullet[] bs = new Bullet[1];
  		  bs[0]= new Bullet(this.x + 2 * xStep,this.y - yStep);
  		  return bs;
  	  }
    }
    
    public void step(){ //�ƶ�
    	  image = images[index++/10%images.length]; 
      }
    
    public void moveTo(int x,int y){
  	    this.x= x-this.width/2;
  	    this.y= y-this.height/2;
  	}
    
    public boolean outOfBounds(){
  		return false;
  	}
    
    public void addDoubleFire(){	//�����ӵ�
  	  doubleFire+=20;//����ֵ��40
    }
    
    public void clearDoubleFire(){	//��Ӣ�ۻ��������ӵ���Ϊ����������doubleFire=0
  	  doubleFire=0;
    }
    
    public void addLive(){	//����ֵ���ӣ������۷�
  	   life++;
    }
    
    public void subtractLife(){
    	  life--;//������һ
    }
    
    public int getLife(){	//������ֵ�����������
  	  return life;
    }
    
    public boolean hit(FlyingObject other){  //�ӵ����ел�����ͨ+�۷䣩
    	int x1 = other.x - this.width / 2;
		int x2 = other.x + other.width + this.width / 2;
		int y1 = other.y - this.height / 2;
		int y2 = other.y + other.height + this.height / 2;
		return 	(this.x + this.width / 2) > x1 && (this.x + this.width / 2) < x2
				&& (this.y + this.height / 2) > y1
				&& (this.y + this.width / 2) < y2;   //true��ʾ����
    }
}
