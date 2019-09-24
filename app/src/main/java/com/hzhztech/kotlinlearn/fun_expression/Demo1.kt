package com.hzhztech.kotlinlearn.fun_expression

fun main(args: Array<String>) {
    //函数表达式
    //声明方法1
    var i = {x:Int,y:Int -> x+y}
    var result2 = i(3,5);
    println(result2)

    //声明方法2
    var j:(Int,Int)->Int = {x,y -> x+y}
    var result3 = j(4,5)
    println(result3)
}