package com.lannstark.delegate

import kotlin.concurrent.thread
import kotlin.reflect.KProperty

/**
 * 인스턴스화 시점과 변수 초기화 시점을 분리하는 것
 * lateinit은 객체의 인스턴스화 시점과
 * 변수의 초기화 시점을 분리하고 싶을 떄 사용한다.
 * 초기값을 지정하지 않고, null이 들어갈 수 없는 변수를 선언
 *
 * 지연 초기화
 * 파일을 읽어와야 하거나, 네트워크 IO를 타야하는데, 그 필드는 사용될 수도 아닐 수도 있을 경우.
 *
 * lateinit과 by lazy의 차이
 */
fun main() {
    val p = Person4()
    println(p.name)
    println(p.name)


}

class Person(

) {

    lateinit var name: String

    val isKim: Boolean
        get() = this.name.startsWith("김")

    val maskingName: String
        get() = name[0] + (1 until name.length).joinToString("") { "*" }
}

/**
 * backingProperty : name과 대응되는, 외부로 드러나지 않는 프로퍼티
 * byLazy 사용
 */
class Person2 {
    //    private var _name: String? = null
//    val name: String
//        get(){
//            if(_name==null){
//                Thread.sleep(2_000L)
//                this._name = "김수한무"
//            }
//            return this._name!!
//        }
    val name: String by lazy {
        Thread.sleep(2_000)
        "김수한무"
    }
}

/**
 * 위임 패턴
 */
class Person3{
    private val delegateProperty = LazyInitProperty{
        Thread.sleep(2_000L)
        "김수한무"
    }

    val name: String
        get() = delegateProperty.value
}

class Person4{
    val name: String by LazyInitProperty {
        Thread.sleep(2_000L)
        "김수한무"
    }
}

class LazyInitProperty<T>(val init: () -> T){

    private var _value: T? = null
    val value: T
        get() {
            if (_value == null) {
                this._value = init()
            }
            return _value!!
        }

    operator fun getValue(thisRef: Any, property: KProperty<*>): T{
        println("getValue가 호출됨!")
        return value

    }

}

