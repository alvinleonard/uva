import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Problem_11498 {

    public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	int K, N, M, X, Y;
	String input;

	while ((input = in.readLine()) != null) {
	    K = Integer.parseInt(input);

	    if (K == 0)
		break;

	    String[] inputArr = in.readLine().split(" ");
	    N = Integer.parseInt(inputArr[0]);
	    M = Integer.parseInt(inputArr[1]);

	    for (int i = 0; i < K; i++) {
		String[] testCase = in.readLine().split(" ");

		X = Integer.parseInt(testCase[0]);
		Y = Integer.parseInt(testCase[1]);

		if (X == N || Y == M)
		    System.out.println("divisa");

		else {
		    if (Y > M)
			System.out.print("N");
		    else
			System.out.print("S");

		    if (X > N)
			System.out.print("E");
		    else
			System.out.print("O");

		    System.out.println();
		}
	    }
	}
    }
}
