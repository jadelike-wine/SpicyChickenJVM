package com.demo.jvm.classfile.attributes.impl;

import com.demo.jvm.classfile.ClassReader;
import com.demo.jvm.classfile.attributes.AttributeInfo;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:55
 */
public class ConstantValueAttribute implements AttributeInfo {

    private int constantValueIdx;

    @Override
    public void readInfo(ClassReader reader) {
        this.constantValueIdx = reader.readUint16();
    }

    public int constantValueIdx(){
        return this.constantValueIdx;
    }

}
