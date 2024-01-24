import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {

    private var side1: Double = 0.0
    private var side2: Double = 0.0
    private var side3: Double = 0.0

    open fun setDimensions(_side1: Double, _side2: Double, _side3: Double){

        this.side1 = _side1
        this.side2 = _side2
        this.side3 = _side3
    }

    override fun printDimensions(){

        println("Uneven triangle side 1 length: $side1")
        println("Uneven triangle side 2 length: $side2")
        println("Uneven triangle side 3 length: $side3")

    }
    override fun getArea(): Double{

        var p : Double = side1+side2+side3

        return sqrt((p *(p-side1)* (p-side2)* (p-side3)))
    }

}