package com.demo.jvm.classfile.attributes.impl;

import com.demo.jvm.classfile.ClassReader;
import com.demo.jvm.classfile.attributes.AttributeInfo;

/**
 * @Author lvyanpu
 * @Date 2021-04-01 21:56
 */
public class LocalVariableTableAttribute implements AttributeInfo {

    private LocalVariableTableEntry[] localVariableTable;

    @Override
    public void readInfo(ClassReader reader) {
        int localVariableTableLength = reader.readUint16();
        this.localVariableTable = new LocalVariableTableEntry[localVariableTableLength];
        for (int i = 0; i < localVariableTableLength; i++) {
            this.localVariableTable[i] = new LocalVariableTableEntry(reader.readUint16(), reader.readUint16(), reader.readUint16(), reader.readUint16(), reader.readUint16());
        }
    }

    static class LocalVariableTableEntry {

        private int startPC;
        private int length;
        private int nameIdx;
        private int descriptorIdx;
        private int idx;

        LocalVariableTableEntry(int startPC, int length, int nameIdx, int descriptorIdx, int idx) {
            this.startPC = startPC;
            this.length = length;
            this.nameIdx = nameIdx;
            this.descriptorIdx = descriptorIdx;
            this.idx = idx;
        }
    }

}
