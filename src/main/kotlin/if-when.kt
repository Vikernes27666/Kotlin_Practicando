fun main() {
    print("Ingrese un número: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        if (numero >= 0) {
            println("El número es positivo o cero.")
        } else {
            println("El número es negativo.")
        }

        val esPar = if (numero % 2 == 0) true else false
        println("¿El número es par? $esPar")

        val mensaje = when {
            numero % 3 == 0 -> "El número es divisible por 3."
            numero % 5 == 0 -> "El número es divisible por 5."
            else -> "El número no es divisible ni por 3 ni por 5."
        }
        println(mensaje)
    } else {
        println("Entrada inválida. Por favor, ingrese un número válido.")
    }
}