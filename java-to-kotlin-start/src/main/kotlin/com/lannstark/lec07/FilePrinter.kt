package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader


/*
  2. Checked Exception & UnChecked Exception
     Kotlin 에서는 Checked Exception & UnChecked Exception 을 구분하지 않는다. 모두 언체크 예외 처리.
 */
class FilePrinter {

    fun readFile(){
        val currentFile = File(".")
        val file = File(currentFile.absolutePath+"/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }
}