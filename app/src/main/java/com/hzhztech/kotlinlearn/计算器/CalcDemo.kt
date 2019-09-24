package com.hzhztech.kotlinlearn.计算器

import java.lang.Exception

fun main(args: Array<String>) {
    while (true) {
        println("欢迎使用加法计算器")
        println("请输入第一个数字")
        var num1 = readLine();
        println("请输入第二个数字")
        var num2 = readLine();

        try {
            var int1 = num1!!.toInt()
            var int2 = num2!!.toInt();
            println("${int1} + ${int2} = ${int1 + int2}")   //1 + 4 = 5
        }catch (e: Exception) {
            println("请输入数字哟")
        }
    }
}