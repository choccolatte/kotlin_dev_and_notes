fun main(){
	println('Hello World from Android!!!');
	print('using print in the same line!!');
}

// combining variables

val name = "John"
println("Hello " +name)


// combining strings

val fname = "John"
val lname = "Smith"
val fulname = fname + lname
println("Hello " + fulname)

// adding ints

val x = 5
val y = 6
println(x + y) // prints the value of x + y

// finding length of a string 

var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
println("The length of the txt string is:" + txt.length )


// concatenating a string
var fname = "John"
var lname = "Smith"
println("My name is $fname $lname")