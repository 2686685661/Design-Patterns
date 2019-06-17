package 工厂方法模式;

public class ConcreCreator extends Creator {

	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		// TODO Auto-generated method stub
		Product product = null;
		try {
			product = (Product)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			//异常处理
		}
		return (T)product;
	}
}
