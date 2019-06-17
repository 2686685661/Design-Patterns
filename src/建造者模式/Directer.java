package 建造者模式;

public class Directer {

	private Builder builder = new ConcreteBuilder();
	public Product getAProduct() {
		builder.setPart();
		/**
		 * 设置不同的零件，产生不同的产品
		 */
		return builder.buildProduct();
	}
}
