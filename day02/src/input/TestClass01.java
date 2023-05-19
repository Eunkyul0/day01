package input;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int age;
		String name;
		
		System.out.print("이름 입력 : ");
		name = in.next();
		System.out.println("나이 입력 : ");
		age = in.nextInt();
		
		System.out.println("당신 이름은 "+name+"이며");
		System.out.println("나이는 "+age+"살 이군요");
		
	}
}
