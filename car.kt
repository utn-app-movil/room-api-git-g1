//Este es el primer método

interface IVehicle {
    fun start_engine()
}

 marcotarea1
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
    val carrito = Car("encendido", 0)
    carrito.start_engine()
=======
class Car: IVehicle{
  fun brake() {
    println("The vehicle is stopped and the acceleration is 0.")
}

}

fun main() {
    val car = Car()


    car.accelerate(30)
 dev1
}