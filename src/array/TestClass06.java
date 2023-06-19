package array;

import java.util.Scanner;

public class TestClass06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10, 54, 13, 17, 25, 30};
		System.out.print("짝수, 홀수입력: ");
		String A = sc.next();
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 ==0 && A.equals("짝수")) {
				System.out.println("짝수 : " + arr[i]);
			}else if (arr[i] % 2 == 1 && A.equals("홀수")) {
				System.out.println("홀수 : " + arr[i]);
			}else {
				
			}
		
		}

	}	
}
