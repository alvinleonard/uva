import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Problem_401 {

    public static void main(String[] args) throws IOException {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	String line;
	List<String> lines = new ArrayList<String>();

	// Read all input lines
	while ((line = in.readLine()) != null && !line.isEmpty()) {
	    lines.add(line.trim());
	}

	for (String l : lines) {
	    process(l);
	}

    }

    static void process(String input) {
	boolean isPalindrome = isPalindrome(input);
	boolean isMirror = isMirror(input);

	if (!isPalindrome && !isMirror)
	    System.out.println(input + " -- is not a palindrome.");

	else if (isPalindrome && !isMirror)
	    System.out.println(input + " -- is a regular palindrome.");

	else if (!isPalindrome && isMirror)
	    System.out.println(input + " -- is a mirrored string.");

	else
	    System.out.println(input + " -- is a mirrored palindrome.");

	System.out.println();
    }

    static boolean isPalindrome(String input) {
	if (input.length() == 1)
	    return true;

	String temp = reverse(input);
	return temp.equals(input);
    }

    static String reverse(String input) {
	String temp = "";
	char[] inputArray = input.toCharArray();
	for (int i = inputArray.length - 1; i >= 0; i--) {
	    temp += inputArray[i];
	}
	return temp;
    }

    static boolean isMirror(String input) {
	Map<Character, Character> mirrorMap = new HashMap<Character, Character>();
	mirrorMap.put('A', 'A');
	mirrorMap.put('E', '3');
	mirrorMap.put('H', 'H');
	mirrorMap.put('I', 'I');
	mirrorMap.put('J', 'L');
	mirrorMap.put('L', 'J');
	mirrorMap.put('M', 'M');
	mirrorMap.put('O', 'O');
	mirrorMap.put('S', '2');
	mirrorMap.put('T', 'T');
	mirrorMap.put('U', 'U');
	mirrorMap.put('V', 'V');
	mirrorMap.put('W', 'W');
	mirrorMap.put('X', 'X');
	mirrorMap.put('Y', 'Y');
	mirrorMap.put('Z', '5');
	mirrorMap.put('1', '1');
	mirrorMap.put('2', 'S');
	mirrorMap.put('3', 'E');
	mirrorMap.put('5', 'Z');
	mirrorMap.put('8', '8');

	char[] charArr = input.toCharArray();

	if (input.length() == 1)
	    return mirrorMap.get(charArr[0]) != null;

	int backPointer = charArr.length - 1;
	for (int i = 0; i < charArr.length / 2; i++) {
	    if (mirrorMap.get(charArr[i]) == null
		    || mirrorMap.get(charArr[i]) != charArr[backPointer--]) {
		return false;
	    }
	}

	return true;
    }
}
