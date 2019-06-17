package 工厂方法模式.女娲造人;

public class HumanFactory extends AbstractumanFactory {

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		
		
		// TODO Auto-generated method stub
		//定义一个生产的人种
		Human human = null;
		try {
			human = (T)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("人种生成错误");
		}
		return (T)human;
	}

}
