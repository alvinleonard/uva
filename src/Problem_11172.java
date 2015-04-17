import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Problem_11172 { // save as Main.java
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	try {
	    int t = Integer.parseInt(in.nextLine());
	    List<String> lines = new ArrayList<String>();

	    while (t > 0) {
		String line = in.nextLine();
		lines.add(line);
		t--;
	    }

	    for (String line : lines) {
		String[] temp = line.split(" ");
		printOperator(Integer.parseInt(temp[0]),
			Integer.parseInt(temp[1]));
	    }

	} finally {
	    in.close();
	}
    }

    static void printOperator(int num1, int num2) {
	if (num1 > num2)
	    System.out.println(">");
	else if (num1 < num2)
	    System.out.println("<");
	else
	    System.out.println("=");
    }
}