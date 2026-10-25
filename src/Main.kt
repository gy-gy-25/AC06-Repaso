//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val sensores = mapOf("S1" to 22.5, "S2" to 30.1, "S3" to 18.0, "S4" to 36.4)
    for ((id, valor) in sensores) {
        if (valor > 25) println(id)
    }

    /*
    * También se puede usar un for normal:
    * for (sensor in sensores) {
    *    if (sensor.value > 25) println(sensor.key)
    * }
    */

    println(sensores["S9"] ?: "Sin datos")
}