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

- like you have already seen with the example above, the `println()` method is often used to display variables.
- to combine both text and a variable, use the `+` character:

- example -
`
val name = "John"
println("Hello " +name)
`

- you can also use the `+` character to add a variable to another variable.
- example

`
val fname = "John"
val lname = "Smith"
val fulname = fname + lname
println("Hello " + fulname)

`

- for numeric values, the `+` character works as a mathematical operator:
- example 
`
val x = 5
val y = 6
println(x + y) // prints the value of x + y
`

- from the example above, we can expect - 
	- x stores the value 5
	- y stores the value 6
	- then we use the `println()` method to display the value of x + y, which is 11.


### Variable Names

- a variable can have a short name (like x and y) or more descriptive names (age, sum, totalVolume).

- the general rule for Kotlin variables are - 
	- names can contain letters, digits, underscores, and dollar signs.
	- names should start with a letter.
	- names can also begin with $ and _ (but we will not use here.)
	- names are case sensitive ("myVar" and "myvar" are different variables).
	- names should start with a lowercase letter and it cannot contain whitespaces.
	- reserved words (like Kotlin keywords, such as `var` or `String`) cannot be used as names.


**camelCase Variables**

- you might also notice that we used firstName and lastName as variables names in the example above, instead of firstname and lastname. This is called 'camelCase', and it is considered as good practise as it makes it easier to read when you have a variable name with different words in it, for example, 'myFavFood' or 'rateActionMovies', etc.



## Data Types

- In Kotlin, the type of a variable is decided by its value - 

- example -
	val myNum = 5 //Int
	val myDoubleNum = 5.99 // Double
	val myLetter = 'D' // Char
	val myBool = true // Boolean
	val myText = 'Hello' // String

- however, you learned earlier that it is possible to specify the type of data if you want to - 

- example -
	val myNum: Int = 5 //Int
	val myDoubleNum: Double = 5.99 // Double
	val myLetter: Char = 'D' // Char
	val myBool: Boolean = true // Boolean
	val myText: String = 'Hello' // String

- sometimes, you have to specify the type, and often you dont. Anyhow, it is good to know what the different types represent.
- you will learn more about them when you need to specify the type later.
- data types are divided into different groups - 

	- Numbers
	- Characters
	- Booleans
	- Strings
	- Arrays


### Numbers

- numbers types are divided into two groups - 
	- Integer Types - stores whole numbers, positive or negative (such as 123, or -456), without decimals. Valid types are - `Byte`, `Short`, `Int`, and `Long`.

	- Floating point types - represents numbers with a fractional part, containing one or more decimals. There are two types - `Float` and `Double`.

- if you dont specify the type for a numeric variable, it is most often returned as `Int` for whole numbers and `Double` for floating point numbers.

### Integer Types

#### Byte
- the `Byte` data type can store whole numbers from -128 to 127. This can be used instead of `Int` or other integer types to save memory when you are certain that the value will be within -128 and 127.
- example - 
`
val myNum: Byte = 100
println(myNum)
`

#### Short
- The `Short` data type can store whole numbers from -32768 to 32767.
- example - 
`
val myNum: Short = 5000
println(myNum)
`

#### Int
- the `Int`data type can store whole numbers from -2147483648 to 2147483647:
- example -
`
val myNum: Int = 100000
println(myNum)
`

#### Long
- the `Long` data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when `Int` is not large enough to store the value. Optionally, you can end the value with an "L":
`
val myNum: Long = 15000000000L
println(myNum)
`

#### Difference Between Int and Long
- a whole number is an `Int` as long as it is up to 2147483647. If it goes beyond that, it is defined as `Long`:
- example -
`
val myNum1 = 2147483647 // Int  
val myNum1 = 2147483648 // Long
`

### Floating Point Types

- floating point types represent numbers with a decimal, such as 9.99 or 3.1415.
- the the `Float` and `Double` data types can store fractional numbers:

**Float example**
`
val myNum: Float = 5.75F
println(myNum)
`

**Double example**
val myNum: Double = `9.99`
println(myNum)

- using `Float` or `Double`?
- the precision of a floating point value indicates how many digits the value can have after the decimal point. The precision of `Float` is only six or seven decimla digits, while `Double` variables have a precision of about 15 digits. Therefore, it is safer to use `Double` for most calculations.
- also, note that you should end the value of a `Float` type with an 'F'.


**Scientific Numbers**
- a floating point number can also be a scientific number an 'e' or 'E' to indicate the power of 10:
- example - 
`
val myNum1: Float = 35E3F
val myNum2: Float = 12E4
println(myNum1)
println(myNum2)
`


### Booleans

- the `Boolean` data type can oly take the values `true` or `false`:
- example - 
`
val isKotlinFun: Boolean = true
val isKarelaTasty: Boolean = false
println(isKotlinFun)
println(isKarelaTasty)
`

- boolean values are mostly used for conditional testing, which we will learn later.


### Characters

- the `Char` data type is used to store a single character. A char value must be surrounded by single quotes, like 'A' or 'C':
- example -
`
val myGrade: Char = 'B'
println(myGrade)
`

- unlike Java, you cannot use ASCII values to display certain characters. The value 66 would output a 'B' in Java, but it will generate an error in Kotlin:
- example - 
`
val myLetter: Char = 66
println(myLetter) // will throw Error
`


### Strings

- the `String` data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:
- example - 
`
val myText: String = "Hello World"
println(myText)
`

### Arrays

- arrays are used to store multiple values in a single variable, instead of declaring seperate variables for each value.


### Type Conversion

- type conversion is when you convert the value of one data type to another data type - like from int to floats.
- in Kotlin, numeric type conversion is different from Java. For example, it is not possible to convert an Int type to a Long type with the following code:

`
val x: Int = 5
val y: Long = x
println(y) // Error: Type mismatch
`

- to convert a numeric data type to another type, you must use one of the following functions: `toByte()`, `toShort()`, `toInt()`, `toLong()`, `toFloat()`, `toDouble()`, `toChar()`.
- example - 
`
val x: Int = 5
val y: Long = x.toLong()
println(y) // no error as we used the funciton - toLong()

`


## Operators

- operators are used to perform operations on variables and values.
- the value is called an operand, while the operation(to be performed between the two operands) is defined by an operator.

	- operand = 100
	- operator = +
	- operand = 50

- in the example below, the numbers 100 and 50 are operands and the `+` sign is an operator.
- example - 
`
var x = 100 + 50
`

- although the `+` operator is often used to add together two values, like in our example above, it can also be used to add together a variable and a value, or a variable and a variable:
- example - 
`
var sum1 = 100 + 50 // 150 (100 + 50)
var sum2 = sum1 + 250 // 400 ( 150 + 250)
var sum3 = sum2 + sum2 // 800 (400 + 400)
`

- Kotlin divides the operators into the following groups - 
	- Arithmetic Operators
	- Assignment Operators
	- Comparison Operators
	- Logical Operators


### Arithmetic Operators

- arithmetic operators are used to perform the common mathematical operations - 
	- | Operator | Name | Description | Example
	- + | Addition | Adds together two values | x + y
	- - | Subtraction | Subtracts one value from another | x - y
	- * | Multiplication | Multiplies two values | x * y
	- / | Division | Divides one value from another | x / y
	- % | Modulous | Returns the divisin remainder | x % y
	- ++ | Increment | Increases the value by 1 | x++
	- -- | Decrement | Decreases the value by 1 | x--


### Assignment Operators

- assignment operators are used to assign values to variables.
- in the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:
- example - 
`
var x = 10
`

- the addition assignment operator (+=) adds a value to a variable:
- example 
`
var x = 10
x += 5
`

- a list of all assignment operators:
	- Operator | Example | Same As
	- = | x = 5 | x = 5
	- += | x += 1 | x = x + 1
	- -= | x -= 15 | x = x - 15
	- *= | x *= 125 | x = x * 125
	- /= | x /= 135 | x = x / 135
	- %= | x %= 50 | x = x % 50


### Comparison Operators

- comparison operators are used to compare two values, and returns a `Boolean` value: either `true` or `false`

- Operator | Name | Example
- == | Equal to | x == y
- != | Not Equal to | x != y
- > | Greater than  | x > y
- < | Less than | x < y
- >= | Greater than or Equal to | x >= y
- <= | Less than or Equal to | x <= y


### Logical Operators

- logical operators are used to determine the logic between variables or values:

- Operator | Name | Description | Example
- && | Logical and | Returns true if both statements are true | x < 5 && x < 10
- || | Logical or | Returns true if one of the statements is  true | x < 5 || x < 10
- ! | Logical not | Reverses the result, returns false if the result is true |


## Strings

- strings are used for storing text.
- a string contains a collection of characters surrounded by double quotes:
- example - 
`
var greeting = "Hello"
`

- unlike Java, you do not have to specify that the variable should be a `String`. Kotlin is smart enough to understand that the greeting variable in the example above is a `String` because of the double quotes.
- however, just like with other data types, you can specify the type if you insist:
- example - 
`
var greeting: String = "Hello"
`

- **Note** - if you want to create a `String` without assigning the value (and assign the value later), you must specify the type while declaring the variable, else it will throw an error:

- good example - 
`
var name: String
name = "John"
println(name) // works fine
`

- bad example - 
`
var name
name = "John"
println(name) // throws Error
`

### Accessing a String

- to access the chracters (elements) of a String, you must refer to the index number inside square brackets.
- String indexes start with a 0. In the example below, we access the first and third element in `txt`:
- example - 
`
var txt = "Hello World!"
println(txt[0]) // first element (H)
println(txt[2]) // third element (l)
`

- [0] is the first element. [1] is the second element, [2] the third and so on.


### String Length

- A String in Kotlin is an object, which contains properties and functions that can perform certain operations on strings, by writing a dot character (.) after the specific string variable. 
- For example, the length of a string can be found with the `length` property:
- example -
`
var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
println("The length of the txt string is:" + txt.length )
`

### String Functions

- there are many string functions available, for example `uppercase()` and `lowercase()`:
- example - 
`
var txt = "Hello World"
println(txt.uppercase()) // outputs "HELLO WORLD"
println(txt.lowercase()) // outputs "hello world"
`


### Comparing Strings

- the `compareTo(string)` function compares two strings and returns 0 if both are equal:
- example - 
`
var txt1 = "Hello World"
var txt2 = "Hello World"
println(txt1.compareTo(txt2)) // outputs 0 (they are equal)
`

### Finding a String in a String

- the `indexOf()` function returns the index (the position) of the first occurance of a specified text in a string (including whitespace):
- example - 
`
var txt = "Please locate where 'locate' occurs!"
println(txt.indexOf("locate")) // Outputs 7
`

- remember that Kotlin counts positions from 0.
- 0 is the first position in a string, 1 is the second, 2 the third...and so on


### Quotes inside a String

- to use quotes inside a string, use single quotes (').
- example -
`
var txt1 = "It's alright"
var txt2 = "That's nice"
`


### String Concatenation

- the `+` operator can be used between strings to add them together to make a new string. This is called concatenation:
- example -
`
var fname = "John"
var lname = "Smith"
println(fname + " " + lname)
`

- note that, we have added an empty text (" ") to create a space between fname and lname on print.
- you can also use the `plus()` function to concatnate two strings:
- example - 
`
var fname = "John"
var lname = "Smith"
println(fname.plus(lname))
`


### String Templates/Interpolation

- instead of concatenation, we can also use "string templates", which is an easy way to add variables and expressions inside a string.
- just refer to the variable with the `$` symbol:
- example - 
`
var fname = "John"
var lname = "Smith"
println("My name is $fname $lname")
`

- **note:** - 'String Templates' is a popular feature of Kotlin, as it reduces the amount of code. FOr example, you do not have to specify a whitespace between firstName and lastName, like we did earlier in the example.


## Booleans

- very often, in programming, you will need a data type that can only have one of two values, like:
	- YES/NO
	- ON/OFF
	- TRUE/FALSE
	
- For this, Kotlin has a `Boolean` data type, which can take the values `true` or `false`.


### Boolean Values

- a boolean type can be declared with the `Boolean` keyword and can only take the values `true` or `false`:
- example - 
`
val isKotlinFun: Boolean = true
val isKarelaTasty: Boolean = false
println(isKotlinFun) // outputs true
println(isKarelaTasty) // outputs false
`

- just like you have learned with other data types in previous topics, the example above can also be written specifying the type, as Kotlin is smart enough to understand that the variables are Booleans:
- example -
`
val isKotlinFun = true
val isKarelaTasty = false
println(isKotlinFun) // outputs true
println(isKarelaTasty) // outputs false
`

### Boolean Expressions

- a boolean expression returns a Boolean value: `true` or `false`.
- you can use a comparison operator, such as the greater than (`>`) operator to find out if an expression (or a variable) is true:
- example - 
`
val x = 10
val y = 9
println(x > y) // returns true, because 10 is greater than 9
`

- or even easier:
- example -
`
println(10 > 9) // returns true, because 10 is greater than9
`

- in the example below, we use the equal to (==) operator to evaluate an expression:
- example -
`
val x = 10;
println(x == 10) // returns true, because the value of x is equal to 10
`

- example -
`
println(10 == 15) // returns false, because 10 is not equal to 15
`

- **note:** the boolean value is the basis for all Kotlin comparisons and conditions.


## Conditions and If ... Else

### If
### else
### else if
### if ... else Expressions

