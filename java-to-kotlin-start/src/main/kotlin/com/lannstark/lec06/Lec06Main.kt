fun main(){

    /*
    1. for each 문
        컬렉션을 만드는 방법
        : 대신 in을 사용
        Java와 동일하게 Iterable 구현된 타입이라면 모두 들어갈 수 있다.
     */

    val numbers = listOf(1L,2L,3L)
    for (number in numbers) {
        println(number)
    }

    /*
    2.  전통적인 for, Progression & Range
        코틀린에서 전통적인 for 문은 등차 수열을 사용
     */

    for(i in 1..3){
        println(i)
    }

    for (i in 3 downTo 1){
        println(i)
    }

    for (i in 1..5 step 2){
        println(i)
    }

    /*
    3. while
     */



}