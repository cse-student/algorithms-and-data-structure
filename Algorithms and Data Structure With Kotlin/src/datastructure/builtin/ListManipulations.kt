package datastructure.builtin

import dataclass.Laptop
import dataclass.Vehicle
import java.util.*

class ListManipulations {
    companion object {
        private var stringList: List<String> = initStringList()
        private var intList: List<Int> = initIntList()
        private var anyList: List<Any> = initAnyList()
        private var mutableStringList: MutableList<String> = initMutableStringList()
        private var mutableIntList: MutableList<Int> = initMutableIntList()

        //region init methods
        private fun initIntList(): List<Int>{
            return listOf(1,2,3,4,5)
        }
        private fun initStringList(): List<String>{
            return listOf("Python", "Java", "nodejs", "Kotlin")
        }

        private fun initAnyList(): List<Any>{
            val laptop1 = Laptop("i7", "Rtx-2080", "64GB")
            val laptop2 = Laptop("i5", "Gtx-1080", "64GB")
            val car = Vehicle("Car", Locale.UK)
            car.price = 250000.00
            return listOf(laptop1, laptop2, car)
        }
        private fun initMutableStringList(): MutableList<String>{
            val result = mutableListOf<String>()
            result.add("C")
            result.add("C++")
            result.add("C#")
            return result
        }

        private fun initMutableIntList(): MutableList<Int>{
            val result = mutableListOf(12, 3, 16, 22, 3, 8, 17, 10, 18, 0)
            for(i in 0..5){
                result.add(i)
            }
            result.removeAt(result.count()-1)
            result.remove(0)
            return result
        }
        //endregion

        //region print methods
        fun printStringList(){
            println(stringList)
            for (i in this.stringList){
                println(i)
            }
        }

        fun printIntList(){
            println(intList)
            for(i in intList){
                println(i)
            }
        }

        fun printAnyList(){
            println(anyList)
            for(i in anyList){
                println(i)
            }
        }

        fun printMutableStringList(){
            println(mutableStringList)
            for (i in mutableStringList){
                println(i)
            }
        }

        fun printMutableIntList(){
            println(mutableIntList)
            for(i in mutableIntList){
                println(i)
            }
        }

        fun printSortedIntList(){
            mutableIntList.sort()
            println(mutableIntList)
        }
        //endregion
    }
}