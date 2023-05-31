package com.lannstark.lec05

import java.lang.IllegalArgumentException
/*
 1. if문
 코틀린은 뒤에 타입을 정의, 함수에서 Unit(void) 생략, 함수를 만들 떄 fun을 사용, 예외처리 할 떄 new 사용 안함

 2. Expression & Statement
 Statement : 프로그램의 문장, 하나의 값으로 도출되지 않는다.
 Expression : 하나의 값으로 도출되는 문장
 kotlin에서는 if-else를 expression으로 사용할 수 있기 때문에 3항 연산자가 없음
 */

fun validateScoreIsNotNegative1(score: Int){
    if(score<0){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}
fun validateScoreIsNotNegative2(score : Int){
    if(score !in 0..100){
        throw IllegalArgumentException("score의 범위는 0부터 100입니다.")
    }
}

fun getPassOrFail(score: Int): String{
    return if (score >= 50){
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int) : String{
    return if(score>=90){
        "A"
    } else if(score >=80){
        "B"
    } else if(score >= 70){
        "C"
    } else {
        "D"
    }

    /*
    3. Switch & When
        is(InstanceOf)도 조건으로 가능
     */

fun getGradeWithSwitch(score: Int): String{
    return when(score/10){
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

    fun getGradeWithSwitch2(score: Int): String{
        return when(score){
            in 90..99 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            else -> "D"
        }
    }

    fun startsWith(obj:Any) :Boolean{
        return when(obj){
            //스마트 캐스팅, is String 통해서 String임을 확인했으므로 바로 startsWith 사용 가능.
            is String -> obj.startsWith("A")
            else -> false
        }
    }

    fun judgeNumber(number: Int) {
        when (number) {
            //Or 조건을 아래와 같이 사용 가능
            1, 0, -1 -> println("익숙한 숫자")
            else -> println("1, 0, -1이 아닙니다.")
        }
    }

    fun judgeNumber2(number: Int) {
        when {
            // When 조건을 넣지 않는 경우도 가능
            number == 0 -> println("주어진 숫자는 0 입니다.")
            number % 2 == 0 -> println("짝수")
            else -> println("홀수")
        }
    }


}