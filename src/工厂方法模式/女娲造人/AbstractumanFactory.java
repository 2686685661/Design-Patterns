package 工厂方法模式.女娲造人;

public abstract class AbstractumanFactory {
	
	public abstract <T extends Human> T createHuman(Class<T> c);
}
