interface IVehicle {
    fun start_engine() // print a message the vehicle was started and the acceleration is 0
    fun accelerate(acceleration: Int) // print a message the current acceleration of the vehicle, you need to sum the new acceleration
    fun brake() // print a message the vehicle is stopped and the acceleration is 0
    fun turn_off_engine() // print a message the vehicle was turned off with acceleration = 0
}

class Car : IVehicle {
    private var isEngineOn: Boolean = false
    private var acceleration: Int = 0

    override fun start_engine() {
        if (!isEngineOn) {
            isEngineOn = true
            acceleration = 0
            println("The car engine was started. Acceleration = $acceleration")
        } else {
            println("The car engine is already running.")
        }
    }

    override fun accelerate(acceleration: Int) {
        if (isEngineOn) {
            this.acceleration += acceleration
            println("The car accelerates. Current acceleration = ${this.acceleration}")
        } else {
            println("Cannot accelerate. The engine is off.")
        }
    }

    override fun brake() {
        if (isEngineOn) {
            acceleration = 0
            println("The car has stopped. Acceleration = $acceleration")
        } else {
            println("The engine is off. The car is already stopped.")
        }
    }

    override fun turn_off_engine() {
        if (isEngineOn) {
            acceleration = 0
            isEngineOn = false
            println("The car engine was turned off. Acceleration = $acceleration")
        } else {
            println("The car engine is already off.")
        }
    }
}

fun main() {
    val myCar = Car()
    myCar.start_engine()
    myCar.accelerate(20)
    myCar.accelerate(30)
    myCar.brake()
    myCar.turn_off_engine()
}
