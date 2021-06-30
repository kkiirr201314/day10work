fun main() {
    //val name = "Madrigal"
    //var healthPoints = 89
    //var isBlessed = true
    //val isImmortal = false

    val player = Player()
    player.castFireball(5)

    val auraColor = auraColor(player.isBlessed, player.healthPoints, player.isImmortal)

    val healthStatus = formatHealthStatus(player.healthPoints, player.isBlessed)
    printPlayerStatus(auraColor, player.isBlessed, player.name, healthStatus)
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
){
    println("光環: $auraColor" + "     走運嗎?${if (isBlessed) "是的" else "否，他很背"}")
    println("$name $healthStatus")
}

private fun castFireBall(numFireballs: Int = 2): Int {
    print("FireBall杯數(x$numFireballs)")
    return numFireballs
}
private fun drunkenness(x: Int){
    val s = when (x) {
        in 41..50 -> "爛醉如泥"
        in 31..40 -> "大醉"
        in 21..30 -> "醉了"
        in 11..20 -> "微醉"
        in 1..10 -> "微醺"
        0 -> "未喝酒"
        else -> "超出範圍"
    }
    println("醉酒程度: $s")
}