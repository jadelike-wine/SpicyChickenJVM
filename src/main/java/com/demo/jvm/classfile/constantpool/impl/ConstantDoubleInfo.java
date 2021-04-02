package com.demo.jvm.classfile.constantpool.impl;

import com.demo.jvm.classfile.ClassReader;
import com.demo.jvm.classfile.constantpool.ConstantInfo;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:28
 * @Description double 类型的字面值
 */
public class ConstantDoubleInfo implements ConstantInfo {

    private double val;

    @Override
    public void readInfo(ClassReader reader) {
        this.val = reader.readUint64TDouble();
    }

    @Override
    public int tag() {
        return this.CONSTANT_TAG_DOUBLE;
    }

    public double value(){
        return this.val;
    }

}
