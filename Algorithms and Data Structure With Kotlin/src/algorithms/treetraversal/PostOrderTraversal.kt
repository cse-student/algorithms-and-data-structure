package algorithms.treetraversal

import algorithms.treetraversal.interfaces.ITreeTraversalRecursive
import datastructure.custom.ITree
//Left Node - Right Node - Root
class PostOrderTraversal{
    companion object: ITreeTraversalRecursive {
        override fun read(tree: ITree, list: MutableList<Int>): MutableList<Int>{
            val lst = list
            if (tree.leftNode != null){
                read(tree.leftNode!!, lst)
            }
            if (tree.rightNode != null){
                read(tree.rightNode!!, lst)
            }
            lst.add(tree.self)
            return lst
        }
    }
}