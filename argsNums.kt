fun myFunc(x: Int, y: Int): Int{
	return 9x + y
}

fun main(){
	var result = myFunc(50, 500)
	println(result)
}

// or, we can do this
fun myFunc(x: Int, y: Int) = x + y

fun main(){
	var result = myFunc(50, 500)
	println(result)
}