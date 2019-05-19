package algorithms.sorting

import algorithms.sorting.interfaces.ISort

class InsertionSort {
    companion object : ISort {
        override fun sort(list: MutableList<Int>): MutableList<Int> {
            var result = list
            for (i in 1 until result.count()) {
                var current = result[i]
                var newPos = i-1
                while (newPos >= 0 && result[newPos] > current) {
                    result[newPos+1] = result[newPos]
                    newPos--
                }
                result[newPos+1] = current
            }
            return result
        }
    }
}