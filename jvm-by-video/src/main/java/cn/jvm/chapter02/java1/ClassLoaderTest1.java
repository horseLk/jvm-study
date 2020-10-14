package cn.jvm.chapter02.java1;

import sun.misc.Launcher;
import sun.security.ec.CurveDB;

import java.net.URL;
import java.security.Provider;

public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("*****启动类加载器*****");
        // 获取引导类加载器能够加载的API路径
        URL[] urls = Launcher.getBootstrapClassPath().getURLs();
        /*
            file:/D:/Program%20Files/Java/jdk1.8.0_221/jre/lib/resources.jar
            file:/D:/Program%20Files/Java/jdk1.8.0_221/jre/lib/rt.jar
            file:/D:/Program%20Files/Java/jdk1.8.0_221/jre/lib/sunrsasign.jar
            file:/D:/Program%20Files/Java/jdk1.8.0_221/jre/lib/jsse.jar
            file:/D:/Program%20Files/Java/jdk1.8.0_221/jre/lib/jce.jar
            file:/D:/Program%20Files/Java/jdk1.8.0_221/jre/lib/charsets.jar
            file:/D:/Program%20Files/Java/jdk1.8.0_221/jre/lib/jfr.jar
            file:/D:/Program%20Files/Java/jdk1.8.0_221/jre/classes
         */
        for (URL url : urls) {
            System.out.println(url.toExternalForm());
        }

        // 从上面的路径中随便选择一个类，查看他的类加载器：引导类加载器
        System.out.println(Provider.class.getClassLoader());// null

        System.out.println("*****拓展类加载器*****");
        String extDirs = System.getProperty("java.ext.dirs");
        /*
            D:\Program Files\Java\jdk1.8.0_221\jre\lib\ext
            C:\Windows\Sun\Java\lib\ext
         */
        for (String path : extDirs.split(";")) {
            System.out.println(path);
        }
        // 从上面的路径中随便选择一个类，查看他的类加载器：拓展类加载器
        System.out.println(CurveDB.class.getClassLoader());// sun.misc.Launcher$ExtClassLoader@4b67cf4d
    }
}
