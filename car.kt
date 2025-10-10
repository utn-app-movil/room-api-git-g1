interface IVehicle{
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}

class Car: IVehicle{
  var acceleration: Int = 0

  // Caleb does the start?start_engine function
  override fun start_engine(){
    acceleration = 0
    println("The vehicle was started and the acceleration is $acceleration")
  }

  // Samiel does the accelerate function
  override fun accelerate(acceleration: Int){
      this.acceleration += acceleration
      println("The vehicle is at: $accel km/hr")
  }

  // Dylan does the brake function
  override fun brake(){
    acceleration = 0
    println("the vehicle is stopped and the acceleration is $acceleration")
  }

  // Luis Alejandro does the turn_off_engine function
  override fun turn_off_engine() {
    acceleration = 0
    println("The vehicle was turned off with acceleration = $acceleration km/hr")
  }
}

// Main function to test the Car class
fun main() {
  val theCar = Car()
  theCar.start_engine()
  theCar.accelerate(20)
  theCar.accelerate(35)
  theCar.brake()
  theCar.turn_off_engine()
}

