package com.pat.kotlin

import java.io.File

class Person(val name:String,val age:Int){
    override fun equals(other: Any?): Boolean {
        val other = (other as? Person)?: return false
        return other.name == this.name && other.age == this.age
    }

    override fun hashCode(): Int {
        return age + 1+ name.hashCode()*17
    }
}

fun main() {
    /*val persons = HashSet<Person>()

    (0..5).forEach{ _ ->
        persons += Person("dog",11)
    }

    println(persons.size)

    var x = "str"
    val y = x.let {
        println(it.removeRange(0,1))
        "yyy"
    }
    println("$x,$y")

    val z = x.run {
        println(this.replace('r','s'))
        "zzz"
    }
    println("$x,$z")*/

    File("build.gradle").readText()
        .toCharArray()
        .filterNot(Char::isWhitespace)
        .groupBy { it }
        .map {
            it.key to it.value.size
        }
        .forEach(System.out::println)
}