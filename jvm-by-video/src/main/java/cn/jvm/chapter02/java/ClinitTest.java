package cn.jvm.chapter02.java;

public class ClinitTest {
    private int a = 1;
    private static int d = 1;
    public static void main(String[] args) {
        int b = 2;
    }

    public ClinitTest() {
        a = 2;
        d = 2;
    }
}
