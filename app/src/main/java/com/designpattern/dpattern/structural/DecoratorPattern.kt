package com.designpattern.dpattern.structure



//Component
interface Coffee{
    fun cost():Int
    fun description():String
}

//Basic Component
class SimpleCoffee: Coffee{

    override fun cost(): Int = 50

    override fun description(): String = "Simple Coffee"
}

//Base Decorator
open class CoffeeDecorator(val coffee: Coffee): Coffee {

    override fun cost(): Int  = coffee.cost()

    override fun description(): String  = coffee.description()

}

//Concrete Decorators
class MilkDecorator(coffee: Coffee): CoffeeDecorator(coffee) {
    override fun cost(): Int = super.cost() + 10
    override fun description(): String  = super.description() + ", Milk"
}

class CreamDecorator(coffee: Coffee): CoffeeDecorator(coffee) {
    override fun cost(): Int = super.cost() + 15
    override fun description(): String  = super.description() + ", Cream"
}


fun main(){
    var myCoffee: Coffee = SimpleCoffee()
    print("base: ${myCoffee.description()} => ${myCoffee.cost()}\n")

    myCoffee = MilkDecorator(myCoffee)
    myCoffee = CreamDecorator(myCoffee)

    print("modified: ${myCoffee.description()} => ${myCoffee.cost()}")
}



