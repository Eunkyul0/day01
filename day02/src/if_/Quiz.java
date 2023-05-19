package if_;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Q. '고래 싸움에 새우 등 터진다'라는 뜻의 사자성어는?");
		System.out.println("1. 경전하사(鯨戰蝦死)");
		System.out.println("2. 사즉동혈(死則同穴)");
		System.out.println("3. 만강혈성(滿腔血誠)");
		num = input.nextInt();
		
		if (num == 1) {
			System.out.println("정답!");
			System.out.println("고래 경, 싸움 전, 새우 하, 죽을 사");
		}	
		
		if ( num == 2 ) {
			System.out.println("땡!");
			System.out.println("사즉동혈은 부부가 죽은 뒤에 한무덤에 묻힌다는 뜻으로,");
			System.out.println("부부의 사이가 매우 좋음을 나타내는 말입니다.");
		}

		if ( num == 3 ) {
			System.out.println("땡!");
			System.out.println("만강혈성은 마음속에서 진심으로 우러나오는 정성을 말합니다.");
		}
		
	}
}
