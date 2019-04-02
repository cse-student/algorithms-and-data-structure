package unittests.treetraversals

import algorithms.treetraversal.PreOrderTraversal
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import unittests.treetraversals.constants.Constants

class PreOrderTraversalTest {
    private var preOrderTraversal = PreOrderTraversal

    @Test
    fun binaryTree1PreOrderTraversal(){
        //Arrange
        val binaryTree = Constants.binaryTree1()
        //Act
        val result = preOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(1,2)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree2PreOrderTraversal(){
        //Arrange
        val binaryTree = Constants.binaryTree2()
        //Act
        val result = preOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(1,2,3)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree3PreOrderTraversal(){
        //Arrange
        val binaryTree = Constants.binaryTree3()
        //Act
        val result = preOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(2,1,3)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree4PreOrderTraversal(){
        //Arrange
        val binaryTree = Constants.binaryTree4()
        //Act
        val result = preOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(5,3,7,10)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree5PreOrderTraversal(){
        //Arrange
        val binaryTree = Constants.binaryTree5()
        //Act
        val result = preOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(1,-10,11,5,3,16,13)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree6PreOrderTraversal(){
        //Arrange
        val binaryTree = Constants.binaryTree6()
        //Act
        val result = preOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(5,3,1,4,9,7,10)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun binaryTree7PreOrderTraversal(){
        //Arrange
        val binaryTree = Constants.binaryTree7()
        //Act
        val result = preOrderTraversal.read(binaryTree)
        val expectedResult = mutableListOf(15,12,7,5,9,13,25,17,16,30,27,32)
        //Assert
        Assertions.assertEquals(expectedResult, result)
    }
}