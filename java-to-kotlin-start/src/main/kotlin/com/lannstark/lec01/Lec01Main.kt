package com.lannstark.lec01

fun main(){

    /*
     1. 변수 선언 키워드 - var, val 차이
     모든 변수는 불변으로 선언하고, 필요한 경우 가변으로 변경
     */
    var number1 : Long = 5
    println(number1)
    val number2 = 10L

    /*
    2. 코틀린에서의 primitive/ reference type
    타입을 명시적으로 작성하지 않아도, 타입이 추론됨
     */

    /*
    3. 코틀린에서의 nullable 변수
     */
    //코틀린은 기본적으로 모든 변수에 null 들어가지 않도록 설계, 만약 null 들어갈 수 있다면 "타입?" 사용
    var number3:Long? = 10L

    /*
    4. 코틀린에서 객체의 인스턴스화
    인스턴스 만들 떄, new 사용 안함
     */

    var person = Person("정상윤")


}