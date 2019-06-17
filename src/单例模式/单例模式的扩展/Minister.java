package 单例模式.单例模式的扩展;

public class Minister {

	public static void main(String[] args) {
		int ministerNum = 5;
		for (int i = 0; i < ministerNum; i++) {
			Emperor emperor = Emperor.getInstance();
			System.out.print("第" + (i + 1) + "个大臣参拜的是：");
			emperor.say();
		}
	}
}
