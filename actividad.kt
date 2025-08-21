

//Variables y Operadores Aritméticos
fun main(){

    val entero: Int = 1
    val decimal: Double = 0.5

    val suma: Double = entero + decimal
    val resta: Double = entero - decimal
    val multiplicados: Double = entero * decimal
    val divisor: Double = entero / decimal

    println("La suma es : $suma, La resta es : $resta, La multiplicacion es : $multiplicados, La division es : $divisor")

    //Seguridad ante Nulos (Null Safety)
    //con datos
    val nulo: String? = "prueba null" //puede ser nulo
    val longitud = nulo?.length?:0
    println("Longitud: ${longitud}")
    //sin datos
    val nulos: String? = null //puede ser nulo
    val longitud2 = nulos?.length?:0
    println("Longitud: ${longitud2}")

    // Antes de acceder a métodos o propiedades de un objeto en Java,
    // es importante verificar que no sea null para evitar un NullPointerException.

        val numero = 3


        //when para elegir un dia de la semana
        when (numero) {
            1 -> println("Lunes")
            2 -> println("Martes")
            3 -> println("Miércoles")
            4 -> println("Jueves")
            5 -> println("Viernes")
            6 -> println("Sábado")
            7 -> println("Domingo")
            else -> println("Número inválido")
        }
    //ultimas respuestas
//en lo que se parecen es que  los dos son lenguajes orientados a objetos y corren en la JVM
    //y diferencia
    //Kotlin tiene Null Safety

    //segunda pregunta
    //Null Safety te ayuda a evitar errores comunes que pueden hacer que una app se cierre, dando un correcto funcionamento
    // a la aplicacion movil
}
