package dataclass

import java.text.NumberFormat
import java.util.*

//Class with setters and getters
data class Vehicle(
    var type: String,
    private var _price: Double?,
    private var _discount: Double?,
    private var _local: Locale,
    private var _formatter: NumberFormat?){
    init{
        _discount = 1.0
        Locale.setDefault(_local)
        _formatter = NumberFormat.getCurrencyInstance()
    }

    constructor(type: String, _local: Locale): this(type, null, null, _local, null)

    var price = _price
        set(value){
            if (value != null) {
                _price = value * _discount!!
            }
        }


}