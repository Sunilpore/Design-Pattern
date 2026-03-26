package com.designpattern.dpattern.behavioral.mediator




//Mediator Interface
interface ATCMediator {
    fun notify(plane: Plane, event: String)
}


class ControlTower : ATCMediator {

    private val planes = mutableListOf<Plane>()

    fun registerPlane(plane: Plane){
        planes.add(plane)
    }

    override fun notify(plane: Plane, event: String) {
        when(event){
            "takeOff" -> println("${plane.name} has taken off")
            "land" -> println("${plane.name} has landed")
            "requestLanding" -> {
                println("${plane.name} request landing")
                println("ControlTower: Landing permission granted to ${plane.name}")
            }
        }
    }

}

//Colleague
abstract class Plane (val name:String, val mediator: ATCMediator){
    abstract fun takeOff()
    abstract fun land()
}

//Concrete Colleague
class PassengerPlane(name: String, mediator: ATCMediator): Plane(name = name, mediator = mediator){

    override fun takeOff() {
        mediator.notify(this, "takeOff")
    }

    override fun land() {
        mediator.notify(this, "land")
    }

    fun requestLanding(){
        mediator.notify(this, "requestLanding")
    }

}


fun main(){
    val controlTower = ControlTower()

    val boening = PassengerPlane("Boening 747", controlTower)
    val airBus = PassengerPlane("Airbus A320", controlTower)

    controlTower.registerPlane(boening)
    controlTower.registerPlane(airBus)

    boening.takeOff()
    airBus.requestLanding()
    airBus.land()

}