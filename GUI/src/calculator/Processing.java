package calculator;

import java.util.*;

public class Processing {

	private ArrayList<Double> numbers = new ArrayList<Double>();
	private ArrayList<String> signs = new ArrayList<String>();
	private int currentIndex = 0;
	private String[] numberArray = new String[100];
	private ArrayList<String> numberList = new ArrayList<String>();

	public void main(String mainProblem) {

		String[] operands = mainProblem.split("");
		for (String s : operands) {

			if (s.equals("+") || s.equals("-") || s.equals("÷") || s.equals("X") || s.equals("%")) {
				signs.add(s);
				currentIndex += 1;
				continue;
			}

			if (numberArray[currentIndex] == null) {
				numberArray[currentIndex] = "";
			}
			numberArray[currentIndex] += s;
		}

		for (int i = 0; i <= currentIndex; i++) {
			numberList.add(numberArray[i]);
		}

		Window.textField.setText(calculation(signs, numberList));

	}

	public String calculation(ArrayList<String> operands, ArrayList<String> nums) {

		String result = null;
		numbers = toNumbers(nums);
		int i = 0;
		int numSize = numbers.size();

		boolean bool = true;

		if (err(nums)) {
			result = "SYNTAX ERR";
			bool = false;

		}

		while (true && bool) {

			boolean add = false, minus = false, divide = false, multiply = false, modulo = false;

			if (i >= numSize - 1) {
				i = 0;
			}

			int d = 0;
			int mi = 0;
			int a = 0;
			int mu = 0;
			int iliterator = 0;
			int mod = 0;

			for (String s1 : operands) {
				if (s1.equals("÷")) {
					divide = true;
					d = iliterator;
				} else if (s1.equals("X")) {
					multiply = true;
					mu = iliterator;
				} else if (s1.equals("+")) {
					add = true;
					a = iliterator;
				} else if (s1.equals("-")) {
					minus = true;
					mi = iliterator;
				} else if (s1.equals("%")) {
					modulo = true;
					mod = iliterator;
				}
				iliterator++;
			}

			if (modulo) {

				operands.remove(d);
				double one = numbers.get(d);
				double two = numbers.get(d + 1);
				double ans = one % two;
				numbers.set(d, ans);
				numbers.remove(d + 1);
				i++;
				numSize -= 1;
				continue;

			} else if (divide && !modulo) {

				operands.remove(d);
				double one = numbers.get(d);
				double two = numbers.get(d + 1);
				double ans = one / two;
				numbers.set(d, ans);
				numbers.remove(d + 1);
				i++;
				numSize -= 1;
				continue;

			} else if (multiply && !divide) {

				operands.remove(mu);
				double one = numbers.get(mu);
				double two = numbers.get(mu + 1);
				double ans = one * two;
				numbers.set(mu, ans);
				numbers.remove(mu + 1);
				i++;
				numSize -= 1;
				continue;

			} else if (add && !divide && !multiply) {

				operands.remove(a);
				double one = numbers.get(a);
				double two = numbers.get(a + 1);
				double ans = one + two;
				numbers.set(a, ans);
				numbers.remove(a + 1);
				i++;
				numSize -= 1;
				continue;

			} else if (minus && !divide && !multiply && !add) {

				operands.remove(mi);
				double one = numbers.get(mi);
				double two = numbers.get(mi + 1);
				double ans = one - two;
				numbers.set(mi, ans);
				numbers.remove(mi + 1);
				i++;
				numSize -= 1;
				continue;

			} else {
				i++;
			}
			if (operands.size() == 0) {
				break;
			}

		}
		if(!err(nums)){
			result = Double.toString(numbers.get(0));
			if (isconvertible(result)) {
				result = removedecimal(result);
			}
		}
		

		return result;
	}

	public ArrayList<Double> toNumbers(ArrayList<String> x) {

		ArrayList<Double> integer = new ArrayList<Double>();
		for (String s : x) {
			if (!(s == null)) {
				integer.add(Double.parseDouble(s));
			}
		}

		return integer;
	}

	public boolean isconvertible(String string) {
		String[] s = string.split("\\.");
		boolean bool = false;

		if (s[1].equals("0")) {
			bool = true;
		}

		return bool;
	}

	public String removedecimal(String string) {
		String[] s = string.split("\\.");
		String w = s[0];
		return w;
	}

	public static boolean isAlign(int num) {
		boolean bool = false;
		if (num == 0) {
			bool = true;
		} else if (num != 0) {
			bool = false;
		}
		return bool;
	}

	public boolean err(ArrayList<String> str) {
		boolean bool = false;
		for (String s : str) {
			if (s == null) {
				bool = true;
				break;
			}
		}
		return bool;
	}

}
