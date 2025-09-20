# Kotlin Notes

- kotlin is a modern, trending programming language released by JetBrains in 2016. 
- It has become very popular since it is compatible with Java, which means that Java code and libraries can be used in Kotlin programs.
- It is used for - 
	- mobile apps
	- web development
	- server side apps
	- data science etc.

- Kotlin is fully compatible with Java, and works on multiple platforms - windows, mac, linux, pi, etc.


## Kotlin Syntax

- basic kotlin syntax looks like this -
`
fun main(){
	println("Hello World!!!")
}
`

- here, the `fun` keyword is used to declare a function. A function is a block of code designed to perform a particular task. In the example above, it declares the `main()` function.
- the `main()` function is something you will see in every Kotlin program. This function is used to 'execute' code. Any code inside the `main()` function's curly brackets `{}` will be 'executed'.
- FOr example, the `println()` function inside the `main()` function, meaning that this will be executed. The `println()` function is used to output/print text, and in our example it will output "Hello World".

- Note: in Kotlin, code statements do not have to end with a semicolor(;) (which is often required for other programming languages, such as Java, C++, C#, etc).


### Main Parameters

- before Kotlin v 1.3, it was required to use the `main()` function with parameters, like: `fun main(args : Array<String>)`. The example above had to be written like this - 
`
fun main(args: Array<String>){
	println("Hello World!!")
}
`

- however, this is not required anymore, and the program will run fine without it. However, if you want, you can still use the older code versions and not get any errors.



## Output (Print)

- the println() function is used to output values/print text:

`
fun main(){
	println("Hello World!!!")
}
`

- you can add as many `println()` functions as you want in a single file. Note that, it will add a new line for each print function you call, meaning, each item will be printed in a new line.

`
fun main(){
	println("Hello World!!!")
	println("Hello World again!!!")
	println("Hello World and again!!!")
}
`

- you can also print numbers, and perform mathematical calculations using println function:

`
fun main(){
	println(3 + 3)
}
`

### The print() function

- there is also a `print()` function, which is simialr to `println()`. The only difference is that it does not insert a new line at the end of the output.

`
fun main(){
	print("Hello World!!!")
	print("Hello World again in the same line!!!")
}
`

- note that, the print() function will continue with in the same line, and will not give any space after beginning the new line. To avoid that, you must give space at the end of the previous line manually ( ), or using an operator.


## Comments

- comments can be used to explain Kotlin code, and to make it more readable. It can also be used to prevent execution when testing alternative code.


### Single-line Comments

- single line comments started with two forward slashes (//).
- any text between `//` and the end of the line is ignored by Kotlin and will not be executed.

`
fun main(){
	// this is a comment and it will not execute
	println("Hello World!!!") // this is also a comment and you can write it like this as well. The code before comment will be executed.
}
`

### Multi-line Comments

- multi-line comments starts with `/*` and ends with `*/`.
- any text between the start of the comment and end of it will be ignored by Kotlin.

`
fun main(){
	/*This is a 
	multi-line comment.
	it will not run*/
	println("Hello World!!!")
}
`


## Variables

- variables are containers for storing data values.
- to create a variable, use `var` or `val`, and assign a value to it with the equal sign (=).

- syntax
`
var varName = value
val varName = value
`

- example
`
var name = 'John'
val year = 2000

println(name) // prints the name value
println(year) // prints the year value
`

- the difference between `var` and `val` is that variables declared with the `var` keyword can be changed/modified, while `val` variables cannot, they are constant. 


### Variable Type

- unlike other programming languages, variables in Kotlin do not need to be declared with a specified type (like "String" for text, or "Int" for numbers)
- to create a variable in Kotlin that should store text and another that should store a number, an example below - 

`
var name = 'John' // String (text)
val year = 2000 // Int (number)

println(name) // prints the name value
println(year) // prints the year value
`

- Kotlin is smart enough to understand that "John" is a `String` (text) and 2000 is an `Int` (number) variable.
- However, if you want, it is still possible to specify the variables type - 

`
var name: String = 'John' // String (text)
val year: Int = 2000 // Int (number)

println(name)
println(year)
`

- you can also declare a variable without assigning the value, and assign the value later. However, this is only possible when you specify the type:
- example - that will work -

`
var name: String
name = "John"
println(name)
`

- example - that will NOT work -

`
var name
name = "John"
println(name)
`

### Notes on `val`

- when you create a variable with the `val` keyword, the value cannot be changed/reassigned. - it becomes a constant.
- here's an example - 

`
val name = "John"
name = "Rob" // Error (Val cannot be reassigned)
println(name)
`

- when using `var`, you can change the value whenever you want - not a constant

`
var name = "John"
name = "Rob"
println(name)
`

### When to use `val`?

- the `val` keyword is useful when you want a variable to always store the same value, like Pi - 3.14159...
- example 

`
val pi = 3.14159265359
println(pi)
`

### Display Variables