public class Demo {
    // final 修饰字符串可以在编译期就优化成abcdef，所以在运行时放入常量池的是abcdef
    public static void main(String[] args) {
        final String a = "abc";
        final String b = "def";
        String c = "abcdef";
        System.out.println(a+b == c); // true


    }
}
