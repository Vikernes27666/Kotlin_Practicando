fun main() {
    print("Ingrese un número: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        if (numero > 0) {
            println("El número ingresado es positivo.")
        } else if (numero < 0) {
            println("El número ingresado es negativo.")
        } else {
            println("El n��mero ingresado es cero.")
        }
    } else {
        println("Entrada inválida. Por favor, ingrese un número válido.")
    }
}