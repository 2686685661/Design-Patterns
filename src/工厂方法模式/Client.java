package 工厂方法模式;
/**
 * 场景类
 * @author lishanlei
 *
 */
public class Client {

	public static void main(String[] args) {
		Creator creator = new ConcreCreator();
		Product product = creator.createProduct(ConcreteProduct2.class);
		product.method2();
		
		/**
		 * 继续业务处理
		 */
	}
}
