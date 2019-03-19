package dataclass

//Simple data class
data class Laptop (
    var cpu: String,
    var gpu: String,
    var ram: String?,
    var price: Double?
){
    init {
        //Is executed every time the primary constructor is executed
        ram = ram?.toUpperCase() ?: "16GB"
    }

    constructor(cpu: String, gpu: String, ram: String): this(cpu, gpu, ram, null){
        //primary constructor must be called eventually in kotlin
    }

    constructor(cpu: String, gpu: String, price: Double): this(cpu, gpu, null, price)
}