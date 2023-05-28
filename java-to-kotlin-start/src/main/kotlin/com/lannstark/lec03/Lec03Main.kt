package com.lannstark.lec03

fun main(){
    val number1:Int? =3
    val number2: Long = number1?.toLong() ?: 0L

    printAgeIfPerson(Person("",100))

    val person = Person("정상윤",100)
    println("이름: ${person.name}")
    val name = "정상윤"
    val str = """
      ABC
      EFG
      ${name}
    """.trimIndent()

    println(str)

    val str2 = "ABC"

    println(str2[0])


}

//스마트 캐스트
fun printAgeIfPerson(obj: Any?){
    val person = obj as? Person
    println(person?.age)
}