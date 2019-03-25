package algorithms.treetraversal.interfaces

import datastructure.custom.ITree

interface ITreeTraversalRecursive: ITreeTraversal{
    fun read(tree: ITree, list: MutableList<Int>): MutableList<Int>

    override fun read(tree: ITree): MutableList<Int> {
        var lst = mutableListOf<Int>()
        return this.read(tree, lst)
    }

}