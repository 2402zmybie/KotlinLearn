package com.hzhztech.kotlinlearn.`fun`

fun main(args: Array<String>) {
    val checkAge = checkAge(18)
    println(checkAge)
}

fun sayHello(name :String):String {
    return "hello" + name
}

fun checkAge(age: Int):Boolean {
    if (age > 18) {
        return true
    }else {
        return false
    }
}

//请编写函数, 函数名为saveLog,方法没有返回值, 一个参数是整数类型, 名称为logLevel
fun saveLog(logLevel: Int) {

}