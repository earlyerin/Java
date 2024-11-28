package exam;

import java.util.Scanner;

public class Day06 {
	public static void main(String[] args) {
		//반복문이란 프로그램 내에서 명령을 일정 욋수만큼 반복하여 수행하도록 제어하는 명령문
		/*
		 * 반복문(for문)
		 * 
		 * 1.초기식 실행
		 * 2.조건식 실행
		 * 3.실행문장 수행
		 * 4.증감식 수행
		 * 5.증감식 실행 후 조건식에 부합한지 판별
		 * 6.조건식이 참이라면 실행문을 수행하고 조건식이 거짓이라면 반복문 탈출
		 * 
		 * 형식) for(초기식;조건식;증감식){
		 * 			실행문
		 * 		}
		 * 
		 */
		
		/*
		 * 디버깅(실무에 중요!!)
		 * 시작위치 더블클릭
		 * 벌레모양 클릭
		 * F6번 눌러서 진행
		 * 디버깅 창에 우클릭해서 terminate and remove
		 * 창 오른쪽 끝에 JAVA 클릭해서 끝내기
		 */
		
		//Hello World 10번 출력
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello World");
		}
		
		//1 ~ 10까지 출력
		//오름차순
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}System.out.println();
		//내림차순
		for(int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}System.out.println();
		
		//10번 찍어 넘어가는 나무
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + "번 찍었습니다.");
			if(i == 10) {
				System.out.println("나무 넘어갑니다.");
			}
		}
		
		//1 ~ 10까지 합 출력
		int sum1 = 0;
		for(int i = 1; i <= 10; i++) {
			sum1 += i;
		}System.out.println(sum1);
		
		//1 ~ 100 중 짝수의 합
		int sum2 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum2 += i;
			}
		}System.out.println(sum2);
		
		/*
		 * 반복문(while문)
		 * 
		 * 형식) while(조건문){
		 * 			실행문
		 * 		}
		 */
		//1 ~ 10 출력
		int i =1; //초기식
		while(i <= 10) { //조건식 - true일 때 반복실행
			System.out.print(i + " ");
			i++; //증감식
		}System.out.println();
		
		//1 ~ 100 중 짝수 출력
		int j = 1;
		while(j <= 100) {
			if(j % 2 == 0) {
				System.out.print(j + " ");
			}
			j++;
		}System.out.println();
		
		//1 ~ 100까지의 모든 수의 합
		int num = 1;
		int sum = 0;
		while(num <= 100) {
			sum += num;
			num++;
		}
		System.out.println(sum);

		/* Quiz1
		 * if-else if문
		 * 자신의 몸무게와 키를 입력받아 BMI를 출력하는 프로그램
		 * 
		 * BMI 공식) 몸무게(KG) / (신장(M)*신장(M)) - 괄호 필수
		 * 
		 * cm => m 로 변환
		 * 1cm = (1/100)m = 0.01m
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몸무게입력>>");
		double weight = sc.nextDouble();
		System.out.println("키입력>>");
		double height = sc.nextDouble();
		double bmi = weight / ((height/100)*(height/100));
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi >= 18.5 && bmi <= 22.9) {
			System.out.println("정상");
		}else if(bmi >= 23.0 && bmi <= 24.9) {
			System.out.println("과체중");
		}else {
			System.out.println("비만");
		}
		
		/* Quiz2
		 * if-else if문
		 * 연도가 주어졌을 때 윤년이면 1, 아니면 0을 출력하는 프로그램
		 * (윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다)
		 */
		System.out.println("년도입력>>");
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			if(year % 100 != 0 && year % 400 == 0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}else {
			System.out.println(0);
		}

		/* Quiz3
		 * if-else if문
		 * 두 정수를 입력받아 A와 B를 비교하는 프로그램 
		 * A가 더 크면 > 출력
		 * B가 더 크면 < 출력
		 * A와 B가 같으면 == 출력
		 */
		System.out.println("정수1 입력:");
		int a = sc.nextInt();
		System.out.println("정수2 입력:");
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(">");
		}else if(a < b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	
		/* Quiz4
		 * if-else if문
		 * 시험 점수를 입력받아 학점을 출력하는 프로그램
		 */
		System.out.println("점수입력>>");
		int score = sc.nextInt();
		
		if(score <= 100 && score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		/* Quiz5
		 * for문
		 * 1 ~ 100 중 짝수의 합
		 */
		int sum3 = 0;
		for(int i1 = 1; i1 <= 100; i1++) {
			if(i1 % 2 == 0) {
				sum3 += i1;
			}
		}
		System.out.println(sum3);
		
		/* Quiz6
		 * for문
		 * 단을 입력 받아 구구단을 출력
		 */
		System.out.println("출력하고 싶은 단 입력>>");
		int num3 = sc.nextInt();
		for(int i1 = 1; i1 < 10; i1++) {
			System.out.printf("%dX%d=" + (num3*i1),num3,i1);
			System.out.println();
		}
		
		/* Quiz7
		 * for문
		 * 1부터 입력받은 수까지의 합계 출력
		 */
		System.out.println("정수입력>>");
		int num4 = sc.nextInt();
		int sum4 = 0;
		for(int i1 = 1; i1 <= num4; i1++) {
			sum4 += i1;
		}
		System.out.println(sum4);
		
		sc.close();
	}
}
