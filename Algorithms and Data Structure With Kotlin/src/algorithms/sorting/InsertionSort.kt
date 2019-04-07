package algorithms.sorting

import algorithms.sorting.interfaces.ISort

class InsertionSort {
    companion object : ISort {
        override fun sort(list: MutableList<Int>): MutableList<Int> {
            var result = list
            for (i in 0 until result.count()) {
                var current = result[i]
                var newPos = i
                while (result[newPos] > current) {
                    newPos--
                }
                result = swap(result, i, newPos)
            }
            return result
        }

        fun swap(list: MutableList<Int>, oldPos: Int, newPos: Int): MutableList<Int> {
            var result = list
            var value = list[oldPos]
            for(i in oldPos until newPos){
                result[i] = result[i-1]
            }
            result[newPos] = value
            return result
        }
    }
}