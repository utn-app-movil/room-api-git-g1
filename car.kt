interface IVehicle{  
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}
//The attributes are being initialized inside of the class body so that you dont have to write them manually.
class Car(
  private var acceleration : Int = 0,
  private var engineIsOn : Boolean = false
): IVehicle{




  //Implements the start engine from IVehicle
  override fun start_engine(){
    if (!engineIsOn){
      engineIsOn = true;
      acceleration = 0;
      print("Vehicle was started and the acceleration is 0 ")
    } else {
      println("Vehicle is already on")
    }

  }

  override fun accelerate(acceleration: Int) {
    if (engineIsOn){
      //the property class, that one that storages the state of acceleration
      this.acceleration += acceleration //this one is the parameter
      println("The current acceleration is: ${this.acceleration}")
    } else{
      println("The engine is off, start it!")
    }
  }

}
