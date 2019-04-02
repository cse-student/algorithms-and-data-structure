package datastructure.builtin

import dataclass.Laptop
import java.text.NumberFormat
import java.util.*

class MapManipulations{
    companion object {
        fun manipulatingMaps(){

            val colorMap =
                mapOf(
                    Pair("tomato", "#FF6347"),
                    Pair("orangered", "#FF4500"),
                    Pair("gold", "#FFD700"),
                    Pair("orange", "#FFA500"))
            println(colorMap)
            for((color, colorcode) in colorMap){
                println("The color code of $color is $colorcode")
            }

            val mutableMap = mutableMapOf<String, Laptop>()
            mutableMap["MSI"] = Laptop("i7", "Rtx-2080", "64GB", price = 5000.00)
            mutableMap["HP"] = Laptop("i5", "intel hd", "16GB", price = 2500.00)
            mutableMap["MSI"] = Laptop("i7", "gtx-1080", "32GB", price = 3000.00)
            mutableMap["DELL"] = Laptop("i5", "gtx-1060", "16GB", price = 1500.00)
            //adding a key value pair having its key already existing as a key for
            //another key value pair in a map replaces the previous one with the new one
            println(mutableMap)
            var totalPrice = 0.00
            for ((brand, laptop) in mutableMap){
                println("The $brand laptop specs is $laptop")
                totalPrice += laptop.price!!
            }
            Locale.setDefault(Locale.US)
            val formatter = NumberFormat.getCurrencyInstance()
            println("The total price of the laptops = ${formatter.format(totalPrice)}")
        }
    }
}