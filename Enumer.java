public class Enumer {
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
	
	
	// getter method to read the description
	public String getDescription(){
		return description;
	}
	
	public class MainNew{
		public static void main(String[] args){
			Level myVar = Level.MEDIUM; // pick one enum constant
			System.out.println(myVar.getDescription()); // prints "Mid Level"
		}
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
}}
