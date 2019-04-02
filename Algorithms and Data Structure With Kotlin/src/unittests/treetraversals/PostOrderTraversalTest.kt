package unittests.treetraversals

import algorithms.treetraversal.PostOrderTraversal
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import unittests.treetraversals.constants.Constants

class PostOrderTraversalTest {
    private var postOrderTraversal = PostOrderTraversal
    @Test
    fun binaryTree1PostOrderTraversal() {
        //Arrange
        val binaryTree = Constants.binaryTree1()
        //Act
        val result = postOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(2,1)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree2PostOrderTraversal() {
        //Arrange
        val binaryTree = Constants.binaryTree2()
        //Act
        val result = postOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(3,2,1)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree3PostOrderTraversal() {
        //Arrange
        val binaryTree = Constants.binaryTree3()
        //Act
        val result = postOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(1,3,2)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree4PostOrderTraversal() {
        //Arrange
        val binaryTree = Constants.binaryTree4()
        //Act
        val result = postOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(3,10,7,5)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree5PostOrderTraversal() {
        //Arrange
        val binaryTree = Constants.binaryTree5()
        //Act
        val result = postOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(-10,3,5,13,16,11,1)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree6PostOrderTraversal() {
        //Arrange
        val binaryTree = Constants.binaryTree6()
        //Act
        val result = postOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(1,4,3,7,10,9,5)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree7PostOrderTraversal() {
        //Arrange
        val binaryTree = Constants.binaryTree7()
        //Act
        val result = postOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(5,9,7,13,12,16,17,27,32,30,25,15)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }
}