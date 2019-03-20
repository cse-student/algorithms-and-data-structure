package datastructure.custom

class LinkedList(num: Int) {
    var num:Int = num
    var next: LinkedList? = null

    fun add(next: Int){
        if (this.next != null){
            this.next!!.add(next)
        }
        else{
            this.next = LinkedList(next)
        }
    }

    fun print(){
        println(this.num)
        if (this.next != null){
            next!!.print()
        }
    }
}