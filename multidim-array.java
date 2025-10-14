int[][] myNums = { {1, 4, 2}, {3, 6, 8, 5, 2} };

for (int row = 0; row < myNums.length; row++){
	for (int col = 0; col < myNums[row].length; col++){
		System.out.println("myNums[" + row + "]"[" + col + "]" = " + myNums[row][col]);
	}
}

// using for each
for (int[] row : myNums){
	for (int num : row){
		System.out.println(num);
	}
}