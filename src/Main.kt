import java.util.Scanner
import kotlin.math.PI

fun main() {

    val reader = Scanner(System.`in`)
    print("Enter length of square: ")
    val length : Double = reader.nextDouble()
    print("Enter height of square: ")
    val height : Double = reader.nextDouble()

    print("Enter radius of circle: ")
    val radius : Double = reader.nextDouble()

    print("Enter triangle side length 1: ")
    val side1 : Double = reader.nextDouble()
    print("Enter triangle side length 2: ")
    val side2 : Double = reader.nextDouble()
    print("Enter triangle side length 3: ")
    val side3 : Double = reader.nextDouble()

    print("Enter Equilateral Triangle side length")
    val equalLength : Double = reader.nextDouble()


    val square : Shape
    val circle : Shape
    val triangle : Shape
    val equilateraltriangle : Triangle

    square = Square("Square1")
    circle = Circle("Circle1")
    triangle = Triangle("Triangle1")
    equilateraltriangle = EquilateralTriangle("Triangle2")

    println("Name of square: ${square.name}")
    square.setDimensions(length, height)
    square.printDimensions()
    println("Area of square: ${square.getArea()}")

    println("\nName of circle: ${circle.name}")
    circle.setDimensions(radius)
    circle.printDimensions()
    println("Area of circle: ${circle.getArea()}")

    println("\nName of uneven triangle: ${triangle.name}")
    triangle.setDimensions(side1, side2, side3)
    triangle.printDimensions()
    println("Area of uneven triangle: ${triangle.getArea()}")

    println("\nName of equilateral triangle: ${equilateraltriangle.name}")
    equilateraltriangle.setDimensions(equalLength)
    equilateraltriangle.printDimensions()
    println("Area of equilateral triangle: ${equilateraltriangle.getArea()}")

}