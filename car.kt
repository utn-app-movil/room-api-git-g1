import java.sql.DriverManager.println

interface IVehicle{
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}

class Car: IVehicle{
  var acceleration: Int = 0

  // Caleb does the start?start_engine function
  overrride fun start_engine(){
    acceleration = 0
    println("The vehicle was started and the acceleration is $acceleration")
  }

  // *name* does the accelerate function
  overrride fun accelerate(){
    for (i in 1..120){
      acceleration = i
      println("The vehicle is at: $acceleration km/hr")
    }
  }

  // *name* does the brake function
  overrride fun brake(){
    
  }

  // *name* does the turn_off_engine function
  overrride fun turn_off_engine(){
    
  }
}
