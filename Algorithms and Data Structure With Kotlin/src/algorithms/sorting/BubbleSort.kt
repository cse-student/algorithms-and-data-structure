package algorithms.sorting

import algorithms.sorting.interfaces.ISort

class BubbleSort {
    companion object: ISort {
        override fun sort(list: MutableList<Int>): MutableList<Int> {
            var result = list
            if (result.count() < 2){
                return result
            }
            for(i in 0 until result.count()){
                for(j in i until result.count()){
                    if (result[j] > result[i]){
                        result = swap(result, i, j)
                    }
                }
            }
            return result
        }

        private fun swap(list: MutableList<Int>, i: Int, j:Int): MutableList<Int>{
            val result = list
            val temp = result[i]
            result[i] = result[j]
            result[j] = temp
            return result
        }
    }
}