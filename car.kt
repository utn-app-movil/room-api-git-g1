interface IVehicle{  
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}

class Car : IVehicle {
    private var acceleration: Int = 0

    override fun start_engine() {
        acceleration = 0
        println("El vehículo fue encendido y la aceleración es de $acceleration")
    }

    override fun accelerate(newAcceleration: Int) {
        acceleration += newAcceleration
        println("La aceleración actual del vehículo es: $acceleration")
    }

    override fun brake() {
        acceleration = 0
        println("El vehículo se ha detenido y la aceleración es 0")
    }

    override fun turn_off_engine() {
        acceleration = 0
        println("El vehículo fue apagado con aceleración = 0")
    }
}
