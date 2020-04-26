package daili;
//¶¯Ì¬´úÀí
public class Client2 {
	public static void main(String args[]) {
//		IShowPic isp2 = new RemoPic();
//		LocalPic2 lp2 = new LocalPic2(isp2);
//		IShowPic isp3 = (IShowPic)lp2.getProxyInstance();
//		isp3.showPic("Êß²Ë");
		
		IShowPic2 isp3 = new RemoPic2();
		LocalPic2 lp3 = new LocalPic2(isp3);
		IShowPic2 isp4 = (IShowPic2)lp3.getProxyInstance();
		isp4.sendMessage("AAA");
	}
}
