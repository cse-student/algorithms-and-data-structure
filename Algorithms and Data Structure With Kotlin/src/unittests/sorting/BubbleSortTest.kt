package unittests.sorting

import algorithms.sorting.BubbleSort
import algorithms.sorting.interfaces.ISort
import unittests.sorting.interfaces.ISortTest

class BubbleSortTest() : ISortTest {
    override var sort: ISort? = BubbleSort
}