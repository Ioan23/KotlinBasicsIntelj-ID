import kotlin.random.Random

class Rectangle(
    private val radius: Double
): Shape("Rectangle")  {

    companion object {
        fun randomRectangle(): Rectangle{
            val radius = Random.nextDouble()
            return Rectangle(radius)
        }
    }
    init {
        println("$name created with radius = $radius ")
        println("$name area is ${area()} ")
        println("$name perimeter is ${perimeter()}")
    }
    override fun area() = radius * radius * ImportantNumbers.PI
    override fun perimeter() = 2 * radius * ImportantNumbers.PI
}