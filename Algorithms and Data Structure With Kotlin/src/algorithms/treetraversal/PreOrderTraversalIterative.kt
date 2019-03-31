package algorithms.treetraversal

import algorithms.treetraversal.interfaces.ITreeTraversalIterative
import datastructure.custom.ITree
import java.util.*

class PreOrderTraversalIterative {
    companion object : ITreeTraversalIterative {
        override fun read(tree: ITree): MutableList<Int> {
            var result = mutableListOf<Int>()
            var stack = Stack<ITree>()
            stack.add(tree)
            while (!stack.isEmpty()) {
                var currentNode = stack.pop()
                result.add(currentNode.self)
                stack = add(currentNode, stack)
            }
            return result
        }

        private fun add(node: ITree, stack: Stack<ITree>): Stack<ITree> {
            var result = stack
            if (node.rightNode != null){
                result.add(node.rightNode)
            }
            if (node.leftNode != null){
                result.add(node.leftNode)
            }
            return result
        }
    }
}
