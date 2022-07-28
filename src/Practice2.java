import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1992년 = 원숭이 띠
		// 자 축 인 묘 진 사 오 미 신 유 술 해
		System.out.print("출생 연도를 입력하세요 : ");
		int year = sc.nextInt();
		
		int mod_year = year % 12;
		
		
		System.out.println((2022 - year + 1) +"살 입니다.");
		
		String[] ddi = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};
		System.out.println(ddi[mod_year] + "띠 입니다.");
//		if(mod_year == 0) {
//			// 신
//			System.out.println("원숭이 띠 입니다.");
//		}else if(mod_year == 1) {
//			
//		}else if(mod_year == 2) {
//			
//		}else if(mod_year == 3) {
//			
//		}else if(mod_year == 4) {
//			
//		}else if(mod_year == 5) {
//			
//		}else if(mod_year == 6) {
//			
//		}else if(mod_year == 7) {
//			
//		}else if(mod_year == 8) {
//			
//		}else if(mod_year == 9) {
//			
//		}else if(mod_year == 10) {
//			
//		}else if(mod_year == 11) {
//			
//		}
		
		switch(mod_year) {
		case 0 :System.out.println("원숭이 띠 입니다.");break;
		case 1 :System.out.println("닭 띠 입니다.");break;
		case 2 : System.out.println("개 띠 입니다.");break;
		case 3 : System.out.println("돼지 띠 입니다.");break;
		case 4 : System.out.println("쥐 띠 입니다.");break;
		case 5 : System.out.println("소 띠 입니다.");break;
		case 6 : System.out.println("호랑이 띠 입니다.");break;
		case 7 : System.out.println("토끼 띠 입니다.");break;
		case 8 : System.out.println("용 띠 입니다.");break;
		case 9 : System.out.println("뱀 띠 입니다.");break;
		case 10 : System.out.println("말 띠 입니다.");break;
		case 11 : System.out.println("양 띠 입니다.");break;
		default : System.out.println("잘못 된 입력 입니다.");
		}
	}
}
