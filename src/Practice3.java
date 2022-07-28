import java.lang.Math;

public class Practice3 {
	public static void main(String[] args) {
		int rand_number =(int)(Math.random()*10 + 1);
		
		
		switch(rand_number) {
		case 1: System.out.println("Bananas"); break;
		case 2: System.out.println("Oranges"); break;
		case 3: System.out.println("Peach");
		case 4: System.out.println("Apples");
		case 5: System.out.println("Plums");break;
		case 6: System.out.println("Pineapples");break;
		case 7: break;
		default: System.out.println("Nuts");
		}
		System.out.println(rand_number);
	}
}
