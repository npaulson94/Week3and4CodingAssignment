package week3;

public class Week3and4CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
//Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	int [] agesArray = {3,9,23,64,2,8,28,95};
		int firstNum = agesArray[0];
		int lastNum = agesArray[agesArray.length-1];
			System.out.println(lastNum-firstNum);
		
		
		int sum = 0;
		for (int ages : agesArray) {
		sum += ages;
		}
		System.out.println(sum / agesArray.length);
		
//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.

String [] namesArray = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	double sumNamesLength = 0;
	for (String n : namesArray) {
		sumNamesLength += n.length();

	}
		System.out.println(sumNamesLength / namesArray.length);
		
//Use a loop to iterate through the array again and concatenate all the names together, 
//separated by spaces, and print the result to the console.	
String space = "";
for (String n : namesArray) {
	space += n + " ";
}
		
System.out.println(space);
		
//How do you access the last element of any array?
	//The last element in any array can be located using the index, nameOfArray.length-1. 
	//This is because the index always starts at [0], so the last number of the index will always be length-1.
		
//How do you access the first element of any array?	
		//Using the index [0], this will always be the first element of an array.

//Create a new array of int called nameLengths. Write a loop to iterate over the previously 
//created names array and add the length of each name to the nameLengths array.
int [] nameLengths = new int[namesArray.length];
for (int i = 0; i < namesArray.length; i++) {
	nameLengths[i] += namesArray[i].length();
}

for (int nameLength : nameLengths) {
	System.out.print(nameLength + " ");
	
}
	System.out.println();
	
//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements 
//in the array. Print the result to the console.

int sumNameLengths = 0;
for (int nameLength : nameLengths) {
	sumNameLengths += nameLength;
}
	System.out.println(sumNameLengths);
	
//Method problems below.	

System.out.println(repeatWord ("Hello",3));	

System.out.println(firstAndLastName ("Nicole","Paulson"));

System.out.println(isSumGreaterThan100 (agesArray));
double [] doubleArray2 = {1.25, 27.33, 4.68, 7.53, 10.20};
double [] doubleArray = {5.12, 12.55, 3.10, 21.45, 15.80};
System.out.println("This is the average of the first array: " + average(doubleArray));
System.out.println("This is the average of the second array: " +average(doubleArray2));
//double [] doubleArray2 = {1.25, 27.33, 4.68, 7.53, 10.20};
System.out.println("First average method: " +isAverageFirstArrayGreater(doubleArray, doubleArray2));
System.out.println("Second average method: " +isAverageFirstArrayGreater2(doubleArray, doubleArray2));

System.out.println(willBuyDrink(true, 8.25));

String [] badBoy = {"Pooped inside", "Laying on dinner table", "Chewed Mom and Dads things"};
String [] goodBoy = {"Slept while we were gone.", "Pooped on his walk."};
System.out.println(isGoodDog(badBoy));
System.out.println(isGoodDog(goodBoy));



	}//end of main method, methods will go below 

//Write a method that takes a String, word, and an int, n, as arguments and returns the word 
//concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the 
//method to return “HelloHelloHello”).	
public static String repeatWord (String word, int n) {
	String newString = "";
	for (int i = 0; i < n; i++) {
		newString += word;
	}
		return newString;
}

//Write a method that takes two Strings, firstName and lastName, and returns a full name 
//(the full name should be the first and the last name as a String separated by a space).
public static String firstAndLastName (String firstName, String lastName) {
	String fullName = "";
	fullName = firstName + " " + lastName;
	return fullName;
}
//Write a method that takes an array of int and returns true if the sum of all the ints in 
//the array is greater than 100.
public static boolean isSumGreaterThan100 (int [] array) {
	int sum = 0;
	for (int num : array) {
		sum += num;
	} return sum > 100;

  }

//Write a method that takes an array of double and returns the average of all the elements 
//in the array.
public static double average (double [] doubleArray) {
	double sum = 0;
	for (double num : doubleArray) {
		sum += num;
	} return (sum / doubleArray.length);
}

//Write a method that takes two arrays of double and returns true if the average of the 
//elements in the first array is greater than the average of the elements in the second array.
public static boolean isAverageFirstArrayGreater (double [] doubleArray, double [] doubleArray2) {
	double sum = 0;
	double sum2 = 0;
	for (double num : doubleArray) {
	for (double numbers : doubleArray2) {
	sum += num;
	sum2 += numbers;
	
	}
	}
	return (sum/doubleArray.length > sum2/doubleArray2.length); 
}	

public static boolean isAverageFirstArrayGreater2 (double [] doubleArray, double [] doubleArray2) {
	return average (doubleArray)>average (doubleArray2);
}
//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double 
//moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
	return (isHotOutside == true && moneyInPocket >10);
	 
}
//Create a method of your own that solves a problem. In comments, write what the method does 
//and why you created it.

//Create a method called isGoodDog that takes an array of strings and 
//returns true if all of the elements in the array are absent. Print the results to the console. 
//I created this method because it's very relateable to my life lately with our puppy Sonny. 
//We never know what we will come home to, but we love him!
public static String isGoodDog (String [] badBoy) {
	for (String phrases : badBoy) {
		if (phrases.toLowerCase().contains ("Pooped inside") || phrases.toLowerCase().contains ("Laying on dinner table") 
				|| phrases.toLowerCase().contains(("Chewed Mom and Dads things"))) {	
		return "Sonny was a bad boy.";}}
	return "Sonny was a good boy.";
		
		
	
	
}
}
