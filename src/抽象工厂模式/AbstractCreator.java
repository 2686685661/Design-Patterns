package 抽象工厂模式;

/**
 * 抽象工厂类
 * @author lishanlei
 *
 */
public abstract class AbstractCreator {

	//创建A产品家族
	public abstract AbstractProductA createProductA();
	
	//创建B产品家族
	public abstract AbstractProductB createProductB();
}
