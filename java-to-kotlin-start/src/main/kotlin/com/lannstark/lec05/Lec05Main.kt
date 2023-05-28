package com.lannstark.lec05

import java.lang.IllegalArgumentException

fun validateScoreIsNotNegative(score : Int){
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
            in 9..10 -> "A"
            in 8..9 -> "B"
            in 7..8 -> "C"
            else -> "D"
        }
    }

    fun startsWith(obj:Any) :Boolean{
        return when(obj){
            is String -> obj.startsWith("A")
            else -> false
        }
    }

    fun judgeNumber(number: Int) {
        when (number) {
            1, 0, -1 -> println("익숙한 숫자")
            else -> println("1, 0, -1이 아닙니다.")
        }
    }

    fun judgeNumber2(number: Int) {
        when {
            number == 0 -> println("짝수")
            number % 2 == 0 -> println("짝수")
            else -> println("홀수")
        }
    }


}