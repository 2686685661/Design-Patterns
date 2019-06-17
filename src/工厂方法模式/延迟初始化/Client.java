package 工厂方法模式.延迟初始化;

public class Client {

	public static void main(String[] args) {
		try {
			Product pro = ProductFactory.createProduct("Product1");
			pro.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
