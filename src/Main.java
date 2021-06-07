
public class Main {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i < 100) {
			sum = sum + i;
			sum = i + sum;
			i+=1;
		}
		System.out.println(sum);
		System.out.println(fun(100, 2000));
		System.out.println(fib(6));
		for (i = 1; i < 6; i++) {
			System.out.print(print(i) + " ");
		}
	}
	static int fun(int a, int b) {
		if (b == 0) {
			return a;
		}
		else {
			return fun(b, a % b);
		}
	}
	
	static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}
	
	static int print(int n) {
		if ((n == 0) || (n == 1) || (n == 2)) {
			return 0;
		}
		if (n == 3) {
			return 1;
		}
		else {
			return print(n - 1) + print(n - 2) + print(n - 3);
		}
	}
}

// 0 -> 0, 1, 1, 2, 3, 5, 8