package 工厂方法模式.女娲造人;

public class WhiteHuman implements Human {

	public void getColor() {
		System.out.println("白色人中的皮肤颜色是白色的");
	}
	
	public void talk() {
		System.out.println("白色人中会说话，一般都是单音节");
	}
}
