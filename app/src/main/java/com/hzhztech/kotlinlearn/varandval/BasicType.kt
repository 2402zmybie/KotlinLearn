package com.hzhztech.kotlinlearn.varandval

fun main(args: Array<String>) {
    var aByte = Byte.MAX_VALUE
    var bByte = Byte.MIN_VALUE;
    println("Byte最大值" + aByte)
    println("Byte最小值" + bByte)

    var aLong = Long.MAX_VALUE
    var bLong = Long.MIN_VALUE;
    println("Long最大值" + aLong)
    println("Long最小值" + bLong)

    val aInt:Int = 0b0011
    println("aInt的值是" + aInt)
}