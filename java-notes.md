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