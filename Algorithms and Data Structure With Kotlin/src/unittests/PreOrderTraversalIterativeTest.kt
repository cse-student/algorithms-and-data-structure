package unittests

import algorithms.treetraversal.PreOrderTraversalIterative
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PreOrderTraversalIterativeTest {
    var preOrderTraversal = PreOrderTraversalIterative

    @Test
    fun binaryTree1InOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree1()
        //Act
        var result = preOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(1,2)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree2InOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree2()
        //Act
        var result = preOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(1,2,3)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree3InOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree3()
        //Act
        var result = preOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(2,1,3)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree4InOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree4()
        //Act
        var result = preOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(5,3,7,10)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree5InOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree5()
        //Act
        var result = preOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(1,-10,11,5,3,16,13)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree6InOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree6()
        //Act
        var result = preOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(5,3,1,4,9,7,10)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree7InOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree7()
        //Act
        var result = preOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(15,12,7,5,9,13,25,17,16,30,27,32)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }
}