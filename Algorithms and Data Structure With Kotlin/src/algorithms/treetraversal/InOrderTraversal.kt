package algorithms.treetraversal

import algorithms.treetraversal.interfaces.ITreeTraversalRecursive
import datastructure.custom.ITree

class InOrderTraversal{
    companion object: ITreeTraversalRecursive {
        override fun read(tree: ITree, list: MutableList<Int>): MutableList<Int>{
            var lst = list
            if (tree.leftNode != null){
                read(tree.leftNode!!, lst)
            }
            lst!!.add(tree.self)
            if (tree.rightNode != null){
                read(tree.rightNode!!, lst)
            }
            return lst
        }
    }
}