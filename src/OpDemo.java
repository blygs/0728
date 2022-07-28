import java.util.Scanner;

public class OpDemo {
	public static void main(String[] args) {
		// 나머지 연산자
//		System.out.println(5 / 2);
//		System.out.println(5 % 2);
		
		// 이동 연산자
//		System.out.println(4 << 2);
		// 0b100 --> 0b10000
//		System.out.println(-16 >> 2);
		// >>> 연산자는 signed 연산자의 양수 음수를 판별하는 비트조차 이동, 이동시 자신을 복제하고 이동하지 않고 0을 채운다.
//		System.out.println(-256 >>> 20);
		
		// << : n * 2^n
		// >> : n / 2^n
		// >>> : n / 2^n, ((-n)/2^n)-1
		
		// & : AND 연산 5 - > 101 , 3-> 011
		// | : OR 연산
		// ^ : XOR 연산
//		System.out.println(5 & 3);
//		System.out.println(5 | 3);
//		System.out.println(5 ^ 3);
//		
//		System.out.println(true && true);
//		System.out.println(true & true);
		
		
//		int a = 5;  int b = 10; int c = 15;
		// && 와 &의 차이는 참과 거짓이 명확해 졌을 때, 뒤에 수식이 실행되는가 실행되지 않는가의 차이가 난다.	|| 과 | 도 같다.
//		if(a > c && ++b < c) {
//			System.out.println("참");
//		}else {
//			System.out.println("거짓");
//		}
//		System.out.println(b);
//		
//		if(a > c & ++b < c) {
//			System.out.println("참");
//		}else {
//			System.out.println("거짓");
//		}
//		System.out.println(b);
		
		
		if(4 > 5) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		// 삼항 연산자
		System.out.println((6 > 5) ? "참" : "거짓");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println((a % 2 == 0)? "짝수를 입력했습니다." : "홀수를 입력했습니다.");
		
		int age = 26;
		age++;
		age = age + 5;
		age += 5;
		
		int aa = 5, bb = 10, xx = 15;
	}
}
