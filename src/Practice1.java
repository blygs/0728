import java.util.Scanner;
import java.util.GregorianCalendar;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요 : " );
		int year = sc.nextInt();
		
		System.out.print("월을 입력하세요(1~12) : " );
		int month = sc.nextInt();
		System.out.print(year+ "년 " + month+"월의 마지막 날은 ");
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("31일 입니다.");
		}else if(month == 2) {
			GregorianCalendar gc = new GregorianCalendar();
			if(gc.isLeapYear(year)) {
				System.out.println("29일 입니다.");
			}else {
				System.out.println("28일 입니다.");
			}
		}else if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30일 입니다.");
		}else {
			System.out.println("잘못된 입력입니다. 월(1~12)");
		}		
		
	}
}
