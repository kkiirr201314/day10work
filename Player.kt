import java.util.*

class Player {

    var name = "madrigal"
        get() = field.capitalize()
        private set(value){
            field = value.trim()
        }
    var healthPoints = 89
    var isBlessed = true
    private val isImmortal = false

    fun castFireball(numFireball: Int = 2) =
        println("橫空變出一杯火球" + "(x$numFireball)")
}