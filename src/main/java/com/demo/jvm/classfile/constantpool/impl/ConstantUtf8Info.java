package com.demo.jvm.classfile.constantpool.impl;

import com.demo.jvm.classfile.ClassReader;
import com.demo.jvm.classfile.constantpool.ConstantInfo;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:49
 * @Description utf-8 编码的字符串
 */
public class ConstantUtf8Info implements ConstantInfo {

    private String str;

    @Override
    public void readInfo(ClassReader reader) {
        int length = reader.readUint16();
        byte[] bytes = reader.readBytes(length);
        this.str = new String(bytes);
    }

    @Override
    public int tag() {
        return this.CONSTANT_TAG_UTF8;
    }

    public String str(){
        return this.str;
    }

}