package shoot;

//��ͨ�ĵ��˶���
public class Airplane extends FlyingObject implements Enemy {
	public Airplane() {
	}
	
	public int score(){//��д��������
		return 5;
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
