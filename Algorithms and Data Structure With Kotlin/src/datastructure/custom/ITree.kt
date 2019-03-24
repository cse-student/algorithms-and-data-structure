package datastructure.custom

interface ITree {
    var self: Int
    var leftNode: BinaryTree?
    var rightNode: BinaryTree?

    fun add(num: Int)
}