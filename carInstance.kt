// create a c1 object of the Car class
val c1 = Car()

c1.brand = "Ford"
c1.model = "Bronco"
c1.brand = 2025

// access the properties and add some values to it

val c2 = Car()

c2.brand = "BMW"
c2.model = "M5"
c2.brand = 2024

val c3 = Car()

c3.brand = "Toyota"
c3.model = "Supra"
c3.brand = 2025

println(c1.brand)
println(c2.model)
println(c3.year)


// using constructors
class Car(var brand: String, var model: String, var year: Int) {
	// class function
	fun drive(){
		println("Vroooooooooooommmm!!!")
	}

	// class function with parameters
	fun speed(maxSpeed: Int){
		println("Max speed is: " + maxSpeed)
	}
}

fun main(){
	val c1 = Car("Ford", "Bronco", 2025)
	val c2 = Car("BMW", "M5", 2024)

	// calling the function
	c1.drive()
	c2.speed(200)
}