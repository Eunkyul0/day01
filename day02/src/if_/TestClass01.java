package if_;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("1. 쉬운 게임");
		System.out.println("2. 어려운 게임");
		System.out.println("3. 종료");
		System.out.print(">>> : ");
		num = input.nextInt();
		if(num == 1) {
			System.out.println("쉬운");
			System.out.println("게임이 동작합니다.");
		}
		if(num == 2) {
			System.out.println("어려운");
			System.out.println("게임이 동작합니다.");
		}
		if(num == 3) {
			System.out.println("게임 종료...");
		}
		
	}
}
