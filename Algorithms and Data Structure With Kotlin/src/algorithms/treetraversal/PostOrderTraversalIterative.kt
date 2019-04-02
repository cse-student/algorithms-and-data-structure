package algorithms.treetraversal

import algorithms.treetraversal.interfaces.ITreeTraversalIterative
import datastructure.custom.ITree
import java.util.*

class PostOrderTraversalIterative{
    companion object: ITreeTraversalIterative {
        override fun read(tree: ITree): MutableList<Int> {
            val result = mutableListOf<Int>()
            var stack = add(tree)
            var tempNode:ITree? = null
            while (!stack.isEmpty()) {
                val currentNode = stack.peek()
                if (isLeaf(currentNode)){
                    result.add(currentNode.self)
                    tempNode = stack.pop()
                    continue
                }
                if (currentNode.rightNode != null && tempNode !== currentNode.rightNode){
                    stack = add(currentNode.rightNode!!, stack)
                }
                else{
                    tempNode = stack.pop()
                    result.add(currentNode.self)
                }
            }
            return result
        }

        private fun add(node: ITree, stack: Stack<ITree>? = null): Stack<ITree> {
            var result = stack
            if (result == null) result = Stack()
            var currentNode=  node
            result.add(currentNode)
            while(currentNode.leftNode != null){
                result.add(currentNode.leftNode)
                currentNode = currentNode.leftNode!!
            }
            return result
        }

        private fun isLeaf(node: ITree): Boolean{
            return node.leftNode == null && node.rightNode == null
        }



    }

}