fun main() {
    val name = "Madrigal"
    var healthPoints = 89
    var isBlessed = true
    val isImmortal = false

    val player = Player()

    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    drunkenness(x=castFireBall(50))
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
private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean) =
        if (isBlessed && healthPoints > 50 || isImmortal) "綠色" else "無光環"

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "健康狀態極佳"
        in 90..99 -> "有一些小擦傷"
        in 75..89 -> if (isBlessed) {
            "雖有一些傷口，但恢復很快"
        } else {
            "有一些傷口"
        }
        in 15..74 -> "嚴重受傷"
        //顯示玩家狀態
        else -> "情況不妙"
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