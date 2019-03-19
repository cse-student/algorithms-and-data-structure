package datastructure.builtin

import dataclass.Laptop

class MapManipulations{
    companion object {
        fun manipulatingMaps(){

            var colorMap =
                mapOf(
                    Pair("tomato", "#FF6347"),
                    Pair("orangered", "#FF4500"),
                    Pair("gold", "#FFD700"),
                    Pair("orange", "#FFA500"))
            println(colorMap)
            for((color, colorcode) in colorMap){
                println("The color code of $color is $colorcode")
            }

            var mutableMap = mutableMapOf<String, Laptop>()
            mutableMap["MSI"] = Laptop("i7", "Rtx-2080", "64GB")
            mutableMap.put("HP", Laptop("i5", "intel hd", "16GB"))
            mutableMap.put("MSI", Laptop("i7", "gtx-1080", "32GB"))
            //adding a key value pair having its key already existing as a key for
            //another key value pair in a map replaces the previous one with the new one
            println(mutableMap)
        }
    }
}