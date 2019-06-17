package 建造者模式.变化是永恒的;

public class BenzModel extends CarModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("奔驰车这样发动的");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("奔驰车应该这样停车的");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("奔驰车喇叭声音是这样子的");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("奔驰车的引擎是这样的");
	}

}
