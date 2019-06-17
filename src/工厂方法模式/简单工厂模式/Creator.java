package 工厂方法模式.简单工厂模式;

public class Creator {

	public static Product createProduct(String name) {
		Product product = null;
		switch(name) {
			case "product1":
				product = new ConcreProduct1();
				break;
			case "product2":
				product = new ConcreProduct2();
				break;
			default:
				System.out.println("no product");
		}
		
		return product;
	}
}
