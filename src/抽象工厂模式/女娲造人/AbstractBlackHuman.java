package 抽象工厂模式.女娲造人;

public abstract class AbstractBlackHuman implements Human {

	
	public void getColor() {
		System.out.println("黑色人种会的皮肤颜色是黑色的");
	}
	
	public void talk() {
		System.out.println("黑人会说话，但是听不懂");
	}
}
