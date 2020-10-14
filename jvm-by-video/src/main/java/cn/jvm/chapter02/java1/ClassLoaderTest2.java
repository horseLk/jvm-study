package cn.jvm.chapter02.java1;

public class ClassLoaderTest2 {
    public static void main(String[] args) {
        try {
            // 方式一：获取当前类的ClassLoader。Clazz.getClassLoader()
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader); // null

            // 方式二：获取当前线程上下文的ClassLoader。Thread.currentThread.getContextClasssLoader()
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            System.out.println(contextClassLoader); // sun.misc.Launcher$AppClassLoader@18b4aac2

            // 方式三：获取系统的ClassLoader。ClassLoader.getSystemClassLoader()
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            System.out.println(systemClassLoader);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
