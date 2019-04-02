package unittests.treetraversals

import algorithms.treetraversal.InOrderTraversal
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import unittests.treetraversals.constants.Constants

class InOrderTraversalTest{
    private var inOrderTraversal = InOrderTraversal
    @Test
    fun binaryTree1InOrderTraversal(){
        //Arrange
        val binaryTree = Constants.binaryTree1()
        //Act
        val result = inOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(1,2)
        //Assert
        assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree2InOrderTraversal(){
        //Arrange
        val binaryTree = Constants.binaryTree2()
        //Act
        val result = inOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(1,2,3)
        //Assert
        assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree3InOrderTraversal(){
        //Arrange
        val binaryTree = Constants.binaryTree3()
        //Act
        val result = inOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(1,2,3)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree4InOrderTraversal(){
        //Arrange
        val binaryTree = Constants.binaryTree4()
        //Act
        val result = inOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(3,5,7,10)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }
    @Test
    fun binaryTree5InOrderTraversal(){
        //Arrange
        val binaryTree = Constants.binaryTree5()
        //Act
        val result = inOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(-10,1,3,5,11,13,16)
        //Assert
        assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree6InOrderTraversal(){
        //Arrange
        val binaryTree = Constants.binaryTree6()
        //Act
        val result = inOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(1,3,4,5,7,9,10)
        //Assert
        assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree7InOrderTraversal(){
        //Arrange
        val binaryTree = Constants.binaryTree7()
        //Act
        val result = inOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(5,7,9,12,13,15,16,17,25,27,30,32)
        //Assert
        assertEquals(expectedResult, result)
    }
}