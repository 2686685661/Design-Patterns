package 抽象工厂模式.女娲造人;

/**
 * 生产女性的八卦炉
 * @author lishanlei
 *
 */
public class FemaleFactory implements HumanFactory {

	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	@Override
	public Human createYellowHuman() {
		// TODO Auto-generated method stub
		
		return new FemaleYellowHuman();
	}

	@Override
	public Human createWhiteHuman() {
		// TODO Auto-generated method stub
		return new FemaleWhiteHuman();
	}
}
