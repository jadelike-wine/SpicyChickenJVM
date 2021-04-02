package com.demo.jvm.classfile.constantpool.impl;

import com.demo.jvm.classfile.ClassReader;
import com.demo.jvm.classfile.constantpool.ConstantPool;
import com.demo.jvm.classfile.constantpool.ConstantInfo;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:48
 * @Description String 类型的常量
 */
public class ConstantStringInfo implements ConstantInfo {

    private ConstantPool constantPool;
    private int strIdx;

    public ConstantStringInfo(ConstantPool constantPool) {
        this.constantPool = constantPool;
    }

    @Override
    public void readInfo(ClassReader reader) {
        this.strIdx = reader.readUint16();
    }

    @Override
    public int tag() {
        return this.CONSTANT_TAG_STRING;
    }

    public String string(){
        return this.constantPool.getUTF8(this.strIdx);
    }

}