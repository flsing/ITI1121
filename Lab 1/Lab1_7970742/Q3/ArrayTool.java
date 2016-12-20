public class ArrayTool {
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

	

	//Main Method
	public static void main(String[] args) {

	double[] valuesArray;
	//double[] lowArray;
	//double[] highArray; 
	double average;

	//int numberSmaller;
	valuesArray = new double[]{100.0,34.0,72.0,56.0,82.0,67.0,94.0} ;

	
	average = computeAverage(valuesArray);
	System.out.println("The average is " + average);

	}
}
