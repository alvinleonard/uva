import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Problem_11559 {

    public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	int N, B, H, W, p, cost = 0, minCost;
	int[] a;

	String input;
	while ((input = in.readLine()) != null) {
	    String[] inputArr = input.split(" ");
	    N = Integer.parseInt(inputArr[0]);
	    B = Integer.parseInt(inputArr[1]);
	    H = Integer.parseInt(inputArr[2]);
	    W = Integer.parseInt(inputArr[3]);

	    minCost = 0;
	    a = new int[W];

	    for (int i = 0; i < H; i++) {
		p = Integer.parseInt(in.readLine());
		String[] availArr = in.readLine().split(" ");
		for (int j = 0; j < availArr.length; j++) {
		    a[j] = Integer.parseInt(availArr[j]);
		}

		cost = N * p;

		// Check if we have enough money given a price
		if (cost <= B) {

		    // Check availability
		    for (int j = 0; j < a.length; j++) {
			if (a[j] >= N) {
			    if (minCost == 0 || cost < minCost) {
				minCost = cost;
			    }
			    break;
			}
		    }
		}
	    }

	    if (minCost != 0)
		System.out.println(minCost);
	    else
		System.out.println("stay home");
	}
    }

}
