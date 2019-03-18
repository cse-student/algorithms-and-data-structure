import datastructure.builtin.ArrayManipulations
import datastructure.builtin.ListManipulations

fun main(string: Array<String>){

    //region Array manipulations
    println("##### Array Manipulations #####")
    ArrayManipulations.printStringArray()
    ArrayManipulations.printIntArray()
    //endregion

    //region List manipulations
    println("##### List Manipulations #####")
    ListManipulations.printStringList()
    ListManipulations.printIntList()
    ListManipulations.printMutableStringList()
    ListManipulations.printMutableIntList()
    //endregion
}