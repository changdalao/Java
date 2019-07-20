package shoot;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JFrame;


public class musicplayer extends JFrame{
	musicplayer(){//构造方法
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(false);	//true 和false 用来调节窗口的可见性。	
		URL codebase=null;
	try{
			codebase = new URL("file:/D:/music.wav");//url类中传参数必须写绝对路径，才可以访问到音乐文件。
		}catch(MalformedURLException e){//捕获异常
			e.printStackTrace();
		}
	       AudioClip  audio=Applet.newAudioClip(codebase);
	       audio.loop();//调用loop方法实现音乐的循环播放
	}
	  public  void player(){
   	      new musicplayer();//调用构造方法
	  }
}
