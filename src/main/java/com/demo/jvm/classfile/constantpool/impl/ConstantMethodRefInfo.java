package com.demo.jvm.classfile.constantpool.impl;

import com.demo.jvm.classfile.constantpool.ConstantPool;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:44
 * @Description 方法
 */
public class ConstantMethodRefInfo extends ConstantMemberRefInfo {

    public ConstantMethodRefInfo(ConstantPool constantPool) {
        super(constantPool);
    }

    @Override
    public int tag() {
        return this.CONSTANT_TAG_METHODREF;
    }
}
