
public class ForDemo {
	public static void main(String[] args) {
		// for - 초기 값 , 조건 값, 증가 값
//		for(int su = 1; su<= 10; su++) {
//			System.out.print(su + "\t");
//		}
//		System.out.print("\n");
//		for(int su = 10; su>=1; su--) {
//			System.out.print(su + "\t");
//		}
		
		
//		for(int i = 1; i <21; i++) {
//			if(i % 3 == 0) {
//				System.out.print(i + "\t");
//			}
//		}
		
		// 20 ~ 180까지 숫자를 출력하되 7의 배수를 출력하되 한줄에 5개 씩만 출력하라.
		int cnt = 0;
		for(int i = 20; i <181 ; i++) {
			if(i % 7 ==0 ) {
				System.out.print(i + "\t");
				cnt++;
				if(cnt % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}
