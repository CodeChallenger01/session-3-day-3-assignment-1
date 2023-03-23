
class VehicleMovement {
  var fuelCapacity: Int = 50
  var count = 0

  def moveVehicle(): String = {
    if (fuelCapacity >= 20) {
      if (count < 3) {
        fuelCapacity = fuelCapacity - 20
        count += 1
        val currentStatus: String = s"Vehicle is Moving ${count} time"
        currentStatus
      }
      else {
        val currentStatus: String = s"All 3 Moves Completed"
        currentStatus
      }
    }
    else {
      val currentStatus: String = s"Vehicle need Fuel"
      currentStatus
    }
  }

  def fillFuel(): String = {
    try {
      if (fuelCapacity >= 20) throw new Exception
      else {
        fuelCapacity = 50
        val currentStatus: String = s"Vehicle is ready to Move"
        currentStatus
      }
    }
    catch {
      case ex: Exception => s"Vehicle having fuel"
    }
  }
}

