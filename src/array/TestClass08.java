package array;

import java.util.Scanner;

public class TestClass08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] id = new String[5];
		String[] pwd = new String[5];
		
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 모든 회원 보기");
		System.out.print(">>>");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: 
			
			System.out.println("비교 id 입력 : ");
			String ID = sc.next();
			System.out.println("비교 pwd 입력 : ");
			String PWD = sc.next();
			
			for(int i = 0; i < id.length; i++) {
				if(id[i].equals(ID) && pwd[i].equals(PWD)) {
					System.out.println("인증통과");
				}else {
					System.out.println("비밀번호 틀림");
				}
				break;
			}
		case 2:
			
		case 3:
		}
		
		
		
			
		
			
		
		
		
	}

}
