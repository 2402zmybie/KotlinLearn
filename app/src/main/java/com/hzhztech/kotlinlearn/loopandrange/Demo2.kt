package com.hzhztech.kotlinlearn.loopandrange

fun main(args: Array<String>) {
//    var nums = 1 until 100    //[1,100)  1闭100开
//    for(num in nums) {
//        println(num)
//    }

    var nums2 = 1 .. 16
    //步长为2
//    for(a in nums2 step 2) {
//        println(a)
//    }

    var nums3 = nums2.reversed()
    for(a in nums3) {
        println(a)
    }

    println("总数为" + nums3.count())
}