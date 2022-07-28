
public class GradeManagementProgram {
	public static void main(String[] args) {
		Student jimin = new Student();
		jimin.stnumber = "2022001";
		jimin.name = "한지민";
		jimin.kor = 100;
		jimin.eng = 88;
		jimin.mat = 78;
		
		jimin.total = jimin.kor + jimin.eng + jimin.mat;
		jimin.avg = jimin.total / 3.0;
		
		// 성적의 기준
		// 평균 90 이상 : A
		// 80~89 : B
		// 70~79 : C
		// 60 ~69 : D
		// 나머지 F
		System.out.printf("평균 점수 : %.2f\n",jimin.avg);
		// if 를 사용 할 경우
		System.out.println("if");
		if(jimin.avg >= 90 && jimin.avg <= 100) {
			jimin.grade = 'A';
		}else if(jimin.avg >= 80) {
			jimin.grade = 'B';
		}else if(jimin.avg >= 70) {
			jimin.grade = 'C';
		}else if(jimin.avg >= 60) {
			jimin.grade = 'D';
		}else {
			jimin.grade = 'F';
		}
		System.out.println(jimin.name + "의 성적은" + jimin.grade + "입니다.");
		
		// switch를 사용할 경우
		System.out.println("Switch");
		int avg = (int)(jimin.avg / 10);
		switch(avg) {
			case 10 :
			case 9: jimin.grade = 'A'; break;
			case 8: jimin.grade = 'B'; break;
			case 7: jimin.grade = 'C'; break;
			case 6: jimin.grade = 'D'; break;
			default: jimin.grade = 'F';
		}
		System.out.println(jimin.name + "의 성적은" + jimin.grade + "입니다.");
		
		
		// 삼항 연산을 사용할 경우
		System.out.println("삼항 연산");
		jimin.grade = (avg >= 9 && avg <= 10)? 'A' : 
			((avg >= 8)? 'B' : 
				((avg >= 7)? 'C' : 
					((avg >= 6)? 'D' : 'F')));
		System.out.println(jimin.name + "의 성적은" + jimin.grade + "입니다.");
		
	}
	
	
}
