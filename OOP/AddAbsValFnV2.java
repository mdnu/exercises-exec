import java.io.*;

public class AddAbsValFnV2 {
	
	public static void main(String[] args) throws IOException, NumberFormatException {
		double x, y, absSum;
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter two numbers: ");
		x = Double.parseDouble(cin.readLine());
		y = Double.parseDouble(cin.readLine());
		absSum = addAbsVal(x, y);
		System.out.format("|%.2f| + |%.2f| = %.2f\n\n", x, y, absSum);
		
		System.out.print("Enter number of values in array: ");
		int n = Integer.parseInt(cin.readLine());
		System.out.print("Enter all " + n + " values in array: ");
		double [] z = new double[n];
		
		for (int i = 0; i < n; i++) {
			z[i] = Double.parseDouble(cin.readLine());
		}
		absSum = addAbsVal(z);
		System.out.format("Sum of absolute values of array elements = %.2f\n", absSum);
	}
	
	public static double addAbsVal(double x, double y) {
		return Math.abs(x) + Math.abs(y);
	}
	
	public static double addAbsVal(double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += Math.abs(x[i]);
		}
		return sum;
	}

}
