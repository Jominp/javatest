package chap3;

import java.util.Scanner;

//  반지름을 입력받아 원의 둘레와 면적을 구하시오
public class Test6 {
	public static void main(String[] args) {
		double pi = 3.141592;
		System.out.println("반지름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		double x = scan.nextInt();
		System.out.println("둘레 = "+2*pi*x);
		System.out.println("면적 = "+pi*x*x);
	}
}
