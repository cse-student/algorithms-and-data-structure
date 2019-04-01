package unittests.treetraversals

import algorithms.treetraversal.InOrderTraversal
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InOrderTraversalTest{
    var inOrderTraversal = InOrderTraversal
    @Test
    fun binaryTree1InOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree1()
        //Act
        var result = inOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(1,2)
        //Assert
        assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree2InOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree2()
        //Act
        var result = inOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(1,2,3)
        //Assert
        assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree3InOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree3()
        //Act
        var result = inOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(1,2,3)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree4InOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree4()
        //Act
        var result = inOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(3,5,7,10)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }
    @Test
    fun binaryTree5InOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree5()
        //Act
        var result = inOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(-10,1,3,5,11,13,16)
        //Assert
        assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree6InOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree6()
        //Act
        var result = inOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(1,3,4,5,7,9,10)
        //Assert
        assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree7InOrderTraversal(){
        //Arrange
        var binaryTree = Constants.binaryTree7()
        //Act
        var result = inOrderTraversal.read(binaryTree)
        var expectedResult = mutableListOf(5,7,9,12,13,15,16,17,25,27,30,32)
        //Assert
        assertEquals(expectedResult, result)
    }
}