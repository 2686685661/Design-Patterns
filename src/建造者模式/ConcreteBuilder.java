package 建造者模式;

public class ConcreteBuilder extends Builder {

	private Product product = new Product();
	
	public void setPart() {
		/**
		 * 产品类内的逻辑处理
		 */
	}


	@Override
	public Product buildProduct() {
		// TODO Auto-generated method stub
		return product;
	}
	
}
