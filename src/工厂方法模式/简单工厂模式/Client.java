package 工厂方法模式.简单工厂模式;

public class Client {

	public static void main(String[] args) {
		Product p1 = Creator.createProduct("product1");
		Product p2 = Creator.createProduct("product2");
		p1.method2();
		p2.method2();
	}
}
