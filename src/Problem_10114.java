import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Problem_10114 {
    public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	int months, rateChange;
	double dp, remainingLoan, value, monthlyPayment;

	String input;
	while ((input = in.readLine()) != null) {
	    String[] inputArr = input.split(" ");

	    months = Integer.parseInt(inputArr[0]);
	    dp = Double.parseDouble(inputArr[1]);
	    remainingLoan = Double.parseDouble(inputArr[2]);
	    rateChange = Integer.parseInt(inputArr[3]);
	    value = remainingLoan + dp;

	    if (months < 0)
		return;

	    Map<Integer, Double> depreciationMap = new HashMap<Integer, Double>();
	    for (int i = 0; i < rateChange; i++) {
		String[] tempArr = in.readLine().split(" ");
		depreciationMap.put(Integer.parseInt(tempArr[0]),
			Double.parseDouble(tempArr[1]));
	    }

	    // Month 0
	    double currentRate = depreciationMap.get(0);
	    value = value - (value * currentRate);

	    monthlyPayment = remainingLoan / months;

	    if (remainingLoan < value) {
		System.out.println("0 months");
		continue;
	    }

	    for (int i = 1; i <= months; i++) {
		currentRate = depreciationMap.get(i) != null ? depreciationMap
			.get(i) : currentRate;

		remainingLoan -= monthlyPayment;
		value = value - (value * currentRate);

		if (remainingLoan < value) {
		    System.out.print(i + " month");
		    if (i > 1)
			System.out.println("s");
		    else
			System.out.println();
		    break;
		}
	    }
	}
    }
}
