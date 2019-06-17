package 模版方法模型.模版方法模式的扩展;

public class HummerH1Model extends HummerModel {

	private boolean alarmFlag = true; //要响喇叭

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		
	}
	
	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}
	


	
}
