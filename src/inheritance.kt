fun main(){
var business=Businessman("hosea",29)
    business.eat()
    business.talk()
    business.walk()
    business.hobby()
    var teach=teacher("Ann",25)
    teach.eat()
    teach.talk()
    teach.walk()
    teach.school()
    var player=footballer("wanyama",30)
    player.eat()
    player.talk()
    player.walk()
    player.status()
}

open class Person(name:String,age:Int){
   open fun eat(){
        println("I love pilau")
    }
   open fun walk(){
        println("I love walking my dog")
    }
    fun talk(){
        println("I love talking to my mum")
    }
}
class Businessman(name:String,age:Int):Person(name,age){
    fun hobby(){
        println("i do farming too")
    }
}
class footballer(name:String,age:Int):Person(name,age){
fun status(){
    println("married")}
   override fun walk(){
        println("I love walking")
    }
}


class teacher(name:String,age:Int):Person(name,age){
      fun school(){
          println("Rusinga")
      }

    override fun eat() {
        super.eat()
        println("and cooking too")
    }
}