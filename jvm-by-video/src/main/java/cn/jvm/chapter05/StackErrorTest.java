package cn.jvm.chapter05;

/**
 * 演示栈中的StackOverFlow异常情况
 *  默认情况下 count = 9321;
 *  设置了 -Xss256k 后， count = 2210
 */
public class StackErrorTest {
    private static int count = 1;
    public static void main(String[] args) {
        a();
    }

    public static  void a() {
        System.out.println(count++);
        a();
    }
}
