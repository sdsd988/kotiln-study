package com.lannstark.lec04
/*
코틀린에서 연산자를 다루는 방법
 */
fun main(){

    /*
    1. 단항 연산자 / 산술 연산자
    객체간의 비교 CompareTo
     */

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if(money1 >money2){
        println("Money1이 Money2보다 금액이 큽니다")
    }

    /*
    2. 비교 연산자와 동등성(두 객체의 값이 같은가), 동일성(메모리 주소가 같은가)
    Java에서는 동일성에 ==를 사용, 동등성에 equals
    Kotiln에서는 동일성 ===, 동등성에 ==를 호출, ==를 사용하면 간접적으로 equals 호출
     */

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println(money3 === money5)

    /*
    3. 논리 연산자와 코틀린에 있는 특이한 연산자

    -in / !in : 컬렉션이나 범위에 포함되어 있다, 포함되어 있지 않다.
    -a..b : a부터 b 까지의 범위 객체를 생성
    -a[i]
     */

    /*
    4. 연산자 오버로딩
     */

}