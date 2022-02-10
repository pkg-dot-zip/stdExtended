package com.zimonishim.stdextended.java.util

import java.util.*

class RandomExtensions {

    companion object {

        fun Random.nextByte(): Byte = nextInt(Byte.MAX_VALUE.toInt()).toByte()
        fun Random.nextShort(): Short = nextInt(Short.MAX_VALUE.toInt()).toShort()

        fun Random.nextUByte(): UByte = nextInt(UByte.MAX_VALUE.toInt()).toUByte()
        fun Random.nextUShort(): UShort = nextInt(UShort.MAX_VALUE.toInt()).toUShort()

        //region Arrays
        fun Random.nextInts(amount: Int): Array<Int> = Array(amount) { nextInt() }
        fun Random.nextDoubles(amount: Int): Array<Double> = Array(amount) { nextDouble() }
        fun Random.nextFloats(amount: Int): Array<Float> = Array(amount) { nextFloat() }
        fun Random.nextLongs(amount: Int): Array<Long> = Array(amount) { nextLong() }
        fun Random.nextBooleans(amount: Int): Array<Boolean> = Array(amount) { nextBoolean() }
        fun Random.nextGaussians(amount: Int): Array<Double> = Array(amount) { nextGaussian() }

        fun Random.nextBytes(amount: Int): Array<Byte> = Array(amount) { nextByte() }
        fun Random.nextShorts(amount: Int): Array<Short> = Array(amount) { nextShort() }
        fun Random.nextUBytes(amount: Int): Array<UByte> = Array(amount) { nextUByte() }
        fun Random.nextUShorts(amount: Int): Array<UShort> = Array(amount) { nextUShort() }
        //endregion
    }
}