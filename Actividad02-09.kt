//Suspend permite detener el hilo sin bloquear el programa
import kotlinx.coroutines.*;

suspend fun saludarConRetraso(nombre: String){
    //suspend detenemos la función un tiempo especifico
    delay(4000)//4 segundos

    println("Hola ${nombre}")
}
//conviertiendo el main en una corrutina que se pueda bloquear
fun main() = runBlocking {
    println("Preparando el saludo, el alumno aún no llega a la sala")
    saludarConRetraso("Thomas")//Don Thomas viene atrasado y saludo con retraso
    delay(1000)
    println("Saludo realizado, el alumno ya está en la sala")
}