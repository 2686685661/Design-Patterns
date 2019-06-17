package 单例模式.常见写法;

/**
 * 懒汉式
 * 高并发多线程下不安全
 * @author lishanlei
 *
 */
public class Singleton1 {

	private static Singleton1 singleton;
	
	private Singleton1() {
		
	}
	
	public static Singleton1 getInstance() {
		if(singleton == null) {
			singleton = new Singleton1();
		}
		return singleton;
	}
}
