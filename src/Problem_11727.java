import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Problem_11727 {
    public static void main(String[] args) throws IOException {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	int T = Integer.parseInt(in.readLine());

	for (int i = 0; i < T; i++) {
	    String inputLine = in.readLine();
	    System.out.print("Case " + (i + 1) + ": ");
	    process(inputLine);
	}

    }

    static void process(String input) {
	String[] inputArr = input.split(" ");
	Arrays.sort(inputArr);
	System.out.println(inputArr[1]);
    }
}
