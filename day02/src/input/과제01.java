package input;

import java.util.Scanner;

public class 과제01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name;
		int A, B, C;
		int D;
		
		System.out.print("당신의 이름은 무엇입니까?");
		name = in.next();
		System.out.print("홍길동 님의 국어 점수");
		A = in.nextInt();
		System.out.print("홍길동 님의 영어 점수");
		B = in.nextInt();
		System.out.print("홍길동 님의 수학 점수");
		C = in.nextInt();
		
		System.out.println("==============");
		System.out.println("이름 : "+name);
		System.out.println("==============");
		System.out.println("국어 : "+A);
		System.out.println("영어 : "+B);
		System.out.println("수학 : "+C);
		System.out.println("==============");
		D = A+B+C;
		System.out.println("합계 : "+D);
		System.out.println("==============");
		
		
		
	}
}
