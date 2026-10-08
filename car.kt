interface IVehicle{  
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
  fun refuel(amount: Int) // print a message that the vehicle was refueled with the given fuel amount
}

class Car: IVehicle{

  //fun Esmeralda
  override fun start_engine() {
    aceleracionActual = 0
    println("El vehiculo ha arrancado y la aceleracion inicial es: $aceleracionActual")
  }
}
