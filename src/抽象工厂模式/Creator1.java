package 抽象工厂模式;

/**
 * 产品等级1的实现类
 * @author lishanlei
 *
 */
public class Creator1 extends AbstractCreator {

	//只生产产品等级为1的A产品
	@Override
	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}
	//只生产产品等级为1的B产品
	@Override
	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
