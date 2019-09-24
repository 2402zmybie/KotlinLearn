package com.hzhztech.kotlinlearn.listandmap

import java.util.*

fun main(args: Array<String>) {
    //map 类似于一个词典, 1 词典有索引, 2 索引对应了具体的内容
    var map = TreeMap<String,String>();
    map["好"] = "good"
    map["学习"] = "learn"
    println(map["好"])
}