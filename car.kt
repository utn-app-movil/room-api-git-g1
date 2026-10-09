interface IVehicle {
    fun start_engine()
    fun accelerate(acceleration: Int)
    fun brake()
    fun turn_off_engine()
}

class Car : IVehicle {

    private var currentAcceleration: Int = 0

    override fun start_engine() {
        currentAcceleration = 0
        println("El vehículo fue encendido. Aceleración actual: $currentAcceleration")
    }

    override fun accelerate(acceleration: Int) {
        currentAcceleration += acceleration
        println("Aceleración actual del vehículo: $currentAcceleration")
    }

    override fun brake() {
        currentAcceleration = 0
        println("El vehículo se detuvo. Aceleración actual: $currentAcceleration")
    }

    override fun turn_off_engine() {
        currentAcceleration = 0
        println("El vehículo fue apagado. Aceleración = $currentAcceleration")
    }
}
