/*
 * 1. 다음과 같은 출력을 할 수 있도록 프로그래밍 하시오.
 * 	A	B	C	D	E
 *  f	g	h	i	j
 *  K	L	M	N	O
 *  p	q	r	s	t
 *  U	V	W	X	Y
 *  z
 * 
 * 
 * 2. 체중과 신장을 입력받아 BMI(체질량지수)를 구하는 프로그램을 작성하시오.
 * BMI = 체중 / 신장제곱
 * 단, 신장은 cm단위가 아니라 m단위임.
 * 고도 비만 : 35 이상
 * 중도 비만 : 30 - 34.9
 * 경도 비만 : 25 - 29.9
 * 과체중 : 23 - 24.9
 * 정상 : 18.5 - 22.9
 * 저체중 : 18.5 미만
 * 
*/
import java.util.Scanner;
public class Practice4 {
	public static void main(String[] args) {
		// 문제 1.
		// A : 65  Z : 90
		// a : 97
		int cnt = 0;
		for(int i = 65; i < 91 ; i++) {
			if((cnt / 5) % 2 == 0) {
				System.out.printf("%c\t", i);
			}
			else {
				System.out.printf("%c\t", i + 32);
			}
			cnt++;
			if(cnt % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		// 문제 2.

		Scanner sc = new Scanner(System.in);
		System.out.print("신장을 입력해 주세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.print("체중을 입력해 주세요(Kg) : ");
		double weight = sc.nextDouble();
		
		height *= 0.01;
		
		double bmi = weight / (height * height);
		
		String msg;
		if(bmi >= 35) {
			msg = "고도 비만";
		}else if(bmi >= 30) {
			msg = "중도 비만";
		}else if(bmi >= 25) {
			msg = "경도 비만";
		}else if(bmi >= 23) {
			msg = "과체중";
		}else if(bmi >= 18.5) {
			msg = "정상";
		}else {
			msg = "저체중";
		}
		System.out.printf("BMI : %.2f\n",bmi);
		System.out.println("당신은 " + msg + "입니다.");
	}
}