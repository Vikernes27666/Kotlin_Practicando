fun main() {
    // Solicitar al usuario que ingrese una palabra
    println("Ingrese una palabra:")
    var palabra = readLine()

    // Validar la entrada del usuario utilizando un bucle while
    while (palabra.isNullOrEmpty()) {
        // Mostrar un mensaje de error si la palabra es inválida
        println("Palabra inválida. Ingrese una palabra:")
        palabra = readLine()
    }

    // Imprimir la palabra ingresada
    println("¡La palabra ingresada es: $palabra!")
}