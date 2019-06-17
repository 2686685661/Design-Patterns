package 工厂方法模式.女娲造人;

public class NvWa {

	public static void main(String[] args) {
		AbstractumanFactory yinyanglu = new HumanFactory();
		
		System.out.println("--造出的第一批人是白色人种");
		Human whiteHuman = yinyanglu.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("--造出的第2批人是黑色人种");
		Human blackHuman = yinyanglu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("--造出的第3批人是黄色人种");
		Human yellowHuman = yinyanglu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
