package 模版方法模型.模版方法模式的扩展;

public abstract class HummerModel {

	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void engineBoom();
	
	//钩子函数，默认喇叭是会响的
	protected boolean isAlarm() {
		return true;
	}
	
	final public void run() {
		this.start();
		this.engineBoom();
		
		if(this.isAlarm()) {
			this.alarm();
		}
		
		this.stop();
	}
}
