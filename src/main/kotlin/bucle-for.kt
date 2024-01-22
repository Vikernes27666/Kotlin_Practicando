fun main() {
    // Solicitar al usuario que ingrese un número
    print("Ingrese un número: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        // Iterar desde 1 hasta el número ingresado
        for (i in 1..numero) {
            val mensaje = when {
                i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"  // Si es divisible por 3 y 5
                i % 3 == 0 -> "Fizz"  // Si es divisible por 3
                i % 5 == 0 -> "Buzz"  // Si es divisible por 5
                else -> i.toString()  // En otros casos, convertir a String
            }
            // Imprimir el mensaje correspondiente
            println(mensaje)
        }
    } else {
        println("Entrada inválida. Por favor, ingrese un número válido.")
    }
}