import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
//		int score = 58;
//		
//		if(score >= 50) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("가장 좋아하는 계절이 뭔가요?(spring / summer / fall / winter) : ");
		String season = sc.nextLine();
//		season = season.toLowerCase();
		if(season.equalsIgnoreCase("spring")) {
			
			System.out.println("진달래, 개나리");
		
		}else if(season.equals("summer")) {
		
			System.out.println("장미, 아카시아");
		
		}else if(season.equals("fall")) {
		
			System.out.println("코스모스, 백합");
		
		}else if(season.equals("winter")){
		
			System.out.println("동백, 매화");
		
		}else {
			System.out.println("올바른 입력이 아닙니다.");
		}
	}
}
