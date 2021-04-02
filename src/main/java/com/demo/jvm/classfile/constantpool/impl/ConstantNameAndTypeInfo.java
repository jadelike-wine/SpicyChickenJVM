package com.demo.jvm.classfile.constantpool.impl;

import com.demo.jvm.classfile.ClassReader;
import com.demo.jvm.classfile.constantpool.ConstantInfo;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:47
 * @Description 名称和类型表
 */
public class ConstantNameAndTypeInfo implements ConstantInfo {

    public int nameIdx;
    public int descIdx;

    @Override
    public void readInfo(ClassReader reader) {
        this.nameIdx = reader.readUint16();
        this.descIdx = reader.readUint16();
    }

    @Override
    public int tag() {
        return this.CONSTANT_TAG_NAMEANDTYPE;
    }

}