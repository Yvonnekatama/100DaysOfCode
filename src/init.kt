fun main(){
    var mydancer=Dancer("Chloe",25)
    var seller=SalesPerson("Paul",36)
}

open class Human(var name:String,var age:Int) {
    init {
        println("I am $name")
        println("my age is $age")
    }

    open fun talk() {
        println("I love talking is good for my career")
    }
}

class Dancer(name:String,age:Int):Human(name,age) {
     init {
        println("I am a dancer")
    }
}
class SalesPerson(name:String,age:Int):Human(name,age) {

    init {
        println("I love my customers")
    }
    override fun talk(){
        println("Talking is good for my career")
    }
}