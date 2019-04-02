package unittests.treetraversals

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import unittests.treetraversals.constants.Constants

class BinaryTreeTest{
    @Test
    fun binaryTree1Creation(){
        var binaryTree = Constants.binaryTree1()
        //Level 1
        assertEquals(1, binaryTree.self)
        assertEquals(2, binaryTree.rightNode!!.self)
    }

    @Test
    fun binaryTree2Creation(){
        var binaryTree = Constants.binaryTree2()
        assertEquals(1, binaryTree.self)
        //Level 1
        assertEquals(2, binaryTree.rightNode!!.self)
        assertEquals(3, binaryTree.rightNode!!.rightNode!!.self)
    }

    @Test
    fun binaryTree3Creation(){
        var binaryTree = Constants.binaryTree3()
        assertEquals(2, binaryTree.self)
        //Level 1
        assertEquals(1, binaryTree.leftNode!!.self)
        assertEquals(3, binaryTree.rightNode!!.self)
    }

    @Test
    fun binaryTree4Creation(){
        var binaryTree = Constants.binaryTree4()
        assertEquals(5, binaryTree.self)
        //Level 1
        assertEquals(3, binaryTree.leftNode!!.self)
        assertEquals(7, binaryTree.rightNode!!.self)
        //Level 2
        assertEquals(10, binaryTree.rightNode!!.rightNode!!.self)
    }

    @Test
    fun binaryTree5Creation(){
        var binaryTree = Constants.binaryTree5()
        assertEquals(1, binaryTree.self)
        //Level 1
        assertEquals(-10, binaryTree.leftNode!!.self)
        assertEquals(11, binaryTree.rightNode!!.self)
        //Level 2
        assertEquals(5, binaryTree.rightNode!!.leftNode!!.self)
        assertEquals(16, binaryTree.rightNode!!.rightNode!!.self)
        //Level 3
        assertEquals(3, binaryTree.rightNode!!.leftNode!!.leftNode!!.self)
        assertEquals(13, binaryTree.rightNode!!.rightNode!!.leftNode!!.self)
    }

    @Test
    fun binaryTree6Creation(){
        var binaryTree = Constants.binaryTree6()
        assertEquals(5, binaryTree.self)
        //Level 1
        assertEquals(3, binaryTree.leftNode!!.self)
        assertEquals(9, binaryTree.rightNode!!.self)
        //region Level 2
        //Left node
        assertEquals(1, binaryTree.leftNode!!.leftNode!!.self)
        assertEquals(4, binaryTree.leftNode!!.rightNode!!.self)
        //right node
        assertEquals(7, binaryTree.rightNode!!.leftNode!!.self)
        assertEquals(10, binaryTree.rightNode!!.rightNode!!.self)
        //endregion
    }

    @Test
    fun binaryTree7Creation(){
        var binaryTree = Constants.binaryTree7()
        assertEquals(15, binaryTree.self)
        //Level 1
        assertEquals(12, binaryTree.leftNode!!.self)
        assertEquals(25, binaryTree.rightNode!!.self)
        //Level 2
        //Left side
        assertEquals(7, binaryTree.leftNode!!.leftNode!!.self)
        assertEquals(13, binaryTree.leftNode!!.rightNode!!.self)
        //Right side
        assertEquals(17, binaryTree.rightNode!!.leftNode!!.self)
        assertEquals(30, binaryTree.rightNode!!.rightNode!!.self)
        //Level 3
        //Left side
        assertEquals(5, binaryTree.leftNode!!.leftNode!!.leftNode!!.self)
        assertEquals(9, binaryTree.leftNode!!.leftNode!!.rightNode!!.self)
        //Right side
        assertEquals(16, binaryTree.rightNode!!.leftNode!!.leftNode!!.self)
        assertEquals(27, binaryTree.rightNode!!.rightNode!!.leftNode!!.self)
        assertEquals(32, binaryTree.rightNode!!.rightNode!!.rightNode!!.self)
    }
}