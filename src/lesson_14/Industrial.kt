package lesson_14

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int,
) : Spaceship(name, speed, unmanned = true) {

    fun launchScanningDrones() {
        println("${name}: Сканирующие дроны запущены")
    }

    override fun runSystemDiagnostic() {
        super.runSystemDiagnostic()
        println("${name}: Запущена диагностика дронов и майнеров")
    }

}