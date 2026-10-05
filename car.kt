import java.lang.IO.println

interface IVehicle{
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
  fun refuel(amount: Int) // print a message that the vehicle was refueled with the given fuel amount
}

class Car: IVehicle{
  //fun by Yul
  override fun refuel(amount: Int) {
    println("The vehicle was refueled with $amount liters of fuel.")
  }

  override fun start_engine() {}
  override fun accelerate(acceleration: Int) {}
  override fun brake() {}
  override fun turn_off_engine() {}
}
