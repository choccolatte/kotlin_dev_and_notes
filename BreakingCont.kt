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