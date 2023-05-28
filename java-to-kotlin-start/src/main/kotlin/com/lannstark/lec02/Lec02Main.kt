package com.lannstark.lec02

import java.lang.IllegalArgumentException
import java.util.IllegalFormatCodePointException

fun main(){
    val str: String? = "ABC"
//    str.length // 불가능
    //safe call: null이 아닌 경우에만 호출
    str?.length // 가능
    //Elvis 연산자 : null인 경우에만 호출
    println( str?.length ?:0)
    // kotlin에서 java코드 사용할 때 플랫폼 타입 사용에 유의해야 함
    val person = Person("공부하는 개발자")
    startWithA(person.name)
}

fun startWithA(str: String): Boolean{
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean{

   return str?.startsWith("A")
    ?:throw IllegalArgumentException("null이 들어왔습니다.")

    if(str==null){
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

fun startsWithA2(str:String?): Boolean?{

    return str?.startsWith("A")
    if(str == null){
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean{

    return str?.startsWith("A")?: false

    if(str == null){
        return false
    }
    return str.startsWith("A")
}

// null이 절대 아닐 때 사용할 수 있는 널 아님 단언(!!)
fun startsWith(str:String?): Boolean{
    return str!!.startsWith("A")
}

