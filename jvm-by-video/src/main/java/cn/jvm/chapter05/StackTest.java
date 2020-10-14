package cn.jvm.chapter05;

public class StackTest {
    public static void main(String[] args) {
        new StackTest().a();
    }

    public void a() {
        int i = 10;
        int j = 20;
        b();
    }

    public void b() {
        int k = 20;
        int m = 40;
    }
}
