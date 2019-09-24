package com.hzhztech.kotlinlearn.字符串和数字

fun main(args: Array<String>) {
    var a = "13"
    var b = 13
    //String -> Int
    a = b.toString()

    //Int -> String
    b = a.toInt();
    println(b)
}