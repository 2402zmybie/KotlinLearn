package com.hzhztech.kotlinlearn.递归

import java.math.BigInteger

fun main(args: Array<String>) {
    var num = BigInteger("70")
    //计算70的阶乘
    print(fact(num))
}

fun fact(num: BigInteger):BigInteger {
    if(num == BigInteger.ONE) {
        return BigInteger.ONE
    }else {
        return num * fact(num - BigInteger.ONE)
    }
}