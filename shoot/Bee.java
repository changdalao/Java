package shoot;

//蜜蜂对象
public class Bee extends FlyingObject implements Award {

	public Bee() {
		// TODO Auto-generated constructor stub
	}
	public int Life(){//生命
		return 0;
	}
	public int bullet(){//子弹双倍
		return 0;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean outOfBounds() {
		// TODO Auto-generated method stub
		return false;
	}
}
