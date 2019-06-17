package 工厂方法模式.替代单例模式;

import java.lang.reflect.Constructor;

public class SingletonFactory {

	private static Singleton singleton;
	
	static {
		try {
			Class c = Class.forName(Singleton.class.getName());
			Constructor constructor = c.getDeclaredConstructor();
			constructor.setAccessible(true);
			singleton = (Singleton)constructor.newInstance();
		} catch (Exception e) {
			//异常处理
		}
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
}
