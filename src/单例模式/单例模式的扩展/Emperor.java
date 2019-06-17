package 单例模式.单例模式的扩展;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
	//定义最多能产生的示例数量
	private static int maxNumOfEmperor = 2;
	
	//存储每个皇帝的名字
	private static ArrayList<String> namelist = new ArrayList<String>();
	
	//存储所有皇帝的实例
	private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
	
	//当前皇帝的序列号
	private static int countNumOfEmperor = 0;
	
	//产生所有的对象
	static {
		for(int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
		}
	}
	
	private Emperor() {
		//通过private限制生成对象
	}
	
	private Emperor(String name) {
		namelist.add(name);
	}
	
	//随机获得一个皇帝对象
	public static Emperor getInstance() {
		Random random = new Random();
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumOfEmperor);
	}
	
	//皇帝说话了
	public static void say() {
		System.out.println(namelist.get(countNumOfEmperor));
	}
}
