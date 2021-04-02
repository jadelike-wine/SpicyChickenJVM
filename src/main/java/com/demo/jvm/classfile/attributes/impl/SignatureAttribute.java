package com.demo.jvm.classfile.attributes.impl;

import com.demo.jvm.classfile.ClassReader;
import com.demo.jvm.classfile.attributes.AttributeInfo;
import com.demo.jvm.classfile.constantpool.ConstantPool;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:56
 */
public class SignatureAttribute implements AttributeInfo {

    private ConstantPool constantPool;
    private int signatureIdx;

    public SignatureAttribute(ConstantPool constantPool) {
          this.constantPool = constantPool;
    }

    @Override
    public void readInfo(ClassReader reader) {
        this.signatureIdx = reader.readUint16();
    }

    public String signature(){
        return this.constantPool.getUTF8(this.signatureIdx);
    }

}
