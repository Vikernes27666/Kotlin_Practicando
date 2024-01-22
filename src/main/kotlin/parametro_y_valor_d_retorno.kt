import java.util.Scanner

// Función que suma dos números y devuelve el resultado
fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Ingrese el primer número: ")
    val numero1 = scanner.nextInt()

    print("Ingrese el segundo número: ")
    val numero2 = scanner.nextInt()

    val resultado = sumar(numero1, numero2)

    println("El resultado de la suma es: $resultado")
}