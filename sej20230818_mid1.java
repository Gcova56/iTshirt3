package sej20230818;

import java.util.Scanner;
import java.util.Random;

public class sej20230818_mid1 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		String userChoice, comChoice;
		
		System.out.print("가위 바위 보 중 하나 입력하세요: ");
		userChoice = user.next();
		
		String[] choice = {"가위", "바위", "보"};
		int rnd = (int) (Math.random() * choice.length);
		Random rand = new Random();
		comChoice = choice[rnd];
		
		System.out.println("컴퓨터: " + comChoice);
		
		if (userChoice.equals("가위")) {
			if (comChoice.equals("가위"))
				System.out.println("비겼습니다");
			else if (comChoice.equals("바위"))
				System.out.println("졌습니다");
			else if (comChoice.equals("보"))
				System.out.println("이겼습니다");
		} else if (userChoice.equals("바위")) {
			if (comChoice.equals("바위"))
				System.out.println("비겼습니다");
			else if (comChoice.equals("가위"))
				System.out.println("졌습니다");
			else if (comChoice.equals("보"))
				System.out.println("이겼습니다");
		} else if (userChoice.equals("보")) {
			if (comChoice.equals("보"))
				System.out.println("비겼습니다");
			else if (comChoice.equals("가위"))
				System.out.println("이겼습니다");
			else if (comChoice.equals("바위"))
				System.out.println("졌습니다"); 
		} else {
			System.out.println("잘못된 입력 값입니다 가위 바위 보 중에서 선택하여 입력하십시오.");
		}
		user.close();
	}
}