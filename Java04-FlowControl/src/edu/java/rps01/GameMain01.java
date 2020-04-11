package edu.java.rps01;

import java.util.Scanner;

public class GameMain01 {

	public static void main(String[] args) {
		// RPS(Rock, paper, Scissors)
		
		// 가위바위보 게임
		// 1. 사용자에게 가위(1), 바위(2), 보(3) 중에서 선택하도록 하고, 선택 결과 저장
		// 2. 컴퓨터는 난수(1, 2, 3)을 발생시켜서 저장
		// 3. 게임의 로직
		// 1) if 사용자가 가위(1)를 냈을 때
		//     (1) if 컴퓨터가 가위(1)를 냈을 때
		//     (2) else if 컴퓨터가 바위(2)를 냈을 때
		//     (3) else
		// 2) else if 사용자가 바위(2)를 냈을 때
		//     (1) if 컴퓨터가 가위(1)를 냈을 때
		//     (2) else if 컴퓨터가 바위(2)를 냈을 때
		//     (3) else
		// 3 else (사용자가 보를 낸 경우)
		//     (1) if 컴퓨터가 가위(1)를 냈을 때
		//     (2) else if 컴퓨터가 바위(2)를 냈을 때
		//     (3) else
		
		double r = Math.random();
		int choice = (int)(3*r+1);
//		System.out.println(choice);
		
		// 1. 사용자의 선택(가위, 바위, 보)를 입력받아서 저장
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt();
		sc.close();
		System.out.println("userChoise" + userChoice);
		
		// 2. 컴퓨터의 선택을 난수로 저장
		
		sc.close();
		int comChoice = choice;
		System.out.println("comChoise" + comChoice);
		
		// 3. 게임의 로직
		// 사용자가 가위를 낸 경우
		if(userChoice == 1) { 
			
			if(comChoice == 1) {// 컴퓨터가 가위를 낸 경우
				System.out.println("비겼습니다.");
			} else if (comChoice == 2) { // 컴퓨터가 바위를 낸 경우
				System.out.println("당신이 졌습니다.");
			} else { // 컴퓨터가 보를 낸 경우
				System.out.println("당신이 이겼습니다.");
			}
			
		} else if (userChoice == 2) { // 사용자가 바위를 낸경우
			
			if(comChoice == 1) {// 컴퓨터가 가위를 낸 경우
				System.out.println("당신이 이겼습니다.");
			} else if (comChoice == 2) { // 컴퓨터가 바위를 낸 경우
				System.out.println("비겼습니다.");
			} else { // 컴퓨터가 보를 낸 경우
				System.out.println("당신이 졌습니다.");
			}
			
		} else { // 사용자가 보를 낸 경우
			
			if(comChoice == 1) {// 컴퓨터가 가위를 낸 경우
				System.out.println("당신이 졌습니다.");
			} else if (comChoice == 2) { // 컴퓨터가 바위를 낸 경우
				System.out.println("당신이 이겼습니다.");
			} else { // 컴퓨터가 보를 낸 경우
				System.out.println("비겼습니다.");
			}
			
		}

	} // end main()

} // end GameMain01


























