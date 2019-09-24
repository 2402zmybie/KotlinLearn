package com.hzhztech.kotlinlearn.`when`

fun whenDemo(score:Int) {
    when(score) {
        10 -> println("考了满分")
        9 -> println("干的不错")
        8 -> println("还可以")
        6 -> println("刚好及格")
        else -> println("还需要加油哦")
    }
}

fun main(args: Array<String>) {
    whenDemo(5)
}
