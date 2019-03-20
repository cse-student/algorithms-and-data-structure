package datastructure.custom

class BinaryTree(self: Int){
    var self = self
    var leftNode: BinaryTree? = null
    var rightNode: BinaryTree? = null

    fun add(num: Int){
        if (num >= self){
            if(this.leftNode == null){
                this.leftNode = BinaryTree(num)
            }
            else{
                this.leftNode!!.add(num)
            }
        }
        else{
            if(this.rightNode == null){
                this.rightNode = BinaryTree(num)
            }
            else{
                this.rightNode!!.add(num)
            }
        }
    }
}