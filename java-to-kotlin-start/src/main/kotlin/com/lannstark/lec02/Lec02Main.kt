package com.lannstark.lec02

import java.lang.IllegalArgumentException


fun main(){

    /*
    1. 코틀린에서 null 체크
     */
fun startsWithA1(str: String?): Boolean{

   return str?.startsWith("A")
    ?:throw IllegalArgumentException("null이 들어왔습니다.")

//    if(str==null){
//        throw IllegalArgumentException("null이 들어왔습니다.")
//    }
//    return str.startsWith("A")
}

fun startsWithA2(str:String?): Boolean?{

    return str?.startsWith("A")
//    if(str == null){
//        return null
//    }
//    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean{

    return str?.startsWith("A")?: false

//    if(str == null){
//        return false
//    }
//    return str.startsWith("A")
}
/*
2. Safe Call과 Elvis 연산자
safe call: null이 아닌 경우에만 호출, ?., 값이 null이면 null 반환
Elvis 연산자 : null인 경우에만 호출  ?:
 */
    val str: String? = "ABC"
//    str.length // 불가능
    str?.length // 가능
    println( str?.length ?:0)

}

/*
3. 널 아님 단언!!
 */
// null이 절대 아닐 때 사용할 수 있는 널 아님 단언(!!)
fun startsWith(str:String?): Boolean{
    return str!!.startsWith("A")
}

/*
4. 플랫폼 타입: 코틀린이 null 관련 정보를 알 수 없는 타입 Runtime 시 예외 발생할 수 있다.
 */

fun main2(){
    val person =  Person("공부하는 개발자")
   startWithA(person.name)
}


fun startWithA(str: String): Boolean{
    return str.startsWith("A")
}

