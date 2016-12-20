public class ArrayToolll {
	//Prints higher or lower
	public static void printHigherOrLower (double[] xs, double cutOffValue) {

		for (int i=0; i<xs.length; i++) {
			if(xs[i]<cutOffValue) {
				System.out.println("The entry " + i + "(" + xs[i] + ") is lower than " + cutOffValue );
			}
			else {
				System.out.println("The entry " + i + "(" + xs[i] + ") is greater than " + cutOffValue );
			
			}
		}
	}

	//Compute the average
	public static  double computeAverage(double xs[]) {
		double sum = 0.0;

		int i;

		for (i=0; i<xs.length; i++) {
			sum += xs[i];
		}

		return sum/i;
	}

	//Count numbers less than
	public static int  countNumberLessThan(double[] xs, double cutOffValue) {
		int counter = 0 ;
		for (int i=0; i<xs.length; i++) {
			if (xs[i]<cutOffValue) {
				counter ++;

			}
	}
	return counter;
	}

	//Split method
	public static void split(double[] xs, double[] low, double high[], double cutOffValue) {

		int highindex=0;
		int lowindex=0;

		for (int i =0; i<xs.length; i++) {
			if(xs[i]<cutOffValue) {
				low[lowindex]=xs[i];
				lowindex++;

			}
			else {
				high[highindex]=xs[i];
				highindex++;
			}
		}
	}

	//Main Method
	public static void main(String[] args) {

	double[] valuesArray;
	double[] lowArray;
	double[] highArray; 
	double average;

	int numberSmaller;
	valuesArray = new double[]{100.0,34.0,72.0,56.0,82.0,67.0,94.0} ;

	
	average = computeAverage(valuesArray);
	

	
	System.out.println("The average is " + average);
	printHigherOrLower(valuesArray, average); 
	System.out.println(countNumberLessThan(valuesArray, average));

	numberSmaller = (countNumberLessThan(valuesArray, average));

	lowArray = new double[numberSmaller];
	highArray = new double[valuesArray.length - numberSmaller];

	split(valuesArray,lowArray,highArray,average);

	System.out.println("Larger values: ");
	for (int i =0; i<valuesArray.length - numberSmaller; i++) {
		if(i>0) System.out.print(", ");
		System.out.print(highArray[i]);
	}
	System.out.println("\nSmaller values: ");
	for (int i =0; i<(numberSmaller); i++) {
		if(i>0) System.out.print(", ");
		System.out.print(lowArray[i]);
	}

}
}
