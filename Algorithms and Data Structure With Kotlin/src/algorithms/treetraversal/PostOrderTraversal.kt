package algorithms.treetraversal

import datastructure.custom.ITree

class PostOrderTraversal{
    companion object: ITreeTraversal{
        override fun read(tree: ITree, list: MutableList<Int>?): MutableList<Int>{
            var lst = list
            if (lst == null){
                lst = mutableListOf()
            }
            if (tree.leftNode != null){
                read(tree.leftNode!!, lst)
            }
            if (tree.rightNode != null){
                read(tree.rightNode!!, lst)
            }
            lst!!.add(tree.self)
            return lst
        }
    }
}