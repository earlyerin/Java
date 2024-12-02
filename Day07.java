package exam;

import java.util.Scanner;

public class Day07 { 

	public static void main(String[] args) {
		/*
		 * 무한루프
		 * 루프를 탈출하기 위해 특정 조건을 작성해야함
		 * 
		 * for(;;){ 초기식과 증감식은 작성하더라도 조건식을 비워야 무한루프
		 * 
		 * }
		 * 구하고자 하는 값의 조건이 무엇인지 명확할 경우 사용 권장
		 * 초기식, 조건식, 증감식의 나열로 가독성이 좋음
		 * 
		 * while(true){
		 * 
		 * }
		 * 구하고자 하는 값의 조건을 정확하게 모를 경우, 즉 유동적인 경우 사용 권장
		 */
		
		//while문
		int  i = 1;
		while(true) {
			if(i == 10) {
				break;
			}
			System.out.print(i + " ");
			i++;
		}System.out.println();
		
		//for문
		for(int j = 1; ; j++) {
			if(j == 10) {
				break;
			}
			System.out.print(j + " ");
		}System.out.println();

		/*
		 * continue문
		 * 반복문 안에서 continue문을 만나면 및에 무슨 코드가 있어도
		 * 수행되지 않고 반복문의 처음으로 돌아가 반복문 실행
		 */
		//1 ~ 100 중 홀수만 출력하는 프로그램
		int k = 0;
		while(k < 100) {
			k++;
			if(k % 2 ==0) {
				continue;
			}
			System.out.print(k + " ");
		}System.out.println();
		
		/* 랜덤함수(실무에 사용!)
		 * Math.random()
		 * double 타입으로 0.0 이상 0.1 미만 사이의 값을 반환하는 함수
		 * (실수형이기 때문에 사용시 정수형으로 형변환하기)
		 */
		//난수생성
		int num = (int)(Math.random() *10) + 1;
		System.out.println(num);
		
		/*
		 * 중첩 for문
		 * 바깥쪽 반복문과 안쪽 반복문이 독립적으로 사이클을 수행
		 * 바깥쪽 반복문과 안쪽 반복문이 서로 형향을 받아 종속적 중첩반복문
		 * 
		 * 형식) for(초기식; 조건식; 증감식){
		 * 			for(초기식; 조건식; 증감식){
		 * 			}
		 *		}
		 */
		//구구단 출력
		//가로출력
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%dX%d="+(j*i)+"\t",i,j);
			}
			System.out.println();
		}
		System.out.println();
		//세로출력
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.printf("%dX%d="+(j*i)+"\t",j,i);
			}
			System.out.println();
		}
		
		//사각형 출력
		for(int i = 1; i <= 10 ; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//구구단 중 짝수단만 출력하기
		for(int i = 2; i < 10; i++){
			if(i % 2 == 0) {
				for(int j = 1; j < 10; j++) {
					System.out.printf("%dX%d="+(j*i)+"\t",i,j);
				}
				System.out.println();
			}			
		}
	
		/*
		 * Quiz1
		 * 무한루프
		 * 숫자를 계속 입력받아 입력받은 숫자들의 총 합을 구하는 프로그램
		 */
		
		Scanner sc  = new Scanner(System.in);
		//for문
		int sum = 0;
		System.out.println("연산 종료 시 0을 입력하세요.");
		for(int i = 0; ; i++) {
			System.out.println("정수입력>>");
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println(sum);
		
		//while문
		sum = 0;
		while(true) {
			System.out.println("정수입력>>");
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println(sum);
		
		/*
		 * Quiz2
		 * while문과 Scanner를 이용해
		 * 입력된 데이터로 예금, 출금, 조회, 종료 기능 구현
		 */
		int cal = 0;
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔금 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println(">>");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("예금액 : ");
				int in = sc.nextInt();
				cal += in;
			}else if(num == 2) {
				System.out.println("출금액 : ");
				int out =sc.nextInt();
				if(out > cal) {
					System.out.println("잔액이 부족합니다.");
				}else {
					cal -= out;
				}
			}else if(num == 3) {
				System.out.println("잔고 : " + cal);
			}else if(num == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		/*
		 * Quiz3
		 * for문
		 * UP&DOWN GAME
		 */
		int num = (int)(Math.random() * 100) + 1;
		System.out.println("컴퓨터가 1 ~ 100 중 랜덤 숫자 하나를 정합니다.");
		System.out.println("이 숫자를 맞춰주세요!");
		
		for(int count = 1; ;count++) {
			int userNum = sc.nextInt();
			if(userNum < num) {
				System.out.println("UP");
			}else if(userNum > num) {
				System.out.println("DOWN");
			}else{
				System.out.println("정답입니다. " + count + "회 만에 맞췄습니다.");
				break;
			}
		}
		sc.close();


	}

}
