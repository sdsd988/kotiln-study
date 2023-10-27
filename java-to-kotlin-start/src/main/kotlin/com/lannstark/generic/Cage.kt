package com.lannstark.generic



//fun main(){
//
//    val cage = Cage()
//    cage.put(GoldFish("금붕어",100))
//    val carp: Carp = cage.getFirst() as Carp
//
//
//    val goldFishCage = Cage2<GoldFish>()
//    goldFishCage.put(GoldFish("금붕어",100))
//
//    val fishCage = Cage2<Fish>()
//    fishCage.moveFrom(goldFishCage)
//
//
//    val fishCage2 = Cage3<Fish>()
//    val animalCage: Cage3<Animal> = fishCage2
//
//    val cage5 = Cage2(mutableListOf(Eagle(),Sparrow()))
//    cage5.printAfterSorting()
//}
//
//
//
//class Cage {
//
//    private val animals: MutableList<Animal> = mutableListOf()
//
//    fun getFirst(): Animal{
//        return animals.first()
//    }
//
//    fun put(animal: Animal) {
//        this.animals.add(animal)
//    }
//
//    fun moveFrom(cage: Cage) {
//        this.animals.addAll(cage.animals)
//    }
//}
//abstract class Bird(
//    name: String,
//    private val size: Int,
//) : Animal(name), Comparable<Bird>{
//    override fun compareTo(other: Bird): Int {
//        return this.size.compareTo(other.size)
//    }
//}
//
//class Sparrow: Bird("참새",100)
//class Eagle: Bird("독수리",500)
//
//class Cage2<T>(
//    private val animals: MutableList<T> = mutableListOf()
//) where T: Animal, T: Comparable<T> {
//
//    fun printAfterSorting(){
//        this.animals.sorted()
//            .map { it.name }
//            .let{ println(it) }
//    }
//    fun getFirst(): T{
//        return animals.first()
//    }
//
//    fun put(animal: T) {
//        this.animals.add(animal)
//    }
//    //타입 파라미터에 변성을 줄 수 있다.. 무공변한 제너릭 클래스 파라미터를 공변하게..
//    // out은 생산자 역할만 한다. 타입안전성떄문에.
//    fun moveFrom(otherCage: Cage2<out T>) {
//        this.animals.addAll(otherCage.animals)
//    }
//
//    // in (함수 파라미터 입장에서의) 소비자, 반공변
//    // Java 와일드 카드..
//    fun moveTo(otherCage: Cage2<in T>) {
//        otherCage.animals.addAll(this.animals)
//    }
//}
//
//class Cage3<out T>{
//    private val animals: MutableList<T> = mutableListOf()
//
//    fun getFirst(): T{
//        return this.animals.first()
//    }
//
//    fun getAll(): List<T> {
//        return this.animals
//    }
//}
//
//fun <T> List<T>.hasIntersection(other: List<T>): Boolean{
//    return (this.toSet() intersect other.toSet()).isEmpty()
//}