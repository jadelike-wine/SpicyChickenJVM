package com.demo.jvm.classfile.constantpool.impl;

import com.demo.jvm.classfile.ClassReader;
import com.demo.jvm.classfile.constantpool.ConstantInfo;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:32
 * @Description 动态调用点限定符
 */
public class ConstantInvokeDynamicInfo implements ConstantInfo {

    private int bootstrapMethodAttrIdx;
    private int nameAndTypeIdx;

    @Override
    public void readInfo(ClassReader reader) {
        this.bootstrapMethodAttrIdx = reader.readUint16();
        this.nameAndTypeIdx = reader.readUint16();
    }

    @Override
    public int tag() {
        return this.CONSTANT_TAG_INVOKEDYNAMIC;
    }
}
