
public class SwitchDemo {
	public static void main(String[] args) {
		int su = 26 ;
		System.out.println((su % 2 == 0)?"짝수" : "홀수" );
		
		if(su%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		// 각각의 케이스가 스위치 조건에 맞는것이 실행 되는것. break필수
		switch(su%2) {
		case 0 : System.out.println("짝수"); break;
//		default : System.out.println("홀수");
		case 1 : System.out.println("홀수"); break;
		}
		
	}
}
