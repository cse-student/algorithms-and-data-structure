package algorithms.treetraversal

import datastructure.custom.BinaryTree

class InOrderTraversal{
    companion object {
        fun printTree(tree: BinaryTree){
            if (tree.leftNode != null){
                printTree(tree.leftNode!!)
            }
            print(tree.self)
            if (tree.rightNode != null){
                printTree(tree.rightNode!!)
            }
        }
    }
}