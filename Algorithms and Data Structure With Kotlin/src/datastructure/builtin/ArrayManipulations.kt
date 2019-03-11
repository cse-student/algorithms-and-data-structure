package datastructure.builtin

import java.util.*

data class ArrayManipulations(var stringArray:Array<String>?,
                         var intArray: Array<Int>?,
                         var objectsArray: Array<Objects>?,
                         var anyArray: Array<Any>?){
    //region Constructor
    constructor(): this(stringArray= null, intArray = null, objectsArray = null, anyArray = null)
    //endregion

    //region Init methods
    init{
        initStringArray()
        initIntArray()
    }

    private fun initStringArray(){
        stringArray = arrayOf("C", "Python", "Java", "C#", "C++", "nodejs", "Kotlin")
    }

    private fun initIntArray(){
        intArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    }
    //endregion

    //region Print Arrays
    fun printStringArray(){
        for(string in stringArray!!){
            println(string)
        }
    }

    //region Equals override
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ArrayManipulations

        try{
        if (stringArray != null) {
            if (other.stringArray == null) return false
            if (other.stringArray!!.count() != stringArray!!.count()) return false
            for(string in stringArray!!){
                if (!other.stringArray!!.contains(string)){
                    return false
                }
            }
        }

        if (intArray != null) {
            if (other.intArray == null) return false
            if (other.intArray!!.count() != intArray!!.count()) return false
            for(int in intArray!!){
                if (!other.intArray!!.contains(int)){
                    return false
                }
            }
        }

        if (objectsArray != null) {
            if (other.objectsArray == null) return false
            if (other.objectsArray!!.count() != objectsArray!!.count()) return false
            for(obj in objectsArray!!){
                if (!other.objectsArray!!.contains(obj)){
                    return false
                }
            }
        }

        if (anyArray != null) {
            if (other.anyArray == null) return false
            if (other.anyArray!!.count() != anyArray!!.count()) return false
            for (any in anyArray!!) {
                if (!other.anyArray!!.contains(any)) {
                    return false
                }
            }
        }
        return true
        }
        catch (exception: Exception){
            println("Exception message: ${exception.message}")
            println("Exception cause: ${exception.cause}")
            return false
        }
    }
    //endregion

    override fun hashCode(): Int {
        var result = stringArray?.contentHashCode() ?: 0
        result = 31 * result + (intArray?.contentHashCode() ?: 0)
        result = 31 * result + (objectsArray?.contentHashCode() ?: 0)
        result = 31 * result + (anyArray?.contentHashCode() ?: 0)
        return result
    }

    //endregion
}