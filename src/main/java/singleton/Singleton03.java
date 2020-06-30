package singleton;

/**
 *
 * effective java 中推荐的单例模式
 * 线程安全，防止反序列化
 *
 */
public enum Singleton03 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->{
                System.out.println(Singleton03.INSTANCE.hashCode());
            }).start();
        }
    }
}
