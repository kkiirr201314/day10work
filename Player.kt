import java.util.*

class Player {

    var name = "madrigal"
        get() = field.capitalize()
        private set(value){
            field = value.trim()
        }

    fun castFireball(numFireball: Int = 2) =
        println("橫空變出一杯火球" + "(x$numFireball)")
}