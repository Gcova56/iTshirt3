package sej20230818;
import java.util.Random;
import java.util.Scanner;

public class sej20230818_mid2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int win=0, lose=0;
		System.out.println("하나 빼기 게임을 시작하겠습니다.");
		System.out.println("START!!");
		
		for( int i = 0; i<3; i++) {
			System.out.println("가위(1) 바위(2), 보(3) 중 두 개 선택하세요.");
			
			System.out.print("내 오른손 선택 (1. 주먹 2. 가위 3. 보): ");
            int userright = scanner.nextInt();
            
            System.out.print("내 왼손 선택 (1. 주먹 2. 가위 3. 보): ");
            int userleft = scanner.nextInt();
            
			int comright = random.nextInt(3)+1;
			int comleft = random.nextInt(3)+1;
			
			System.out.printf("uesr 오른 손 %d, 왼손 %d \n", userright, userleft);
			System.out.printf("cpu 오른 손 %d, 왼손 %d \n", comright, comleft);
			
			System.out.println("오른쪽과 왼쪽 중 하나를 선택해주세요 (오른손(1) 왼손(2)");
			int handr = scanner.nextInt();
			int userh = (handr == 1) ? userright :  userleft;
			
			int comh = random.nextBoolean() ? comright : comleft;
			
			System.out.printf("user : %d, cpu : %d\n", userh, comh);
			
			if ((userh == 1 && comh == 3 ) || (userh == 2 && comh == 1 ) || (userh == 3 && comh == 2)) {
				System.out.println("user win!");
				win++;
			} else if (userh == comh) {
				System.out.println("비겼습니다...");
			} else {
				System.out.println("con win!");
				lose++;
			}
			System.out.printf("\n\n");
		}
		System.out.printf("게임 결과 >  나: %d 컴퓨터: %d\n", win, lose);
		scanner.close();
	}
}