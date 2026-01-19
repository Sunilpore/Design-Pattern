package com.designpattern.dpattern.structural

import androidx.compose.foundation.text.input.rememberTextFieldState

//Abstract Product
interface Car {
   fun assemble()
}

interface CarSpecification {
    fun display()
}

//Abstract Factory Interface (CarFactory)
abstract class CarFactory {
    abstract fun createCar(): Car
    abstract fun getCarSpecification(): CarSpecification
}

///Concrete Implementation
class NorthAmericaFactory : CarFactory() {

    override fun createCar(): Car {
        return Sedan()
    }

    override fun getCarSpecification(): CarSpecification {
        return NorthAmericaSpecification()
    }

}

class EuropeFactory : CarFactory() {

    override fun createCar(): Car {
        return Jaguar()
    }

    override fun getCarSpecification(): CarSpecification {
        return EuropeSpecification()
    }

}


//Concrete Products
class Sedan : Car {

    override fun assemble() {
        print("Assembling Sedan Car")
    }
}


class Jaguar: Car {

    override fun assemble() {
        print("Assembling Jaguar Car...");
    }
}


class NorthAmericaSpecification : CarSpecification {
    override fun display() {
        print("North America Car SpecifSpecification: Car Safety");
    }
}

class EuropeSpecification : CarSpecification {

    override fun display() {
        print("Europe Car SpecifSpecification: Fuel Efficient");
    }
}


class CarFactoryClient {

    fun getCar(carType:Int): CarFactory{

        if(carType ==1){
            return NorthAmericaFactory()
        } else {
            return EuropeFactory()
        }
    }
}



fun main(){
    var sedanCar = CarFactoryClient().getCar(1)
    print("sedanCar==> name:${sedanCar.createCar().assemble()}")
}

