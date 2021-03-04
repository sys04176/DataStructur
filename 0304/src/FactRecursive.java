import java.util.Scanner;
@SuppressWarnings("unused")

public class FactRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수를 입력하시오 >> ");
		 int input = sc.nextInt();
		 System.out.println(fact(input));
		 sc.close();
	}
	
	public static int fact(int n) {
		if (n <= 1)
			return n;
		else 
			return fact(n-1) * n;
	}
}
