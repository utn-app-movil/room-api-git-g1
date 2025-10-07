//Este es el primer método

interface IVehicle {
    fun start_engine()
}

class Car : IVehicle {
    private var encender: String = ""
    private var aceleracion: Int = 0

    constructor(encender: String, aceleracion: Int) {
        this.encender = encender
        this.aceleracion = aceleracion
    }

    override fun start_engine() {
        println("El carro se está encendiendo...")
        println("El carro está $encender y la aceleración es $aceleracion")
    }
}

fun main() {

}