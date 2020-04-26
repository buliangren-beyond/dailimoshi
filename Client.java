package daili;
//静态代理
public class Client {
	public static void main(String args[]) {
		IShowPic sp = new LocalPic();
		sp.showPic("水果");
	}
}
