package com.designpattern.dpattern.behavioral.mediator


//ChatMediator Interface
interface ChatMediator {
    fun sendMessage(message: String, user: User)
}


class ChatRoom : ChatMediator {

    override fun sendMessage(message: String, user: User) {
        println("${user.getUserName()} send Message: $message")
    }
}

//------------------------------------------------------------------------------------------------//

//Colleague Interface
interface User {
    fun sendMessage(message: String)
    fun receiveMessage(message:String)
    fun getUserName():String
}


class ChatUser(val name:String, val mediator: ChatMediator) : User {

    override fun sendMessage(message: String) {
        mediator.sendMessage(message, this)
    }

    override fun receiveMessage(message: String) {
        println("$name received Message: $message")
    }

    override fun getUserName(): String {
        return name
    }

}


fun main(){
    val chatMediator: ChatMediator = ChatRoom()

    val user1 = ChatUser("Mayank", chatMediator)
    val user2 = ChatUser("Rohit", chatMediator)

    user1.sendMessage("Hello, Rohit!")
    user2.sendMessage("Hi, Mayank! How are you?")
}



