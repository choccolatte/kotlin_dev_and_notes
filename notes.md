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

- we already know that Kotlin supports familiar comparison conditions from maths, suchas -
	- Less than: a < b
	- Less than or equal to: a <= b
	- Greater than: a > b
	- Greater than or equal to: a >= b
	- Equal to a == b
	- Not Equal to: a != b

- you can use these conditions to perform different actions for different decisions.
- Kotlin has the following conditionals - 
	- Use `if` to specify a block of code to be executed, ifa specified conditionis true
	- Use `else` to specify a block of code to be executed, if the same condition is false
	- Use `else if` to specify a new condition to test, if the first condition is false
	- Use `when` to specify many alternative blocks of code to be executed

- **Note:**
- unlike Java, `if...else` can be used as a statement or as an expression(to assign a value to a variable) in Kotlin.


### If

- Use `if` to specify a block of code to be executed, if a specified conditionis `true`
- syntax - 
`
if (condition){
	// block of code to be exected if the condition is true
}
`

- Note that, `if` is in lowercase letters. Uppercase letters (If or IF) will generate an error.

- in the example below, we test two values to find out if 20 is greater than 18. If the condition is `true`, print some text:
- example - 
`
if (20 > 18){
	println("20 is greater than 18")
}
`

- we can also test variables:
- example - 
`
val x = 20
val y = 18
if (x > y){
	println("x is greater than y")
}
`

- examples explained
- in the example above, we use two variables, x and y, to test whether x is greater than y (using the `>` operator). As x is 20 and y is 18, and we know that 20 is greater than 18, we print to the screen that "x is greater than y".


### else

- Use `else` to specify a block of code to be executed, if the same condition is `false`
- syntax - 
- if (condition){
	// block of code to be exected if the condition is true
} else {
	// block of code to be executed if the condition is true
}

- example - 
`
val time = 20
if (time < 18){
	println("Good day!")
} else {
	println("Good evening.")
}
// outputs "GOod evening."
`

- example explained -
- in the example above, time (20) is greater than 18, so the condition is `false`, so we move on to the `else` condition and print to the screen "Good evening." If the time was less than 18, the program would print "Good day".


### else if

- Use `else if` to specify a new condition to test, if the first condition is `false`.
- syntax - 
`
if (condition1){
	// block of code to be executed if condition1 is true
} else if (condition2) {
	// block of code to be executed if condition1 is false and condition2 is true
} else{
	// block of code to be executed if condition1 and condition2 is false
}
`

- example - 
`
val time = 22
if (time < 10){
	println("Good morning.")
} else if(time < 20>){
	println("Good day.")
} else {
	println("Good evening!")
}
// outputs "Good evening"
`

- example explained - 
- in the example above, time(22) is greater than 10, so the first condition if `false`. The next condition, in the `else if` statement, is also `fasle`, so we move on to the `else` condition since condition1 and condition2 is both `false` - and print to the screen "Good evening."
- However, if the time was 14, our program would print "Good day."


### if ... else Expressions

- In Kotlin, we use if...else statements as expressions (assign a value to a variable and return it):
- example - 
`
val time = 20
val greeting = if (time < 18) {
	"Good day."
} else {
	"Good evening!"
}
println(greeting)
`

- **note:**
- when using `if` as an expression, you must also include `else` (required).
- You can also omit the curly braces `{}` when `if` has only one statement.

- example - 
`

fun main(){
	val time = 20
	val greeting = if (time < 18) "Good day."else "Good evening!"
	println(greeting)
}
`

- this example is similar to the 'ternary operator' (short hand if....else) in Java.


## When

- instead of writing many `if...else` conditions, you can use the `when` expression which is much easier to read.
- it is used to select one of many code blocks to be executed:
- example - use the weekday number to calculate the weekday name:
`
val day = 4
val result = when (day){
	1 -> "Monday"
	2 -> "Tuesday"
	3 -> "Wednesday"
	4 -> "Thursday"
	5 -> "Friday"
	6 -> "Satday"
	7 -> "Sunday"
	else -> "Invalid day"
}
println(result)
// outputs "Thursday" (day 4)
`

- the `when` expression is similar to the `switch` statement in Java.

- this is how it works -
	- the `when` variable (day) is evaluated once
	- the value of the day variable is compared with the values of each 'branch'
	- each branch starts with a value, followed by an arrow (->) and a result
	- if there is a match, the associated block of code is executed
	- `else` is used to specify some code to run if there is no match (base case)
	- in the example above, the value of `day` is `4`, meaning, "Thursday" will be printed.


## While Loop

- loops can execute a block of code as long as a specified condition is reached.
- loops are handy because they save time, reduce errors, and they make code more readable.

- the `while` loop loops through a block of code as long as a specified condition is `true`:
- syntax -
`
while (condition){
	// code block to be executed
}
`

- in the example below, the code in the loop will run, over and over again, as long as the counter variable(i) is less than 5:
- example - 
`
var i = 0
while (i < 5){
	println(i)
	i++
}
`

- **Note:**
- do not forget to increase the variable used in the condition, else the loop will never end since the condition will always meet whenever the code enters the loop.


### the Do...While loop

- the `do...while` loop is a variant of the `while` loop. This loop will execute the code block once, before checking if the condition is true, thenit will repeat the loop as long as the condition is true.
- syntax - 
`
do {
	// code blockto be executed
}
while (condition);
`

- the example below uses a `do...while` loop. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:
- example - 
`
var i = 0
do {
	println(i)
	i++
}
while (i < 5)
`

- **Note:**
- do not forget to increase the variable used in the condition, else the loop will never end since the condition will always meet whenever the code enters the loop.


## Break/Continue

### Break

- the `break` statement is used to jump our of a loop.
- this example jumps out of the loop when i is equal to 4:
- example -
`
var i = 0
while (i < 10){
	println(i)
	i++

	if (i == 4){
		break
	}
}
`

### Continue

- the `continue` statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
- this example skips the value of 4:
`
var i = 0
while (i < 10){
	if (i == 4){
		i++
		contiue
	}

	println(i)
	i++	
}
`


## Arrays

- arrays are used to store multiple values in a single variable, instead of creating seperate variables, for each value.
- to create an array, we use the `arrayOf()` function, and place the values in a comma-seperated list inside it:
- syntax - 
`
val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
`

### Access the Elemenets of Array

- we can access an aray elements by referring to the index number, inside square brackets.
- in this example, we access the value of the first element in cars:
- example -
`
val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
println(cars[0])
//outputs volvo
`

- **Note:**
- just like with Strings, Array indexes start with 0:[0] is the first element. [1] is the second, [2] the third, and so on.....


### Change an Array Element

- to change the value of a specific element, refer to the index number:
- syntax -
`
cars[0] = "Audi"
`
- example - 
`
val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
cars[0] = "Audi"
println(cars[0])
// now the output will be Audi instead of Volvo
`

### Array Length / Size

- to find out how many elements an array have, use the `size` property.
- example -
`
val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
println(cars.size)
// outputs 4
`

### Check if an Element Exists

- you can use the `in` operator to check if an element exists in an array.
- example -
`
val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
if ("Volvo" in cars){
	println("It exists")
} else {
	println("DOesnt exist.")
}
// output: It exists
`

### Loop Through an Array

- often when you work with an arrays, you need to loop through all of the elements.
- you can loop throuigh the array elements with the `for` loop.
- the following example outputs all elements in the cars array:
- example -
`
val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
for (x in cars){
	println(x)
}
// outputs all the array elements one by one
`


## For Loop

- often, when you work with arrays, you need to loop through all of the elements.
- to loop through array elements, use the `for` loop together with the `in` operator.
- example -
`
val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
for (x in cars){
	println(x)
}
`

- you can loop through all kinds of arrays. In the example above, we used an array of strings.
- in the example below, we loop through an array of integers:
- example - 
`
val nums = arrayOf(1, 5, 10, 15, 20, 25)
for (x in nums){
	println(x)
}
`

### Traditional For Loop

- unlike Java, and other programming languages, there is no traditional `for` loop in Kotlin.
- in Kotlin, the `for` loop is used to loop through arrays, ranges, and other things that contains a countable number of values.


## Ranges

- with the `for` loop, you can also create ranges of values with '..':
- example - print the whole alphabet:
`
for (char in 'a'..'z'){
	println(char)
}
`

- you can also create ranges of numbers:
- example -
`
for (nums in 5..50){
	println(nums)
}
`

- **note:**
- the first and the last value is included in the range.


### Check if a Value Exists

- you can also use the `in` operator to check if a value exists in a range:
- example - 
`
val nums = arrayOf(2, 4, 6, 8, 10)
if (2 in nums){
	println("It exists!")
} else {
	println("It doesnt exist!")
}
`

- example 2 -
`
val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
if ("BMW" in cars){
	println("It exists!")
} else {
	println("It doesnt exist!")
}
`


### Break or Continue a Range

- you can also use the `break` and `continue` keywords in a range/`for` loop:
- example - stop the loop when `nums` is equal to `10`:
`
for (nums in 5..50){
	if (nums == 10){
		break // will break the loop when condition meets 
	}
	println(nums)
}
`

- example 2 - skip the value of 10 in the loop, and continue with the next iteration:
`
for (nums in 5..50){
	if (nums == 10){
		continue // will skip 10 and then continue with the loop
	}
	println(nums)
}
`


## Functions

- a function is a block of code which only runs when its called.
- you can pass data, known as parameters, into a function.
- Functions are used to perform certain actions, and they are also known as methods.


### Predefined Functions

- so it turns out you already known what a function is. You have been using it the whole time here.
- for example, `println()` is a function. It is used to output/print text to the screen:
- example - 
`
fun main(){
	println("Hello World!")
}
`

### Create Your Own Functions

- to create your own function, use the `fun` keyword, and write the name of the function, followed by parantheses():
- example - create a function named "myFun" that should output some text:
`
fun myFun(){
	println("New Function")
}
`

### Calling a Function

- now that we have already created a function, we can execute it by calling it.
- to call a function, write the name of the function followed by a parantheses ().
- in the following example, `myFun()` will print some text (the action), when its called:
- example -
`
fun myFun(){
	println("New Function")
}

fun main(){
	myFun() // calls myFun
}

// output: New Function
`

- a function can be called multiple times, if you want.
- example -
`
fun main(){
	myFun()
	myFun()
	myFun()
}
// output: New Function
// output: New Function
// output: New Function
`

### Function Parameters

- information can be passed to functions as parameters.
- parameters are specified after the function name, inside the parantheses. you can add as many parameters as you want, just seperate them with a comma. Just note that you must specify the type of each parameter (Int, String, etc.)
- the following example has a function that takes a `string` called fname as paraeter. When the function is caled, we pass along a first name, which is used inside the function to print the full name:
- example -
`
fun myFunc(fname: String){
	println(fname + " Doe")
}

fun main(){
	myFunc("John")
	myFunc("Joe")
	myFunc("George")
}

//output: John Doe
//output: Joe Doe
//output: George Doe
`

- **Note:**
- when a parameter is passed to the function, it is called an - argument. So, from the example above: `fname` is a parameter, while John, Joe and George are arguments.


### Multiple Parameters

- you can have as many parameters as you like:
- example - 
`
fun myFunc(fname: String, age: Int){
	println(fname + " is " age)
}

fun main(){
	myFunc("John", 25)
	myFunc("Joe", 30)
	myFunc("George", 18)
}

// output: John is 25
// output: Joe is 30
// output: George is 18
`

- **Note:**
- when working with multiple parameters, the function call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.


### Return Values

- in the example above, we used functions to output a value. In the following example, we will use a function to return a value and assign it to a variable.
- to return a value, we use the `return` keyword, and specify the return type after the function's parantheses (`Int` in this example):
- example - a function with one `Int` parameter and an `Int` return type -
`
fun myFun(x: Int): Int {
	return (x + 5)
} 

fun main(){
	var result = myFunc(50)
	println(result)
}

// output - 55 (5 + 50)
`

- using two parameters;
- example - a function with two `Int` parameters, and `Int` return type -
`
fun myFun(x: Int, y: Int): Int {
	return (x + y)
} 

fun main(){
	var result = myFunc(50, 500)
	println(result)
}

// output - 550 (50 + 500)
`


### Shorter Syntax for Return Values

- there is also a shorter syntax for returning values. You can use the `=` operator instead of `return` without specifying the return type. 
- Kotlin is smart enough to automatically find out what it is:
- example -
`
fun myFunc(x: Int, y:Int) = x + y

fun main(){
	var result = myFunc(50, 500)
	println(result)
}

//output - 550 (50, 500)
`


## Classes - OOP

- OOP stands for Object Oriented Programming.
- procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

- Object-oriented programming has several advantages over procedural programming -
	- OOP is faster and easier to execute.
	- OOP provides a clear structure for the programs.
	- OOP helps to keep the Kotlin code DRY "Dont Repeat Yourself", and makes the code easier to maintain, modify and debug.
	- OOP makes it possible to create full reusable applications with less code and shorter development time.

- **Tips:**
- The - DRY "Dont Repeat Yourself" principle is about reducing the repetations of code. You should extract out the codes that are common for the application, and place them at a singleplace and reuse them instead of repeating it.


### What are Classes and Objects?

- classes and objects are two main aspects of object-oriented programming.
- example - 
- class - fruit
- objects - Apple, Banana, Mango

- example 2
- Class - Car
- Objects - Volvo, BMW, Audi

- So, a class is a template for objects, and an object is an instance (an example, or a single occurance) of a class.
- when the individual objects are created, they inherit all the variables and methods from the class.


## Classes - Classes/Objects

- everything in Kotlin is associated with classes and objkects, along with its properties, and functions. 
- For example, in real life, a car is an object. The car has properties, such as brand, weight and color, and functions, such as drive and brake.
- a Class is like an object constructor, or a 'blueprint' for creating objects.


### Creating a Class

- to create a class, use the `class` keyword, and specify the name of the class.
- example - create a Car class with some properties (brand, model and year)
`
class Car{
	var brand = ""
	var model = ""
	var year = 0
}
`

- a property is basically a variable that belongs to the class.
- Tip: It is considered a good practise to start the name of the class with an upper case letter, for better organization.


### Create an Object

- now we can use the class named Car to create objects.
- in the example below, we create an object of Car called c1, and then we access the properties of c1 by uising the dot syntax (.), just like we did to access arrays and string properties:
- example -
`
// create a c1 object of the Car class
val c1 = Car()

// access the properties and add some values to it
c1.brand = "Ford"
c1.model = "Bronco"
c1.brand = 2025

println(c1.brand)
println(c1.model)
println(c1.year)
`

### Multiple Objects

- you can also create multiple objects of one class:
- example -
`
// create a c1 object of the Car class
val c1 = Car()

c1.brand = "Ford"
c1.model = "Bronco"
c1.brand = 2025

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
`


## Classes - Constructors

- earlier, we created an object of a class, and specified the properties inside the class, like this:
- example -
`
class Car{
	var brand = ""
	var model = ""
	var year = 0
}

fun main(){
	val c1 = Car()
	c1.brand = "Ford"
	c1.model = "Bronco"
	c1.brand = 2025
}
`

- in Kotlin, there's a faster way of doing this, by using a constructor.
- a constructor is a special function, and it is defined by using two parantheses `()` after the class name. You can specify the properties inside of the parantheses (like passing parameters into a regular function).
- the constructor will initialize the proeprties when you create an object of a class. Just remember to specify the type of the property/variable:

- example -
`
class Car(var brand: String, var model: String, var year: Int)

fun main(){
	val c1 = Car("Ford", "Bronco", 2025)
}
`

- now its even easier to specify multiple objects of one class:
- example -
`
class Car(var brand: String, var model: String, var year: Int)

fun main(){
	val c1 = Car("Ford", "Bronco", 2025)
	val c2 = Car("BMW", "M5", 2024)
}
`


## Classes Functions

- you can also use functions inside a class, to perform certain actions:
- example - create a `drive()` function inside the `Car` class and call it:
`
class Car(var brand: String, var model: String, var year: Int) {
	// class function
	fun drive(){
		println("Vroooooooooooommmm!!!")
	}
}

fun main(){
	val c1 = Car("Ford", "Bronco", 2025)
	val c2 = Car("BMW", "M5", 2024)

	// calling the function
	c1.drive()
	c2.drive()
}
`

- Tip:
	- when a function is declared inside a class, it is known as a class function, or a member function.

- Note:
	- when an object of the class is created, it has access to all of the class functions.


### Class Fnction Parameters

- just like with regular functions, you can pass parameters to a class function:
- example - create two functions: `drive()` and `speed()` and pass parameters to the `speed()` function:
`
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
`


## Classes - Inheritance

- in Kotlin, it is possible to inherit class properties and functions from one class to another. We group the 'inheritence concept' into two categories:

	- Subclass (child) - the class that inherits from another class
	- Superclass (parent) - the class being inherited from

- in the example below, `MyChildClass` (subclass) inherits the properties from `MyParentClass` (superclass):
- example -
`
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
`