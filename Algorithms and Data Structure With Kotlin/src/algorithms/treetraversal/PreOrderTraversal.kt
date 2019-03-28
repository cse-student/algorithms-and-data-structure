package algorithms.treetraversal

import algorithms.treetraversal.interfaces.ITreeTraversalRecursive
import datastructure.custom.ITree
//Root - Left Node - Right Node
class PreOrderTraversal {
    companion object: ITreeTraversalRecursive {
        override fun read(tree: ITree, list: MutableList<Int>): MutableList<Int> {
            var lst = list
            lst!!.add(tree.self)
            if (tree.leftNode != null){
                PreOrderTraversal.read(tree.leftNode!!, lst)
            }
            if (tree.rightNode != null){
                PreOrderTraversal.read(tree.rightNode!!, lst)
            }
            return lst
        }
    }
}