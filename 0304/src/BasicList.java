import java.util.Scanner;
@SuppressWarnings("unused")

public class BasicList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int arr[] = new int[5];
	      
	      System.out.print("���� 5���� �Է��Ͻÿ� >> ");
	      for(int i=0; i<arr.length; i++) {
	         arr[i] = sc.nextInt();
	         System.out.print(arr[i]+ " ");
	      }
	      
	      sc.close();
	}
}