import java.lang.Math;

public class RandomDemo {
	public static void main(String[] args) {
//		System.out.println(Math.random());
		// 0.0 <= random <= 1.0 이기 때문에 구하려고하는 범위의 최대값을 곱해준 뒤 최소값을 맞춰준다. 이후 정수형으로 바꾸어 준다.
		// 실제로 시간에 의한 랜덤이다. 시차의 영향을 받는다.
		int number;
		for(int i = 0; i < 10; i++) {
			number = (int)(Math.random()*6 + 1);
			System.out.println(number);
		}
	}
}
