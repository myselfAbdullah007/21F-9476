public class Cal {
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public static int multi(int num1, int num2) {
		return num1 * num2;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		int sum = add(a, b);
		int difference = subtract(a, b);
		int multi = multi(a, b);
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Multiply: " + multi);
	}
}
