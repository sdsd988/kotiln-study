
import kotlin.NumberFormatException

/*
   1. try catch finally 구문
   코틀린에서는 타입이 뒤에 온다. new 사용 하지않음, 포맷팅 간결
   기본 타입간의 형변환은 toType()을 사용
 */

fun parseIntOrThrowV1(str: String) :Int{
    try {
        return str.toInt();
    } catch (e:NumberFormatException){
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

fun parseIntOrThrowV2(str: String) : Int?{
    return try {
        str.toInt()
    } catch (e: NumberFormatException){
        null
    }
}



