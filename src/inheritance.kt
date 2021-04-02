fun main() {
    var vehicle = Car("Subaru", "legacy", "white", 4)
    vehicle.carry(24)
    println(vehicle.capacity)
    vehicle.identity()
    println(vehicle.calculateParkingFees(4))
    var travel=Bus("Marcedeec","legacy","Blue",8)
    println(travel.maxTripFare(50.55))
    println(travel.calculateParkingFees(6))

}
open class Car(var make:String,var model:String,var colour:String,var capacity:Int) {
    fun carry(people: Int) {
        if (capacity <= people) {
            println("carrying $people passengers")
        } else if (capacity > people) {
            var execeed = people - capacity
            println("over capacity $people passengers ")
        }
    }

    fun identity() {
        println("Iam a $colour $make $model")
    }

    open fun calculateParkingFees(hours: Int):Int{
        var ParkingFees=hours*20
        return ParkingFees
    }
}

class Bus(make:String,model:String,colour:String,capacity:Int):Car(make, model, colour, capacity){
    fun maxTripFare(fare:Double): Double {
        var cash=fare*capacity
        return cash
    }
    override fun calculateParkingFees(hours:Int):Int {
        return hours*capacity

    }

}