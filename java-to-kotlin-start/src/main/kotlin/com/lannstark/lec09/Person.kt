package com.lannstark.lec09

import kotlin.IllegalArgumentException

/*
 1. 클래스와 프로퍼티
 프로퍼티 = 필드+getter+setter
 코틀린에서는 필드만 만들면 getter,setter 자동으로 만들어준다.
 constructor 생략 가능
 나머지도 생략 가능
 */
/*
 2. 생성자와 Init - Java는 생성자에서 검증가능
  Init : 코틀린에서 클래스가 초기화 되는 시점에 한 번 호출되는 블록
  생성자 추가
  주 생성자가 반드시 존재해야 한다!
  단, 주생성자에 파라미터가 하나도 없는 경우 생략 가능
  최종적으로 주생성자를 this로 호출해야 한다.
  body를 가질수 있다
  디폴트 파라미터 권장
 */
fun main() {
    val person = Person("정상윤", 100)
    println(person.name)
    person.age = 10
    println(person.age)


    val person2 = Person("정상윤")
}

class Person(
    name: String = "정상윤",
    var age: Int = 1
){

//    fun getUppercaseName(): String{
//        return this.name.uppercase()
//    }
//
//    val uppercaseName: String
//        get() = this.name.uppercase()
//
    var name = name
    set(value){
        field = value.uppercase()
    }

    init {
        if(age<=0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name:String): this(name,1){
        println("첫 번째 부생성자")
    }
    constructor(): this("홍길동"){
        println("두 번째 부생성자")
    }

    fun isAdult(): Boolean{
        return this.age >= 20
    }

    val isAdult: Boolean
        get() = this.age >= 20
}

/*
 3. 커스텀 getter, setter
  1. 함수 2. 프로퍼티
 */

