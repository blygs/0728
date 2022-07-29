import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Client cl = new Client();
		
		System.out.print("이름 : ");
		cl.name = sc.nextLine();
		
		System.out.print("나이 : ");
		cl.age = sc.nextInt();
		sc.nextLine();
		
		boolean flag = true;
		do {
		System.out.print("gender(남성 : M / 여성 : F) : ");
		String gender = sc.nextLine();
		cl.gender = gender.charAt(0);
			if((int)(cl.gender) != 70 && (int)(cl.gender) != 77 && (int)(cl.gender) != 102 && (int)(cl.gender) != 109) {
				System.out.println("잘못된 성별입력입니다.");
				flag = false;
			}
			else flag = true;
		}while(!flag);
		
		System.out.print("신장 : ");
		cl.height = sc.nextDouble();
		
		System.out.print("체중 : ");
		cl.weight = sc.nextDouble();
		
		double h = cl.height * 0.01;
		cl.bmi = cl.weight / (h * h);
		
		cl.result = cl.name + "씨의 BMI는 "+ cl.bmi + " 입니다.";
		System.out.printf("%s씨의 BMI는 %.2f 이며 ", cl.name, cl.bmi);
		
		if(cl.bmi >= 35) {
			
			cl.result = "고도 비만";
		
		}else if(cl.bmi >= 30) {
			
			cl.result = "중도 비만";
		
		}else if(cl.bmi >= 25) {
			
			cl.result = "경도 비만";
		
		}else if(cl.bmi >= 23) {
			
			cl.result = "과체중";
		
		}else if(cl.bmi >= 18.5) {
			
			cl.result = "정상";
		
		}else {
			
			cl.result = "저체중";
		
		}
		System.out.println(cl.result + "입니다.");
		
	}
}
