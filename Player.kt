import java.util.*

class Player {

    val name = "madrigal"
        get() = field.capitalize()

    fun castFireball(numFireball: Int = 2) =
        println("橫空變出一杯火球" + "(x$numFireball)")
}