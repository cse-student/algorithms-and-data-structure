import datastructure.builtin.ArrayManipulations
import datastructure.builtin.ListManipulations
import datastructure.builtin.MapManipulations
import datastructure.builtin.SetManipulations

fun main(string: Array<String>){

    //region Array manipulations
    println("##### Array Manipulations #####")
    ArrayManipulations.printStringArray()
    ArrayManipulations.printIntArray()
    ArrayManipulations.printAnyArray()
    //endregion

    //region List manipulations
    println("##### List Manipulations #####")
    ListManipulations.printStringList()
    ListManipulations.printIntList()
    ListManipulations.printAnyList()
    ListManipulations.printMutableStringList()
    ListManipulations.printMutableIntList()
    ListManipulations.printSortedIntList()
    //endregion

    //region Set Manipulations
    SetManipulations.manipulateSets()
    //endregion

    //region Map Manipulations
    MapManipulations.manipulatingMaps()
    //endregion
}