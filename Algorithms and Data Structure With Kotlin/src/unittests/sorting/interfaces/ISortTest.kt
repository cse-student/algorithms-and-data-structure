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
        val result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList2(){
        val lst = Constants.list2()
        val result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList3(){
        val lst = Constants.list3()
        val result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList4(){
        val lst = Constants.list4()
        val result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList5(){
        val lst = Constants.list5()
        val result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList6(){
        val lst = Constants.list6()
        val result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList7(){
        val lst = Constants.list7()
        val result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList8(){
        val lst = Constants.list8()
        val result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList9(){
        val lst = Constants.list9()
        val result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList10(){
        val lst = Constants.list10()
        val result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }
}