import kotlin.math.sqrt

class EquilateralTriangle(_name:String) : Triangle(_name) {

    private var length: Double = 0.0

    fun setDimensions(_length: Double){

        this.length = _length
    }
    override fun printDimensions(){

        println("All 3 sides of equilateral triangle are length $length")
    }

    override fun getArea(): Double{

        val p = length*3
        return sqrt((p* (p-length)* (p-length) *(p-length)))
    }
}