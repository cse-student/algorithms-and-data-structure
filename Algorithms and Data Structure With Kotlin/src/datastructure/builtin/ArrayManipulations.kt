package datastructure.builtin

import dataclass.Laptop
import dataclass.Vehicle
import java.util.*

class ArrayManipulations {

    companion object {
        private var stringArray: Array<String> = initStringArray()
        private var intArray: Array<Int> = initIntArray()
        private var anyArray: Array<Any> = initAnyArray()

        //region init methods
        private fun initStringArray(): Array<String> {
            return arrayOf("C", "Python", "Java", "C#", "C++", "nodejs", "Kotlin")
        }

        private fun initIntArray(): Array<Int> {
            return arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        }

        private fun initAnyArray(): Array<Any>{
            val laptop1 = Laptop("i7", "Rtx-2080", "64GB")
            val laptop2 = Laptop("i5", "Gtx-1080", "64GB")
            val car = Vehicle("Car", Locale.UK)
            car.price = 250000.00
            return arrayOf(laptop1, laptop2, car)
        }
        //endregion

        //region print methods
        fun printStringArray() {
            println(stringArray)
            for (string in stringArray) {
                println(string)
            }
        }

        fun printIntArray(){
            println(intArray)
            for (i in stringArray) {
                println(i)
            }
        }

        fun printAnyArray(){
            println(anyArray)
            for (i in anyArray) {
                println(i)
            }
        }
        //endregion
    }
}