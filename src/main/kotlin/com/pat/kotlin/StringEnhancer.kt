package com.pat.kotlin

operator fun String.minus(right:Any?) = this.replaceFirst(right.toString(),"")

operator fun String.times(right:Int):String{
    return (1..right).joinToString(""){this}
}

operator fun String.div(right:Any?):Int{
    val right = right.toString()
    return this.windowed(right.length,1){
        this == right
    }.count { it }
}

fun main(){
    val str = "hello world"
    println(str - "world")
    println(str * 2)
    println("*"*20)
    println(str/"l")
}