package singleton;

/**
 *
 * 静态内部类创建实例
 *  getInstance()方法中的引用属于被动引用，只有在getInstance()方法被调用时才会创建实例（懒加载）
 * 每个类只会被初始化一次，这是由JVM保证的（线程安全）
 *
 */
public class Singleton04 {
    private Singleton04(){

    }

    private static  class Singleton04Holder{
        private static final Singleton04 INSTANCE = new Singleton04();
    }

    public static Singleton04 getInstance(){
        return Singleton04Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->{
                System.out.println(getInstance().hashCode());
            }).start();
        }
    }
}
