package datastructure.builtin

import dataclass.Laptop

class SetManipulations{
    companion object {
        fun manipulateSets(){
            var set = mutableSetOf("C", "Python", "Java", "C#", "C++", "nodejs", "lisp")
            println(set)
            set.add("kotlin")
            println(set) //As you can see kotlin was added successfully
            set.add("kotlin")
            println(set) //kotlin has not been added to the set, as sets does not allow duplicate

            var set2 = mutableSetOf<Laptop>()
            set2.add(Laptop("i7", "Rtx-2080", "64GB"))
            set2.add(Laptop("i7", "Rtx-2080", "64GB"))
            set2.add(Laptop("i7", "Rtx-2080", "128GB"))
            println(set2)
            //as you can see the set makes an equality check to verify whether it is adding a duplicate object
            //it only takes one different property value for it to mark 2 objects as different and add it successfully
        }
    }
}