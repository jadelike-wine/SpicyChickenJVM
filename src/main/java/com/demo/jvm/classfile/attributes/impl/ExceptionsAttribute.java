package com.demo.jvm.classfile.attributes.impl;

import com.demo.jvm.classfile.ClassReader;
import com.demo.jvm.classfile.attributes.AttributeInfo;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:55
 */
public class ExceptionsAttribute implements AttributeInfo {

    private int[] exceptionIndexTable;

    @Override
    public void readInfo(ClassReader reader) {
        this.exceptionIndexTable = reader.readUint16s();
    }

    public int[] exceptionIndexTable(){
        return this.exceptionIndexTable;
    }

}
