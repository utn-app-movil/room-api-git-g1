interface IVehicle{
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
  fun refuel(amount: Int) // print a message that the vehicle was refueled with the given fuel amount
}

class Car: IVehicle{

    var aceleracionActual = 0

    //fun by Esmeralda
    override fun start_engine() {
        println("The vehicle was started and the acceleration is: $aceleracionActual")
    }

    //fun Maria
    override fun accelerate(acceleration: Int) {
        aceleracionActual = aceleracionActual + acceleration
        println("La aceleracion actual del vehiculo es: $aceleracionActual")
    }

    //fun by Yul
    override fun refuel(amount: Int) {
        println("The vehicle was refueled with $amount liters of fuel.")
    }

    //fun Nailea
    override fun brake() {
        aceleracionActual = 0
        println("The vehicle is stopped and the acceleration is 0.")
    }

    //fun Kristel
    override fun turn_off_engine() {
        aceleracionActual = 0
        println("The vehicle was turned off and the acceleration is 0.")
    }

}
