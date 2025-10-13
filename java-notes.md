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
### Real Life Array Examples
### Multidimensional Arrays


## Methods

## Classes

## Errors

## File Handling
## I/O Streams
## Data Structures
## Advanced
## Projects
## How To's


