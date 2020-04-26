package daili;

public class LocalPic implements IShowPic, Runnable {
	
	public void run() {
		isp.showPic(picname);
		System.out.println(picname+"图片加载完成");
	}
	
	private IShowPic isp;
	private String picname;
	public void showPic(String picname) {
		isp = new RemoPic();
		this.picname=picname;
		System.out.println(picname+"图片正在载入！\n请等待..............");
		Thread th = new Thread(this);
		th.start();
	}
}
