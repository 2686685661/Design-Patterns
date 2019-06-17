package 模版方法模型.制作悍马;

public abstract class HummerModel {

	public abstract void start();
	
	public abstract void stop();
	
	public abstract void alarm();
	
	public abstract void engineBoom();
	
	public void run() {
		this.start();
		this.engineBoom();
		this.alarm();
		this.stop();
	}
}
