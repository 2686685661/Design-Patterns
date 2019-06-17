package 工厂方法模式;

/**
 * 抽象工厂类
 * @author lishanlei
 *
 */
public abstract class Creator {

	public abstract <T extends Product> T createProduct(Class<T> c);
}
