package com.hzhztech.kotlinlearn.stringtemplate

//字符串模板
fun diaryTools(name:String):String {
    var str = """
        今天我们去${name} 玩,看到了${name}, 总共是${name.length}个字""";
    return str
}

fun main(args: Array<String>) {
    println(diaryTools("武汉市第五医院"))
}