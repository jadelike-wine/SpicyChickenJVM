package com.demo.jvm.classpath;

import com.demo.jvm.classpath.impl.CompositeEntry;
import com.demo.jvm.classpath.impl.DirEntry;
import com.demo.jvm.classpath.impl.WildcardEntry;
import com.demo.jvm.classpath.impl.ZipEntry;

import java.io.File;
import java.io.IOException;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 16:54
 * @Description 类路径的接口
 */
public interface Entry {

    byte[] readClass(String className) throws IOException;

    static Entry create(String path) {
        if(path.contains(File.pathSeparator)) {
            return new CompositeEntry(path);
        }

        if (path.endsWith("*")) {
            return new WildcardEntry(path);
        }

        if(path.endsWith(".jar") || path.endsWith(".JAR") ||
                path.endsWith(".zip") || path.endsWith(".ZIP")) {
            return new ZipEntry(path);
        }

        return new DirEntry(path);
    }

}
