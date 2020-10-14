package cn.jvm.chapter02.java1;

public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader systemLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(systemLoader); //用户自定义的类，默认使用系统类加载器 sun.misc.Launcher$AppClassLoader@18b4aac2

        ClassLoader extensionLoader = systemLoader.getParent();
        System.out.println(extensionLoader); // 系统类加载器的父类，拓展类加载器 sun.misc.Launcher$ExtClassLoader@1b6d3586

        // 引导类加载器由于是 C/C++ 编写的，因此不能获取
        ClassLoader bootstrapLoader = extensionLoader.getParent();
        System.out.println(bootstrapLoader); // null

        // String 类使用引导类加载器加载的（Java的核心类都是使用引导类加载器加载）
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);
    }
}
