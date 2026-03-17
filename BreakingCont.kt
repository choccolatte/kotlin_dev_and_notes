// using break
var i = 0
while(i < 10){
	println(i)
	i++
	
	if(i == 5){
		break
	}
}

// using continue
var j = 0
while(j < 10){
	if(j == 5){
		j++
		continue
	}
	println(j)
	j++
}

// classes - class funcs and constructors 
class Student(var name: String, var marks: Int){

	name = ""
	marks = 0

	fun grade(int marks): Char{
		if(marks > 90){
			return 'A'
		} else if (marks >= 80){
			return 'B'
		} else if (marks >= 65){
			return 'C'
		} else if (marks >= 50){
			return 'D'
		} else if (marks >= 40){
			return 'E'
		} else {
			return 'F'
		}
	}
}

fun main(){
	var stud1 = Student("John", 99)
	stud1Grade = stud1.grade(stud1.marks)
}

// using when
val day = 5
val result = when(day){
	1 -> "Monday"
	2 -> "Tuesday"
	3 -> "Wednesday"
	4 -> "Thursday"
	5 -> "Friday"
	6 -> "Saturday"
	7 -> "Sunday"
	else -> "Invalid Day"
}
println(result)