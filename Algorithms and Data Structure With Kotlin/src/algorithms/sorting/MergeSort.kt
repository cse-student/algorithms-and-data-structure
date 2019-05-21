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

        private fun merge(lst1: List<Int>, lst2: List<Int>): MutableList<Int> {
            var list1 = mutableListOf<Int>()
            list1.addAll(lst1)
            var list2 = mutableListOf<Int>()
            list2.addAll(lst2)

            var index1 = 0
            var index2 = 0
            var result = mutableListOf<Int>()
            while (result.count() != lst1.count() + lst2.count()) {
                if (list1.isEmpty()){
                    result.addAll(list2)
                    return result
                }
                if (list2.isEmpty()){
                    result.addAll(list1)
                    return result
                }
                if (list1[index1] < list2[index2]) {
                    result.add(list1[index1])
                    list1.removeAt(index1)
                } else {
                    result.add(list2[index2])
                    list2.removeAt(index2)
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