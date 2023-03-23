import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class VehicleMovementTest extends AnyFlatSpec with Matchers {
  val vehicle = new VehicleMovement

  "fillFuel call" should " return having Fuel" in {
    val fillFuel: String = vehicle.fillFuel()
    val actualOutput: String = s"Vehicle having fuel"
    assert(actualOutput == fillFuel)
  }

  "moveVehicle call 1st time " should "return vehicle is moving 1 time " in {
    val firstMove: String = vehicle.moveVehicle()
    val actualOutput = s"Vehicle is Moving 1 time"
    assert(actualOutput == firstMove)
  }

  "moveVehicle call 2nd  time" should "return vehicle is moving 2 time" in {
    val secondMove: String = vehicle.moveVehicle()
    val actualOutput = s"Vehicle is Moving 2 time"
    assert(actualOutput == secondMove)
  }

  "moveVehicle call 3rd time " should "return Vehicle Need Fuel" in {
    val thirdMove: String = vehicle.moveVehicle()
    val actualOutput = s"Vehicle need Fuel"
    assert(actualOutput == thirdMove)
  }

  "fillFuel call " should "return Vehicle is ready to move" in {
    val fillFuel: String = vehicle.fillFuel()
    val actualOutput = s"Vehicle is ready to Move"
    assert(actualOutput == fillFuel)
  }

  "moveVehicle call after fill fuel " should "return Vehicle is moving 3 time" in {
    val thirdMove: String = vehicle.moveVehicle()
    val actualOutput = s"Vehicle is Moving 3 time"
    assert(actualOutput == thirdMove)
  }

  "moveVehicle call 4th time" should "not return All move Completed" in {
    val fourthMove: String = vehicle.moveVehicle()
    val actualOutput = s"Vehicle is Moving 3 time"
    assert(actualOutput != fourthMove)
  }

  "moveVehicle call 4th time" should "return All move Completed" in {
    val fourthMove: String = vehicle.moveVehicle()
    val actualOutput = s"All 3 Moves Completed"
    assert(actualOutput == fourthMove)
  }

}
