package 工厂方法模式.替代单例模式;

public class Client {

	public static void main(String[] args) {
		Singleton singleton = SingletonFactory.getSingleton();
		singleton.doSomething();
	}
}
