import java.util.Scanner;
//import java.util.Date;
import java.util.GregorianCalendar;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.println("입력하신 연도는 " + ((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) )? "윤년 입니다." : "평년 입니다."));
		sc.close();
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.isLeapYear(year));
		String today = gc.getTime().toString();
		System.out.println(gc.getTime().toInstant());
		System.out.println(today);
	}
}