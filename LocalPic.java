package daili;

public class LocalPic implements IShowPic, Runnable {
	
	public void run() {
		isp.showPic(picname);
		System.out.println(picname+"ͼƬ�������");
	}
	
	private IShowPic isp;
	private String picname;
	public void showPic(String picname) {
		isp = new RemoPic();
		this.picname=picname;
		System.out.println(picname+"ͼƬ�������룡\n��ȴ�..............");
		Thread th = new Thread(this);
		th.start();
	}
}
