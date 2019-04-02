package unittests.sorting

import algorithms.sorting.interfaces.ISort
import algorithms.sorting.interfaces.InsertionSort
import unittests.sorting.interfaces.ISortTest

class InsertionSortTest: ISortTest {
    override var sort: ISort? = InsertionSort
}