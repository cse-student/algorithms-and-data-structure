package unittests.treetraversals

import algorithms.treetraversal.PostOrderTraversalIterative
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import unittests.treetraversals.constants.Constants

class PostOrderTraversalIterativeTest {
    var postOrderTraversal = PostOrderTraversalIterative
    @Test
    fun binaryTree1PostOrderTraversal() {
        //Arrange
        var binaryTree = Constants.binaryTree1()
        //Act
        var result = postOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(2,1)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree2PostOrderTraversal() {
        //Arrange
        var binaryTree = Constants.binaryTree2()
        //Act
        var result = postOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(3,2,1)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree3PostOrderTraversal() {
        //Arrange
        var binaryTree = Constants.binaryTree3()
        //Act
        var result = postOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(1,3,2)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree4PostOrderTraversal() {
        //Arrange
        var binaryTree = Constants.binaryTree4()
        //Act
        var result = postOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(3,10,7,5)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree5PostOrderTraversal() {
        //Arrange
        var binaryTree = Constants.binaryTree5()
        //Act
        var result = postOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(-10,3,5,13,16,11,1)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree6PostOrderTraversal() {
        //Arrange
        var binaryTree = Constants.binaryTree6()
        //Act
        var result = postOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(1,4,3,7,10,9,5)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree7PostOrderTraversal() {
        //Arrange
        var binaryTree = Constants.binaryTree7()
        //Act
        var result = postOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(5,9,7,13,12,16,17,27,32,30,25,15)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }
}