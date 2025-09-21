// Superclass
open class MyParentClass{
	val x = 5
}

// subclass
class MyChildClass: MyParentClass(){
	fun myFunc(){
		println(x) // x is now inherited from the superclass
	}
}

// create an object(instance) of MyChildClass and call myFunc
fun main(){
	val myObj = MyChildClass()
	myObj.myFunc()
}