package 抽象工厂模式.女娲造人;

public abstract class AbstractYellowHuman implements Human {

	public void getColor() {
		System.out.println("黄色人种的皮肤颜色是黄色的");
	}
	
	public void talk() {
		System.out.println("黄色人种会说话，一般是双音节");
	}
}
