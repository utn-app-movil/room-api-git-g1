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
  var currentAcceleration = 0

  override fun accelerate(newAcceleration: Int){
    currentAcceleration+=newAcceleration
    println("The current acceleration is $currentAcceleration")
  }
}

fun main() {
    val car = Car()


    car.accelerate(30)
 dev1
}