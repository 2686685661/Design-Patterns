package 建造者模式.变化是永恒的;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
	
//		ArrayList<String> sequence = new ArrayList<String>();
//		sequence.add("engine boom");
//		sequence.add("start");
//		sequence.add("stop");
//		
//		//要一个奔驰
//		BenzBuilder benzBuilder = new BenzBuilder();
//		benzBuilder.setSequence(sequence);
//		BenzModel benz = (BenzModel)benzBuilder.getCarModel();
//		benz.run();
//		
//		//同样顺序的宝马
//		BMWBuilder bmwBuilder = new BMWBuilder();
//		bmwBuilder.setSequence(sequence);
//		BMWModel bmw = (BMWModel)bmwBuilder.getCarModel();
//		bmw.run();
		
		Director director = new Director();
		
		for (int i = 0; i < 100; i++) {
			director.getABenzModel().run();
		}
		
		for (int i = 0; i < 100; i++) {
			director.getBBenzModel().run();
		}
		
		for (int i = 0; i < 100; i++) {
			director.getCBMWModel().run();
		}
	}
}
