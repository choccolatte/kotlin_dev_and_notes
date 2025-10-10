// student data
String studentName = "John Doe";
int studentId = 15;
int studentAge = 20;
float studentFee = 100.00;
char studentGrade = 'A';

//print variables
System.out.println("Student Name: " + studentName);
System.out.println("Student Age: " + studentAge);
System.out.println("Student Id: " + studentId);
System.out.println("Student Fee: " + studentFee);
System.out.println("Student Grade: " + studentGrade);


// type casting 
int myInt = 60;
double myDouble = myInt; // automatic casting - int to double

System.out.println(myInt); // outputs 60
System.out.println(myDouble); // outputs 60.0


// operators
int a = 10;
int b = 3;
System.out.println(a/b); // Int division, will give 3

double c = 10.0d;
double d = 3.0d;
System.out.println(c/d); // Decimal division, will give 3.333...


// chain concating
String txt1 = "Sky";
String txt2 = "is";
String txt3 = "blue";
String result = txt1.concat(txt2).concat(txt3);
System.out.println(result); // outputs - Sky is blue


// nested if
int x = 15;
int x = 25;

if (x > 10){
	System.out.println("x is greater than 10");

	// nested if
	if (y > 20){
		System.out.println("y is greater than 20");
	}
}