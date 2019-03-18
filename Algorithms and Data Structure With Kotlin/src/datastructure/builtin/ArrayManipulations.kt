package datastructure.builtin

import java.util.*

class ArrayManipulations {

    companion object {
        var stringArray: Array<String> = initStringArray()
        var intArray: Array<Int> = initIntArray()
        lateinit var objectsArray: Array<Objects>

        //region init methods
        private fun initStringArray(): Array<String> {
            return arrayOf("C", "Python", "Java", "C#", "C++", "nodejs", "Kotlin")
        }

        private fun initIntArray(): Array<Int> {
            return arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        }
        //endregion

        //region print methods
        fun printStringArray() {
            println(stringArray)
            for (string in stringArray!!) {
                println(string)
            }
        }

        fun printIntArray(){
            println(intArray)
            for (i in stringArray!!) {
                println(i)
            }
        }


        //endregion
    }
}