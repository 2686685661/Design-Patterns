package 单例模式.常见写法;

/**
 * 懒汉式
 * 同步方法
 * 线程安全
 * @author lishanlei
 *
 */
public class Singleton2 {

	private static Singleton2 singleton;
	
	private Singleton2() {
		
	}
	
	public static synchronized Singleton2 getInstance() {
		if(singleton == null) {
			singleton = new Singleton2();
		}
		return singleton;
	}
}
