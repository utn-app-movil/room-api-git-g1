interface IVehicle {
  fun start_engine() // print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() // print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() // print a message the vehicle was turned off with acceleration = 0
}

class Vehicle : IVehicle {
  private var currentAceleration: Int = 0

  //Método de encender carro
  override fun start_engine(){
    velocidadActual = 0
    println("The vehicle was started, the aceleration is: $currentAceleration")
  }

  override fun accelerate(acceleration: Int) {
    currentAceleration += aceleration
    println("The current acceleration is $currentAceleration")
  }

  override fun brake() {
    currentAcceleration = 0
    println("The vehicle is stopped and the acceleration is $currentAcceleration")
  }


  override fun turn_off_engine() {
    velocidadActual = 0
    println("El vehículo fue apagado con la aceleración de: $velocidadActual")
  }
}

