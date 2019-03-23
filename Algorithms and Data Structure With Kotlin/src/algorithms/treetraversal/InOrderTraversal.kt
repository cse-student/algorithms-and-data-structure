package algorithms.treetraversal

import datastructure.custom.BinaryTree

class InOrderTraversal{
    companion object {
        fun printTree(tree: BinaryTree){
            var list = buildList(tree)
            println(list)
        }

        fun buildList(tree: BinaryTree, list: MutableList<Int>? = null): MutableList<Int>{
            var lst = list
            if (lst == null){
                lst = mutableListOf()
            }
            if (tree.leftNode != null){
                buildList(tree.leftNode!!, lst)
            }
            lst!!.add(tree.self)
            if (tree.rightNode != null){
                buildList(tree.rightNode!!, lst)
            }
            return lst
        }
    }
}