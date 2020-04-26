package daili;

public class RemoPic implements IShowPic{
	public void showPic(String picname) {
		for(int i=1;i<4;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
