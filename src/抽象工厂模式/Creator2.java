package 抽象工厂模式;

/**
 * 产品等级为2的实现类
 * @author lishanlei
 *
 */
public class Creator2 extends AbstractCreator {

	//只生产产品等级为2的A产品
	@Override
	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	//只生产产品等级为2的B产品
	@Override
	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
