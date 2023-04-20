package com.careerit.jfs.cj.day6;

public class Calc {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		for( ; ; ) {
			System.out.println("1.Add 2.Sub 3.Mul 4.Div 5.Exit");
			int ch = sc.nextInt();
			System.out.println();
			int num1 = sc.nextInt();
			System.out.println();
			int num2 = sc.nextInt();
			int res = 0;
			switch(ch) {
				case 1: res = num1 + " + " + num2 " = " + (num1 +  num2);
					break;
				case 2: res = num1 + " - " + num2 " = " + (num1 -  num2);
					break;
				case 3: res = num1 + " * " + num2 " = " + (num1 *  num2);
					break;
				case 4: res = num1 + " / " + num2 " = " + (num1 /  num2);
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Enter a valid num between 1 - 5");
					
			}
			System.out.println(res);
		}
	}

		
	}

	public static int reverse(int num) {
		return 0;
	}

	public static boolean isPrime(int num) {
		if(num < 2 || (num % 2 == 0 && num != 2)) {
			return false;
		}
		for(int i = 2; i < num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int fibonacciTerm(int num) {
		if(num == 1) {
			return 0;
		} else if(num == 2 || num == 3) {
			return 1;
		} else {
			int a = 0, b = 1;
			for(int i = 2; i < num; i++) {
				int sum = a + b;
				a = b;
				b = sum;
			}
			return b;
		}
	}
}
