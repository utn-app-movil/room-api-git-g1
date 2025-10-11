interface IVehicle{  
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}

class Car : IVehicle {
    private var acceleration: Int = 0
    private var isEngineOn: Boolean = false

    override fun start_engine() {
        isEngineOn = true
        acceleration = 0
        println("El vehículo fue encendido. Aceleración actual = $acceleration")
    }

    override fun accelerate(acceleration: Int) {
        if (!isEngineOn) {
            println("No se puede acelerar. El motor está apagado.")
            return
        }
        this.acceleration += acceleration
        println("Acelerando... Aceleración actual = ${this.acceleration}")
    }

    override fun brake() {
        acceleration = 0
        println("El vehículo se ha detenido. Aceleración actual = $acceleration")
    }

    override fun turn_off_engine() {
        if (!isEngineOn) {
            println("El motor ya está apagado.")
            return
        }
        acceleration = 0
        isEngineOn = false
        println("El vehículo fue apagado. Aceleración = $acceleration")
    }
}

fun main() {
    val car = Car()
    car.start_engine()
    car.accelerate(20)
    car.accelerate(15)
    car.brake()
    car.turn_off_engine()
}

