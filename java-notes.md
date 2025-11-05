# Java

## Syntax

- sample java code - 
`
public class Main{
	public static void main(String[] args){
		String name = "John";
		System.out.println("Hello " + name)
	}
}
`

- here, every line of code that runs in Java must be inside a `class`. the class name should always start with an uppercase first letter. In our example, we named the class Main.
	- Note: Java is case-sensitive. `MyClass` and `myclass` would be treated as two completely different names.
- the name of the Java file must match the class name. So, if your class is called `Main`, the file must be saved as `Main.java`. This is because Java uses the class name to find and run your code. If the names dont match, Java will give an error and the program will not run.
- When saving the file, save it using the class name and add `.java` to the end of the filename. To run the example above on your computer, make sure that Java is properly installed.


### the Main Method

- the `main()` method is required in every Java program, it is where the program starts running:

`
public static void main(String[] args)
`

- any code placed inside the `main()` method will be executed.


### System.out.println()

- inside the `main()` method, we can use the `println()` method to print a line of text to the screen:
`
public static void main(String[] args){
	System.out.println("Hello World!")
}
`

- Note:
	- the curly braces - `{}` - marks the beginning and the end of a block of code.
	- `System.out.println()` may look long, but you can think of it as a single command that means - "Send this text to teh screen."
	- here's what each part means (You will learn the details later:)
		- System - is a built in java class
		- out - is a member of `System`, short for 'output'
		- println() - is a method, short for 'print line'.
	- FInally, remember that each java statement must end with a semicolon(;).


## Statements 

- a computer program is a list of 'instructions' to be 'executed' by a computer.
- in a programming language, these programming instructions are called statements.
- the following statement 'instructs' the compiler to print the text 'Java is fun'  to the screen.

`
System.out.println("Java is fun!');
`

- it is important that you end the statement with a semicolon - ;
- if you forget the semicolon - ; -, an error will occur adn the program will nott run:
- example -
`
System.out.println("Java is fun!')
`
- result will be - errror: ';' expected

- tip:
- you can think of a statement like a sentence in English. Just as sentences end with a period (.), Java statements end with a semicolon - ;


### Many Statements

- most Java programs contain many statements.
- the statements are executed, one by one, in the same order as they are written:
- example - 
`
System.out.println("Hello World');
System.out.println("Java is fun!');
`

- example explained:
	- from the examples above, we have two statements - 
		1. System.out.println("Hello World');
		2. System.out.println("Java is fun!');
	- the first statement is executed first (print "Hello World!" to the screen).
	- the second statement is executed last (print "Java is fun!" to the screen).


## Output/Print

### Print Text

- we already know that we can use `println()` method to output alues or print text in Java:
- example 
`
System.out.println("Hello World!");
`

- we can also add as many `println()` methods as we wnat, note that it will add a new line for each method:
- example - 
`
System.out.println("Hello World');
System.out.println("Java is fun!');
`

### Double Quotes

- text must be wrapped inside double quotations marks`""`.
- if you forget the double quotes, an error occurs:
- example 
`
System.out.println("Hello World!"); // correct
`

- wrong way to use it
`
System.out.println(Hello World!); // incorrect
`

### The Print() Method

- there is also a `print()` method, which is similar to `println()`
- the only difference is that it does not insert a new line at the end of the output.
- example -
`
System.out.print("Hello World! ");
System.out.print("This will also print on the same line");
`

- note that we add an extra space after "Hello World! " in our example above for better readibility.


## Output Numbers

- you can also use the `println()` method to print numbers.
- however, unlike texts, we dont put numbers inside double quotes:
- example - 
`
System.out.println(3);
System.out.println(335);
System.out.println(300000);
`

- you can also perform mathematical calculations inside the `println()` method:
- example - 
`
System.out.println(3 + 50);
System.out.println(3 * 5);
`


## Comments

- comments can be used to explain Java code, and to make it more readable. It can also be used to prevent execution when testing alternative code.

### Single Line Comments

- single line comments starts with two forward slashes (`//`)
- any text between `//` and the end of the line is ignored by Java (will not be executed).
- example -
`
// this is a comment
System.out.println("Hello World!");
`

- this is also a correct single line comment example, but it uses it at the end of the code block -
`
// this is a comment
System.out.println("Hello World!"); // this is also a comment
`

### Multi Line Comments

- multi line comments starts with `/*` and ends with `*/`.
- any text between `/*` and `*/` will be ignored by Java.
- example - 
`
/* this is a multi line 
comment */
System.out.println("Hello World!");
`

- its up to you to decide which comment you want to use. Normally, we use single line comments (//) for short comments, and multi line comments (*/ /*) for longer comments.


## Variables

- variables are basically containers for storing data values. 
- in Java, there are different types of variables - 
	- `String` - stores text, such as "Hello". String values are surrounded by double quotes.
	- `int` - stores integers (whole nmbers), without decimals, such as 123 or -123.
	- `float` - stores floating point numbers, with decimals, such as 19.99 or -19.99.
	- `char` - stores single characrters, such as 'a' or 'B'. Char values are surrounded by single quotes.
	- `boolean` - stores values with two states - true or false.


### Declaring (Creating) Variables

- to create a variable in Java, you need to - 
	- choose a type (like `int` or `string`)
	- give the variable a name (like x, age, or name)
	- optionally assign it a value using =

- syntax -
`
type variableName = value
`

- for example, if you want to store some text, you can use a `String`:
- example - create a variable called name of type `String` and assign it the value "John". Then, we use `println()` to print the name variable.
`
String name = "John";
System.out.println(name);
`

- to create a variable that should store a number, you can use `int`:
- example - create  a variable called myNum of type `int` and assign it the value 15 - 
`
int myNum = 15;
System.out.println(myNum);
`

- you can also declare a variable without assigning the value, adn assign the value later:
- example -
`
int myNum;
myNum = 15;
System.out.println(myNum);
`

- note that if you assign a nwe value to an existing variable, it will overwrite the previous value:
- example - change the value of myNum from 15 to 25 -
`
int myNum = 15;
myNum = 20; // myNum is now 20
System.out.println(myNum);
`

### Final Variables

- if you dont want others (or yourself) to overwrite existing values, use the `final` keyword (this will declare the variable as "final" or "constant", which means unchangable and read-only)-
- example - 
`
final int myNum = 15;
myNum = 20; // will generate an error: cannot assign a value to a final variable
`

### Other Types

- a demonstration of how to declare variable of other types -
- example - 
`
int myNum = 15;
float myFloat = 5.95f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
`


## Print Variables

- the `println()` method is often used to display variables.
- to combine both texts and variable, use the `+` operator.
- example - 
`
String name = "John";
System.out.println("Hello " + name);
`

- you can also use the `+` character to add a variable to another variable.
- example -
`
String fname = "John";
String lname = "Smith";
String fullName = fname + lname;
System.out.println("Hello " + fullName);
`

- in Java, the `+` symbol has two meanings - 
	- for text (strings), it joins them together (called concatenation).
	- for numbers, it adds values together.

- for numeric values, the `+` character works as a mathematical operator (notice that we use `int` (integer) variables here):
- example - 
`
int x = 5;
int y = 6;
System.out.println(x + y); // pPrint the value of x + y
`

- from the example above, here's what happens step by step - 
	- x stores the value 5
	- y stores the value 6
	- println() displays the result of x + y, which is 11


### Mixing Text and Numbers

- be careful when combining the text and numbers in the same line of code. Without parantheses, Java will treat the numbers as text after the first string:
- example - 
`
int x = 6;
int x = 10;

System.out.prinln("The sum is " + x + y); // prints: The sum is 610
System.out.prinln("The sum is " + (x + y)); // prints: The sum is 16
`

- explanation - 
- in the first line, Java combines "the Sum is " with `x`, creating the string "The sum is 6". Then, `y` is added to that string, so it becomes, "The sum is 610".
- in the second line, the parantheses makes sure `x + y` is calculated first (resulting in 16), so the output is "The sum is 16".


## Declare Multiple Variables

- to declare more than one variable of the same type, you can use the comma-seperated list.
- example - 
- instead of writing:
`
int x = 10;
int y = 100;
int z = 1;
System.out.println(x + y + z); // 111
`
- you can write this instead - 
`
int x = 10, y = 100, z = 1;
System.out.println(x + y + z); // 111
`

- note that, declaring many variables in one line is shorter, but writing one variable per line can sometimes make the code easier to read.


### One Value to Multiple Variables

- you can also assign the same value to multiple variables in one line:
- example - 
`
int x, y, z;
x = y = z = 50;
System.out.println(x+y+z) // 150
`


## Identifiers

- all java variables must be identified with unique names.
- these unique names are called identifiers.
- identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
- Note: It is recommended to use descriptive names in roder to create understandable and maintainable code.
- example - 
`
// Good
int minutesPerHour = 100;

// bad
int m = 100;
`

- the general rules for naming variables are:
	- names can contain letter, digits, underscores, and dollar signs.
	- names must begin with a letter.
	- names should start with a lowercase letter, and cannot contain whitespaces.
	- names can also begin with $ and _
	- names are case-sensitive ("MyVar" and "myvar" are different variabels)
	- reserved words (like Java keywords, such as `int` and `boolean`) cannot be used as names


### Invalid Identifiers

- here are some examples of invalid identifiers that would cause errors:
- example -
`
// invalid identifiers
int 2ndNumber = 5; // cant start with a digit
int my var = 10; // cant contain space in names
int int = 290; // cant use reserved keywords
`


## Constants (final keyword)

- when you do not want a variable's value to change, use the `final` keyword.
- a variable declared with the `final` keyword becomes a constant, which means unchangable and read-only.

- example - 
`
final int myNum = 50;
myNum = 100; // error: cannot assign a value to final variable 'myNum'
`

### When to use final?

- you should declare variables as `final` when their values should never change. For example, the number of minutes in an hour, or your birth year:
- example - 
`
final int MINUTES_PER_HOUR = 60;
final int BIRTHYEAR = 2000;
`

- Note:
- by convention, final variables in Java are usually written in upper case (eg. BIRTHYEAR). It is not required, but useful for code readibility and common for many programmers.


## Data Types

- a variable in Java must be a specified data type:
- example - 
`
int myNum = 5; // integer (whole numbers)
float myFloat = 5.99f; // floating point numbers
char myLetter = 'A'; // character
boolean myBool = true; // true/false
String myText = 'John'; // strings
`

- data type are divided into two groups - 
	- Primitive data types - includes `byte, short, int, long, float, double, boolean, char.`
	- Non-primitive data types - such as `String`, Arrays, Classes


### Primitive data types

- a Primitive data type specifies the type of a variable and the kind of values it can hold.
- there are eight Primitive data types in Java - 

Data Type | Description 
`byte` | stores whole numbers from -128 to 127
`short` | stores whole numbers from -32,768 to 32,767
`int` | stores whole numbers from -2,147,483,648 to 2,147,483,647
`long` | stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
`float` | stores fractional number. Sufficient for storing 6 to 7 decimal digits.
`double` | stores fractional numbers. Sufficient for storing 15 to 16 decimal digits.
`boolean` | Stores true or false values
char | Stores a single character/letter or ASCII values


### You Cannot Change the Data Type

- once a variable is declared with a type, it cannot change to another type later in the program:
- example -
`
int myNum = 5; // myNum is an int
// myNum = "Hello"; // Error: cannot assign a String to an int

String myText = "Hi"; // myText is a String
// myText = 123; // Error; cannot assign a number to a string
`

- Note:
- this rule makes Java safer, because the compiler will stop you if you try to mix up types by mistake.
- if you really need to change between the types, you must use type casting or conversion methods (for example, turning an `int` into a `double`).


## Numbers

- primitive number types are divided into two groups -
	- Integer types - stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are `byte`, `short`, `int`, `long`. The type you use depends on the numeric value.
	- Floating point types - represents the numbers with a fractional part, containing one or more decimals. There are two types - `float` and `double`.

- even though there are many numeric types in Java, the most used for numbers are `int` (for whole numbers) adn `double`(for floating point numbers).


### Integer Types
#### Byte

- the `byte` data type can store whole numbers from -128 to 127. This can be used instead of `int` or other integer types to sve memory where you are certain that the value will be within -128 to 127.
- example -
`
byte myNum = 100;
System.out.println(myNum);
`

#### Short

- the `short` data type can store whole numbers from -32768 to 32767.
- example -
`
short myNum = 10000;
System.out.println(myNum);
`

#### Int

- The `int` data type can store whole numbers from -214,748,3648 to 214,748,3647. In general, and here, the `int` data type is the preferred data type when we create variables with the numeric value.
- example -
`
int myNum = 1000000;
System.out.println(myNum);
`

#### Long

- the `long` data type cna store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the values. Note that, you should also end the value with an "L".
- example - 
`
long myNum = 9223372036854775L;
System.out.println(myNum);
`

### Floating Point Types

- you should use a floating point type whenever you ned a number with a decimal, such as 9.99 or 3.14.
- the `float` and `double` data types can store fractional numbers. Note that, you should end the value with an "f" for floats and "d" for doubles.
- float eg. -
`
float myNum = 5.55f;
System.out.println(myNum);
`
- double eg. -
`
double myNum = 55.55d;
System.out.println(myNum);
`

Note: Using `float` or `double`?
- the precision of a floating point value indicates how many digits the value can have after the decimal point. The precision of a `float` is only 6-7 decimal digits, while `double` variables have a precision of about 16 digits.
- therefore, it is safer to use `double` for most calculations.


### Scientific Numbers

- a floating point number can also be a scientific number with an 'e' to indicate the power of 10.
- eg. -
`
float f1 = 35e3f;
double d1 = 12e4d;
System.out.println(f1);
System.out.println(d1);
`


## Boolean Data Types

- very often in programming, you will need a data type that can only have one of two values, like - 
	- Yes / No
	- On / Off
	- True / False
- for this, we use `Boolean` data type, which can only take the values `true` or `false`:
- eg. - 
`
boolean isJavaFun = true;
boolean isKarelaTasty = false;
System.out.println(isJavaFun); // prints true
System.out.println(isKarelaTasty); // prints false
`

- boolean values are mostly used for conditional testing.


## Characters

- the `char` data type is used to store a single character. the character must be surrounded by single quotes like 'A', or 'c':
- eg. -
`
char myChar = 'a';
System.out.println(myChar);
`

- alternatively, if you are familiar with ASCII values, you can use those to display certain characters:
- eg. -
`
char myVar1 = 65, myVar2 = 66, myVar3 = 36;
`

### Strings

- the `String` data type is used to store a sequence of characters (text). String values must be surrouned by double quotes:
- eg -
`
String myStr = "Hello";
System.out.println(myStr);
`

- the String type is so much used and integrated in java, that it is often called 'the special ninth type.'
- a string in Java is actually a non-primitive data type, because it refers to an object. The string object has methods that are used to perform certain operations on strings. Dont worry if you dont understand the term 'object' just yet, we will learn about it later.


## Non-Primitive Data Type

- Non-Primitive Data Types are called reference types because they refer to objects.
- the main difference between primitive and non-primitive data types are -
	- Primitive types in java are predefined and built into the language, while non-primitive types are created by the programmer (except for `String`).
	- Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
	- Primitive types start with a lowercase letter (like `int`), while non-primitive types typically starts with an uppercase letter (like `String`).
	- Primitive types always hold a value, whereas non-primitive types can be `null`.
	- examples of non-primitive types are strings, arrays, classes. examples of primitive types are int, boolean, floats, etc.


## Var

- the `var` keyword was introduced in Java 10 (2018).
- the `var` keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.
- this helps you write cleaner code and avoid repeating types, especially for long or complex types.
- for example, instead of writing `int x = 5;` we can write - `
var x = 5; // x is an int
`

- when using `var`, the compiler understands that `5` is an `int`.


### Examples with Different Types

- here are some examples showing how `var` can be used to create variables of different types, based on the values you assign:
- eg. -
`
var myNum = 5; //int
var myFloat = 5.55f; //float
var myBool = true; //boolean
var myChar = 'a'; //char
var myStr = "Helllo"; //String
`

### Imp Notes for Var

1. `var` only works when you assign a value at the same time (you cant declare `var x;` without assigning a value), it'll give an error.
- eg. - 
`
var x; //error
var x = 5; //correct
`

2. Once the type is chosen, it stays the same.
- eg. -
`
var x = 15; // x is int
x = 10; // OK - x is still int
x = 9.99; // Error, the value here is float or double, and you cant assign to x.
`

### When to use Var

- for simple variables, its usually clearer to write the type directly (`int`, `double`, `char`, etc)
- but for more complex types, such as `ArrayList` or `HashMap`, `var` can make the code shorter and easier to read.
- eg. -
`
// without var
ArrayList<String> cars = new ArrayList<String>();

// with var
var cars = new ArrayList<String>();
`


## Type Casting

- type casting means converting one data type into another. For example, turning an `int` into a `double`.
- in Java, there are two main types of casting - 
	- Widening Casting (automatic) - converting a smaller type to a larger type size.
		- byte -> short -> char -> int -> long -> float -> double
	- Narrowing Casting (manual) - converting a larger type to a smaller size.
		- double -> float -> long -> int -> char -> short -> byte


### Widening Casting

- Widening Casting is done automatically when passing a smaller size type into a larger size type.
- this works because there is no risk of losing information. For example, an `int` value can safely fit inside a `double`.
- eg. -
`
int myInt = 60;
double myDouble = myInt; // automatic casting - int to double

System.out.println(myInt); // outputs 60
System.out.println(myDouble); // outputs 60.0
`

### Narrowing Casting

- Narrowing Casting must be done manually by placing the type in parantheses `()` in front of the value.
- this is required because narrowing may result in data lose (for example, dropping decimals when converting a `double` to an `int`).
- eg. -
`
int myDouble = 6.69d;
double myInt = (int) myDouble; // manual casting - double to int

System.out.println(myDouble); // outputs 6.69
System.out.println(myInt); // outputs 6
`

### Real Life Example

- here's a real life example of type casting. We calculate the percentage of a user's score in relation to the maximum score in a game.
- we use type casting to make sure that the result is a floating-point value, rather than an integer:
- eg. -
`
// set the maximum possible score in the game to 500
int maxScore = 500;

// the actual score of the user
int userScore = 444;

// calculate the percentage of the user's score in relation to the maximum available score. Convert userScore to double to make sure that the division is accurate
double percentage = (double) userScore/maxScore * 100.0d;

System.out.println("User's percentage is " + percentage)
`


## Operators

- operators are used to perform operations on variables and values.
- in the example below, we use the `+` operator to add together two values.
- eg. - 
`
int x = 100 + 80;
`

- although the `+` operator is often used to add together two values, it can also be used to add together a variable and a value, or a variable adn another variable.
- eg. -
`
int sum1 = 100 + 80; // 180 
int sum2 = sum1 + 90; // 180 + 90 = 270
int sum3 = sum1 + sum2; // 270 + 180 = 350
`

- java divides the operations into the following groups - 
	- Arithmetic operators
	- Assignment operators
	- Comparison operators
	- Logical operators
	- Bitwise operators
	
### Arithmetic

- arithmetic operators are used to perform common mathemaical operations.

- Operator | Name | Description | Example 
- + | Addition | Adds together two values | x + y
- - | Subtraction | Subtracts one value from another | x - y
- * | Multiplication | Multiplies two values | x * y
- / | Division | Divides one value from another | x / y
- % | Modulus | Returns the division remainder | x % y
- ++ | Increment | Increases the value of a variable by 1 | ++x
- -- | Decrement | Decreases the value of a variable by 1 | --x

- example using different arithmetic operators -
`
int x = 10;
int y = 5;

System.out.println(x + y); // 15
System.out.println(x - y); // 5
System.out.println(x * y); // 50
System.out.println(x / y); // 2
System.out.println(x % y); // 0

int z = 2;
++z;
System.out.println(z); // 3

--z;
System.out.println(z); // 2
`

- Note:
- when dividing two integers in Java, the result will also be an integer. For example, 10 / 3 gives 3. If you want a decimal result, use `double` values, like 10.0 / 3.
- eg. -
`
int a = 10;
int b = 3;
System.out.println(a/b); // Int division, will give 3

double c = 10.0d;
double d = 3.0d;
System.out.println(c/d); // Decimal division, will give 3.333...
`

#### Incrementing and Decrementing

- incrementing and decrementing are very common in programming, especially when working with counters, loops, and arrays.
- the `++` operator increases a value by 1, while the `--` operator decreases the value by 1.
- eg. -
`
int x = 5;
++x; // increments x's value to 6

--x; // decrements x's value back to 5
`

- examples in real life - counting people
- imagine a program to count how many people enter and leave a room. you can use the `++` to increase the counter when someone enters, and `--` to decrease it when someone leaves:
`
int peopleCounter = 0;

// 3 people enter
peopleCounter++;
peopleCounter++;
peopleCounter++;

System.out.println(peopleCounter); // 3

// 1 person leaves
peopleCounter--;

System.out.println(peopleCounter); // 2
`


### Assignment

- assignment operators are used to assign values to variables.
- here, we are using the assignment operator (`=`) to assign the value 10 to a variable called x.
- eg. -
`
int x = 10;
`

- the addition assignment operator (`+=`) adds a value to a variable.
- eg. -
`
int x = 10;
x += 20; // now, x is 30
`

- a list of all assignment operators - 
- Operator | Example | Same as
- = | x = 5 | x = 5
- += | x += 5 | x = x + 5
- -= | x -= 5 | x = x - 5
- *= | x *= 5 | x = x * 5
- /= | x /= 5 | x = x / 5
- %= | x %= 5 | x = x % 5
- &= | x &= 5 | x = x & 5
- |= | x |= 5 | x = x | 5
- ^= | x ^= 5 | x = x ^ 5
- >>= | x >>= 5 | x = x >> 5
- <<= | x <<= 5 | x = x << 5

- note:
- most assignment operators are just shorter ways of writing code. For example, `x += 5` is the same as x = x + 5, but shorter and often easier to read.


- real life example - tracking savings
- assignment operators cna also be used in real life scenarios. For example, you can use the `+=` operator to keep track of savings when you add money to an account.
- eg. -
`
int savings = 1000;
savings += 500; // add 500 more to savings
System.out.println(savings); // savings is now 1500
`


### Comparison

- comparison operators are used to compare two values (or variables). This is important in programming, because it helps us find answers and make decisions.
- the return value of a comparison is either `true` or `false`. These values are known as Boolean values.
- here, we are using the greater than operator (`>`) to find out if 5 is greater than 3.
- eg. -
`
int x = 5;
int y = 3;
System.out.println(x > 3); // returns true, as 5 > 3
`

- a list of all comparison operators - 
- Operator | Name | Example 
- == | Equal to | x == y
- != | Not Equal | x != y
- > | Greater than  | x > y
- < | Less than | x < y
- >= | Greater than or Equal to | x >= y
- <= | Less than or Equal to | x <= y

- real life examples - 
- comparison operators are often used in real world conditions, such as checking if a person is old enough to vote -
`
int age = 18; 

System.out.println(age >= 18); // returns true, old enough to vote
System.out.println(age < 18); // returns false, not old enough
`

- another example to check whether the password is long enough -
`
int passwordLength = 10;

System.out.println(passwordLength < 10); // returns false, password too short
System.out.println(passwordLength >= 10); // returns true, password long enough

`


### Logical

- as with comparison operators, you can also test for `true` and `false` values with logical operators.
- logical operators are used to determine the logic between variables and values, by combining multiple conditions.

- list of logical operators -
- Operator | Name | Description | Example
- && | Logical AND | Returns true if both statements are true | x < 5 && x < 10
- || | Logical OR | Returns true if one of the statements is true | x < 5 || x < 4
- ! | Logical NOT | Reverses the result, returns false if the result is true | !(x < 5 && x < 10)

- real life example - login check 
- here, we are using logical operators in real situation, e.g., when checking login status and access rights:
`
boolean isLoggedIn = true;
boolean isAdmin = false;

System.out.println("Regular User: " + (isLoggedIn && isAdmin));
System.out.println("Admin: " + (isLoggedIn || !isAdmin));
System.out.println("Not logged in: " + (!isLoggedIn));
`
- result -
Is regular user: true
Is admin: true
Not logged in: false


### Operator Precedence

- when a calculation contains more than one operator, Java follows order of operations rules to decide which part to calculate first.
- example, multiplication comes before addition -
- eg. -
`
int result1 = 2 + 3 * 4; // 2 + 12 = 14
int result2 = (2 + 3) * 4; // 5 * 4 = 20 (bracket comes first)

System.out.println(result1);
System.out.println(result2);
`

#### Why does this happen?

- in `2 + 3 * 4` calculation, the multiplication is done first, so the answer is 14.
- however, if you want the addition part to happen first, you must use a parantheses - `(2 + 3) * 4`, which gives us 20.

- Tip
- always use parentheses () if you want to make sure the calculations are done in the order you expect. It also makes your code easier to read.

#### Order or Operations

- here are some common operators, from the highest to lowest priority -
	- () - parantheses
	- *, /, % - multiplication, division, modulus
	- + , - - addition and subtraction
	- >, <, >=, <= - comparison
	- ==, != - equality
	- && - logical AND
	- || - logical OR
	- = - assignment

- eg. - 
`
int result1 = 10 - 2 + 5; // (10 - 2) + 3 = 13
int result2 = 10 - (2 + 5); // 10 - 7 = 3

System.out.println(result1);
System.out.println(result2);
`

- remember, parantheses always comes first, use them to control the order of your calculations.


## Strings

- strings are used for storing text.
- a `string` variable contains a collection of characters surrounded by double quotes.
- eg. - create a variable of type `String` and assign it a value -
`
String myStr = "Hello World!";
`

### String Length

- a string in Java is actually an object, which means it contains methods that can perform certain operations on strings.
- for example, you can find the length of a string with the `length()` method.
- eg. -
`
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println(txt.length()); // running the length() method
`

### More String Methods

- there are many string methods available in Java - 
- for example -
	- toUpperCase() - converts a string to upper case letters.
	- toLowerCase() - converts a string to lower case letters.
- eg. -
`
String txt = "Hello World!";
System.out.println(txt.toUpperCase()); // outputs - HELLO WORLD!
`

### Finding a Character in a String

- the `indexOf()` method returns the index (the position) of the first occurance of a specified text in a string (including whitespaces):
- eg. -
`
String txt = "Hello World!";
System.out.println(txt.indexOf("world")); // outputs - 6
`

- Java counts positions from zero 0.
- 0 is the first position in a string, 1 is the second, 2 is the third....

- you can use the `charAt()` method to access a character at a specific position in a string:
- eg. -
`
String txt = "Hello World!";
System.out.println(txt.charAt(7)); // outputs - o
`

### Comparins Strings

- to compare two strings, we can use the `equals()` method,
- eg. -
`
String txt1 = "Hello";
String txt2 = "Hello";

String txt3 = "World";
String txt4 = "Greetings";

System.out.println(txt1.equals(txt2)); // true
System.out.println(txt3.equals(txt4)); // false
`

### Removing Whitespace

- the `trim()` method removes the whitespace from the beginning and the end of a string.
- eg. -
`
String txt = "    Hello World!    ";
System.out.println(txt.trim()); // Hello World
`

### String Concatenation

- the `+` operator can be used between strings to combine them. This is called concatenation.
- eg. -
`
String fName = "John";
String lName = "Doe";
System.out.println(fName +" "+ lName); // John Doe
`

- note that, we have added an empty text (" ") to create a space between fName and lName on print.

#### Concatenation in Sentences

- you can use string concatenation to build sentences with both text and variables.
- eg. -
`
String name = "John";
int age = 25;
System.out.println(name +" "+ "is " + age +" " + " years old."); // outputs - John is 25 years old.
`


#### The `concat()` method

- we can also use the `concat()` method to concatenate things.
- eg. -
`
String fName = "John";
String lName = "Doe";
System.out.println(fName.concat(lName)); // John Doe
`

- we can also join more than two strings by chaining `concat()` method calls.
- eg. -
`
String txt1 = "Sky";
String txt2 = "is";
String txt3 = "blue";
String result = txt1.concat(txt2).concat(txt3);
System.out.println(result); // outputs - Sky is blue
`

- note:
- while you can use the `concat()` method to join multiple strings, most developers prefer the `+` operator because its shorter and easier to read.


### Numbers and Strings

- warning:
- java uses teh `+` operator for both addition and concatenation.
- numbers are added. Strings are concatenated.

- if you add two numbers, the result will be a number.
- eg. -
`
int x = 10;
int y = 100;
int z = x + y; // 10 + 100 = 110 (an int)
`

- if you add two strings however, the result will be a string concatenation.
- eg. -
`
String x = "10";
String y = "100";
String z = x + y; // z will be 10100 (a string)
`

- if you add a number and then a string, the result will be a string concatenation.
- eg. -
`
int x = 10;
String y = "100";
String z = x + y; // z will be 10100 (a string)
`


### Special Characters

- because strings must be written within quotes, Java will misunderstand a string put within this string, and generate an error:
- eg. -
`
String txt = "Hello "new" World!"; // error
`

- the solution to avoid this problem, is to use the backslash escape character (`\`).
- the backslash (`\`) escape character turns the special characters into string characters - 
- Escape Character | Result | Description
- \' | ' | Single quote
- \" | " | Double quote
- \\ | \ | Backslash

- the sequence (`\"`) inserts a double quote in a string.
- eg. -
`
String txt = "Hello \"new\" World!"; // correct
`

- the sequence (`\'`) inserts a single quote in a string.
- eg. -
`
String txt = "Hello \'a\' new World!"; // correct 
`

- the sequence (`\\`) inserts a single backslash in a string.
- eg. -
`
String txt = "This \\ is called a single backslash"; // correct
`

- other common escape character sequence that are valid in java are - 
- Escape Character | Result | Description
- \n | New Line | inserts a new line
- \t | Tab | inserts a tab
- \b | Backspace | inserts a backspace
- \r | Carriage Return | inserts a carriage return
- \f | Form Feed | inserts a form feed

- note:
-  most of these escape character codes are rarely used in modern programming. The most common ones are `\n` (new line), `\"` (double quotes), and `\\` (backslash).



## Math

- the math class has many methods that allow you to perform mathematical tasks on numbers.

### Math.max(x,y)

- the `Math.max(x,y)` method cna be used to find the highest value of x and y.
- eg. -
`
Math.max(5, 10);
`

### Math.min(x,y)

- the `Math.min(x,y)` method cna be used to find the lowest value of x and y.
- eg. -
`
Math.min(5, 10);
`

### Math.sqrt(x)

- the `Math.sqrt(x)` method returns the square root of x.
- eg. -
`
Math.sqrt(500);
`

### Math.abs(x)

- the `Math.abs(x)` method returns the absolute (positive) value of x.
- eg. -
`
Math.abs(-9.10);
`

### Math.pow(x,y)

- the `Math.pow(x,y)` method returns the value of x raised to the power of y.
- eg. -
`
Math.pow(5, 2); // 25.0
`

- note:
- Math.pow(5, 2) means 5 multiplied by itself 2 times.
- 5 * 5 = 25

- note:
- the Math.pow() method always returns a `double`, even if the result is a whole number. For example, Math.pow(5, 2) returns 25.0 and not 25.


### Rounding Methods

- java has several methods for rounding numbers.
	- Math.round(x) - rounds to be the nearest integer.
	- Math.ceil(x) - rounds up (returns the smallest integer greater than or equal to x).
	- Math.floor(x) - rounds down (returns the largest integer less than or equal to x).

- eg. - 
`
Math.round(4.6); // 5
Math.ceil(4.6); // 5.0
Math.floor(4.6); // 4.0
`


### Random Numbers

- `Math.random()` returns a random number between 0.0 (inclusive) and 1.0 (exclusive).
- eg. -
`
Math.random();
`

- to get more control over the random numbers, for example, if you only want a random number between 0 and 100, you can use the following formula -
- example -
`
int randomNum = (int)(Math.random() * 101); // 0 to 100 random numbers it will generate
System.out.println(randomNum); // after each run, it will generate a random no. between 0 - 100
`

- note:
- Math.random() returns a `double`. To get an integer value, you need to cast it with (int) - int randomNum = (int)(Math.random() * 101);.


## Booleans

- very often in programming, you will need a data type that can only have one of two values, like - 
	- Yes / No
	- On / Off
	- True / False

- for this, java has a `boolean` data type, which can only store `true` or `false` values:


### Boolean Values

- a boolean value is declared with the `boolean` keyword and can only take the values `true` or `false`.
- eg. - 
`
boolean isJavaFun = true;
boolean isKarelaTasty = false;
System.out.println(isJavaFun); // prints true
System.out.println(isKarelaTasty); // prints false
`

- in practise, booleans are most often the result of expressions, and are used to test conditions in programs.


### Boolean Expressions

- a boolean expression returns a boolean value - `true` or `false`.
- this is used to build logic and make decisions in programs.
- for example, you can use a comparison operator, such as the greater than (>) operator, to find out if an expression (or a variable) is true or false.
- eg. -
`
int x = 10;
int y = 9;
System.out.println(x > y); // returns true, since 10 is gerater than 9

// we can also do this directly
System.out.println(10 > 9); // returns true, since 10 is gerater than 9
`

- in the example below, we use the equal to (==) operator to evaluate an expression.
- eg. -
`
int x = 10;
System.out.println(x == 10); // returns true, since the value we declared earlier is x = 10.

// or
System.out.println(10 == 15); // returns false, since 10 is not equal to 15.
`

- booleans are the basis for all Java comparisons and conditions.


### Real Life COnditions of Boolean Expressions

- here, we want to find if a person is old enough to vote.
- in our example below, we use the `>=` comparison operator to find outif the age (25) is greater than or equal to the voting age limit, which is set to 18.
- eg. -
`
int myAge = 25;
int votingAge = 18;
System.out.println(myage >= votingAge); // returns true
`

- or even better aproach to this would be to wrap the code above in an `if...else` statement, so we cna perform different actions depending on the result.
- eg. - 
`
int myAge = 25;
int votingAge = 18;

if (myAge >= votingAge)
{
	System.out.println("Old enough.");
} else {
	System.out.println("Not old enough.");
}
`


## If...Else

- conditions and if statements let you control the flow of your program - deciding which code runs, and which code is skipped.
- think of it like real life - if it rains, take an umbrella, otherwise, do nothing.
- every `if` statement needs a condition that results in `true` or `false`.
- this means, `if` statements work hand in hand with boolean values.
- eg. -
`
boolean isRaining = true;

if (isRaining) {
	System.out.println("Take an Umbrella.");
}
`

- most often, conditions are created using comparison operators, like the ones below.
	- less than: `a < b`
	- less than or equal to: `a <= b`
	- greater than: `a > b`
	- greater than or equal to: `a >= b`
	- equal to: `a == b`
	- not equal to: `a != b`

- you can also use these conditions to perform different actions for different decisions.
- Java has the following conditional statements - 
	- use `if` to specify a block of code to be executed, if a specified condition is true.
	- use `else` to specify a block of code to be executed, if the same condition is false.
	- use `else if` to specify a new condition to test, if the first condition is false.
	- use `switch` to specify many alternative blocks of code to be executed.


### if Statement

- the `if` statement specifies a block of code to be executed if a condition is `true`:
- syntax -
`
if (condition){
	// block of code to be executed if the condition is true
}
`

- note:
- the condition inside the `if` statement must result in a `boolean` value - it can be either a boolean expression (like `x > y`) or a boolean variable (like `isLightOn`).
- also note that `if` is in lowercase. Uppercase letters (If or IF) will generate an error.

- eg. -
`
if (20 > 18){
	System.out.println("20 is greater than 18");
}
`

- you can also compare variables -
- eg. -
`
int x = 10;
int y = 20;
if (x > y){
	System.out.println("x is not greater than y");
}
`

- example explained -
- in the example above, we use two variables, x and y, to test whether x is greater than y (uising the `>` operator). As x is 10 and y is 20, and we know that 20 is greater than 10, we print that x is not greater than y.

- comparison is also often used to check if two values are equal, using the `==` operator.
- eg. -
`
int x = 10;
int y = 10;
if (x == y){
	System.out.println("x is equal to y");
} 
`

- here, the condition `x == y` is true, because both x and y are 10, so the message x is equal to y is printed.


### Using Boolean Variables

- you can also test boolean variables directly in an `if` statement. 
- eg. -
`
boolean isLightsOn = true;

if (isLightsOn){
	System.out.println("The light is on.");
}
`

- note:
- writing `if(isLightsOn)` is the same as writing `if (isLightsOn == true)`, but shorter and easier to read.
- here, we are writing same example with the value `false` to see that the program continues even when the code block does not run-
- eg. -
`
boolean isLightsOn = false;

if (isLightsOn){
	System.out.println("The light is on."); // will notprint
}

System.out.println("The light is off."); // will print, because its out of the if statement condition.

`


### If Without Braces

- if an `if` statement has only one line of code, you can write it without curly braces `{}`.
- eg. -
`
if (20 > 10)
	System.out.println("true");
`

- Potential Problem:
- without braces, only the first line after the `if` belongs to it. Any other lines will run no matter what, which can lead to unexpected results.
- eg. -
`
int x = 20;
int y = 10;

if (x > y)
	System.out.println("true"); // belongs to if condition
	System.out.println("Hello World!"); // doesnt belong to if condition and it will print, because its out of the if statement condition.

// output
// true
// Hello World!
`

- **the safe way**
- to avoid mistakes, always use curly braces `{}`. THis makes it clear which lines belong to the `if` statement.
- eg. -
`
int x = 20;
int y = 10;

if (x > y){
	System.out.println("true"); // belongs to if condition
	System.out.println("Hello World!"); // belongs to if
}

// code outside if condition
System.out.println("Hello World from outside."); // doesnt belong to if condition and it will print, because its out of the if statement condition.
`

- tip -
- always using curly braces `{}` makes your code clearer, easier to read and prevents subtle bugs.



### else

- the `else` statement lets you run a block of code when the condition in the `if` statement is `false`.
- syntax -
`
if (condition){
	// block of code to be executed if the condition is true
} else {
	// block of code to be executed if the condition is false
}
`

- real life example would be - if (if) it rains, bring an umbrella, Otherwise (else), go outside without one.
- eg. -
`
boolean isRaining = false;

if (isRaining){
	System.out.println("Bring Umbrella");
} else {
	System.out.println("Don't Bring Umbrella");
}
`

- here, since `isRaining` is false, the condition inside the `if` statement is not met. That means, the `if` block is skipped, and the `else` block runs instead, printing "DOnt bring umbrella".

- another example - here, it says good day or good evening depending on the time.
`
int time = 20;

if (time < 18){
	System.out.println("Good day!");
} else {
	System.out.println("Good evening!!");
}

// outputs - Good evening!!
`

- examples explained -
- in the example above, time (20) is greater than 18, so the condition is `false`. Becaus eof this, we move on to the `else` condition and print to the screen "Good evening"./ If the time was less than 18, the program would print "Good day!".


- **notes:**
- `else` does not have a condition - it runs when the `if` statement is `false`
- do not put a semicolon right after the `if (condition)`. That would end the statement early and make `else` behave unexpectedly.


### else if

- use the `else if` statement to specify a new condition if the first condition is false.
- syntax -
`
if (condition 1) {
	// block of code to be executed if condition 1 is true
} else if ( condition 2) {
	//  block of code to be executed if condition 2 is true and condition 1 is false - only then it'll move here
} else {
	// if both upper conditions are false
}
`

- think of it like real life - `if` it rains, bring an umbrella, `else if` its sunny, wear sunglasss, `else` just go outside normally.

- eg. -
`
int weather = 2; // weather 1 = raining, 2 - sunny, 3 = cloudy

if (weather == 1){
	System.out.println("Bring umbrella");
} else if (weather == 2){
	System.out.println("Bring sunglasses");
} else {
	System.out.println("Go outside normally!");
}

// output - bring sunglasses, since weather = 2
`

- since, the `weather` is `2`, the first condition (weather == 1) is not met, so the first `if` block is skipped. The program then checks if the `else if` condition (weather == 2) meets, which is `true` (it does match), so this condition will run. That means, the output is bring sunglasses.


- another example - choose between three different messages depending on the time of the day.
`
int time = 22;

if(time < 10){
	System.out.println("Good morning!");
} else if (time < 18){
	System.out.println("Good Day!!");
} else {
	System.out.println("Good evening!!!");
}

// outputs - good evenign!!!
`

- explained -
- here, time = 22, which is greater than 10, so the first condition is `false`. The next condition, in the `else if` statement is also `false`. So, we move on to the `else` conmdition, since condition1 and condition2 is both `false` - and print to the screen Good Evening!!!.

- however, if the time was 14, our program would print - Good Day!!
`
int time = 14;

if(time < 10){
	System.out.println("Good morning!");
} else if (time < 18){
	System.out.println("Good Day!!");
} else {
	System.out.println("Good evening!!!");
}

// outputs - good evenign!!!
`


### Short Hand if...else

- there is also a short hand if-else, which is known as the ternary operator because it consists of three operands.
- it cna be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements. -
- syntax -
`
variable = (condition) ? expressionTrue : expressionFalse;
`

- instead of writing -
- eg. -
`
int time = 20;
if (time < 18){
	System.out.println("Good day!!");
} else {
	System.out.println("Good evening!!!");
}
`

- you can simply write -
`
int time = 20;
String result  = (time < 18) ? "Good Day!!" : "Good Evening!!!"
System.out.println(result);
`


### Nested if

- you can also place an `if` statement inside another `if`. This is caleld a nested if statement.
- a nested `if` lets you check for a condition only if another condition is already `true`.
- syntax -
`
if (condition 1){
	// code to run if condition 1 is true

	if (condition 2){
		// code to run if condition 1 and condition 2 are true
	}
}
`

- eg. - here, we first check if `x` is greater than 10. If it is, we check if `y` is greater than 20.
`
int x = 15;
int x = 25;

if (x > 10){
	System.out.println("x is greater than 10");

	// nested if
	if (y > 20){
		System.out.println("y is also greater than 20");
	}
}

// outputs 
x is greater than 10
y is also greater than 20
`

- **real life example**
- nested `if` statements are useful when you need to test multiple conditions that depend on each other. For example, checking if a person is old enough to vote, and if they are a citizen.
`
int age = 20;
boolean isCitizen = true;

if (age >= 18){
	System.out.println("Old enough to vote.");

	if (isCitizen){
		System.out.println("And you are a citizen, so you can vote.");
	} else {
		System.out.println("But you must be a citizen to vote.");
	} else {
		System.out.println("Not Old enough to vote.");
	}
}

// output -
// old enough to vote
// and you're a citizen, so you can vote!
`

- **notes:**
- you can nest as many `if` statements as you want, but avoid making the code too deep - it can become hard to read.
- nested `if` is often used together with `else` and `else if` for more complex decision making.


### Logical Operators in COnditions

- you can combine or reverse conditions using logical operators. these work together with `if`, `else` and `else if` to build more complex decisions.
	- `&&` (AND) - and all conditions must be true
	- `||` (OR) - at least one condition must be true
	- `!` (NOT) - reverses a condition (true = false, false = true)


#### AND (`&&`)

- use AND (`&&`) when both conditions must be true.
- eg. - test if a is greater than b, and if c is greater than a.
`
int a = 200;
int b = 33;
int c = 500;

if (a > b && c > a){
	System.out.println("Both conditions are true.");
}
`


#### OR (`||`)

- use OR (`||`) when at least one of the condition can be true.
- eg. - test if a is greater than b, or if a is greater than c.
`
int a = 200;
int b = 33;
int c = 500;

if (a > b || a > c){
	System.out.println("At least one condition is true.");
}
`


#### NOT (`!`)

- use NOT (`!`) to reverse a condition.
- eg. - test if a is not greater than b.
`
int a = 33;
int b = 200;

if (!(a > b)){
	System.out.println("a is NOT greater than b.");
}
`


#### Real life example

- in real programs, logical operators are often used for access control. FOr example, to get access to a system, there are specific requirements.
- you must be logged in, and then you either need to be an admin, or have a high security clearance (level 1 or 2) -
`
boolean isLoggedIn = true;
boolean isAdmin = false;
int securityLevel = 3; // 1 = highest

if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
	System.out.println("Access granted.");
} else {
	System.out.println("Access denied.");
}

// Try changing securityLevel to test different outcomes:
if (isLoggedIn && (!isAdmin || securityLevel <= 1)) {
	System.out.println("Highest level Access granted.");
} else {
	System.out.println("Access denied.");
}
`


### Real Life Examples

- here is an example where we show how you can use if...else to 'open a door' if the user enters the correct code:
`
int doorCode = 1337;

if (doorCode == 1337){
	System.out.println("Correct. Door is open.");
} else {
	System.out.println("Incorrect. Door is still closed.");
}
`

- testing how to use if...else to find out if a number is positive or negative.
`
int myNum = 10; //positive or negative?

if (myNum > 0) {
	System.out.println("Positive number.");
} else if (myNum < 0) {
	System.out.println("Negative number.");
} else {
	System.out.println("Its 0.");
}
`

- find out if a person is old enough to vote, and if they are also a citizen (using nested if statements).
`
int age = 20;
boolean isCitizen = true;

if (age >= 18){
	System.out.println("Old enough to vote.");

	if (isCitizen){
		System.out.println("Is a citizen, can vote.");
	} else {
		System.out.println("Not a citizen. You must be a citizen to vote.");
	}
	else {
		System.out.println("Not old enough to vote.");
	}
}
`

- find out if a number is even or odd.
`
int myNum = 19;

if (myNum / 2 == 0){
	System.out.println("Even number.");
} else {
	System.out.println("Odd number.");
}
`

- check temp.
`
int temp = 30;

if (temp < 0){
	System.out.println("Its freezing outside.");
} else if(temp < 20) {
	System.out.println("Its pleasantly cool.");
} else {
	System.out.println("Its warm outside.");
}
`


## Switch

- instead of writing many `if...else` statements, you can use the `switch` statement.
- think of it like ordering food in a restaurant - if you choose number 1, you get Pizza, if you chooze 2, you get a burger, 3 - a pasta, otherwise, nothing.
- the `swtich` statement selects one of many code blocks to be executed.
- syntax -
`
switch (expression){
	case x:
		// code block
		break;
	case y:
		// code block
		break;
	case z:
		// code block
		break;
	default:
		// code block
}
`

- this is how it works -
	 - the `switch` expression is evaluated once.
	 - the result is compared with each `case` value.
	 - if there is a match, the matching block of code runs.
	 - the `break` statement stops the switch after the matching case has run.
	 - the `default` statement runs if there is no match.

- the example below uses the weekday number to calcualte the weekday name:
`
int day = 4;
switch (day){
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
}

// outputs - Thursday (day 4)
`

#### the break keyword

- when Java reaches a `break` keyword, it breaks out of the switch block.
- this will stop the execution of more code and case testing inside the block.
- when a match is found, and the job is done, its time for a break. There is no need for more testing.

- a break can save a lot of execution time because it 'ignores' the execution of all the rest of the code in the switch block.


#### the default keyword

- the `default` keyword specifies some code to run if there is no case match (base case).
- eg. -
`
int day = 4;
switch (day){
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
	default:
		System.out.println("Some other day.");
}

// outputs - Some other day.
`

- note that, if the `default` statement is used as the last statement in a switch block, it does not need a break.



## While Loop

- loops can execute a block of code as long as a specified condition is true.
- loops are handy because they save time, reduce errors, and they make the code readable.

- the `while` loop repeats a block of code as long as the specified condition is true.
- syntax -
`
while (condition) {
	// code block to be executed
}
`

- eg. - here, the code in the loop will ru again and again, as long as a variable (`i`) is less than 5:
`
int i = 0;
whiel (i < 5){
	System.out.println(i);
	i++;
}
`

- note:
- do not forget to increase the variable used in the condition (`i++`), otherwise, the loop will never end.


### Countdown example 

- you can also use a `while` loop to count down. This example here, counts from 5 to 1, and then prints "Happy New Year!!!" at the end.
- eg. -
`
int countdown = 5;

while (countdown > 0) {
	System.out.println(countdown);
	countdown++;
}
System.out.println("Happy New Year!!!");
`

### Countdown example 

- in the above examples, the condition was true at the start, so the loop ran one or more times. But if the condition is false at the beginning, the code inside the loop will never run:
- eg. -
`
int i = 10;

while (i <5) {
	System.out.println("this will not run/print");
	i++;
}
`

- note:
- a `while` loop may never run if the condition is false from the start. For that, we use the `do while` loop, which always runs the code at least once before checking the condition.


### Do/While Loop

- the `do/while` loop is a variant of the `while` loop. This loop will execute the code block once, before checking if the condition is true. Then, it will repeat the loop as long as the condition is true.
- syntax - 
`
do {
	// code block to be executed
}
while (condition);
`

- note: the semicolon `;` after the `while` condition is required.


#### Do/While Example 

- the example below uses a do/while loop. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:
-eg. -
`
int i = 0;
do {
	System.out.println(i);
	i++;
}
while (i < 5);
`

- do not forget to increase the variable used in the condition (`i++`), otherwise, the loop will never end!


#### Condition is False from the Start

- In the `while` loop chapter, we saw that if the condition is false at the beginning, the loop never runs at all.
- the `do/while` loop is different: it will always run the code block at least once, even if the condition is false from the start.
- here's an example, where the variable `i` starts at 10, so `i < 5` is false immediately. Still, the loop runs once before checking the condition.
- eg. 
`
int i = 10;

do {
	System.out.println("i is " + i);
	i++;
} while (i < 5);
`

- **Summary:**
- a `do/while` loop always runs at least once, even if the condition is false at the start. This is the key difference from a `while` loop, which would skip the code block completely in the same situation.
- this behavior makes the `do/while` useful when you want something to happen at least once, such as showing a message or asking the user for input.


### While loop examples

- to demonstrate a practical example of the while loop combined with an if else statement, we've created a Yatzy game:
- eg. - print "Yatzy" if the dice number is 6:
`
int dice = 1;

while (dice <=6){
	if (dice < 6){
		System.out.println("No Yatzy");
	} else {
		System.out.println("Yatzy!!!");
	}
	dice++;
}
`

- here, if the loop passes the values ranging from 1 to 5, it prints, "No Yatzy", however, if the loop meets 6, it prints - "Yatzy!!!".



## For Loop

- when you know exactly how many times you want to loop through a block of code, use the `for` loop instead of a `while` loop.
- syntax -
`
for (statement 1; statement 2; statement 3){
	// code block to be executed
}
`

- here, statement 1, is executed (one time) before the execution of the code block.
- statement 2, defines the condition for executing the code block
- Statement 3, is executed (every time) after the code block has been executed.


### Print Numbers

- here's an example that will print the numbers 0 - 4:
- eg -
`
for (int i = 0; i < 5; i++){
	System.out.println(i);
}
`

- example explained -
	- Statement 1 - sets a variable before the loop starts - `int i = 0`
	- Statement 2 - defines the condition for the loop to run: `i < 5`. If the condition is true, the loop will run again; if its false, the loop ends.
	- Statement 3 - increases a value each time the code block has run - `i++`.


### Print Even Numbers

- here's an example that prints even values between 0 and 100:
- eg. -
`
for (int i = 0; i < 100; i = i + 2){
	System.out.println(i);
}
`


### Sum of Numbers

- here's an example that calculates the sum of numbers from 1 to 5.
- eg. -
`
int j;
for (int i = 0; i < =5; i++){
	j = i + j;
	i++
}
System.out.println("Total sum is " + j);
`

### Countdown

- here's an example that countdowns from 5 to 0.
- eg. -
`
for (int i = 5; i >= 0; i--){
	System.out.println(i);
}
`

### For Loop with False Conditions

- just like a `while` loop, a `for` loop may also never run. If the condition is `false` right from the start, the code inside the loop will be skipped entirely.
- eg. -
`
for (int i = 10; i < 5; i++){
	System.out.println("It will not print.");
}
`

- in the example above, the loop starts with `i = 10`. The condition is `i < 5`, which is already false, so the loop body is skipped, and nothing is printed.


### Nested Loops

- it is also possible to place a loop inside another loop. This is called a nested loop.
- the inner loop will be executed one time (completing its entire iteration once) for each iteration of the outer loop.

- eg. -
`
// outer loop
for (int i = 1; i <= 2; i++){
	System.out.println("Outer: " + i); // executes 2 times

	// inner loop
	for (int j = 1; j <= 3; j++){
		System.out.println("Inner: " + i); // executes 6 times (2 * 3)
	}
}
`


#### Multiplication Table Example

- this example uses the nested loops to print a simple multiplication table - 1 to 3:
`
for (int i = 1; i <= 3; i++){
	for (int j = 1; j < 3; j++){
		System.out.print(i * j + " ");
	}
	System.out.println();
}
// outputs 
1 2 3
2 4 6
3 6 9
`

- nested loops are useful when working with tables, matrices, or multi-dimensional data structures.


### For Each Loop

- there is also a for-each loop, which is used exclusively to loop through the elements in an array (or other data structrures):
- syntax -
`
for (type variableName : arrayName){
	// code block to be executed
}
`

- the for-each loop is similar and more readable than a regular `for` loop, since you dont need a counter (like `i < array.length`).
- the following example prints all elements in the cars array:
- eg. -
`
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

for (String car : cars){
	System.out.println(car);
}
`

- here is a similar example with numbers. We create an array of integers and use a for-each loop to print each value -
- eg. -
`
int[] numbers = {10, 20, 30, 40};

for (int num : numbers){
	System.out.println(num);
}
`


### For Loop Examples

- an example that counts to 100 by tens:
`
for (int i = 0; i <= 100; i+= 10){
	System.out.println(i);
}
`

- here, another example where we only print values between 0 and 10:
`
for (int i = 0; i <= 10; i += 2){
	System.out.println(i);
}
`

- a multiplication table:
`
int num = 20;

for (int i = num; i <= 10; i++){
	System.out.println(num + " x " + i + " = " (num * i));
}
`

- using a loop to calculate a factorial of a number - 
`
int n = 5;
int fact = 1;

for (int i = 1; i <= n; i++){
	fact *= i;
}

System.out.println("Factorial of " + n + " is " + fact);
// outputs - Factorial of 5 is 120.
`

- here, factorial means multiplying a number by every number below it, down to 1. FOr example, the factorial of 5 is - 5 * 4 * 3 * 2 * 1 = 120.



## Break/Continue

### Break

- we have already seen the `break` statement used earlier where we used it to jump out of a `switch` statement.
- the `break` statement can also be used to jump out of a loop.
- eg. -
`
for (int i = 0 ; i < 10; i++){
	if (i == 4){
		break; // it will reach 4 and end the loop. It will print 4.
	}
	System.out.println(i);
}
`


### Continue

- the `continue` statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
- here's an example that skips over 4:
- eg. -
`
for (int i = 0; i < 10; i++){
	if (i == 4){ 
		continue; // it will jump over 4. It won't print 4 but continue the loop till 10.
	}
	System.out.println(i);
}
`

- note: things to remember -
	- `break` = stop the loop immediately
	- `continue` = skip this round, but keep looping

### Combining Break and Continue

- you can combine `break` and `continue`.
- this example skips printing 2 and stops the loop at 4.
- eg. -
`
for (int i = 0; i < 6; i++){
	if (i == 2){
		continue; // here, it will jump over 2. It won't print 2 but continue on with the loop.
	}
	if (i == 4){
		break; // here, it will reach 4 and end the loop. It will print 4.
	}
	System.out.println(i);
}
`


### Break and Continue in While Loop

- you can also use `break` and `continue` in while loops.
- `break` eg. -
`
int i = 0;
while (i < 10){
	System.out.println(i);
	i++;
	
	if (i == 4){
		break; // here, it will reach 4 and end the loop. It will print 4.
	}
}
`

- `continue` eg. -
`
int i = 0;
while (i < 10){
	if (i == 4){
		i++;
		continue;
	}
	System.out.println(i);
	i++;
for (int i = 0; i < 6; i++){
	if (i == 2){
		continue; // here, it will jump over 2. It won't print 2 but continue on with the loop.
	}
	if (i == 4){
		break; // here, it will jump over 4 and end the loop. It won't print 4.
	}
	System.out.println(i);
}
`

#### Real Life Example

- imagine processing a list of numbers where you want to skip the negative values, but stop completely if you find a zero:
- eg. -
`
int[] numbers = {3, -1, 7, 0, 9};

for (int n : numbers){
	if (n < 0){
		continue; // skips only negative numbers
	}
	if (n == 0){
		break; // program stops completely if there's 0
	}
	System.out.println(n);
}
`


## Arrays

- arrays are used to store multiple values in a single variable, instead of declaring seperate variables for each value.
- to declare an array, define the variable type with square brackets `[]`:
`
String[] cars;
`

- we have now declared a variable that holds an array of strings. To insert values to it, you can place the values in a comma-seperated list, inside curly braces `{}`:
`
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
`

- to create an array of integers, you could write:
`
int[] myNum = {1, 2, 3, 4, 5};
`


### Access the Elements of an Array

- we can access an array's elements by referring to the index numbers.
- this statement accesses the value of the first tlement in cars array:
- eg. -
`
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// outputs - Volvo
`

- note:
	- array index starts with 0: [0] is the first element. [1] is the second element, etc.
	- think of an array as numbered boxes, where each box stores an element.
	- index | element
	- 0 | Volvo
	- 1 | BMW
	- 2 | Ford
	- 3 | Toyota


### Change an Array Element

- to change the value of a specific element, refer to the index number.
`
cars[0] = "Ferrari";
`

- eg. -
`
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Ferrari";
System.out.println(cars[0]);
// outputs - Ferrari
`

### Array Length

- to find out how many elements an array has, use the `length` property.
- eg -
`
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// outputs - 4
`


### The `new` keyword

- you can also create a new array by specifying its size with `new`. THis makes an empty array with space for a fixed number of elements, which you can fill later:
- eg. -
`
String[] cars = new String[4]; // size is 4
cars[0] = "Ferrari";
cars[1] = "Volvo";
cars[2] = "BMW";
cars[3] = "Toyota";
System.out.println(cars[0]); // outputs - Ferrari
`

- however, if you already know the values, you dont need to write `new`. Both of these create the same array:
- eg. -
`
// with new 
String[] cars = new String[] {"Volvo", "BMW", "Ford", "Mazda"};

// shortcut (most common)
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
`

- **note**:
	- you cannot write `new String[4] {"Volvo", "BMW", "Ford", "Mazda"};`

	- in java, when using `new` you either -
		- use `new String[4]` to create an empty array with 4 slots, and then fill them later.
		- or, use `new String[] {"Volvo", "BMW", "Ford", "Mazda"}` (without specifying the number of elements) to create the array and assign values at the same time.
	
- **Tip**:
	- the shortcut syntax is the most often used when the values are known at the start. Use the `new` with a size when you want to create an empty array and fill it later.


### Loop Through An Array

- you can loop through the array elements with the `for` loop, and use the `length` property to specify how many times the loop should run.
- this example creates an array of strings and then uses a `for` loop to print each element, one by one:
- eg. -
`
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

for (int i = 0; i < cars.length; i++){
	System.out.println(cars[i]);
}
`

- here, 


#### Calculate the Sum of Elements

- now that we know how to work with arrays and loops, lets use them together to calculate the sum of all elements in an array.
- eg. -
`
int[] nums = {1, 5, 10, 25};
int sum = 0;

// loop through the array and add each element to sum
for (int i = 0; i < nums.length; i++){
	sum += nums[i];
}
System.out.println("Sum is: " + sum);
`


#### Loop Through an Array with For-Each

- there is also a for-each loop, which is used exclusively to loop through elements in an array (or other data structures).
- syntax -
`
for (type variable : arrayname){
	// code block to be executed
}
`

- the colon (`:`) is read as 'in'. So, you can read the loop as - for each variable in array.
- here's an example that uses the for-each loop to print all elements in the cars array:
- eg. -
`
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

for (String car : cars){
	System.out.println(car);
}
`

- here, this means - for each `String` in the `cars` array (here called `car`), print its value.
- compared to a regular `for` loop, the for-each loop is easier to write and read because it does not need a counter (like `i < cars.length`). However, it only gives you the values, not their positions (indexes) in the array.
- So, if you need both the position (index) of each element and its value, a regular `for` loop is the right choice. For example, when printing the sear numbers in a theater row, you need to show both the seat number (the index) and who is sitting there (the value).
- eg. -
`
String[] seats = {"Jenny", "Liam", "Angie", "Bo"};

for (int i = 0; i < seats.length; i++){
	System.out.println("Seat number " + i + " is taken by " + seats[i]);
}
`

- note:
	- the for-each loop is great when you only need to read elements. if you want to change the elements later, or keep track of their index, use a regular `for` loop instad.


### Real Life Array Examples

- here's an array example that calculates the average of different ages:
- eg. -
`
// an array storing diff ages
int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};

float avg, sum = 0;

// get the length of the array
int length = ages.length;

// loop through the elements of the array
for (int age : ages){
	sum += age[i];
}

// calclate the average by dividing the sum with the total length
avg = sum / length;

// print the avg
System.out.println("Averge age is: " + avg);
`

- here, we find the lowest age among different ages:
`
// an array storing diff ages
int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};

// get the length of the array
int length = ages.length;

// create a 'lowest age' variable and assign the first array element of ages to it
int lowestAge = ages[0];

// loop through teh elements of the ages array to find the lowest age
for (int age : ages){
	// check if lowestage is high/low than current age
	if (age[i] < lowestAge){
		// if it is, replace current age with lowest age
		lowestAge = age[i];
	}
}

// output the lowest age
System.out.println("Lowest age in the array is: " + lowestAge);
`

- here, we create a program with a list of numbers where you want to skip negative values, but stop completely if you find a zero.
`
int[] nums = {3, -1, 7, 0, 9};

for (int num : nums){
	if (num < 0){
		continue; // skips negative nums
	} 
	if (num == 0){
		break; // stops program if there's 0
	}

	System.out.println(num);
}
`

- here, we create a program that keeps track of the highest and lowest values in an array:
`
int[] nums = {45, 12, 98, 33, 27};
int max = nums[0];
int min = nums[0];

for (int num : nums){
	if (num > max){
		max = num; // replaces higher num with max
	}
	if (num < min){
		min = num; // replaces lower num with min
	}
}

System.out.println("Highest number is: " + max);
System.out.println("Lowest number is: " + min);
`



### Multidimensional Arrays

- a Multidimensional Array is an array that contains other arrays.
- you can use it to store data in a table with rows and columns.
- to create a two-dimensional array, write each row inside its own curly braces.
- eg. -
`
int[][] nums = { {1, 4, 2}, {3, 6, 8} };
`

- here, nums has two arrays (two rows of arrays) -
	- First row - {1, 4, 2}
	- Second row - {3, 6, 8}

- think of it like this -
	Column 0 | Column 1 | Column 2
Row 0  1	| 	4		| 	2
Row 1  3	|  	6		|	8


#### Access Elements

- to acess an element of a two-dimensional array, you need two indexes - the first for the row, and the second for the column.
- remember: array indexes start at 0. That mean, row `0` is the first row, and column `0` is the first column. (So, row index 1 is the second row, and column index 2 is the third column).
- this statement access the element in the second row (index `1`) adn third column (index `2`) of the nums array:
- eg. -
`
int [][] nums = { {1, 4, 2}, {3, 6, 8} };
System.out.println(nums[1][2]); // outputs 8
`

- this example prints the value at row `0` and column `1`:
- eg. - 
`
int [][] nums = { {1, 4, 2}, {3, 6, 8} };
System.out.println(nums[0][1]); // outputs 4
`


#### Change Element Values

- you can overwrite an existing element using the same two-index notation (row, then column):
- eg. -
`
int[][] nums = { {1, 4, 2}, {3, 6, 8} };
nums[1][2] = 90;
System.out.println(nums[1][2]); // outputs 90
`


#### Rows and Columns (Lengths)

- you can also use the `length` to get the number of rows, and `nums[rowNumber].length` for the number of columns in a given row.
- eg. -
`
int[][] nums = { {1, 4, 2}, {3, 6, 8, 5, 2} };

System.out.println("Rows: " + nums.length); // outputs 2
System.out.println("Cols in Row 0: " + nums[0].length); // outputs 3
System.out.println("Cols in row 1: " + nums[1].length); // outputs 5
`

- note:
	- notice how rows can have different lengths - in this example, the second row has more elements than the first one, and thats perfectly valid in Java.


#### Loop Through a Multidimensional Array

- use a `for` loop inside another `for` loop to visit each and eevry element (row by row):
- eg. -
`
int[][] myNums = { {1, 4, 2}, {3, 6, 8, 5, 2} };

for (int row = 0; row < myNums.length; row++){
	for (int col = 0; col < myNums[row].length; col++){
		System.out.println("myNums[" + row + "]"[" + col + "]" = " + myNums[row][col]);
	}
}
`

- or just use a for-each loop in both levels, which you may find it easier to read -
- eg. -
`
int[][] myNums = { {1, 4, 2}, {3, 6, 8, 5, 2} };

for (int[] row : myNums){
	for (int num : row){
		System.out.println(num);
	}
}
`



## Methods

- a method is a block of code which only runs when its called.
- you can pass data, known as parameters, into a method.
- methods are used to perform certain actions, and they are aslo known as functions.
- why use methods? To reuse code: define the code once, and use it many times.


### Creating a Method

- a method must be declared within a class. It is defined with the name of the method,followed by parantheses(). 
- Java provides some pre-defined methods, such as `System.out.println()`, but you can also create your own methods to perform certain actions.
- eg. - create a method inside main -
`
public class Main{
	static void myMethod(){
		// code to be executed
	}
}
`

- example explained:
	- `myMethod()` - is the name of the method.
	- `static` - means that the method belongs to the Main class and not an object of the Main class.
	- `void` - means that this method does not have a return value.


### Calling a Method

- to call a method in Java, write the method's name followed by two parantheses () and a semicolon ;
- in the following example, `myMethod()` is used to print a text (the action), when its called.
- eg. - inside `main` call the `myMethod()` method -
`
public class Main(){
	static void myMethod(){
		System.out.println("This is method execuiton");
	}

	public static void main (String[] args){
		myMethod();
	}
}

// outputs - "This is method execuiton"
`

- a method can also be called multiple times -
- eg. -
`
public class Main(){
	static void myMethod(){
		System.out.println("This is method execuiton");
	}

	public static void main (String[] args){
		myMethod();
		myMethod();
		myMethod();
	}
}

// outputs -
// "This is method execuiton"
// "This is method execuiton"
// "This is method execuiton"
`


### Method Parameters and Arguments

- information can be passed to methods as a parameter. Parameters act as variables inside the method.
- parameters are specified after the method name, inside the parantheses. You can add as many parameters as you want, just seperate them with a comma.
- the following example has a method that takes a `String` called fname as a parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name.
- eg. -
`
public class Main{
	static void myMethod(String fname){
		System.out.println(fname + "Smith");
	}

	public static void main(String[] args){
		myMethod("Joe");
		myMethod("John");
		myMethod("Liam");
	}
}

// outputs -
// Joe Smith
// John Smith
// Liam Smith
`

- when a parameter is passed to the method, it is called an argument. So, from the example above - `fname` is a parameter, while `Liam`, `John` and `Joe` are arguments.


### Multiple Parameters

- you can have as many parameters inside a method.
- eg. -
`
public class Main{
	static void myNewMethod(String fname, int age){
		System.out.println(fname + " is " + age);
	}

	public static void main (String[] args){
		myMethod("Joe", 18);
		myMethod("John", 50);
		myMethod("Liam", 22);
	}
}

// outputs -
// Joe is 18
// John is 50
// Liam is 22
`

- note that when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.


### A Method with if...else

- it is common to use `if...else` statements inside methods.
- eg. -
`
public class Main{
	// create a checkAge() method with an integer variable called age
	static void checkAge(int age){
		// if age is less than 18, print 'access denied'
		if (age < 18){
			System.out.println("Access denied - you are not old enough!);

			// if age is greater than, or equal to, 18, print 'access denied'
		} else {
			System.out.println("Access granted - you are old enough!);
		}
	}
	}

	public static void main(String[] args){
		checkAge(20); // call the checkAge method and pass along an age of 20
	}
}

// outputs - 'Access granted - you are old enough!'
`


### Return Values

- earlier, we used `void` keyword in all examples (like `static void myMethod(int x)`), which indicates that the method should not return a value.
- if you want the method to return a value, you can use a primitive data type 9such as `int`, `char`, etc.), instead of `void`, and use the `return` keyword inside the method.
- eg. -
`
public class Main{
	static int myMethod(int x){
		return 5 + x;
	}

	public static void main(String[] args){
		System.out.println(myMethod(5));
	}
}

// outputs - 8(5 + 3)
`

- this example returns the sum of a method's two parameters.
- eg. -
`
public class Main{
	static int myMethod(int x, int y){
		return x + y;
	}

	public static void main(String[] args){
		System.out.println(myMethod(5 , 3));
	}
}

// outputs - 8 (5 + 3)
`

- you can also store the result in a variable (recommended, as it is easier to read and maintain):
- eg. -
`
public class Main{
	static int myMethod(int x, int y){
		return x + y;
	}

	public static void main(String[] args){
		int z = myMethod(5, 3);
		System.out.println(z);
	}
}

// outputs - 8(5 + 3)
`

#### Practical Example

- here is a simple and fun 'game example' using a method that returns a value, to show the double of the numbers 1 through 5 (using a `for` loop).
- eg. -
`
public class Main{
	// method that doubles the number
	static int doubleGame(int x){
		return x * 2;
	}

	public static void main(String[] args){
		for (int i = 1; i <= 5; i++){
			System.out.println("Double of " + i + " is " + doubleGame(i));
		}
	}
}
`


### Method Overloading

- with method overloading, multiple methods can have the same name with different parameters.
- eg. -
`
int myMethod(int x)
float myMethod(float x)
double myMethod(int x, float y)
`

- consider the following example, which has two methods that add numbers of diff types -
- eg. -
`
static int plusMethodInt(int x, int y){
	return x + y;
}

static double plusMethodDouble(double x, double y){
	return x + y;
}

public static void main(String[] args){
	int myNum1 = plusMethodInt(8, 5);
	double myNum2 = plusMethodDouble(80.12, 50.5);

	System.out.println("Int's value: " + myNum1);
	System.out.println("Double's value: " + myNum2);
}
`

- instead of defining two methods that should do the same thing, it is better to overload one - means use the same method name but with different value and return types.
- in the example below, we overload the `plusMethod` method to work for both `int` and `double`:
- eg. -
`
static int plusMethod(int x, int y){
	return x + y;
}

static double plusMethod (double x, double y){
	return x + y
}

public static void main(String[] args){
	int myNum1 = plusMethodInt(8, 5);
	double myNum2 = plusMethodDouble(80.12, 50.5);

	System.out.println("Int's value: " + myNum1);
	System.out.println("Double's value: " + myNum2);
}
`

- note:
	- multiple methods cna have the same name as long as the numbers and/or type of parameters are different.



### Scope

- in java, variables are only accessible inside the region where they are created. This is called scope.


#### Method Scope

- variables declared directly inside a method are availeble anywhere in the method following(after) the line of code in which they were declared.
- eg. -
`
public class Main{
	public static void main(String[] args){
		// code here CANNOT use x, as its not declared yet

		int x = 100;

		// code here CAN use x, as its declared now
		System.out.println(x);
	}
}
`


#### Block Scope

- a block of code refers to all of the code between curly braces`{}`.
- variables declared inside a block of code are only accessible by the code between the curly braces, and only after the line in which the variable was declared.
- eg. -
`
public class Main{
	public static void main(String[] args){
		// code here CANNOT use x, not defined yet

		{
			// This is a block

			// code here CANNOT use x, not defined yet

			int x = 500;

			// code here CAN use x
			System.out.println(x);
		} // the block ends here, block ended

		// Code here CANNOT use x, as the block has ended
	}
}
`

- a block of code can stand alone, or be part of an `if`, `while`, or `for` statement. In a `for` loop, the variable declared in the loop header (like `int i = 0`) only exists inside the loop.


#### Loop Scope

- variables declared inside a `for` loop only exist inside the loop.
- eg. -
`
public class Main{
	public static void main(String[] args){
		for (int i = 0; i < 10; i++){
			System.out.println(i); // i is accessible here
		}

		// i is NOT accessible here
	}
}
`

- here, 
	- the `for` loop has its own block (`{...}`).
	- the variable `i` declared in the loop header (`int i = 0`) is only accessible inside that loop block.
	- once the loop ends, `i` is destroyed, so you can't use it outside.

- **why this matters?**
- loop variables are not available otuside the loop.
- you cna safely reuse the same variable name (`i`, `j`, etc.) in different loops in the same method.
- eg. -
`
public class Main{
	public static void main (String[] args){
		for (int = 0; i < 5; i++){
			System.out.println("Loop 1: " + i);
		}

		for (int = 0; i < 4; i++){
			System.out.println("Loop 2: " + i);
		}
	}
}
`


#### Class Scope

- variables declared inside a class but outside any method have class scope (also called fields). These variables can be accessed by all methods in the class.
- eg. -
`
public class Main{
	int x = 5; // class variable

	public static void main(String[] args){
		Main myObj = new Main();
		System.out.println(myObj.x); // x is accessible here
	}
}
`



### Recursion

- recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simpler problems which are easier to solve.
- recursion may be a bit difficult to understand. The best way to figure out how it works is to experiment with it.


#### Recursion Example

- adding two numbers together is easy to do, but adding a range of numbers is more complicated. In the following example, recursion is used to add a range of numbers together by breaking it down into the simple task of adding two numbers -
- eg. - use recursion to add all numbers from 1 to 10.
`
public class Main{
	public static int sum(int k){
		if (k > 0){
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}

	public static void main(String[] args){
		int result = sum(10);
		System.out.println(result);
	}
}
`

- **example explained**
	- when the `sum()` method is called, it adds parameter `k` to the sum of all numbers smaller than `k` and returns the result. 
	- When `k` becomes 0, the method just returns 0. 
	- when running, the problem follows these steps:
		- 10 + sum(9)
		- 10 + (9 + sum(8))
		- 10 + (9 + (8 + sum(7)))
		.
		..
		...
		- 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
		- 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
	- since the method does not call itself when `k` is 0, the program stops there and returns the result.


#### Halting Condition

- just as loops can run into the problem of infinite looping, recursive methods can run into the problem of infinite recursion. Infinite recursion is when the method never stops calling itself.
- Every recursive method should have a halting condition (base case), which is the condition where the method stops calling itself. In the previous example, the halting condition is when the parameter `k` becomes 0.
- it is helpful to see a variety of different examples to better understand the concept. In this example, the method adds a range of numbers between a start and an end. The halting condition for this recursive method is when end is not greater than start.
- eg. - here, we're using recursion to add all numbers from 5 to 10 (5+6+7+8+9+10.)
`
public class Recurs{
	public static int sum(int start, int end){
		if (end > start){
			return end + sum(start, end - 1);
		} else {
			return end;
		}
	}

	public static void main(String[] args){
		int result = sum(5, 10);
		System.out.println(result);
	}
}
`

- note:
	- here, be careful with recursion. 
	- Its easy to accidently write a method that never stops or uses too much memory. But when written correctly, recursion can be both efficient and elegant.


#### Countdown with Recursion

- this example demonstrates how to use recursion to create a countdown function -
- eg. -
`
public class Countdown{
	static void countdown(int n){
		if (n > 0){
			System.out.println(n + " ");
			countdown(n - 1); // calling countdown again
		}
	}

	public static void main(String[] args){
		countdown(5);
	}
}
`

- here, this method calls itself `n - 1` until `n` becomes `0`.


#### Calculate Factorial with Recursion

- here, this example uses a recursive method to calculate the factorial of 5.
- eg. -
`
public class Fact{
	static int factorial(int n){
		if (n > 1){
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args){
		System.out.println("Factorial of 5 is " + factorial(5));
	}
}
`

- note:
	- factorial means multiplying a number by every number below it, down to 1.
	- For example, the factorial of 5 is - 5 * 4 * 3 * 2 * 1 = 120.
	- by definition, `0!` is also 1.



## Classes - OOP

- OOP stands for Object-Oriented Programming.
- Procedural programming is about writing procedures or methods that perform operations on the data, while Object-Oriented Programming is about creating objects that contain both data and methods.
- Object-Oriented Programming has several advantages over procedural programming -
	- OOP is faster and easier toe xecute.
	- OOP provides a clear structure for the programs.
	- OOP helps to keep the java code DRY - Dont Repeat Yourself - and makes the code easier to maintain, modify or debug.
	- OOP makes it possible to create full reusable applications with less code and shorter development time.

- Tips: the DRY principle is about reducing the repetation of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.


### What are Classes and Objects?

- classes and objects are two main aspects of the Object-Oriented Programming.
- eg. -
	- class - Fruit
	- object - apple, banana, mango

- eg.2. -	
	- class - Car
	- object - Volvo, Audi, Toyota

- so, a class is a template for objects, and an object is an instance of a class.
- when the individual objects are created, they inherit all the variables and methods from the class.



## Classes/Objects

- java is an Object-Oriented Programming language.
- everything in java is associated with classes and objects, along with its attributes and methods. For example: in real lief, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.
- a class is like an object constructor, or a 'blueprint' for creating objects.


### Create a Class

- to create a class, use the keyword `class`.
- in this example, we create a class named `Main` with a variable `x`:
- eg. -
` in Main.java
public class Main{
	int x = 50;
}
`

- remember from Java Syntax that, a class should always start with an uppercase first letter, and that the name of the Java file should match the class name.


### Create an Object

- in Java, object is created from a class. we have already created the class named `Main`, so now, we can use this to create objects.
- to create an objectof `Main`, specify the class name, followed by the object name, and use the keyword `new`.
- eg. - create an object `myObj` and print the value of x.
`
public class Main{
	int x = 50;

	public static void main(String[] args){
		Main myObj = new Main();
		System.out.println(myObj.x);
	}
}
`


### Multiple Objects

- you can create multiple objects of one clas.
- eg. - here, we're creating two objects of Main:
`
public class Main{
	int x = 50;

	public static void main(String[] args){
		Main myObj1 = new Main(); // obj 1
		Main myObj2 = new Main(); // obj 2

		System.out.println(myObj1.x);
		System.out.println(myObj2.x);
	}
}
`


### Using Multiple Classes

- you can also create an object of a class and access it in another class. This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).
- remember, that the name of the java file should match the class name. Here, we have created two files in the same directry/folder -
	- FirstMain.java
	- Second.java
- in FirstMain.java
`
public class FirstMain{
	int x = 50;
}
`

- in Second.java
`
class Second{
	public static void main(String[] args){
		FirstMain myObj = new Main();
		System.out.println(myObj.x);
	}
}
`

- when both files are compiled - 
`C:\Users\Your Name>javac FirstMain.java
C:\Users\Your Name>javac Second.java
`

- you can run the Second.java file -
C:\Users\Your Name>java Second
`

- output -
`
50
`



## Class Attributes

- earlier, we used the term 'variable' for `x`, it is actually an attribute of the class. Or you could say that class attributes are variables within a class.
- eg. - here, we create a class called `Main` with two attributes - `x` and `y`.
`
public class Main{
	int x = 50;
	int y = 30;
}
`

- another term for class attributes is fields.


### Accessing Attributes

- you can access attributes by creating an object of the class, and by using the dot syntax(`.`).
- the following example will create an object of the `Main` class, with the name `myObj`. We use the `x` attribute on the object to print its value.
- eg. - create an object called `myObj` and print the value of `x`.
`
public class Main{
	int x = 50;

	public static void main(String[] args){
		Main myObj = new Main();
		System.out.println(myObj.x);
	}
}
`


### Modify Attributes

- you can also modify attribute values.
- eg. - here, we set the value of `x` to 40.
`
public class Main{
	int x; // here, its not set at first

	public static void main(String[] args){
		Main myObj = new Main();
		myObj.x = 500;
		System.out.println(myObj.x);
	}
}
`

- or, we can override existing values -
- eg. - here, we change the value of `x` to 25.
`
public class Main{
	int x = 100;

	public static void main(String[] args){
		Main myObj = new Main();
		myObj.x = 50; // x is now 50
		System.out.println(myObj.x);
	}
}
`

- if you dont want the ability to override existing values, declare the attribute as `final`.
- eg. - 
`
public class Main{
	final int x = 50;

	public static void main(String[] args){
		Main myObj = new Main();
		myObj.x = 25; // it will generate an error, coz we used the final keyword.
		System.out.println(myObj.x);
	}
}
`

- the `final` keyword is useful when you want a variable to always store the same value like PI(3.14..).
- the `final` keyword is called a 'modifier'.


### Multiple Objects

- if you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other.
- eg. - change the value of `x` to 50 in `myObj2` and leave `x` in `myObj1` unchanged.
`
public class Main{
	int x = 5;

	public static void main(String[] args){
		Main myObj1 = new Main(); // obj 1
		Main myObj2 = new Main(); // obj 2
		myObj2.x = 50;
		System.out.println(myObj2.x); // 50
		System.out.println(myObj1.x); // 5
	}
}
`


### Multiple Attributes

- you can also specify as many attributes as you want.
- eg. -
`
public class Main{
	String fname = "John";
	String lname = "Doe";
	int age = 50;

	public static void main(String[] args){
		Main myObj = new Main();
		System.out.println("Name: " + myObj.fname + myObj.fname + " Age: " + myObj.age);
	}
}
`



## Class Methods

- Methods are declared within a class, and they are used to perform certain actions.
- eg. - create a method named `myMethod()` in Main -
`
public class Main{
	static void myMethod(){
		System.out.println("Hello World!")
	}
}
`

- here, `myMethod()` prints a text (the action), when it is called. To call a method, write the method's name followed by two parantheses () and a semicolon;.
- eg. - inside the `main`, call `myMethod()` -
`
public class Main{
	static void myMethod(){
		System.out.println("Hello World!");
	}

	// calling the method
	public static void main(String[] args){
		myMethod();
	}
}

// outputs - Hello World!
`


### Static vs Public

- you will often see Java programs that have either `static` or `public`  attributes and methods.
- in the exmaple above, we created a `static` method, which means that it can be accessed without creating an object of the class, unlike `public`,which can only be accessed by objects.
- eg. - an example to demonstrate the difference between `static` and `public` methods -
`
public class Main{
	// static method
	static void myStaticMet(){
		System.out.println("Static methods can be called without creating an object.");
	}

	// public method
	public void myPublicMet(){
		System.out.println("Public methods must be called by creating objects.");
	}

	// main method
	public static void main(String[] args){
		myStaticMet(); // call the static method
		// myPublicMet(); - this will give an error

		Main myObj = new Main(); // create an object of main
		myObj.myPublicMet(); // call the public method on the object
	}
}
`


### Access Methods with an Object

- eg. - create a Car object named `myCar`. call the `fullThrottle()` and `speed()` methods on the `myCar` object, and run the program.
`
// creating a main class
public class Main{
	// creating a fullThrottle method
	public void fullThrottle(){
		System.out.println("Car is going fast as f*ck!!!")
	}

	// creating a speed() method and adding a parameter
	public void speed(int maxSpeed){
		System.out.println("Max speed: " + maxSpeed);
	}

	// inside main, call the methods on the myCar object
	public static void main(String[] args){
		Main myCar = new Main(); // creating a myCar object
		myCar.fullThrottle(); // calling the fullTHrottle method
		myCar.speed(150); // calling the speed method
	}
}
`

- **example explained**
	1. We created a custom `Main` classs with the `class` keyword.
	2. We created the `fullThrottle()` and `speed()` methods in the `Main()` class.
	3. the `fullThrottle()` method and the `speed()` method will print out some text, when they are called.
	4. The `speed()` method accepts an `int` parameter called `maxSpeed` - we will use this in 8.
	5. in order to use the `Main` class and its methods, we need to create an object of the `Main` class.
	6. then, go to the `main()` method, which you know by now is a built-in java method that runs your program (any code inside the main is executed.)
	7. by using the `new` keyword, we created an object with the name `myCar`.
	8. then, we call the `fullThrottle()` and `speed()` methods on the `myCar` object, and run the program using the name of the object (`myCar`), followed by a dot(`.`), followed by the name of the method (`fullThrottle();` and speed(`150`)). Notice, that we add an `int` parameter of `150` inside the `speed();` method.

- **remember that:**
	- the dot(.) is used to access the object's attributes and methods.
	- to call a method in java, write the method name followed by a set of parantheses(), followed by a semicolon(;).
	- a class must have a matching filename (`Main`(class) and Main.java(filename)).


### Using Multiple Classes

- it is a good practise to create an object of a class and access it in another class.
- remember that the name of the java file should match with the class name. Here, we have created two files in the same directory -
- in Main.java
`
public class Main{
	public void fullThrottle{
		System.out.println("Car going fast af!");
	}

	public void speed(int maxSpeed){
		System.out.println("Max Speed: " + maxSpeed)
	}
}
`
- in Second.java
`
class Second{
	public static void main(String[] args){
		Main myCar = new Main();
		myCar.fullThrottle();
		myCar.maxSpeed(200);
	}
}
`

- when both the files have been compiled -
`
C:\Users\Your Name>javac Main.java
C:\Users\Your Name>javac Second.java
`

- run the Second.java file -
`
C:\Users\Your Name>java Second
`

- and the output will be -
`
Car going fast af!
Max Speed: 200
`



## Constructors

- a constructor in Java is a special method that is used to initialize objects.
- the constructor is called when an object of a class is created.
- it can be used to set initial values for object attributes.
- eg. - creating a constructor.
`
// create a Main class
public class Main{
	int x; // create a class attribute

	// create a class constructor for the Main class
	public Main(){
		x = 50; // set the initial value for the class attribute x
	}

	public static void main(String[] args){
		Main myObj = new Main(); // create an object of class Main(this will call the constructor)
		System.out.println(myObj.x); // print the value of x
	}
}

// outputs - 5
`

- note that, the constructor name must match the class name, and it cannot have a return type (like `void`).
- also, note that, the constructor is called when the object is created.
- all classes have constructors by default. If yo do not create a class constructor yourself, Java creates one for you. However, you are not able to set initial values for object attributes.


### Constructor Parameters

- constructors can also take parameters, which is used to initialize attributes.
- the following example adds an `int y` parameter to the constructor. Inside the constructor, we set x to y (x = y). When we call the constructor, we pass a parameter to the constructor (5), which will set the value ofo x to 5.
- eg. -
`
public class Main{
	int x;

	public Main(int y){
		x = y;
	}

	public static void main(String[] args){
		Main myObj = new Main(5);
		System.out.println(myObj.x);
	}
}

//outputs - 5
`

- you can have as many parameters as you want -
`
public class Main{
	int modelYear;
	String modelName;

	public Main(int year, String name){
		modelYear = year;
		modelName = name;
	}

	public static void main(String[] args){
		Main myCar = new Main(2025, "Supra");
		Main myCar = new Main(myCar.modelName + " : " + myCar.modelYear);
	}
}

- outputs - 2025 Mustang
`



## this Keyword

- the `this` keyword in Java refers to the current object in a method or constructor.
- the `this` keyword is often used to avoid confusion when class attributes have the same name as method or constructor parameters.


### Accessing Class Attributes

- sometimes, a constructor or method has a parameter with the same name as a class variable. When this happens, the parameter temporarily hides the class variable inside that method or constructor.
- to refer to the class variable and not the parameter, you can use the `this` keyword.
- eg. -
`
public class Main{
	int x; // class variable x

	// constructor with one parameter x
	public Main(int x){
		this.x = x; // refers to the class variable x - so, in a way, its - Main.x = x - the Main() class's x accessed here = x from the constructor parameter
	}

	public static void main(String[] args){
		// create an object of Main and pass the value 5 to the constructor
		Main myObj = new Main(50);
		System.out.println(myObj.x); // outputs - 50
	}
}
`

- **tip:**
	- think of `this.x = x;` as: `this.x`(the class variable) gets the value of `x` the parameter.
	- without `this`, the code above will look like - `x = x;`, which would set the parameter `x` equal to itself, and the class variable would stay uninitialized (`0`).


### Calling a Constructor from Another Constructor

- you can also use `this()` to call another constructor in the same class.
- this is useful when you want to provide default values or reuse initialization code instead of repeating it.
- eg. -
`
public class Main{
	int modelYear;
	String modelName;

	// constructor with one parameter
	public Main(String modelName){
		// call the two-parameter constructor to reuse code and set a default year
		this(2020, modelName)
	}

	// constructor with two parameters
	public Main(int modelYear, String modelName){
		// use 'this' to assign values to the class variable
		this.modelYear = modelYear;
		this.modelName = modelName;
	}

	// method to print the car info
	public void printInfo(){
		System.out.println(modelYear + " " + modelName);
	}

	public static void main(String[] args){
		// create a car with only model name (uses default year)
		Main car1 = new Main("Corvette");

		// now, create a car with both mmodel year and name\
		Main car2 = new Main(2025, "Mustang GTD");

		car1.printInfo();
		car2.printInfo();
	}
}

// outputs -
2020 Corvette
2025 Mustang GTD
`


- **note:**
	- the call to `this()` must be the first statement inside the constructor.


### When to use this?

- when the constructor or method has a parameter with the same name as a class variable, use `this` to update the class variable correctly.
- to call another constructor in the same class and reuse code.



## Modifiers

- by now, you are quite familiar with the `public` keyword that appears in almost all of our examples.
	- `public class Main`
- the `public` keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.
- we divide modifiers into two groups -
	- access modifiers - controls the access level
	- non-access modifiers - do not control access level, but provides other functionality


### Access Modifiers

- for classes, you can use either `public` or default.
- Modifier | Description
------------------------
- `public` | the class is accessible by any other class.
- default | the class is accessible by classes in the same package. This is used when you don't specify a modifier.


- for attributes, methods and constructors, you can use one of the following -

- Modifier | Description
------------------------
- `public` | the code is accessible for all classes.
- `private` | the code is  only accessible within the declared class.
- default | The code is only accessible in the same package. This is used when you don't specify a modifier.
- `protected` | the code is accessible in the same package and subclasses.


### Public vs Private Example

- in the example below, the class has one `public` attribute and one `private` attribute.
- think of it like real life -
	- `public` - a publc park, everyone can enter
	- `private` - your house key, only you can use it.

- eg. -
`
class Person{
	public String name = "John"; // public - accessible everywhere
	private int age = 25; // private- only accessible inside this class
}

public class Main{
	public static void main(String[] args){
		Person p = new Person();
		System.out.println(p.name); // works fine
		System.out.println(p.age); // error: age has a private access in Person
	}
}
`

- example explained -
- here, `name` is declared as `public`, so it can be accessed from outside the `Person` class. But `age` is declared as `private`, so it can only be used inside the `Person` class.


### Non-Access Modifiers

- Non-Access Modifiers do not control visibility (like `public` or `private`), but instead, add other features to classes, methods and attributes.
- the most commonly used Non-Access Modifiers are `final`, `static` and `abstract`.


#### Final

- if you dont want the ability to override existing attribute values, declare attributes as `final`.
- eg. -
`
public class Main{
	final int x = 100;
	final double PI = 3.14;

	public static void main(String[] args){
		Main myObj = new Main();
		myObj.x = 50; // will give error as we used final earlier
		myObj.PI = 5.12; // will give error as we used final earlier
		System.out.println(myObj.x);
	}
}
`


#### Static

- a `static` method belongs to the class, not to any specific object. This means you can call it without creating an object of the class.
- eg. - a simple exaple showing how to call a `static` method directly -
`
public class Main{
	// static method 
	static void myStatMet(){
		System.out.println("Static methods can be called without creating objects")
	}

	// main method
	public static void main(String[] args){
		myStatMet(); // will call the static method
		Main.myStatMet(); // we can also call it using the class name
	}
}
`

- **note:**
- a `static` method belongs to the class itself. You can call it without creating an object, but it cannot use variables or methods that belong to an object.


#### Abstract

- an `abstract` method belongs to an `abstract` class, and it does not have a body. The body is provided by the subclass.
- eg. - in Main.java
`
// abstract class
abstract class Main{
	public String fname = "John";
	public int age = 25;
	public abstract void study(); // abstract method
}

// subclass (inherit from Main)
class Student extends Main{
	public int gradYear = 2020;
	public void study() { // the body of the abstract method is provided here
	System.out.println("Studying all day long")
	}
}
`

- in Second.java
`
// code from filename: Second.java
class Second{
	public static void main(String[] args){
		// create an object of the student class (which inherits attributes and methodsfrom Main)
		Student myObj = new Student();

		System.out.println("Name: " + myObj.fname);
		System.out.println("Age: " + myObj.age);
		System.out.println("Grad Year: " + myObj.gradYear);
		myObj.study(); // call abstract method
	}
}
`


#### Non-Access Modifiers List

- for classes, you can use either `final` or `abstract` -
- modifier | description
-------------------------
- `final` | the class cannot be inherited by other classes.
- `abstract` | the class cannot be used to create objects. (to access an abstract class, it must be inherited from another class.)

- for attributes and methods, you can use one of the following -
- modifier | description
-------------------------
- `final` | attributes adn methods cannot be overridden/modified.
- `static` | attributes and methods belong to the class, not to objeccts. This means all objects share the same `static` attribute, and `static` methods can be called without creating objects. 
- `abstract` | can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example `abstract void run();`. The body is provided by the subclass (inherited from). 
- `transient` | attributes and methods are skipped when serializing the object containing them.
- `synchronized` | methods can only be accesssed by one thread at a time.
- `volatile` | the value of an attribute is not cached thread-locally, and is always read from the 'main memory'.



## Encapsulation

- the meaning of Encapsulation is, to make sure that 'sensitive' data is hidden from users. To achieve this, you must -
	- declare class variables/attributes as `private`.
	- provide public get and set methods to access and update the value of a `private` variable.


### Get and Set

- earlier, we saw that `private` variables can only be accessed within the same class (an outside class has no access to it). However, it is also possible to access them if we provide public get and set methods.
- the `get` method returns the variable value, and the `set` method sets the value.
- syntax for both is that they start with either `get` and `set`, followed by the name of the variable, with the first letter in upper case.
- eg.-
`
public class Person{
	private String name; // private = restricted access

	// getter
	public String getName(){
		return name;
	}

	// setter
	public void setName (String newName):
	this.name = newName;
}
`

- **example explained:**
	- the `get` method returns the value of the variable `name`.
	- the `set` method takes a parameter (`newName`) and assigns it to the `name` variable. The `title` keyword is used to refer to the current object.
	- however, as the `name` variable is declared as `private`, we cannot access it from outside this calss.

- eg. -
`
public class Main{
	public static void main(String[] args){
		Person myObj = new Person();
		myObj.name = "John"; // error
		System.out.println(myObj.name); // error
	}
}
`

- if the variable was declared as `public`, we would expect the following output -
- Output - John

- however, as we try to access a `private` variable, we get an error.
- instead, we use the `getName()` and `setName()` methods to access and update the variable.
- eg. -
`
public class Main{
	pubic static void main(String[] args){
		Person myObj = new Person();
		myObj.setName("John"); // set the myObj.name's variable to John
		System.out.println(myObj.getName()); // prints - John
	}
}
`


### Why Encapsulation?

- better control of class attributes and methods.
- class attributes can be made read-only (if you only use the `get` method), or write-only (if you only use the `set` method.)
- flexible - the programmer can change one part of the code without affecting other parts.
- increased security of data.



## Packages / API

- a package in java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories -
	- Built-in packages (packages from the Java API)
	- User-defined packages (create your own packages)


### Built-In Packages

- the java API is a library of prewritten classes, that are free to use, included in the Java development environment.
- the library contains components for managing input, database programming, and much more. It can be found at - Oracles website: https://docs.oracle.com/javase/8/docs/api/.
- the library id divided into packages and classes, meaning, you can either import a single class (along with its methods and attributes), or a whole package that contain all the classes that belong to the specified package.
- to use a class or a package from the library, you need to use the `import` keyword -
- syntax -
`
import package.name.class; // import a single class
import package.name.*; // import the whole package
`


### Import a Class

- if you find a class you want to use, for example, the `Scanner` class, which is used to get the user input, write the following code -
- eg. -
`
import java.util.Scanner;
`

- in the example above, `java.util` is a package, while `Scanner` is a class of the `java.util` package.
- to use the `Scanner` class, create an object of the class and use any of the available methods found in the `Scanner` class documentation. In our exmaple, we will use the `nextLine()` method, which is used to read a complete line.
- eg. - using the `Scanner` class to get user input -
`
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username: ");

		String userName = myObj.nextLine();
		System.out.println("Username is: " + userName)
	}
}
`


### Import a Package

- there are many packages to choose from. In previous example, we used the `Scanner` class from the `java.util` package. This package also contains date and time facilities, random-number generator and other utility classes.
- to import a whole package, end the sentence with an asterisk sign(*). The following example will import ALL classes in the `java.util` package.
- eg. -
`
import java.util.*;
`


### User-defined Packages

- to create your own package, you need to understand that java uses a file system directory to store them. Just like folders on your PC.
- eg. -
`
root
	- mypack
		- MyPackageClass.java
`
- to create a package, use the `package` keyword.
- in MyPackageClass.java
`
package myPack;
class MyPackageClass{
	public static void main(String[] args){
		System.out.println("This is a package");
	}
}
`

- then, save the file as MyPPAckageClass.java, and compile it.

- **note:**
	- this forces the compiler to create the 'mypack' package.
	- the `-d` keyword specifies the destination for where to save the class file. You can use any directory name, like c:/user(windows), or, if you want to keep the package within the same directory, you can use the dor notation '.', like in the example above.
	- note - the package name should be written in lower case to avoid conflict with the class names.

- when we compiled the package in the example above, a new folder was created called 'mypack'.
- to run the MyPackageClass.java file, write the following in cmd -
`
java mypack.MyPackageClass
`
- the output will be -
`
This is my package!
`



## Inheritence (subclass and superclass)

- in java, it is possible to inherit the attributes adn methdos from one class to another. We group the 'inheritence concept' into two categories - 
	- subclass(child) - the class that inherits from another class
	- superclass(parent) - the class being inherited from

- to inherit from a class, use the `extends` keyword.
- in our example below, the `Car` class(subclass) inherits the attributes and methods from the `Vehicle` class (superclass).
- eg. -
`
class Vehicle{
	protected String brand = "Ford"; // vehicle attribute
	public void honk(){ // vehicle method
		System.out.println("toot, toot!");
	}
}

class Car extends Vehicle{
	private String modelName = "Mustang GTD";  // car attribute
	public static void main(String[] args){
		// create a myCar object

		Car myCar = new Car();

		// call the honk() method (from the vehicle class) on myCar object
		myCar.honk();

		// display the value of the brand attribute (from the vehicle class) and the value of the modelName from the Car class
		System.out.println(myCar.brand + " " + myCar.modelName);
	}
}
`

- **note:**
	- did you notice the `protected` modifier in Vehicle?
	- we set the brand attribute in Vehicle to a `protected` access modifier. If it was set to `private`, the Car class would not be able to access it.
	
	- Why and when to use "Inheritence"?
	- it is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
	
	- **tip:**
	- also, take a look at Polymorphism, which uses inherited methods to perform different tasks.


### the final keyword

- if you dont want other classes to inherit from a class, use the `final` keyword.
- if you try to access a `final` class, Java will generate an error:
`
final class Vehicle{
	...
}

class Car extends Vehicle{
	...
}
`

- the output of the above example will be something like this -
`
Main.java:9: error: cannot inherit from final Vehicle
class Main extends Vehicle {
                  ^
1 error)

`



## Polymorphism

- Polymorphism means 'many forms', and it occurs when we have many classes that are related to each other by inheritence.
- like we specified earlier, inheritence lets us inherit attributes and methodss from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
- for example, think of a superclass called `Animal` that has a method called `animalSound()`. Subclasses of Animals could be Pigs, Cats, Dogs - adn they also have their own implementation of an animal sound - the pig oinks, cat meows, dog barks, etc.
- eg. -
`
class Animal{
	public void animalSound(){
		System.out.println("The animal makes a sound.");
	}
}

class Pig extends Animal{
	public void animalSound(){
		System.out.println("Oink Oink mf!!!");
	}
}

class Cat extends Animal{
	public void animalSound(){
		System.out.println("Mraaawww!!");
	}
}
`

- here, we are using the `extends` keyword to inherit from a parent class.

- now, we can create `Pig` and `Cat` objects and call the `animalSound()` method on both of them:
`
class Animal{
	public void animalSound(){
		System.out.println("The animal makes a sound.");
	}
}

class Pig extends Animal{
	public void animalSound(){
		System.out.println("Oink Oink mf!!!");
	}
}

class Cat extends Animal{
	public void animalSound(){
		System.out.println("Mraaawww!!");
	}
}

class Main{
	public static void main(String[] args){
		Animal myAnimal = new Animal(); // create a new animal object
		Animal myPig = new Pig(); // create a pig class
		Animal myCat = new Cat(); // create a cat class

		myAnimal.animalSound();
		myPig.animalSound();
		myCat.animalSound();
	}
}
`

- why and when to use "Inheritence" and "Polymorphism"?
- it is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.



## super Keyword

- in java, the `super` keyword is used to refer to the parent class of a subclass.
- the most common use for the `super` keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.
- it can be used in two main ways -
	- to access attributes and methods from the parent class
	- to call the parent class constructor


### Access Parent Methods

- if a subclass has a method with the same name as one in its parent class, you can use `super` to call the parent version:
- eg. -
`
class Animal{
	public void animalSound(){
		System.out.println("The animal makes a sound!");
	}
}

class Cat extends Animal{
	public void animalSound(){
		super.animalSound(); // calls the parent method of same name
		System.out.println("Mraaawww!!");
	}
}

public class Main{
	public static void main(String[] args){
		Cat myCat = new Cat();
		myCat.animalSound();
	}
}

- outputs -
the animal makes a sound!
Mraaawww!!
`

- **note:**
	- use `super` when you want to call a method from the parent class that has been overridden in the child class - basically meaning methods of the same name but diff functionality.


### Access Parent Attributes

- you can also use `super` to access an attriute from the parent class if they have an attribute with the same name.
- eg. -
`
class Animal{
	String type = Animal;
}

class Cat extends Animal{
	String type = "Cat";

	public void printType(){
		System.out.println(super.type); // access parent's attributes here coz we used super
	}
}

public class Main{
	public static void main(String[] args){
		Cat myCat = new Cat();
		myCat.printType();
	}
}

- outputs -
Animal
`


### Call Parent Constructor

- use `super()` to call the constructor of the parent calss.  This is especially useful for reusing initialization code.
- eg. -
`
class Animal{
	Animal(){
		System.out.println("Animal is created!");
	}
}

class Cat extends Animal{
	Cat(){
		super(); // calll parent constructor. Also, first call to super()
		System.out.println("Cat is created!");
	}
}

public class Main{
	public static void main(String[] args){
		Cat myCat = new Cat();
	}
}

- outputs -
Animal is created!
Cat is created!
`

- **note:**
	- the call to `super()` must be the first statement in the subclass constructor.




## Inner Classes

- in java, it is also possible to nest classes (a class within a class). the purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.
- to access the inner class, create an object of the outer class, and then create an object of the inner class:
- eg. -
`
class OuterClass{
	int x = 10;

	class InnerClass{
		int y 50;
	}
}

public class Main{
	public static void main(String[] args){
		OuterClass myOuter = new OuterClass();
		OuterClasss.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	}
}

// outputs - (50 + 10)
`


### Private Inner Class

- unlike a 'regular' class, an inner class can be `private` or `protected`. If you dont want outside objects to access the inner class, declare the class as `private`.
- eg. -
`
class OuterClass{
	int x = 10;

	private class InnerClass{
		int y = 100;
	}
}

public class Main{
	public static void main(String[] args){
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	}
}
`

- if you try to access a private inner class from an outside class, an error occurs.
`
Main.java:13: error: OuterClass.InnerClass has private access in OuterClass
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
`


### Static Inner Class

- an inner class can also be `static`, which means that you can access it without creating an object of the outer class.
- eg. -
`
class OuterClass{
	int x = 10;

	static class InnerClass{
		int y = 100;
	}
}

public class Main{
	public static void main(String[] args){
		OuterClass.InnerClass myInner = new OuterClass.InnerClass();
		System.out.println(myInner.y);
	}
}

// outputs - 110
`

- **note:**
	- just like `static` attributes and methods, a `static` inner class does not have access to members of the outer class.


### Access Outer Class From Inner Class

- one advantage of inner classes, is that they can access attributes and methods of the outer class.
- eg. -
`
class OuterClass{
	int x = 10;

	class InnerClass{
		public int myInnerMethod(){
			return x;
		}
	}
}

public class Main{
	public static void main(String[] args){
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.myInnerMethod());
	}
}

// outputs - 110
`



## Abstraction
## Abstract Classes and Methods

- data abstraction is the process of hiding certain details and showing only essential information to the user. Abstraction can be achieved with either abstract classes or interfaces.
- the `abstract` keyword is a non-access modifier, used for classes and methods:
	- **Abstract Class**: is a restricted class that cannot be used to create objects (to access it,  it must be inherited from another class).
 	- Abstract Method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass(inherited from).

- an abstract class can have both abstract and regular methods:
- eg. -
`
abstract class Animal{
	public abstract void animalSound();
	public void sleep(){
		System.out.println("zzz");
	}
}
`

- from the example above,it is not possible to create an object of the Animal class:
`
Animal myObj = new Animal(); // will generate an error
`

- to access the abstract class, it must be inherited from another class.  Lets convert the Animal class we used in Polymorphism to abstract class.
- remember that, we use the `extends` keyword to inherit from a class.
- eg. -
`
// abstract class
abstract class Animal{
	// abstract method (does not have a body)
	public abstract void animalSound();

	// regular method
	public void sleep(){
		System.out.println("zzz");
	} 
}

// sub class (inherits from Animal)
class Cat extends Animal{
	public void animalSound(){
		// the body of animalSound() is provided here
		System.out.println("Merrrrrrooww");
	}
}

class Main{
	public static void main(String[] args){
		Cat myCat = new Cat(); // create a Cat object
		myCat.animalSound();
		myCat.sleep();
	}
}
`

- **note:** Why and when to use Abstract Classes and Methods?
	- to achieve security - hide certain details and only show the important details of an object.
	- note that, abstraction can also be achieved with interfaces.



## Interfaces

- another way to achieve abstraction in Java, is with interfaces.
- an `interface` is a completely 'abstract class' that is used to group related methods with empty bodies.
- eg. -
`
// interface
interface Animal{
	public void animalSound(); // interface method (does not have a body)
	public void run(); // interface method (does not have a body)
}
`

- to access the interface methods, the interface must be 'implemented' (kinda like inherited) by another class with the `implements` keyword (instead of `extends`). The body of the interface method is provided by the 'implement' class.

- eg. -
`
// interface
interface Animal{
	public void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body) 
}

// Cat 'implements' the Animal interface
class Cat implements Animal{
	public void animalSound(){
		// the body animalSound() is provided here
		System.out.println("Mrraaawwww!");
	}

	public void sleep(){
		// body of sleep() is provided here
		System.out.println("Zzzzz");
	}
}

class Main{
	public static void main(String[] args){
		Cat myCat = new Cat(); // create a new cat object
		myCat.animalSound();
		myCat.sleep();
	}
}
`

- **notes on interfaces:**
	- like 'abstract classes', interfacs cannot be used to create objects (in the example above, it is not possible to create an 'Animal' object in the MyMainClass)
	- interface methods do not have a body - the body is provided by the 'implement' class.
	- on implementation of an interface, you must override all of its methods.
	- interface methods are by default `abstract` and `public`.
	- interface attributes are by default `public`, `static`, and `final`.
	- an interface cannot contain a constructor (as it cannot be used to create objects).

	- **Why and When to Use Interfaces?**
	1. To achieve secutiry - hide certain details and only show the important details of an object (interface).
	2. java does not support 'multiple inheritence' (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interface. Note: To implement multiple interfaces, seperate them with a comma (see example below).


### Multiple Interfaces

- to implement multiple interfaces, seperate them with a comma.
- eg. - 
`
interface FirstInterface{
	public void myMethod(); // interface method
}

interface SecondInterface{
	public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface{
	public void myMethod(){
		System.out.println("Some text...");
	}

	public void myOtherMethod(){
		System.out.println("Other Method's text..");
	}
}

class Main{
	public static void main(String[] args){
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}
`



## Anonymous

- an anonymous class is a class without a name. It is created and used at the same time.
- you often use anonymous classes to override methods of an existing class or interface, without a seperate class file.
- here, we create an anonymous class that extends another class and overrides its method.
- eg. - 
`
// normal class
class Animal{
	public void makeSound(){
		System.out.println("Animal sound");
	}
}

public class Main{
	public static void main(String[] args){
		// anonymous class that overrides animalSound() method
		Animal myAnimal = new Animal(){
			public void makeSound(){
				System.out.println("Mraaaw!");
			}
		}; // semicolon is required to end the line of code that creates the object

		myAnimal.makeSound();
	}
}

// output - Mraaaaw!
`


### Anonymous Class from an Interface

- you can also use an anonymous class to implement an interface on the fly.
- eg. -
`
// interface
interface Greeting(){
	void sayHello();
}

public class Main{
	public static void main(String[] args){
		// anonymous class that implements Greeting
		Greeting myGreet = new Greeting(){
			public void sayHello(){
				System.out.println("Hello world!");
			}
		};

		myGreet.sayHello();
	}
}

// outputs - Hello world!
`

- **when to use anonymous classes?**
- use anonymous classes when you need to create a short class for one-time use. For example -
	- overriding a method without creating a new subclass.
	- implementing an interface quickly.
	- passing small pieces of behavior as objects.



## Enums

- an `enum` is a special 'class' that represents a group of constants (unchangable variables, like `final` variables).
- to create an `enum`, use the `enum` keyword (instead of class or interface), and seperate the constants with a comma. Note that they should be in uppercase letters:
- eg. -
`
enum Level{
	LOW,
	MEDIUM,
	HIGH
}
`

- you can access `enum` constants with the dot syntax -
`
Level myVar = Level.MEDIUM;
`

- enum is short for 'enumerations', which means 'specifically listed.'


### Enum inside a Class

- you can also have an `enum` inside a class.
- eg. -
`
public class Main{
	enum Level {
		LOW,
		MEDIUM,
		HIGH
	}

	public static void main(String[] args){
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
	}
}

// outputs - MEDIUM
`


### Enum in a Switch Statement

- enums are often used in `switch` statements to check for corresponding values:
- eg. -
`
enum Level {
	LOW,
	MEDIUM,
	HIGH
}

public class Main{
	public static void main(String[] args){
		Level myVar = Level.MEDIUM;

		switch (myVar){
			case LOW:
				System.out.println("Low Level");
				break;
			case MEDIUM:
				System.out.println("Medium Level");
				break;
			case HIGH:
				System.out.println("High Level");
				break;
		}
	}
}

// output - Medium LEvel
`


### Loop Through an Enum

- the enum type has a `values()` method, which returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum:
- eg. -
`
for (Level myVar : Level.values()){
	System.out.println(myVar);
}

// output -
LOW
MEDIUM
HIGH
`


### Difference between Enums and Classes

- an `enum` can, just like a `class`, have attributes and methods. The only difference is that enum constants are `public`, `static` and `final` (unchangable - cannot be overridden).
- an `enum` cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

- why and when to use enums?
- use enums when you have values that you know arent going to change, like month days, days, colors, deck of cards, etc.


### Enum Constructor

- an `enum` can also have a constructor just like a class.
- the constructor is called automatically when the constants are created. You cannot call it yourself.
- here, each constant in the enum has a value (a string) that is set through the constructor:
- eg. -
`
enum Level{
	// enum constants (each has its own description)
	LOW("Low Level"),
	MEDIUM("Mid Level"),
	HIGH("Hi Level");

	// field (variable) to store the description text
	private String description;

	// constructor (runs once for each constant above)
	private Level(String description){
		this.description = description;
	}

	// Getter method to read the description
  	public String getDescription() {
    	return description;
  }
}

public class Main{
	public static void main(String[] args){
		Level myVar = Level.MEDIUM; // pick one enum constant
		System.out.println(myVar.getDescription()); // prints "Mid Level"
	}
}
`

- **note:**
	- the constructor for an enum must be private. If you dont write `private`, Java adds it automatically.


#### Loop Through Enum with Constructor

- you can also loop through the constants and print their values using the values() method.
- eg. -
`
for (Level myVar : Level.values()){
	System.out.println(myVar + " : " + myVar.getDescription());
}

// output -
LOW : Low level
MEDIUM : Mid level
HIGH : Hi level
`



## User Input(Scanner)

- the `Scanner` class is used to get user input, and it is found in the `java.util` package.
- to use the `Scanner` class, create an object of the class and use any of the available methods found in the `Scanner` class documentation. Here, we are using `nextLine()` method, which is used to read Strings.
- eg. -
`
import java.util.Scanner; // import Scanner class

class Main{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in); // create a Scanner object
		System.out.println("Enter username: ");

		String uName = myObj.nextLine(); // read user input
		System.out.println("Username is: " + uName); // output the user name
	}
}
`


### Input Types

- in our example above, we used the `nextLine()` method, which is used to read Strings. To read other types, look at the table below:
- Method | Description
----------------------
- nextBoolean() | Reads a `boolean` value from the user
- nextByte() | Reads a `byte` value from the user
- nextDouble() | Reads a `double` value from the user
- nextFloat() | Reads a `float` value from the user
- nextInt() | Reads a `int` value from the user
- nextLine() | Reads a `String` value from the user
- nextLong() | Reads a `long` value from the user
- nextShort() | Reads a `short` value from the user

- here, we use different methods to read data of various types -
- eg. -
`
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter name, age, salary: ");

		// string input
		String name = myObj.nextLine();

		// numerical input
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();

		// output input by the user
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}
}
`

- **note:**
	- if you enter wrong input (e.g. text in a numerical input), you will get an exception/error message (like "inputMismatchException").



## Date

- java does not have a built-in Date class, but we can import the `java.time` package to work with the date and time API. the package includes many date and time classes. For example -
- Class | Description
---------------------
- `LocalDate` | Represents a date (year, month, day (yyyy-MM-dd))
- `LocalTime` | Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
- `LocalDateTime` | Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
- `DateTimeFormatter` | Formatter for displaying and parsing date-time objects


### Display Current Date

- to display the current date, import the `java.time.LocalDate` class, adn use its `now()` method.
- eg. -
`
import java.time.LocalDate; // import localdate class

public class Main{
	public static void main(String[] args){
		LocalDate myObj = LocalDate.now(); // create a date object
		System.out.println(myObj); // display current date
	}
}

// outputs - 2025-10-30
`


### Display Current Time

- to display the current time (hour, minute, second, and nanoseconds), import the `java.time.LocalTime` and use its now() method.
- eg. -
`
import java.time.LocalTime; // import localtime class

public class Main{
	public static void main(String[] args){
		LocalTime myObj = LocalTime.now(); // create a date object
		System.out.println(myObj); // display current date
	}
}

// outputs - 21:26:32.625157
`


### Display Current Date and Time

- to display the current date and time, import the `java.time.LocalDateTime` class, and use its now() method.
- eg. -
`
import java.time.LocalDateTime; // import localdatetime class

public class Main{
	public static void main(String[] args){
		LocalDateTime myObj = LocalDateTime.now(); // create a date time object
		System.out.println(myObj); // display current date
	}
}

// outputs - 2025-10-29T21:26:32.626221
`


### Formatting Date and Time

- the "T" in the example above is used to seperate the date from the time. 
- You can use the `DateTimeFormatter` class with the `ofPattern()` method in the same package to format or parse date-time objects. The following example will remove both the "T" and nanoseconds from date-time:
- eg. -
`
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main{
	public static void main(String[] args){
		LocalDateTime myTime = LocalDateTime.now();
		System.out.println("Before formattring: " + myTime);

		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");

		String formattedDate = myTime.format(myFormatObj);
		System.out.println("After formattring: " + formattedDate)
	}
}

// outputs -
Before Formatting: 2025-10-29T21:26:32.626096
After Formatting: 29-10-2025 21:26:32
`

- the `ofPattern()` method accepts all sorts of values, if you want to display the date and time in a different format. Like example -
- Value | Example 
-----------------
- yyyy-MM-dd | 2020-10-09
- dd/MM/yyyy | 09/10/2020
- dd-MMM-yyyy | 09-Sep-2020
- E, MMM dd yyyy | Fri, Oct 10 2020



## Errors
### Java Errors

- when error occurs in code, the key is learning how to spot and fix them.
- here, we cover common errors and helpful debugging tips to understand what's going wrong and how to fix it.


#### Types of Errors in Java

- Error Type | Description
--------------------------
- Compile-Time Error | Detected by the compiler. Prevents the code from running. 
- Runtime Error | Occurs while the program is running. Often causes crashes.
- Logical Error | Code runs but gives incorrect results. Hardest to find.


#### Common Compile-Time Errors

- compile-time errors occur when the program cannot compile due to syntax or type issues.
- here are some examples -

1. Missing Semicolon
- eg - 
`
int x = 5
System.out.println(x);
`
- result - error:';' expected

- **tip:** Java requires a semiconon at the end of every statement (int x = 5;)


2. Undeclared Variables
- eg. -
`
System.out.println(myVar);
`
- result - cannot find symbol
	symbol: variable myVar

- **tip:** you must declare a variable before using it (int myVar = 50;)


3. Mismatched Types
- eg. -
`
int x = "Hello";
`
- result - incompatible types: String cannot be converted to int

- **tip:** Make sure the value matches the variable type (String x = "Hello";)


#### Common Runtime Errors

- runtime errors occur when the program compiles but crashes or behaves unexpectedly.
- here are some examples -
1. Division by Zero
- eg. -
`
int x = 10;
int y = 0;
int result = x / y;
System.out.println(result);
`
- result - exception in thread 'main' java.lang.ArithmeticException: / by zero


2. Array Index Out of Bounds
- eg.-
`
int [] numbers = {1, 2, 3};
System.out.println(numbers[8]);
`
- result - Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 3


#### Logical Errors

- logical errors happen when the code runs, but the result is not what you thought.
- eg. -
`
int x = 10;
int y = 2;
int sum = x - y;
System.out.println("x + y = " + sum);
`
- result - x + y = 8
- expected result - 12
- logical error - the code mistakenly subtracts instead of adds.

- **tip:**
	- test your program with different inputs to catch logic flaws (try using `x + y` instead). This is part of debuggin.


#### Good Habits to Avoid Errors

- use meaningful variable names.
- read the error message carefully. What line does it mention?
- check for missing semicolons or braces.
- look for typos in variables or method names.



### Debugging

- after learning about common errors, the next step in understanding how to debug your Java code - that is, how to find and fix those erros effectively.
- here, we use simple debugging techniques that are useful for beginners and helpful even for experienced developers.


#### What is Debugging?

- debugging is the procecss of identifying and fixing errors and bugs in your code.
- it often involves -
	- reading error messages
	- tracing varible values step by step
	- testing small pieces of code independently.

- **tip:**
	- debugging is a skill that improves with practise. The more you debug, the better you get at spotting problems quickly.


#### Print Statements for Debugging

- the most basic (and often most effective) way to debug Java code is to use `System.out.println()` to print values and check the flow of the program.
- in our example here, the first line "Before division" will print, but the second line is never reached because the program crashes due to division by zero:
- eg. -
`
int x = 10;
int y = 0;

System.out.println("Before division"); // debug output

int result = x / y; // crashes

System.out.println("Result: " + result); // never runs
`

- result -
Before division
Exception in thread "main" java.lang.ArithmeticException: / by zero

- **tip:**
	- add print statements before and after key lines of code to find out where things go wrong.


#### Check Variable Values

- if something unexpected happens, print out the values of variables.
- eg. -
`
int age = 17;
System.out.println("Age: " + age);

if (age >= 18){
	System.out.println("Access Granted");
} else {
	System.out.println("Age denied!");
}
`

- **tip:**
	- this is a good way to test whether a condition is working correctly - try changing `age` to 18 or 19 and observe the output.

 
#### Debugging with IDEs

- modern IDEs like IntelliJ IDEA, Eclipse, and NetBeans come with built-in debugging tools.
	- set breakpoints to pause the program at specific lines
	- step through code line by line
	- inspect variable values in real time

- **tip:**
	- use your IDEs debugger to find errors faster - its more powerful than print statements alone!


#### Debugging Checklist

- read the full error messages, it often tells you exactly whats wrong
- check if all variables are initialized before use
- print variable values to trace the problem
- watch for off-by-one errors in loops and arrays
- comment out the sections of code to find bugs.



### Exceptions

- Different types of errors can occur while running a program - such as coding mistakes, invalid inputs, or unexpected situations.
- when an error occurs, Java will normally stop and generate an error message. The technical term for this is - Java will throw an exception (throw an error).


#### Exception Handling (try and catch)

- exception handling lets you catch and handle errors during runtime - so your program doesnt crash.
- it uses different keywords -
	- `try` - the try statement allows you to define a block of code to be tested for errors while it is being executed.
	- `catch` - the catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

- the try and catch keywords come in pairs -
- syntax -
`
try{
	// block of code to try
} 
catch(Exception e){
	// block of code to handle errors
}
`

- consider the following example -
- this will generate an error, because myNumbers[10] does not exist.
`
public class Main{
	public static void main(String[] args){
		int[] myNumbers = {1, 2, 3, 4, 5};
		System.out.println(myNumbers[10]); // error
	}
}
`

- the output will be something like this -
`
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        at Main.main(Main.java:4)
`

- **note:**
	- `ArrayIndexOutOfBoundsException` occurs when you try to access an index number that does not exist.

- if an error occurs, we use `try...catch` to catch the error and execute some code to handle it.
- eg. -
`
public class Main{
	public static void main(String[] args){
		try{
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);
		} catch (Exception e){
			System.out.println("Something went wrong.")
		}
	}
}

// output - Something went wrong.
`	


#### Finally

- the `finally` statement lets you execute code, after `try...catch`, regardless of the result.
- eg. -
`
public class Main{
	public static void main(String[] args){
		try{
			int[] myNum = {1, 2, 3, 4, 5};
			System.out.println(myNum[10]);
		} catch (Exception e){
			System.out.println("Something went wrong!);
		} finally {
			System.out.println("The try..catch is finished!");
		}
	}
}

// output - something went wrong!
the try...catch is finished.
`


#### The throw keyword

- the `throw` statement allows you to create a custom error.
- the `throw` statement is used together with an exception type. There are many exception types available in Java: `ArithmeticException`, `FileNotFoundException`, `ArrayIndexOutOfBoundsException`, `SecurityException`, etc.
- eg. - throw an exception if the age is below 18 (print "Access Denied!"). "Access Granted" if the age is above 18.
`
public class Main{
	public class main void(String[] args){
		if (age < 18) {
			throw new ArithmeticException ("Access Deined. You are not old enough");
		} else {
			System.out.println("Access Granted. You can vote.")
		}
	}

	public static void main(String[] args){
		checkAge(15); // its below 15, so it will go to throw keyword block
	}
}

// output - Exception in thread "main" java.lang.ArithmeticException: Access denied - You must be at least 18 years old.
        at Main.checkAge(Main.java:4)
        at Main.main(Main.java:12)

`

- however, if  the age was 20, we would not get an exception.
- eg. -
`
checkAge(20);

// output - Access Granted. You can vote.
`


#### Errors and Exception Types

- here's a table that shows some of the most common errors and  exceptions in java, with a short descriptiomn of each -
- Error/Exception | Description
--------------------------------
- ArithmeticError | Occurs when a numeric calculation goes wrong.
- ArrayIndexOutOfBoundsException | Occurs when trying to access an index number that does not exist in an array.
- ClassNotFoundException | Occurs when trying to access a class that does not exist.
- FileNotFoundException | Occurs when a file cannot be accessed.
- InputMismatchException | Occurs when entering wrong input (e.g. text in a numerical input).
- IOException | Occurs when an input or output operation fails.
- NullPointerException | Occurs when trying to access an object reference that is `null`.
- NumberFormatException | Occurs when it is not possible to convert a specified string to a numeric type.
- StringIndexOutOfBoundsException | Occurs when trying to access a character in a String that does not exist.



### Multiple Exceptions

- sometimes, different errors (exceptions) can happen in the same `try` block. You cna handle them all with multiple catch blocks.


#### One try, Many Catch

- you can add more than one `catch` block, and Java will run the first one that matches the thrown exception type:
- eg. -
`
public class Main{
	public static void main(String[] args){
		try{
			int[] numbers = {1, 2, 3, 4, 5};
			System.out.println(numbers[10]); // ArrayIndexOutOfBoundsException
			int result = 10 / 0; // ArithmeticException
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array index does not index"):
		} catch(ArithmeticException e){
			System.out.println("Cannot divide by zero.");
		} catch(Exception e){
			System.out.println("Something else went wrong. Try again later.");
		}
	}
}

// result - Array index does not exist.
`

- explanation - Only the first exception (`ArrayIndexOutOfBoundsException `) is thrown, so only the first matching `catch` runs.


#### Order Matters

- you should always put more specific exceptions first, and general ones later. Otherwise, the general catch will grab the error and the specific ones will never run.
- eg. (bad order)-
`
try{
	int result = 10 / 0;
} catch(Exception e){
	System.out.println("General Error");
} catch(ArithmeticExcecption e){
	// this will never be reached in case of error
	System.out.println("Divide by zero");
}
`
- **tip:** 
	- always put `Exception` (the general one) at the end.


#### Multi-Catch

- since java 7, you can catch multiple exceptions in one catch block using the `|` symbol. This is useful when different exceptions should be handled in the same way, so you dont have to repeat code:
- eg. -
`
try{
	int result = 10 / 0;
	int[] numbers = {1, 2, 3, 4, 5};
	System.out.println(numbers[10]);
} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
	System.out.println("Math error or array errr occured.")
}
`


### Java try-with-resources
#### Close Resources

- when working with files, streams, or other resources, it is important to close them after use. If you forget to close a resource, it may keep using memory or even prevent you from opening the file again until the program ends.
- In older code, you had to close 'resources' manually by calling their `close()` methods.
- eg. -
`
import java.io.FileOutputStream;
import java.io.IOException;

public class Main{
	public static void main(String[] args){
		try{
			FileOutputStream output = new FileOutputStream("filename.txt");
			output.write("Hello world!."getBytes());
			output.close(); // must close manually
			System.out.println("Successfully wrote to the file.")
		} catch(IOException e){
			System.out.println("Error writing file.");
		}
	}
}
`


#### try-with-resources

- since java 7, you can use try-with-resources. It is a special form of `try` that works with resources (like files and streams). The resource is declared inside parantheses `try(...)`, and java will close it automatically when the block finishes - even if an error occurs.
- eg. (try-with-resources) -
`
import java.io.FileOutputStream;
import java.io.IOExecption;

public class Main{
	public static void main(String[] args){
		// resource is opened inside try()
		try(FileOutputStream output = new FileOutputStream("filename.txt")){
			output.write("Hello world!.".getBytes());

			// no need to call close() now
			System.out.println("Successfully wrote to the fle.");
		} catch(IOException e){
			System.out.println("Error writing file.")
		}
	}
}
`


#### why use try-with-resources?

- safer - resources are always closed, even if an exception occurs.
- cleaner - no need to write `close()` calls.
- shorter code - less boilerplate, easier to read.

- **rule of thumb:**
	- whenever you work with files, streams, or database connections, use try-with-resources to make sure they are closed properly.




## Java Files

- file handling is an important part of any application.
- java has several methods for creating, reading, updating, and deleting files.


### File Handling

- the `File` class from the `java.io` package allows us to work with files.
- to use the `File` class, create an object of the class, and specify the filename or directory name.
- eg. -
`
import java.io.File; // importing File class

File myObj = new File("filename.txt"); // specifying the filename
`

- the `File` class has many useful methods for creating and getting the information about files. For eg. -
- Method | Type | Description
------------------------------
- `canRead()` | Boolean | tests whether the file is readable or not.
- `canWrite()` | Boolean | tests whether the file is writable or not.
- `createNewFile()` | Boolean | creates an empty file.
- `delete()` | Boolean | deletes a file.
- `exists()` | Boolean | tests whether the file exists.
- `getName()` | String | returns the name of the file.
- `getAbsolutePath()` | String | returns the absolute pathname of the file.
- `length()` | Long | returns the size of the file in bytes. 
- `list()` | String[] | returns an array of the files in the directory.
- `mkdir()` | Boolean | creates a directory.


### Create Files

- in java, you can create a new file with the `createNewFile()` method from the `File` class.
- this method returns -
	- `true` - if the file was created successfully.
	- `false` - if the file already exists.

- note that, the method is enclosed in a `try...catch` block. This is necessary because it throws an `IOException` if an error occurs (if the file cannot be created for some reason).
- eg. -
`
import java.io.File; // importing file class
import java.io.IOException; // importing IOException class to handle errors

public class CreateFile{
	public static void main(String[] args){
		try{
			File myFil = new File("filename.txt"); // creating file object
			if (myFil.createNewFile()){ // try to create the file
				System.out.println("File created: " + myFil.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch(IOException e){
			System.out.println("An error occured.");
			e.printStackTrace(); // print error details
		}
	}
}

// output - file created: filename.txt
`

- **explanation:**
- the program tries to create a file called `filename.txt`. If the file does not exist, it will be created and a success message is printed. If the file already exists, you will see the message "File already exists." instead.

- **note:**
- the `createNewFile()` method only creates an empty file. It does not add any content inside.


#### Create a File in a Specific Folder

- to create a file in a specific directory (requires permission), specify the path of the file and use double backslashes to escape the `\` character (for windows). On Mac and Linux, you cna just write the path like: /USers/name/filename.txt
- eg. -
`
File myFil = new File("C:\\Users\\MyName\\filename.txt");
`


### Write Files

- if you're just starting with Java, the easiest way to write text to a file is by using the `FileWriter` class.
- in the example below, we use `FileWriter` togetehr with its `write()` method to create and write some text into a file.
- note: when you are done, you should close the writer with the `close()` method.
- eg. -
`
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile{
	public class void main(String[] args){
		try{
			FileWriter myWrit = new FileWriter("filename.txt");
			myWrit.write("Hello World!");
			myWrit.close(); // closing the file after use
			System.out.println("Successfully wrote to file.")
		} catch(IOException e){
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}

// output - successfully wrote to file 
`

- **explainaton:**
	- this program tries to write some text into a file named `filename.txt`. If everything works, the program will print `Successfully wrote to file.` in the console. If something goes wrong(for example, the file cannot be opened), it will print `An error occured.` instead.


#### Write to a File with try-with-resources

- since java 7, you can use try-with-resources. This makes sure the writer is closed automatically, even if an error occurs.
- eg. -
`
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile{
	public static void main(String[] args){
		// fileWriter will be closed automatically here
		try(FileWriter myWrit = new FileWriter("filename.txt")){
			myWrit.write("Hello World again!");
			System.out.println("Successfully wrote to file.");
		} catch(IOException e){
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}

// output - Successfully wrote to file.
`

#### Append to a File

- normally, `FileWriter` will overwrite a file if it already exists. If you want to add new content at the end of the file (without deleting whats already there), you can use the two-argument constructor and pass `true` as the second parameter. This puts the writer into append mode.
- eg. -
`
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile{
	public static void main(String[] args){
		// true = append mode
		try(FileWriter myFil = new FileWriter("filename.txt", true)){
			myFil.write("\nAppended text!");
			System.out.println("Successfully appended.");
		} catch(IOException e){
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}

// output - Appended text.
`

- explanation - this program adds the text "Appended text!" to end of `filename.txt` instead of replacing the file's content.
- note: if the file does not already exist, java will create it before appending.


#### Other Ways to Write to Files

- there are several classes you can use to write files in java:
	- `FileWriter` - easiet choice for basic text.
	- `BufferedWriter` - better for large text files, because it is faster and supports handy features.
	- `FileOutputStream` - best for binary data (images, audio, PDFs).



### Read Files

- here, we use the `Scanner` class to read to contents of the text file we created in the earlier chapter.
- eg. -
`
import java.io.File; // import the file class
import java.io.FileNotFoundException; // importing this class to handle errors
import java.util.Scanner; // import the scanner class to read text files

public class ReadFile{
	public static void main(String[] args){
		File myObj = new File("filename.txt");

		// try-with-resources: Scanner will be closed automatically
		try(Scanner myReader = new Scanner(myObj)){
			while(myReader.hasNextLine()){
				String data = myReader.nextLine();
				System.out.println(data);
			}
		} catch(FileNotFoundException e){
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}
`

- explanation - this program above opens the file named `filename.txt` and reads it line by line using a `Scanner`. Each line is printed to the console. If the file cannot be found, the program will print `An error occured.` instead.


#### Get File Information

- to get more information about a file, use any of the `File` methods:
- eg. -
`
import java.io.File;

public class GetFileInfo{
	public static void main(String[] args){
		File myObj = new File("filename.txt");

		if (myObj.exists()){
			System.out.println("File name: " + myObj.getName());
			System.out.println("Absolute path: " + myObj.getAbsolutePath());
			System.out.println("Writable: " + myObj.canWrite());
			System.out.println("Readable: " + myObj.canRead());
			System.out.println("File size in bytes: " + myObj.length());
		} else {
			System.out.println("The file does not exist.");
		}
	}
}
`


#### Other Ways to Read Files

- there are several other classes you can use to read files in Java -
	- `Scanner` - best for simple text and when you want to parse numbers or words easily.
	- `BufferedReader` - best for large text files, because it is faster and reads line by line.
	- `FileInputStream` - best for binary data (images, audio, PDFs) or when you need full control of raw bytes.



### Delete Files

- to delete a file in Java, use the `delete()` method.
- eg. -
`
import java.io.File;

public class DeleteFile{
	public static void main(String[] args){
		File myFil = new FIle("filename.txt");

		if (myFil.delete()){
			System.out.println("File deleted successfully: "  + myFil.getName());
		} else {
			System.out.println("An error occured.");
		}
	}
}

// output - file deleted successfully.
`


#### Delete a Folder

- you can also delete an entire folder. However, it must be empty.
- eg. -
`
import java.io.File;

public class DeleteFolder{
	public class void main(String[] args){
		File myFol = new File("C:\\Users\\MyName\\Test");

		if (myFol.delete()){
			System.out.println("Folder deleted successfully: " + myFol);
		} else {
			System.out.println("Folder can't be deleted.")
		}
	}
}
`



## I/O Streams(Input/ Output Streams)

- In java, there is an important difference between working with the `File` class and working with I/O Streams (input/output streams):
	- the `File` class (from `java.io`) is used to get information about the files and directories.
		- does the file exist?
		- what is the name and size of the file?
		- create or delete files and folders

		- but the `File` class does not read or write the contents of the file.

- So far, wehave used `Filewriter` class for writing text and `Scanner` class for reading text. These are easy to use, but they are mainly designed for simple text files.
- I/O Streams are more flexible, because they work with text and binary data (like images, audio, PDFs).


### Types of Streams

- Byte Streams
	- works with raw binary data (like images, audio, PDFs files).
	- eg. - `FileInputStream`, `FileOutputStream`

- Character Streams
	- works with text(character adn strings). These streams automatically handle character encoding.
	- eg. - `FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`

- tip:
	- use character streams when working with text, adn byte streams when working with binary data.



### FileInputStream

- so far, we have used `Scanner` class to read text files. `Scanner` is very convenient for text because it can split input into lines, words, and numbers. However, sometimes, you need more control. For example, when reading binary data (like images, audio and PDFs), or when you need full control of raw bytes. In those cases, you use `FileInputSStream`.


#### Read a Text File (Basic Example)

- this example uses `FileInputStream` to read a text file, one byte at a time, and prints the result as characters.
- eg. -
`
import java.io.FileInputStream;
import java.io.IOException;

public class Main{
	public static void main(String[] args){
		// try-with-resources: FileInputStream will be closed automatically
		try(FileInputStream myFil = new FileInputStream("filename.txt")){
			int i; // variable to store each byte that is read

			// read one byte at a time until the end of the fioe (-1 here means "no more data")
			while ((i = input.read()) != -1){
				// convert the byte to a character and print it ot the console
				System.out.println((char)i);
			}
		} catch(IOException e){
			// if an error occurs (eg. file not found), print an error message
			System.out.println("Error reading file.");
			e.printStackTrace;
		}
	}
}
`

- explanation - here, the program opens `filename.txt`,  reads it byte by byte, and prints the result as characters in the console.


#### Copy a Binary File (Real-World Example)

- the real strength of `FileInputStream` is that, it can handle any file type, not just text. Here is an example that copies an image file.
- eg. -
`
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile{
	public static void main(String[] args){
		// copy image.jpg to copyImg.jpg
		try(FileInputStream filInput = new FileInputStream("img.jpg");
		FileOutputStream filOutput = new FileOutputStream("copyimg.jpg")){
			int i; // where the copied data is kept

			while ((i = filInput.read()) != -1){
				filOutput.write(); // write the raw byte to the new file
			}

			System.out.println("File copied successfully!")
		} catch(IOException e){
			System.out.println("An error occured while copying file.");
			e.printTraceStack;
		}
	}
}
`

- explanation - this program reads `image.jpe` and writes it into `copyImage.jpg`. Since it works with raw bytes, it can copy any kind of file - text, images, audio, PDFs.

- note: the program also uses `FileOutputStream`. While `FileInputStream` is used to read bytes from a file, `FileOutputStream` is used to write bytes to a file. Together, they make it possible to copy any kind of file.


#### Choosing the Right Class

- java gives you several ways to read files. Here's when to pick each one -
	- `Scanner` - best for simple text and when you want to parse numbers or words easily. 
	- `BufferedReader` - best for large text files, because it is faster and reads line by line.
	- `FileInputStream` - best for binary data (images, audio, PDFs), or when you need full control of raw bytes.



### FileOutputStream

- the `FileOutputStream` class works in a similar way as a `FileWriter` class. But it writes the data as raw bytes. That means, you can use it not only for text files, but also for binary files (like images, PDFs and audio files).


#### Write a Text File (Basic Example)

- this examplee writes a short text string to a file using `FileOutputStream`.
- **note**: if the file already exists, its contents will be replaced (overwritten).
- eg. -
`
import java.io.FileOutputStream;
import java.io.IOException;

public class Main{
	public static void main(String[] args){
		// the text we want to write
		String text = "This is the new text we want to write on file."

		// try-with-resources: stream will be closed automatically
		try(FileOutputStream filOutput = new FileOutputStream("filename.txt")){
			filOutput.write(text.getBytes()); // converts text to bytes and writes
			System.out.println("File written successfully.")
		} catch(IOException e){
			System.out.println("an error occured while writing to file.")
			e.printStackTrace();
		}
	}
}
`

- explanation - here, this prorgram creates (or overwrites) `filename.txt` and writes our `text` material in the console(file). Otherwise, it shows an error message.


#### Copy a Binary File (Real-World Example)

- the real strength of `FileOutputStream` is that it can handle any file type, not just text. Here is an example that copies an image file.
- eg. -
`
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class CopyFile{
	public static void main(String[] args){
		// copy img.jpg to copy.jpg
		try(FileInputStream myInput = new FileInputStream("img.jpg");
		FileOutputStream myOutput = new FileOutputStream("copy.jpg")){
			
			int b; // copy raw file data and store it here

			while((b = myInput.read()) != -1){
				myOutput.write(b); // write each raw byte to the new file
			}
			System.out.println("file copied successfully.");
		}catch(IOException e){
			System.out.println("Error occured while copying the file.");
			e.printStackTrace();
		}
	}
}
`

- explanation - this program reads `img.jpg` and writes it to `copy.jpg`. Since, it works with raw bytes, it can copy any kind of file - text, images, audio, PDFs, etc.


#### Append a File

- by default, `FileOutputStream` overwrites the file if it already exists. To add(append) new content instead, pass `true` as the second argument:
- eg. -
`
import java.io.FileOutputStream;
import java.io.IOException;

public class Main{
	public static void main(String[] args){
		String newText = "Hello world!";

		// true = append mode on(keeps existing content)
		
		try(FileOutputStream myFil = new FileOutputStream("filename.txt", true)){
			myFil.write(newText.getBytes());
			System.out.println("File appended successfully.");
		}catch(IOException e){
			System.out.println("An error occured while appending file.);
			e.printStackTrace;
		}
	}
}
`

- explanation - this program adds `Appended Text!` to the end of `filename.txt`, keeping the existing content.


#### Choosing the Right Class

- java gives you several ways to write to files. Here's when to pick each one:
	- `FileWriter` - best for basic text files. Simple and easy to use.
	- `BufferedWriter` - best for large text files, because it is faster and lets you add new lines easily.
	- `FileOutputStream` - best for binary data (images, PDFs, audio) or when you need full control of raw bytes.



### BufferedReader
#### BufferedReader and BufferedWriter

- `BufferedReader` and `BufferedWriter` makes reading and writing text files faster.
	- BufferedReader - lets you read text line by line with `readLine()`.
	- BufferedWriter - lets you write text efficiently and add new lines with `newLine()`.

- these classes are usually combined with `FileReader` and `FileWriter`, which handle opening or creating the file. The buffered classes then make reading/writing faster by using a memory buffer.


#### Read a Text File(Line by Line)

- use `BufferedReader` with `FileReader` to read each line of a file.
- eg. -
`
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args){
		try(BufferedReader br = new BufferedReader(new FileReader("filename.txt"))){
			String line;

			while ((line = br.readLine()) != null){
				System.out.println(line);
			}
		} catch(){
			System.out.println("Error occured.");
			e.printTraceStack();
		}
	}
}
`


#### Comparing File Reading Classes

- java gives you seveeral ways to read files, Here's when to pic each one:
	- `Scanner` - best for simple text. It can split text into lines, words, or numbers (e.g. `nextInt()`, `nextLine()`)
	- `BufferedReader` - best for large text files. It is faster, uses less memory, and can read full lines with `readline()` 
	- `FileInputStream` - best for binary files (like images, PDFs, audios).



### BufferedWriter

- the `BufferedWriter` class is used to write text to a file,one line or one string at a time. If the file alread exists, its contents will be replaced (overwritten).


#### Write to a Text File

- use `BufferedWriter` with `FileWriter` to write text to a file. The `write()` method adds texts, and you can then use `newLine()` to insert a line break.
- eg. -
`
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile{
	public static void main(String[] args){
		try(BufferedWriter myFil = new BufferedWriter(new FileWriter("filename.txt))){
			myFil.write("First line.");
			myFil.newLine(); // adds line break
			myFil.write("Second line.");
			myFil.newLine(); // adds line break
			myFil.write("Hello World.");
			System.out.println("Successfully wrote to file.");
		} catch(IOException e){
			System.out.println("error occured while writing to file.");
			e.printStackTrace();
		}
	}
}
`

- explanation - this program creates (or overwrites) `filename.txt` and writes two lines of text into it. The `newLine()` method inserts a line break between "first line","second line" and "hello world". If everything goes well, the console will print "successfully wrote to file."


#### Append to a Text File

- to add new content to the end of a file (instead of overwriting), pass `true` to `FileWriter`.
- eg. -
`
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile{
	public static void main(String[] args){
		// true = append mode on
		try(BufferedWriter myFil = new BufferedWriter(new FileWriter("filename.txt", true))){
			myFil.newLine(); // first move to new line
			myFil.write("Hello world, after appending.); // then write to file
			System.out.println("successfully appended to file.");
		} catch(IOException e){
			System.out.println("error occured.");
			e.printStackTrace();
		}
	}
}
`

- explanation - this program keeps the existing content of `filename.txt` and adds a new line with the text "Hello world after appending." at the end. If everything works, the console prints "success" message.


#### Comparing File Writing Classes

- `FileWriter` - best for simple text writing. Quick and easy to use.
- `BufferedWriter` - better for larger text files, because it is faster and lets you easily add line breaks with `newLine()`.
- `FileOutputStream` - best for binary files (like images, PDFs, or audio).



## Data Structures

- data structures are ways to store and organize data so you can use it efficiently.
- an array is an example of a data structure, which allows multiple elements to be stored in a single variable.
- java includes many other data structures as well, in the `java.util` package. Each is used to handle data in different ways:
- some of the most common are:
	- `ArrayList`
	- `HashSet`
	- `HashMap`

- tip: data structures are like supercharged arrays - more flexible and feature-rich.


### ArrayList

- an `ArrayList` is a resizable array that can grow as needed.
- It allows you to store elements and access them by index.
- eg. -
`
// import the ArrayList class
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Toyota");
		System.out.println(cars)
	}
}
`


### HashSet

- a `HashSet` is a collection where every element is unique - no duplicates are allowed.
- eg. -
`
// import the HashSet class
import java.util.HashSet;

public class Main{
	public static void main(String[] args){
		HashSet<HashSet> cars = new HashSet<String>();
		cars.add("BMW"); // first duplicate will not be printed/added
		cars.add("Ferrari");
		cars.add("Audi");
		cars.add("Ford");
		cars.add("Toyota");
		cars.add("Ford"); // duplicate
		System.out.println(cars);
	}
}
`

- note: in the example above, even though BMW is added twice it only appears once in the set because every element in a set has to be unique.


### HashMap

- a `HashMap` stores key-value pairs, which are great when you want to store values and find them by a key(like a name or ID).
- eg. -
`
// import the HashMap class
import java.util.HashMap;

public class Main{
	public static void main(String[] args){
		// create a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		// add key adn value pairs (country, city)
		capitalCities.put("England", "London");
		capitalCities.put("India", "Delhi");
		capitalCities.put("US", "Washington DC");
		capitalCities.put("Australia", "Sydney");
		capitalCities.put("Norway", "Oslo");

		System.out.println(capitalCities);
	}
}
`


### Data Structures Overview

- Data Structure | Stores | Keeps Order? | Allow Duplicates? | Best For 
-----------------------------------------------------
- ArrayList | Ordered elements | Yes | Yes | Accessing elements by index
- HashSet | Unique elements | No | No | Avoiding duplicates, fast checks
- HashMap | Key-value pairs | No | Yes (keys are unique) | Fast lookups by key


### Iterators

- when learning about data structures, you will often hear about iterators too.
- an iterator is a way to loop through elements in a data structure.
- it is called an "iterator" because "iterating" is the technical term for looping.
- eg. - using an iterator with ArrayList -
`
import java.util.ArrayList;
import java.util.Iterator;

public class Main{
	public static void main(String[] args){
		// create an ArrayList of Strings
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("BMW");
		arrList.add("Audi");
		arrList.add("Ford");

		// get an iterator for an ArrayList
		Iterator<String> iter = arrList.iterator();

		// iterate through the list using the iterator
		while(iter.hasNext()){
			System.out.println(it.next());
		} 
	}
}
`



### Collections Framework

- before we explore `ArrayList`, `hashSet`, `hashMap`, and other data structures in more detail, its important to understand that all of these are part of something bigger - the Java Collections Framework.
- the Java Collections Framework provides a set of interfaces (like List, Set, Map) and a set of classes (`ArrayList`, `HashSet`, `HashMap`) that implements those interfaces.
- all of these are part of the `java.util` package.
- they are used to store, search, sort and organize data more easily - all using standarized methods and patterns.

- **tip:**
	- think of the Java Collections Framework as a toolbox.
	- interfaces like `List` define what tools can do, and classes like `ArrayList` are the actual tools that do the work.


#### Core Interfaces in the Collections Framework

- here are some common interfaces, along with their classes -
- Interface | Common Classes | Description
- `List` | `ArrayList`, `LinkedList` | ordered collection that allows duplicates
- `Set` | `HashSet`, `TreeSet`, `LinkedHashSet` | collection of unique elements
- `Map` | `HashMap`, `TreeMap`, `LinkedHashMap` | stores key-value pairs with unique keys


#### Overview of Classes

- the table below gives an overview of the common data structure classes and their characteristics - 
- Interface | Class | Description
---------------------------------
- `List` | `ArrayList` | resizable array that maintains order and allows duplicates.
		 | `LinkedList` | list with fast insert and remove operations.
- `Set` | `HashSet` - unordered collection of unique elements.
		| `TreeSet` - sorted set of unique elements (natural order).
		| `LinkedHashSet` | maintains the order in which the elements were inserted.
- `Map` | `HashMap` - stores key/value pairs with no specific order.
		| `TreeMap` - sorted map based on the natural order of keys.
		| `LinkedHashMap` | maintains the order in which keys were inserted.

- **note:**
	- use `List` classes when you care about order, you may have duplicates, and want to access elements by index.
	- use `Set` classes when you need to store unique values only.
	- use `Map` classes when you need to store pairs of key and values, like a name and its phone number.



### Java List
#### Java List Interface

- the `List` interface is part of the Java Collections Framework and represents an ordered collection of elements.
- you can access elements by their index, add duplicates, and maintain the insertion order.
- since, List is an interface, you cannot create a List object directly.
- instead, you use a class that implements the `List` interface, such as  -
	- `ArrayList` - like a resizable array with fast random access.
	- `LinkedList` - like a train of cars you can easily attach or remove.

- **tip** - use `List` when you care about order, you may have duplicates, and want to access elements by index.


#### Common List Methods

- Method | Description
----------------------
- `add()` | adds an element to the end of the list. 
- `get()` |  returns the element at the specified position.
- `set()` |  replaces the element at the specified position.
- `remove()` |  removes the element at the specified position.
- `size()` | returns the number of elements in the list.


#### List vs. Array

- Array | List
----------------
- Fixed Size | Dynamic Size
- Faster performance for raw data | more flexible and feature-rich
- not part of Collections framework | Part of the Java Collections Framework



### ArrayList

- an `ArrayList` is like a resizable array.
- It is part of the `java.util` package and implements the `List` interface.
- the difference between a built-in array, and an `ArrayList` in Java is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and remove from an `ArrayList` whenever you want.


#### Create an ArrayList

- to use an `ArrayList`, you must first import it from `java.util`.
- eg. - create an `ArrayList` object called cars that will store strings.
`
import java.util.ArrayList; // importing ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // creating an ArrayList object
`

- now, we can use methods like `add()`, `get()`, `set()` and `remove()` to manage our list of elements.


#### Add Elements

- to add elements to an `ArrayList`, use the `add()` method.
- eg. -
`
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Volvo");
		cars.add("Toyota");
		System.out.println("Added successfully to: " + cars)
	}
}
`

- you can also add en element at a specified position by referring to the index number.
- eg. -
`
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Volvo");
		cars.add("Toyota");

		cars.add(0, "Honda"); // insert element at the beginning of the list at index - 0

		System.out.println(cars);
	}
}
`

- an `ArrayList` keeps the elements in the same order you add them, so the first item you add will be at index 0, the next at index 1, then 2, and so on.


#### Access an Element

- to access an element in the `ArrayList`, use the `get()` method and refer to the index number.
- eg. -
`
cars.get(1); // gets the element at index 1
`


#### Change an Element

- to modify an element, use the `set()` method and refer to the index number.
- eg. -
`
cars.set(0, "Honda"); // it will replace the existing element at 0 with Honda
`


#### Remove an Element

- to remove an element, use the `remove()` method and refer to the index number.
- eg. -
`
cars.remove(0); // will remove the element at index 0.
`

- to remove all the element in the `ArrayList`, use the `clear()` method.
- eg. -
`
cars.clear(); // remove all element
`


#### ArrayList Size

- to find out how many elements an `ArrayList` has, use the `size()` method.
- eg. -
`
cars.size(); // gives you the total count of the elements
`


#### Loop Through an ArrayList

- loop through the elements of an `ArrayList` with a `for` loop, and use the `size()` method to specify how many times the loop should run.
- eg. -
`
public class Main{
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Honda");

		for (int i = 0; i <= cars.size(); i++){
			System.out.println(cars.get(i));
		}
	}
}
`

- you can also loop through an `ArrayList` with the for-each loop.
- eg. -
`
public class Main{
	public static void main(String[] args){		ArrayList<String> cars = new ArrayList<String>();
	cars.add("BMW");
	cars.add("Ford");
	cars.add("Honda");

	for (String i : cars){
		System.out.println(i);
		}
	}
}
`


#### Other Types

- elements in an `ArrayList` are actually objects. In the example above, we created elements (objects) of type "String". Remember that a `String` in java is an object (not a primitive type). To use other types, such as `int`, you must specify an equivalent wrapper class: `Integer`. For other primitive types, use: `Boolean` for booleans, `Character` for char, `Double` for double, etc.
- eg. - create an `ArrayList` to store numbers (add elements of type `Integer`).
`
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		for (int i : nums){
			System.out.println(i);
		}
	}
}
`


#### Sort an ArrayList

- another useful calss in the `java.util` package is the `Collections` class, which includes the `sort()` method for sorting lists alphabetically or numerically.
- eg. - sort an ArrayList of Strings -
`
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Volvo");
		cars.add("Honda");

		Collections.sort(cars); // sorts car
		for (String i : cars){
			System.out.println(i);
		}
	}
}
`

- eg. - sort an ArrayList of integers.
`
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		ArrayList<Integer> myNum = new ArrayList<Integer>();
		myNum.add(110);
		myNum.add(9);
		myNum.add(90);
		myNum.add(1);

		Collections.sort(myNum);
		for (int i : myNum){
			System.out.println(i);
		}
	}
}
`


#### The var keyword

- from java 10, you can use the `var` keyword to declare an `ArrayList` variable without writing the type twice. The compiler figures out the type from the value you assign.
- this makes the code shorter, but many developers still use the full type for clarity. Since `var` is valid java, you may see it in other code as well, so its good to know it exists.
- eg. -
`
// without var
ArrayList<String> cars = new ArrayList<String>();

// with var
var cars = new ArrayList<String>(); // both the syntax are the same and will do the same thing
`


#### The List Interface

- note: sometimes, you will see both `List` and `ArrayList` in java code, like this -
- eg. -
`
import java.util.List;
import java.util.ArrayList;

List<String> cars = new ArrayList<>();
`

- here, this means that the variable (cars) is declared as a `List` (the interface), but it stores an `ArrayList` object (the actual list). Since `ArrayList` implements the `List` interface, this is possible.
- it works the same way, but some developers prefer this style because it gives them more flexibility to change the type later.



### LinkedList

- `LinkedList` class is almost identical to the `ArrayList`.
- eg. -
`
// import the LinkedList class
import java.util.LinkedList;

public class Main{
	public static void main(String[] args){
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Volvo");

		for (String i : cars){
			System.out.println(i);
		}
	}
}
`


#### ArrayList vs LinkedList

- the `LinkedList` class is a collection which can contain many objects of the same type, just like the `ArrayList`.
- the `LinkedList` class has the same methods as `ArrayList` because both follow the `List`  interface. This means you can add, change, remove, or clear elements in a `LinkedList` just like you would with an `ArrayList`.
- However, while the `ArrayList` class and the `LinkedList` class can be used in the same way, they are built very differently.


##### How the ArrayList works?

- the `ArrayList` class has a regualr array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one adn the old one is removed.


##### How the LinkedList works?

- the `LinkedList` stores its elements in 'containers'. The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container adn that container is linked to one of the other containers in the list.


##### When to Use?

- use an `ArrayList` for storing and accessing data, and `LinkedList` to manipulate data.


#### LinkedList Methods

- for many cases, the `ArrayList` is more efficient as it is common to need access to random elements in the list, but the `LinkedList` provides several methods to do certain operations more efficiently.
- Method | Description
----------------------
- `addFirst()` - adds an element to the beginning of the list. 
- `addLast()` - adds an element to the end of the list.
- `removeFirst()` - removes an element from the beginning of the list. 
- `removeLast()` - removes an element from the end of the list. 
- `getFirst()` - get the element at the beginning of the list. 
- `getLast()` - get the element at the end of the list.


#### The var keyword

- from java 10, you can use the `var` keyword to declare a `LinkedList` variable without writing the type twice. The compiler figures out the figures out the type from the value you assign.
- this makes code shorter, but many developers still use the full type for clarity. Since `var` is valid java, you may see it in other code, so its good to know that it exists.
- eg. -
`
// without var
LinkedList<String> cars = new LinkedList<String>();

// with var
var cars = new LinkedList<String>();
`


#### The List Interface

- note: sometimes, you will see both `List` and `LinkedList` in java code like this.
- eg. -
`
import java.util.List;
import java.util.LinkedList;

List <String> cars = new LinkedList<>();
`

- this means the variable (cars) is declared as a `List` (the interface), but it stores a `LinkedList` object (the actual list). Since, `LinkedList` implements the `List` interface, this is possible.
- it works the same way, but some developers prefer this style because it gives them more flexibility to change the style later.



### List Sorting

- another useful class in the `java.util` package is the `Collections` class, which include the `sort()` method for sorting lists alphabetically or numerically.


#### Sort an ArrayList

- sort an ArrayList of Strings alphabetically in ascending order.
- eg. -
`
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Honda");
		cars.add("Audi");

		Collections.sort(cars); // sorting cars

		for (String i : cars){
			System.out.println(i);
		}
	}
}
`

- sorting an ArrayList of integers numerically in ascending order.
- eg. - 
`
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		ArrayList<Integer> myNum = new ArrayList<Integer>();
		myNum.add(110);
		myNum.add(11);
		myNum.add(1);
		
		Collections.sort(myNum); // sorting myNum

		for (String i : myNum){
			System.out.println(i);
		}
	}
}
`


#### Reverse the Order

- you can also sort a list in reverse order, by using the `reverseOrder()` method.
- in the following example, we sort an ArrayList of Strings alphabetically in reverse/descending order.
- eg. -
`
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Honda");
		cars.add("Audi");

		Collections.sort(cars, Collections.reverseOrder()); // sorting cars

		for (String i : cars){
			System.out.println(i);
		}
	}
}
`

- sorting an ArrayList of integers in reverse/descending order.
- eg. -
`
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		ArrayList<Integer> myNum = new ArrayList<Integer>();
		myNum.add(110);
		myNum.add(11);
		myNum.add(1);
		
		Collections.sort(myNum, Collections.reverseOrder()); // sorting myNum

		for (String i : myNum){
			System.out.println(i);
		}
	}
}
`



### Set
### HashSet
### TreeSet
### LinkedHashSet
### Map
### HashMap
### TreeMap
### LinkedHashMap
### Iterator
### Algorithms


## Advanced
### Wrapper Classes
### Generics
### Annotations
### RegEx
### Lambda
### Threads
### Advanced Sorting

## Projects
## How To's


