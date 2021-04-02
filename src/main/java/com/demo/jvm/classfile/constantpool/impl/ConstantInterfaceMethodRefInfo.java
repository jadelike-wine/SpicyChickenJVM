package com.demo.jvm.classfile.constantpool.impl;

import com.demo.jvm.classfile.constantpool.ConstantPool;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:31
 * @Description 对一个接口中方法的符号引用
 */
public class ConstantInterfaceMethodRefInfo extends ConstantMemberRefInfo {

    public ConstantInterfaceMethodRefInfo(ConstantPool constantPool) {
        super(constantPool);
    }

    @Override
    public int tag() {
        return this.CONSTANT_TAG_INTERFACEMETHODREF;
    }

}
