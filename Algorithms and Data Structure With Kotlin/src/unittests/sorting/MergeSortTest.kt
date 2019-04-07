package unittests.sorting

import algorithms.sorting.interfaces.ISort
import algorithms.sorting.MergeSort
import unittests.sorting.interfaces.ISortTest

class MergeSortTest: ISortTest{
    override var sort: ISort? = MergeSort
}