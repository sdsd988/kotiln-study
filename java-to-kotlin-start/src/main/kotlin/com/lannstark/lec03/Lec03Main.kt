package com.lannstark.lec03

fun main(){
    /*
    1. 기본 타입 : 암시적 변경안됨, to변환타입
     */

    val number1:Int? =3
    val number2: Long = number1?.toLong() ?: 0L

    /*
    2. 타입 캐스팅, is,!is, as, as?
     */
    printAgeIfPerson(Person("",100))

    /*
    3. 코틀린의 특이한 타입 3가지 - Any(Java의 오브젝트), Unit(void), Nothing
     */

    /*
    4. String interpolation / String indexing
     */
    val person = Person("정상윤",100)
//    System.out.println(String.format("이름  : %s",person.name))
    println("이름: ${person.name}")
    val name = "정상윤"
    println("이름 : $name")

    
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