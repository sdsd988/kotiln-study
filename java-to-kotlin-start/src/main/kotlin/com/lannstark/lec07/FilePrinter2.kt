package com.lannstark.lec07

import java.io.BufferedReader
import java.io.FileReader

/*
    3. try with resources
    코틀린에서는 새로운 함수를 활용해서 구현 (use라는 inline 함수)
 */
class FilePrinter2 {

    fun readFile(path:String){
        BufferedReader(FileReader(path)).use{reader ->
            println(reader.readLine())
        }
    }
}