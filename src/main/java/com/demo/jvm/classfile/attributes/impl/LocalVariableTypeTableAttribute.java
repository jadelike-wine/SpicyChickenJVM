package com.demo.jvm.classfile.attributes.impl;

import com.demo.jvm.classfile.ClassReader;
import com.demo.jvm.classfile.attributes.AttributeInfo;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:56
 */
public class LocalVariableTypeTableAttribute implements AttributeInfo {

    private LocalVariableTypeTableEntry[] localVariableTypeTable;

    @Override
    public void readInfo(ClassReader reader) {
        int localVariableTypeTableLength = reader.readUint16();
        this.localVariableTypeTable = new LocalVariableTypeTableEntry[localVariableTypeTableLength];
        for (int i = 0; i < localVariableTypeTableLength; i++) {
            this.localVariableTypeTable[i] = new LocalVariableTypeTableEntry(reader.readUint16(), reader.readUint16(), reader.readUint16(), reader.readUint16(), reader.readUint16());
        }
    }

    static class LocalVariableTypeTableEntry {
        private int startPC;
        private int length;
        private int nameIndex;
        private int signatureIndex;
        private int index;

        public LocalVariableTypeTableEntry(int startPC, int length, int nameIndex, int signatureIndex, int index) {
            this.startPC = startPC;
            this.length = length;
            this.nameIndex = nameIndex;
            this.signatureIndex = signatureIndex;
            this.index = index;
        }
    }

}
