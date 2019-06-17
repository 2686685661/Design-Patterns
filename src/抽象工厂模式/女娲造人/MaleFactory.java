package 抽象工厂模式.女娲造人;

/**
 * 生产男性的八卦炉
 * @author lishanlei
 *
 */
public class MaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		// TODO Auto-generated method stub
		return new MaleYellowHuman();
	}

	@Override
	public Human createWhiteHuman() {
		// TODO Auto-generated method stub
		return new MaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		// TODO Auto-generated method stub
		return new MaleBlackHuman();
	}

	
}
