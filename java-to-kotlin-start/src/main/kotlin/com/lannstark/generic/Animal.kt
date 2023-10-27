package com.lannstark.generic

import kotlin.io.path.fileVisitor

abstract class Animal(
    val name: String
)


    abstract class Fish(
        name: String,
        private val size: Int,) : Animal(name),Comparable<Fish>{
        override fun compareTo(other: Fish): Int {
            return this.size.compareTo(other.size)
        }
    }


    class GoldFish(name: String, size: Int) :
        Fish(name,size)
    //
    class Carp(name: String,size: Int) : Fish(name,size)
