package com.hzhztech.kotlinlearn.listandmap

fun main(args: Array<String>) {

    //list
    var lists = listOf("买鸡蛋","买大米","买冈本","买冰激凌")
    for((i,e) in lists.withIndex()) {
        println("${i} ${e}")
    }




}