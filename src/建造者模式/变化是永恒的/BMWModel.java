package 建造者模式.变化是永恒的;

public class BMWModel extends CarModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("宝马车的跑起来是这样子");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("宝马车停下来是这样子吧");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("宝马车喇叭声音是这样子的");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("宝马车的引擎是这样子");
	}

}
