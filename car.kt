interface IVehicle {
    fun start_engine() // Imprime que el vehículo fue encendido y la aceleración es 0
    fun accelerate(acceleration: Int) // Imprime la aceleración actual, sumando la nueva
    fun brake() // Imprime que el vehículo se detuvo y la aceleración es 0
    fun turn_off_engine() // Imprime que el vehículo fue apagado con aceleración = 0
}

class Car : IVehicle {

    private var acceleration = 0
    private var engineOn = false

    override fun start_engine() {
        engineOn = true
        acceleration = 0
        println("El motor fue encendido. Aceleración = $acceleration")
    }

    override fun accelerate(acceleration: Int) {
        if (!engineOn) {
            println("No se puede acelerar. El motor está apagado.")
            return
        }
        this.acceleration += acceleration
        println("El vehículo acelera. Aceleración actual = ${this.acceleration}")
    }

    override fun brake() {
        acceleration = 0
        println("El vehículo se detuvo. Aceleración = $acceleration")
    }

    override fun turn_off_engine() {
        if (acceleration != 0) {
            println("No se puede apagar mientras acelera. Detén el vehículo primero.")
        } else {
            engineOn = false
            println("El motor fue apagado. Aceleración = $acceleration")
        }
    }
}