package algorithms.treetraversal

import algorithms.treetraversal.interfaces.ITreeTraversalIterative
import datastructure.custom.ITree
import java.util.*

class InOrderTraversalIterative {
    companion object : ITreeTraversalIterative {
        override fun read(tree: ITree): MutableList<Int> {
            var result = mutableListOf<Int>()
            var stack = add(tree)

            while (!stack.isEmpty()) {
                var currentNode = stack.pop()
                result.add(currentNode.self)
                if (currentNode.rightNode != null){
                    stack = add(currentNode.rightNode!!, stack)
                }
            }

            return result
        }

        private fun add(tree: ITree, stack: Stack<ITree>? = null): Stack<ITree>{
            var result = stack
            if (result == null) result = Stack()
            var currentNode = tree
            result.add(currentNode)
            while(currentNode.leftNode != null) {
                result.add(currentNode.leftNode)
                currentNode = currentNode.leftNode!!
            }
            return result
        }
    }
}