package com.demo.jvm.classfile.constantpool.impl;

import com.demo.jvm.classfile.constantpool.ConstantPool;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:29
 * @Description 对一个字段的符号引用
 */
public class ConstantFieldRefInfo extends ConstantMemberRefInfo  {

    public ConstantFieldRefInfo(ConstantPool constantPool) {
        super(constantPool);
    }

    @Override
    public int tag() {
        return this.CONSTANT_TAG_FIELDREF;
    }

}
