interface IVehicle{  
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}

class Car : IVehicle {
    private var estado: String = ""
    private var aceleracion: Int

    constructor(estado: String, aceleracion: Int) {
        this.estado = estado
        this.aceleracion = aceleracion
    }
	
    
    //Primera función marcotarea1
    override fun start_engine() {
        println("PRIMERA FUNCIÓN")
        println("El carro se está encendiendo...")
        println("El carro está $estado y la aceleración es $aceleracion")
        println("------------------------------------------------------")
    }
    
    //Segunda función lauratarea1
    override fun accelerate(newAcceleration: Int){
        val totalAcceleration = aceleracion + newAcceleration
        println("SEGUNDA FUNCIÓN")
        println("The current acceleration is $totalAcceleration")
        println("------------------------------------------------------")
    }
    
    //Tercera función sofiatarea1
    override fun brake() {
        println("TERCERA FUNCIÓN")
    	println("The vehicle is stopped and the acceleration is  $aceleracion")
        println("------------------------------------------------------")
	}
    
    //Cuarta función pablotarea1
    override fun turn_off_engine(){
        println("CUARTA FUNCIÓN")
        println("El carro se está apagando...")
        println("El carro esta $estado con aceleracion de $aceleracion")
        println("------------------------------------------------------")
    }
    
   
}

fun main() {
    val carrito = Car("encendido", 0)
    val carrito2 = Car("apagado", 0)
    
    carrito.start_engine()
    carrito.accelerate(30)
    carrito.brake()
    carrito2.turn_off_engine()
    
}
