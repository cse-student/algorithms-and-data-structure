package algorithms.treetraversal

import datastructure.custom.ITree

class PreOrderTraversal {
    companion object: ITreeTraversal{
        override fun read(tree: ITree, list: MutableList<Int>?): MutableList<Int> {
            var lst = list
            lst!!.add(tree.self)
            if (lst == null){
                lst = mutableListOf()
            }
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