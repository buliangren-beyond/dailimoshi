package daili;

public class RemoPic2 implements IShowPic2 {

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		for(int i=3;i>0;i--) {
			System.out.println("怪物还有"+i+"秒出现");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("怪物出现了");
	}
}
