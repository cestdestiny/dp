package singleton;

/**
 * 饿汉模式
 * 在类初始化的时候进行实例化
 */
public class Singleton01 {
    private static Singleton01 INSTANCE = new Singleton01();
    private Singleton01(){

    }
    public static Singleton01 getInstance(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->{
                System.out.println(Singleton01.getInstance().hashCode());
            }).start();
        }
    }
}
