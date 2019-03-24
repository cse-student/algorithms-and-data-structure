package algorithms.treetraversal

import datastructure.custom.ITree

interface ITreeTraversal{
    fun print(tree: ITree){
        var list = this.read(tree)
        println(list)
    }

    fun read(tree: ITree, list: MutableList<Int>? = null): MutableList<Int>
}