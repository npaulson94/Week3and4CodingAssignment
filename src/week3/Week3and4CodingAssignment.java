package week3;

public class Week3and4CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//URL to GitHub Repository: https://github.com/npaulson94/Week3and4CodingAssignment.git
		
//URL to Public Link of your Video: https://youtu.be/Z6fc3p4gNfI
		
		
//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//Programmatically subtract the value of the first element in the array from the value in the 
//last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
//Add a new age to your array and repeat the step above to ensure it is dynamic 
//(works for arrays of different lengths). Use a loop to iterate through the array and 
//calculate the average age. Print the result to the console.
	int [] agesArray = {3,9,23,64,2,8,28,105};
		int firstNum = agesArray[0];
		int lastNum = agesArray[agesArray.length-1];
			System.out.println("The first number subtracted from the last number is: " + (lastNum-firstNum));
		
		
		int sum = 0;
		for (int ages : agesArray) {
		sum += ages;
		}
		System.out.println("The average is: " +(sum / agesArray.length));
		
//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//Use a loop to iterate through the array and calculate the average number of letters per name. 
//Print the result to the console.

String [] namesArray = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	double sumNamesLength = 0;
	for (String n : namesArray) {
		sumNamesLength += n.length();

	}
		System.out.println("Average number of letters per name: " +sumNamesLength / namesArray.length);
		
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

//Using the index nameOfArray[0], this will always be the first element of an array.

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

System.out.println("The sum is greater than 100: " +isSumGreaterThan100 (agesArray));

double [] doubleArray2 = {1.25, 27.33, 4.68, 7.53, 10.20};
double [] doubleArray = {5.12, 12.55, 3.10, 21.45, 15.80};
System.out.println("This is the average of the first array: " + average(doubleArray));
System.out.println("This is the average of the second array: " +average(doubleArray2));

System.out.println("First average method is greater: " +isAverageFirstArrayGreater(doubleArray, doubleArray2));


System.out.println("I will buy a drink: " +willBuyDrink(true, 11));

double [] isTotalInBudget = {135.50, 56.75, 111, 22.50, 299.99};

System.out.print("In my budget this month: " + buyHouseSupplies(isTotalInBudget)); 


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

//Create a method called buyHouseSupplies that takes an array of double and 
//returns whether or not you can afford to buy the supplies/if it fits within your monthly 
//budget of $500. Print the results to the console. 
//I created this method because it's very relateable to my life lately with moving. I've been 
//going a crazy and a monthly budget is not a bad idea. 

public static boolean buyHouseSupplies (double [] isTotalInBudget) {
	double sum = 0;
	for (double prices : isTotalInBudget) { 
		sum += prices;
	}	return sum <=500;
	
}}
