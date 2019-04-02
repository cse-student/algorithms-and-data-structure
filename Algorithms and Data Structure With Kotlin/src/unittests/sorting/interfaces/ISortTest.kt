package unittests.sorting.interfaces

import algorithms.sorting.interfaces.ISort
import org.junit.jupiter.api.Test
import unittests.sorting.constants.Constants
import kotlin.test.assertEquals

interface ISortTest {

    var sort: ISort?
    @Test
    fun sortList1(){
        var lst = Constants.list1()
        var result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList2(){
        var lst = Constants.list2()
        var result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList3(){
        var lst = Constants.list3()
        var result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList4(){
        var lst = Constants.list4()
        var result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList5(){
        var lst = Constants.list5()
        var result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList6(){
        var lst = Constants.list6()
        var result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList7(){
        var lst = Constants.list7()
        var result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList8(){
        var lst = Constants.list8()
        var result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList9(){
        var lst = Constants.list9()
        var result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }

    @Test
    fun sortList10(){
        var lst = Constants.list10()
        var result = sort!!.sort(lst)
        lst.sort()
        assertEquals(lst, result)
    }
}