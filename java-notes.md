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

