class Square(_name: String): Shape(_name) {

    private var length : Double = 0.0
    private var height : Double = 0.0

    fun setDimensions(_length: Double, _height: Double){

        this.length = _length
        this.height = _height

    }
    override fun printDimensions(){

        println("Length of square = $length")
        println("Width of square = $height")
    }
   override fun getArea() : Double{

       return (height * length)
   }
}