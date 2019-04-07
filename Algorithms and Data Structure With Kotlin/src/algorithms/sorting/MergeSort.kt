package algorithms.sorting

import algorithms.sorting.interfaces.ISort

class MergeSort {
    companion object : ISort {
        override fun sort(list: MutableList<Int>): MutableList<Int> {
            var result = list
            var size = 1
            var partitionedList = list.chunked(size)
            while (partitionedList.count() > 1) {
                for (index in 0 until partitionedList.count()-1 step 2){
                    var tempList = merge(partitionedList[index], partitionedList[index + 1])
                    replace(result, tempList, index*size)
                }
                size *= 2
                partitionedList = list.chunked(size)
            }
            return result
        }

        private fun merge(list1: List<Int>, list2: List<Int>): MutableList<Int> {
            var index1 = 0
            var index2 = 0
            var result = mutableListOf<Int>()
            while (result.count() != list1.count() + list2.count()) {
                if (list1[index1] < list2[index2]) {
                    result.add(list1[index1])
                    if (index1 < list1.count() - 1) {
                        index1++
                    }
                } else {
                    result.add(list2[index2])
                    if (index2 < list2.count() - 1) {
                        index2++
                    }
                }
            }
            return result
        }

        private fun replace(originalList: MutableList<Int>, newList: MutableList<Int>, startIndex: Int){
            var result = originalList
            var startIndex = startIndex
            for (i in newList){
                result[startIndex] = i
                startIndex++
            }
        }
    }
}