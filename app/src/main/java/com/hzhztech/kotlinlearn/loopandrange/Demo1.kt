package com.hzhztech.kotlinlearn.loopandrange

fun jia():Int {
    var nums = 1 .. 100;   //[1,100]  双闭区间
    var result:Int = 0
    for(num in nums) {
        result += num
    }

    return result
}

fun main(args: Array<String>) {
    val result = jia();
    println(result)
}