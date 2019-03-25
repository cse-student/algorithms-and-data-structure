package algorithms.treetraversal.interfaces

import datastructure.custom.ITree

interface ITreeTraversal {
    fun print(tree: ITree){
        var list = this.read(tree)
        println(list)
    }

    fun read(tree: ITree): MutableList<Int>
}