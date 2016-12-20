public class ArrayTooll {
	//Prints higher or lower
	public static void printHigherOrLower (double[] xs, double cutOffValue) {

		for (int i=0; i<xs.length; i++) {
			if(xs[i]<cutOffValue) {
				System.out.println("The entry " + i + "(" + xs[i] + ") is lower than " + cutOffValue );
			}
			else {
				System.out.println("The entry " + i + "(" + xs[i] + ") is higher than " + cutOffValue );
			
			}
		}
	}



	//Main Method
	public static void main(String[] args) {

	double[] valuesArray;

	valuesArray = new double[]{100.0,34.0,72.0,56.0,82.0,67.0,94.0} ;

	//double average;
	//average = computeAverage(valuesArray);
	

	printHigherOrLower(valuesArray, 72.5);
	//System.out.println("The average is " + average);
	}
}

