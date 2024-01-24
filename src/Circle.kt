import kotlin.math.PI

class Circle(_name: String) : Shape(_name) {

    private var radius: Double = 0.0

    fun setDimensions(_radius: Double){

        this.radius = _radius
    }

    override fun printDimensions(){

        println("Radius of circle = $radius")
    }

    override fun getArea(): Double{

        return PI * (radius * radius)
    }
}