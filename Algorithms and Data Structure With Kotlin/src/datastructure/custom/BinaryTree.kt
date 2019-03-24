package datastructure.custom

class BinaryTree(self: Int): ITree{
    override var self = self
    override var leftNode: BinaryTree? = null
    override var rightNode: BinaryTree? = null

    override fun add(num: Int){
        if (num >= self){
            if(this.rightNode == null){
                this.rightNode = BinaryTree(num)
            }
            else{
                this.rightNode!!.add(num)
            }
        }
        else{
            if(this.leftNode == null){
                this.leftNode = BinaryTree(num)
            }
            else{
                this.leftNode!!.add(num)
            }
        }
    }
}