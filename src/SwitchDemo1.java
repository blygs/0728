import java.util.Scanner;

public class SwitchDemo1 {
	public static void main(String[] args) {
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
		
		
		String flower = (season.equals("spring")? "진단래, 개나리" :
			(season.equals("summer")? "장미, 아카시아" :
				(season.equals("fall")? "코스모스, 백합" :
					(season.equals("winter")? "동백, 매화":"그런 계절은 없습니다."))));

		System.out.println(flower);
		
		switch(season) {
		case "spring" : System.out.println("진달래, 개나리");break;
		case "summer" : System.out.println("장미, 아카시아");break;
		case "fall" : System.out.println("코스모스, 백합");break;
		case "winter" : System.out.println("동백, 매화");break;
		default : System.out.println("올바른 입력이 아닙니다.");
		}
	}
}
