package com.vtyurin.solutions;

import java.nio.ByteOrder;

public class Endianness {
    public static void main(String[] args) {
        ByteOrder byteOrder = ByteOrder.nativeOrder();

        if (byteOrder.equals(ByteOrder.BIG_ENDIAN)) {
            System.out.println("BigEndian");
        } else {
            System.out.println("LittleEndian");
        }
    }
}
