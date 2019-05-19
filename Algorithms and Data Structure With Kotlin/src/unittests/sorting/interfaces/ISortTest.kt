package unittests.sorting.interfaces

import algorithms.sorting.interfaces.ISort
import org.junit.jupiter.api.Test
import unittests.sorting.constants.Constants
import kotlin.test.assertEquals

interface ISortTest {

    var sort: ISort?
    @Test
    fun sortList1(){
        val lst = Constants.list1()
        var result = mutableListOf<Int>()
        result.addAll(lst)
        result = sort!!.sort(result)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList2(){
        val lst = Constants.list2()
        var result = mutableListOf<Int>()
        result.addAll(lst)
        result = sort!!.sort(result)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList3(){
        val lst = Constants.list3()
        var result = mutableListOf<Int>()
        result.addAll(lst)
        result = sort!!.sort(result)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList4(){
        val lst = Constants.list4()
        var result = mutableListOf<Int>()
        result.addAll(lst)
        result = sort!!.sort(result)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList5(){
        val lst = Constants.list5()
        var result = mutableListOf<Int>()
        result.addAll(lst)
        result = sort!!.sort(result)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList6(){
        val lst = Constants.list6()
        var result = mutableListOf<Int>()
        result.addAll(lst)
        result = sort!!.sort(result)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList7(){
        val lst = Constants.list7()
        var result = mutableListOf<Int>()
        result.addAll(lst)
        result = sort!!.sort(result)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList8(){
        val lst = Constants.list8()
        var result = mutableListOf<Int>()
        result.addAll(lst)
        result = sort!!.sort(result)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList9(){
        val lst = Constants.list9()
        var result = mutableListOf<Int>()
        result.addAll(lst)
        result = sort!!.sort(result)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList10(){
        val lst = Constants.list10()
        var result = mutableListOf<Int>()
        result.addAll(lst)
        result = sort!!.sort(result)
        lst.sort()
        assertEquals(lst, result)
    }
}