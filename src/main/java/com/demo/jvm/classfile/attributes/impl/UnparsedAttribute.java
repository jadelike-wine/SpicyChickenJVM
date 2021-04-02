package com.demo.jvm.classfile.attributes.impl;

import com.demo.jvm.classfile.ClassReader;
import com.demo.jvm.classfile.attributes.AttributeInfo;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:56
 */
public class UnparsedAttribute implements AttributeInfo {

    private String name;
    private int length;
    private byte[] info;

    public UnparsedAttribute(String attrName, int attrLen) {
        this.name = attrName;
        this.length = attrLen;
    }

    @Override
    public void readInfo(ClassReader reader) {
        this.info = reader.readBytes(this.length);
    }

    public byte[] info(){
        return this.info;
    }

}
