import kotlinx.coroutines.*;

fun main() = runBlocking {

    val scope = CoroutineScope(Dispatchers.Default)
    scope.launch {
        delay(2000)
        println("Arroz listo.")
    }
    scope.launch {
        delay(1500)
        println("Papas listas.")
    }
    scope.launch {
        delay(1000)
        println("Jugo listo.")
    }
    println("Iniciando cocina inteligente...")
    delay(500)
    println("Preparando la mesa...")

    delay(2000)
    println("Cocina completa.")
}