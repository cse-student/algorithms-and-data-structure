package unittests

import datastructure.custom.BinaryTree

class Constants {
    companion object {
        fun binaryTree1(): BinaryTree{
            var binaryTree = BinaryTree(1)
            binaryTree.add(2)
            return binaryTree
        }

        fun binaryTree2(): BinaryTree{
            var binaryTree = BinaryTree(1)
            binaryTree.add(2)
            binaryTree.add(3)
            return binaryTree
        }

        fun binaryTree3(): BinaryTree{
            var binaryTree = BinaryTree(1)
            binaryTree.add(-10)
            binaryTree.add(11)
            binaryTree.add(5)
            binaryTree.add(3)
            binaryTree.add(16)
            binaryTree.add(13)
            return binaryTree
        }

        fun binaryTree4(): BinaryTree{
            var binaryTree = BinaryTree(5)
            binaryTree.add(3)
            binaryTree.add(9)
            binaryTree.add(1)
            binaryTree.add(4)
            binaryTree.add(7)
            binaryTree.add(10)
            return binaryTree
        }

        fun binaryTree5(): BinaryTree{
            var binaryTree = BinaryTree(15)
            binaryTree.add(12)
            binaryTree.add(25)
            binaryTree.add(7)
            binaryTree.add(13)
            binaryTree.add(17)
            binaryTree.add(30)
            binaryTree.add(5)
            binaryTree.add(9)
            binaryTree.add(16)
            binaryTree.add(27)
            binaryTree.add(32)
            return binaryTree
        }
    }

}