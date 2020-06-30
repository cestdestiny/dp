package singleton;

/**
 * double check lock
 *
 * JVM中对象实例化过程：
 *  1.在堆内存中分配内存空间
 *  2.给对象的参数赋值
 *  3.将对象引用指向堆内存
 *
 *  jvm的指令重排序可能先执行3，再执行2，导致其他线程拿到未初始化完的实例
 *  需要通过 volatile 防止指令重排序 保证可见性，每次都是从主内存中取
 */
public class Singleton02 {
    // volatile 防止指令重排 JIT
    private static volatile Singleton02 INSTANCE = null;
    private Singleton02(){

    }
    public static Singleton02 getInstance(){
        if (INSTANCE == null){
            synchronized(Singleton02.class){
                if (INSTANCE == null){
                    INSTANCE = new Singleton02();
                }
            }
        }
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
                System.out.println(Singleton02.getInstance().hashCode());
            }).start();
        }
    }
}
