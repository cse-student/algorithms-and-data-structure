import datastructure.builtin.ArrayManipulations
import datastructure.builtin.ListManipulations
import datastructure.builtin.MapManipulations
import datastructure.builtin.SetManipulations
import datastructure.custom.LinkedList

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

    //region Linked List
    println("##### Custom Linked List #####")
    var linkedList = LinkedList(1)
    for(i in 2..5){
        linkedList.add(i)
    }
    println(linkedList)
    linkedList.print()
    //endregion
}