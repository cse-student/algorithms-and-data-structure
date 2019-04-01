package unittests.treetraversals

import algorithms.treetraversal.PreOrderTraversalIterative
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PreOrderTraversalIterativeTest {
    var preOrderTraversal = PreOrderTraversalIterative

    @Test
    fun binaryTree1PreOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree1()
        //Act
        var result = preOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(1,2)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree2PreOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree2()
        //Act
        var result = preOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(1,2,3)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree3PreOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree3()
        //Act
        var result = preOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(2,1,3)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree4PreOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree4()
        //Act
        var result = preOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(5,3,7,10)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree5PreOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree5()
        //Act
        var result = preOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(1,-10,11,5,3,16,13)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree6PreOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree6()
        //Act
        var result = preOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(5,3,1,4,9,7,10)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree7PreOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree7()
        //Act
        var result = preOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(15,12,7,5,9,13,25,17,16,30,27,32)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }
}