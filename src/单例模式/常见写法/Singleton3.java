package 单例模式.常见写法;

/**
 * 懒汉式
 * 同步
 * 线程安全
 * @author lishanlei
 *
 */
public class Singleton3 {

    private static volatile Singleton3 singleton;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (singleton == null) {
            synchronized (Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}
