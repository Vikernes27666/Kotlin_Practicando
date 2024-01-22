fun main() {
    // Variable Long mutable
    var poblacionMundial: Long = 7800000000 // Variable mutable de tipo Long (para números enteros largos)
    println("Población Mundial: $poblacionMundial")

    // Puedes cambiar el valor de la variable Long
    poblacionMundial += 1000000
    println("Nueva Población Mundial: $poblacionMundial")

    // Variable Int mutable
    var temperaturaActual: Int = 25 // Variable mutable de tipo Int (para números enteros)
    println("Temperatura Actual: $temperaturaActual")

    // Puedes cambiar el valor de la variable Int
    temperaturaActual += 5
    println("Nueva Temperatura Actual: $temperaturaActual")

    // Variable Double inmutable
    val pi: Double = 3.14159 // Variable inmutable de tipo Double (para números de punto flotante)
    println("Valor de Pi: $pi")

    // Variable String inmutable
    val saludo: String = "Hola, mundo!" // Variable inmutable de tipo String
    println(saludo)
}