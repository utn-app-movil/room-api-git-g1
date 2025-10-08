interface IVehicle{  
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}

class Car: IVehicle{

  // Caleb does the start?start_engine function
  overrride fun start_engine(){
    acceleration = 0
    println("The vehicle was started and the acceleration is $acceleration")
  }

  // *name* does the accelerate function
  overrride fun accelerate(){

  }

  // *name* does the accelerate function
  overrride fun brake(){
    
  }

  // *name* does the accelerate function
  overrride fun turn_off_engine(){
    
  }
}
