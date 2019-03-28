package unittests

import algorithms.treetraversal.PreOrderTraversal
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PreOrderTraversalTest {
    var preOrderTraversal = PreOrderTraversal

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
}