package com.demo.jvm.classfile.constantpool.impl;

import com.demo.jvm.classfile.ClassReader;
import com.demo.jvm.classfile.constantpool.ConstantPool;
import com.demo.jvm.classfile.constantpool.ConstantInfo;

import java.util.Map;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:37
 * @Description 对一个类中方法相关的符号引用的模板
 */
public class ConstantMemberRefInfo implements ConstantInfo {

    protected ConstantPool constantPool;
    protected int classIdx;
    private int nameAndTypeIdx;

    ConstantMemberRefInfo(ConstantPool constantPool) {
        this.constantPool = constantPool;
    }

    @Override
    public void readInfo(ClassReader reader) {
        this.classIdx = reader.readUint16();
        this.nameAndTypeIdx = reader.readUint16();
    }

    @Override
    public int tag() {
        return 0;
    }

    public String className() {
        return this.constantPool.getClassName(this.classIdx);
    }

    public Map<String, String> nameAndDescriptor() {
        return this.constantPool.getNameAndType(this.nameAndTypeIdx);
    }

}
