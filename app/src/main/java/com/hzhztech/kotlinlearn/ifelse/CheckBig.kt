package com.hzhztech.kotlinlearn.ifelse

fun checkBig(a:Int,b:Int):Int {
    if(a > b)
        return a
    else
        return b
}

fun main(args: Array<String>) {
    var a = 3;
    var b = 5;
    println("${a}和${b}较大的值为${checkBig(a,b)}")  //3和5较大的值为5
}