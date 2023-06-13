package com.lannstark.lec14

fun main(){
    val dto1 = PersonDto("정상윤",100)
    val dto2 = PersonDto("정상윤",100)
    println(dto1 == dto2)
    println(dto1)
}

//data 키워드를 붙여주면 equals, hashcode, toString 자동으로 생성
data class PersonDto(
    val name: String,
    val age: Int,
)

enum class Country(
    private val code: String
){
    KOREA("KO"),
    AMERICA("US")
}

fun handleCountry(country: Country){
    when(country){
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

