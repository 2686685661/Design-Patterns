package 抽象工厂模式.女娲造人;

/**
 * 八卦炉的定义
 * @author lishanlei
 *
 */
public interface HumanFactory {

	//制造一个黄色人种
	public Human createYellowHuman();
	
	//制造一个白色人种
	public Human createWhiteHuman();
	
	//制造一个黑色人种
	public Human createBlackHuman();
}
