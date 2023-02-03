
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ages[]  = new int[9]; 
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 33;		
		int resultOfAgesSub = ages[ages.length - 1] - ages[0];
		System.out.println("sum of subtraction between last and first array input: " + resultOfAgesSub);
		
		
		double totalAge = 0;
		double lengthAgeArr = ages.length;
		for (int i = 0; i < ages.length; i++) {
			totalAge += ages[i];
		} 
			double averageAge = totalAge / lengthAgeArr;
			System.out.println("Average age in array: " + averageAge);
			
			
			String names[] = new String[6];
			names[0] = "Sam";
			names[1] = "Tommy";
			names[2] = "Tim";
			names[3] = "Sally";
			names[4] = "Buck";
			names[5] = "Bob";
			
			String concatNames = "Names concatonated: ";
			double numOfChar = 0;
			int lengthNames = names.length;
			int i = 0;
			for (String name : names) {
				numOfChar += names[i].length();
				concatNames += names[i] + " ";
				i++;
			} 
			double averageOfChar = numOfChar / lengthNames;
			System.out.println("Average number of characters in names: " + averageOfChar);
			System.out.println(concatNames);
			
			int totalBetweenNames = 0;
			int nameLengths[] = new int[6];
			int j = 0;
			for (String name : names) {
				nameLengths[j] = names[j].length();
				totalBetweenNames += nameLengths[j];
			j++;
			}
			System.out.println("Total number of characters in Names array: " + totalBetweenNames);
			
			String testMethod = concatWords("Welcome", 2);
			System.out.println("Working method proof: " + testMethod);
			
			
			String fullNameTest = fullNameBuilder("Robert", "Lacey");
			System.out.println("Full name test: " + fullNameTest);
			
			
			// testing int and double array's
			int newIntArray[] = new int[5];
			newIntArray[0] = 12;
			newIntArray[1] = 24;
			newIntArray[2] = 36;
			newIntArray[3] = 6;
			newIntArray[4] = 2;
			System.out.println("sum check array answer: " + sumCheckArray(newIntArray));
			double newDoubleArray[] = new double[6];
			newDoubleArray[0] = 23.29;
			newDoubleArray[1] = 64.3;
			newDoubleArray[2] = 59;
			newDoubleArray[3] = 12;
			newDoubleArray[4] = 12.21;
			newDoubleArray[5] = 64.95;
			double averageOfArray = averageCheckArray(newDoubleArray);
			System.out.println("Average of double array: " + averageOfArray);
			
			// checking Comparison method
			double compareCheckArr[] = new double[5];
					compareCheckArr[0] = 24.6;
			compareCheckArr[1] = 12;
			compareCheckArr[2] = 24.3;
			compareCheckArr[3] = 64.12;
			compareCheckArr[4] = 72.65;
			System.out.println("First array is larger than second array (double): " + compareDoubleArray(newDoubleArray, compareCheckArr));
			// checking boolean double check
			System.out.println("Will I buy a drink?: " + willBuyDrink(true, 22.6));
			
			
			
			
			
			
	}

	public static String concatWords(String wTBC, int x) {
		
		String finishedConcatonation = " ";
		for (int i = 0; i < x; i++) {
			finishedConcatonation += wTBC;
		}
		return finishedConcatonation;	
	}
	public static String fullNameBuilder(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	public static boolean sumCheckArray(int[] passedNum) {
		
		int sum = 0;
		for (int i = 0; i < passedNum.length; i++) {
			sum += passedNum[i];
		} 
		if (sum > 100) {
			return true;
		}
		else {
			return false;
		}
	}
	public static double averageCheckArray(double[] doubleArray) {
		
		double sum = 0;
		for (int i = 0; i < doubleArray.length; i++) {
			sum += doubleArray[i];
		} double average = sum / doubleArray.length;
		return average;
		}
	public static boolean compareDoubleArray(double[] firstArray, double[] secondArray) {
		
		double firstSum = 0;
		double secondSum = 0;
		for (int i = 0; i < firstArray.length; i++) {
			firstSum += firstArray[i];
		} double firstAverage = firstSum / firstArray.length;
		
		for (int j = 0; j < secondArray.length; j++) {
			secondSum += secondArray[j];
		} double secondAverage = secondSum / secondArray.length;
		
		if (firstAverage > secondAverage) {
			return true;
		} else {
			return false;
		}	
	}
	public static boolean willBuyDrink( boolean isHotOutside , double moneyInPocket ) {
		
		if (isHotOutside == true && moneyInPocket >= 10.50) {
			return true;
		} else {
			return false;
		}
		
	}
	
		
	
	
	
	
}
