package com.hzhztech.kotlinlearn.`null`

/**
 * 接收一个参数, 参数是非空的string类型, 加上问号表示参数可以为空\
 * Null也是一种类型, 只不过代表没有数据而已
 */
fun heart(name:String?):String {
    return "热" + name
}

fun main(args: Array<String>) {
    var result1 = heart("狗")
    println(result1)

    var result2 = heart(null);
    println(result2)
}