package com.lannstark.lec12

fun main(){
    println(Singleton.a)
    Singleton.a += 10;
    println(Singleton.a)



}

class Person(
    var name: String,
    var age: Int,
){
    companion object Factory : Log{
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person{
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("Person 클래스의 동행 객체 Factory")
        }
    }
}


object Singleton{
    var a: Int = 0
}
