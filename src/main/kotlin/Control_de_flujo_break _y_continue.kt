fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (numero in numeros) {
        if (numero == 3) {
            continue // Salta al siguiente número sin ejecutar el código siguiente
        }

        if (numero == 8) {
            break // Finaliza el bucle y sale del mismo
        }

        println(numero) // Imprime el número actual
    }
}