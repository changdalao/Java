package shoot;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JFrame;


public class musicplayer extends JFrame{
	musicplayer(){//���췽��
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(false);	//true ��false �������ڴ��ڵĿɼ��ԡ�	
		URL codebase=null;
	try{
			codebase = new URL("file:/D:/music.wav");//url���д���������д����·�����ſ��Է��ʵ������ļ���
		}catch(MalformedURLException e){//�����쳣
			e.printStackTrace();
		}
	       AudioClip  audio=Applet.newAudioClip(codebase);
	       audio.loop();//����loop����ʵ�����ֵ�ѭ������
	}
	  public  void player(){
   	      new musicplayer();//���ù��췽��
	  }
}
