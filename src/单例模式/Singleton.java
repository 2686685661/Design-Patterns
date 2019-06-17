package 单例模式;
//饿汉式
public class Singleton {

	private static Singleton singleton = new Singleton();
	private Singleton() {
		//通过private私有关键字限制多个对象的生成
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
	public void say() {
		System.out.println("test...");
	}
	
}
