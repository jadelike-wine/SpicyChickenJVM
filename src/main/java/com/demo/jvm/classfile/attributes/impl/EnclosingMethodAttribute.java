package com.demo.jvm.classfile.attributes.impl;

import com.demo.jvm.classfile.constantpool.ConstantPool;
import com.demo.jvm.classfile.ClassReader;
import com.demo.jvm.classfile.attributes.AttributeInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:55
 */
public class EnclosingMethodAttribute implements AttributeInfo {

    private ConstantPool constantPool;
    private int classIdx;
    private int methodIdx;


    public EnclosingMethodAttribute(ConstantPool constantPool) {
        this.constantPool = constantPool;
    }

    @Override
    public void readInfo(ClassReader reader) {
        this.classIdx = reader.readUint16();
        this.methodIdx = reader.readUint16();
    }

    public String className() {
        return this.constantPool.getClassName(this.classIdx);
    }

    public Map<String, String> methodNameAndDescriptor() {
        if (this.methodIdx <= 0) return new HashMap<>();
        return this.constantPool.getNameAndType(this.methodIdx);
    }

}
