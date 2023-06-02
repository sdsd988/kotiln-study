package com.lannstark.lec08


fun main(){
    repeat("Hello World",3,true)

    repeat("Hello World")

    repeat("Hello World", useNewLine = false)

    printNameAndGender(name = "정상윤", gender = "MALE")

    printAll("A","B","C")

    val array = arrayOf("A","B","C")
    printAll(*array)

}

/*
1. 함수 선언 문법  - 접근 지시자 public 생략 가능, fun 함수 선언
 */
fun max(a:Int, b:Int) = if(a>b) a else b

/*
2. default parameter
 */

fun repeat(str: String, num: Int=3, useNewLine:Boolean = true){
    for(i in 1..num){
        if(useNewLine){
            println()
        } else{
            println(str)
        }
    }
}

/*
3. named argument, builder를 직접 만들지 않고 builder의 장점을 가지게 된다
  builder 패턴을 쓰는 이유 어떤 객체를 인스턴스화 할 때, 명확하게 만들 수 있다.
  Kotlin 에서 Java 함수 쓰는 경우 사용 불가
 */

fun printNameAndGender(name: String, gender:String){
    println(name)
    println(gender)
}

/*
 4. 같은 타입의 여러 파라미터 받기(가변인자) ...
 */


fun printAll(vararg strings: String){
    for(str in strings){
        println(str)
    }
}