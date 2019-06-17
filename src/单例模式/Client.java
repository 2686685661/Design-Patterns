package 单例模式;

public class Client {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleton();
		singleton.say();
	}
}
