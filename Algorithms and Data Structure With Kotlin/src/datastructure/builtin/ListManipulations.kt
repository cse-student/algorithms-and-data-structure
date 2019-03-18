package datastructure.builtin

import java.util.*

class ListManipulations {
    companion object {
        private var stringList: List<String> = initStringList()
        private var intList: List<Int> = initIntList()
        lateinit var objectList: List<Objects>
        private var mutableStringList: MutableList<String> = initMutableStringList()
        private var mutableIntList: MutableList<Int> = initMutableIntList()
        lateinit var mutableObjectList: MutableList<Objects>

        //region init methods
        private fun initIntList(): List<Int>{
            var result = listOf(1, 2, 3, 4, 5)
            return result
        }
        private fun initStringList(): List<String>{
            var result  = listOf("Python", "Java", "nodejs", "Kotlin")
            return result
        }

        private fun initMutableStringList(): MutableList<String>{
            var result = mutableListOf<String>()
            result.add("C")
            result.add("C++")
            result.add("C#")
            return result
        }

        private fun initMutableIntList(): MutableList<Int>{
            var result = mutableListOf<Int>()
            for(i in 0..5){
                result.add(i)
            }
            return result
        }
        //endregion

        //region print methods
        fun printStringList(){
            println(stringList)
            for (i in this.stringList!!){
                println(i)
            }
        }

        fun printIntList(){
            println(intList)
            for(i in intList!!){
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
        //endregion
    }
}