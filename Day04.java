package exam;

import java.util.Scanner;

public class Day04 {

	public static void main(String[] args) {
		// 복합 대입 연산자(+=, -=, *=, /=, %=)
		int i = 10;
		i += 10; // x = x + 10
		System.out.println(i);
		
		int x = 10;
		int y = 1;
		x += y; // x = x + y
		System.out.println(x);
		x *= 20; // x = x * 20
		System.out.println(x);
		x %= 2; // x = x % 2
		System.out.println(x);
		
		// 복합 대입 연산자 풀어서 쓴 형태(가독성 향상)
		System.out.println("==========");
		int result = 0;
		result = result + 10;
		System.out.println("result:"+result);
		
		result = result - 5;
		System.out.println("result:"+result);
		
		result = result * 3;
		System.out.println("result:"+result);
		
		result = result / 5;
		System.out.println("result:"+result);
		
		/*
		 * 관계 연산자(<, <=, >, >=, ==, !=)
		 * 2개의 피연산자를 부호로 비교하려 그 부호 관계가
		 * true인지 false인지 판별하는 연산자
		 */
		System.out.println("==========");
		int a = 20; int b = 20;
		System.out.println(a > b); // a가 b보다 큰가?
		System.out.println(a <= b); // b가 a보다 크거나 같은가?
		System.out.println(a == b); // a와 b가 같은가?
		System.out.println(a != b); // a와 b가 같지 않은가?
		
		char ch1 = 'A';
		int num1 = 65;
		System.out.println(ch1 == num1);
		
		/*
		 * 논리 연산자
		 * 논리곱 &&(AND) :두 항이 모두 true이면 true, 나머지는 false
		 * 논리합 ||(OR) : 두 항중 하나라도 true이면 true, 모두 false이면 false
		 * 배타적 논리합 ^(XOR) : 두 항이 같은 값이면 false, 다르면 true
		 * 논리 부정 !(NOT) : 식이 true이면 false, false이면 true
		 */
		System.out.println("==========");
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("---논리곱---");
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		System.out.println(b2 && b4);
		
		System.out.println("---논리합---");
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b4);
		
		System.out.println("---배타적 논리합---");
		System.out.println(b1 ^ b2);
		System.out.println(b2 ^ b4);
		
		System.out.println("---논리 부정---");
		boolean power = false;
		System.out.println(power);
		power = !power;
		System.out.println(power);
		
		/*
		 * 삼항 연산자
		 * -피연산자를 3개 가지는 식
		 * -복잡한 조건이 걸릴 시 구현하기 힘듦
		 * -많이 사용할 경우 가독성 저하
		 * 
		 * 형식) (조건식) ? (피연산자1-참일 때 리터럴) : (피연산자2-거짓일 때 리터럴)
		 */
		System.out.println("==========");
		boolean result1 = (10 < 20) ? true : false;
		System.out.println(result1);
		
		int result2 = (10 % 2 == 0) ? 1: 0;
		System.out.println(result2);
		
		/*
		 * 조건문(if)
		 * -조건식의 결과에 따라 종속 문자(블록 내의 문장)의 실행 여부 결정
		 * -조건식의 연산 결과가 true이면 블록 내 문장을 실행하고
		 * false이면 실행하지 않는다
		 * -if문의 조건식에는 boolean 변수 또는 true와 false 값을
		 * 산출할 수 있는 연산식이 올 수 있다
		 * -else문은 단독으로 사용 불가
		 * -if문의 실행문이 실행될 경우 if-else문을 바로 벗어남
		 */
		
		//조건문 if로 표현 - 복잡한 조건식은 if문 권장
		System.out.println("=========");
		if(10 < 20) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		if(10 % 2 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		//조건식에 변수 사용
		int score = 70;
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		int money = 2000;
		if(money >= 3000) {
			System.out.println("택시");
		}else {
			System.out.println("도보");
		}
		
		//조건식에 논리 연산자 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("입력>>");
		int cash = sc.nextInt();
		boolean card = true;
		if(cash <= 3000 || card) {
			System.out.println("택시");
		}else {
			System.out.println("도보");
		}
		
		/* Quiz1
		 * 과목의 합게 평균을 출력하는 프로그램
		 * 국어 85점
		 * 수학 85점
		 * 영어 75점
		 * 역사 88점
		 */
		int kor = 85;
		int mat = 85;
		int eng = 75;
		int his = 88;
		int sum = kor + mat + eng + his;
		double avg = (double)sum/4;
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+avg);
		
		/* Quiz2
		 * 두 자리 숫자하나를 입력받아(10~99)
		 * 입력받은 수의 십의 자리 숫자와 일의 자리 숫자를 출력하는 프로그램
		 */
		System.out.println("두 자리 정수를 입력하세요 : ");
		int number = sc.nextInt();
		int tens_place = number/10;
		int ones_place = number%10;
		System.out.println("십의 자리 : " + tens_place);
		System.out.println("일의 자리 : " + ones_place);
		
		/* Quiz3
		 * 세자리 숫자 하나를 입력받아(100~999)
		 * 입력받은 수의 백의 자리 이하를 버리는 프로그램
		 */
		System.out.println("세 자리 정수를 입력하세요:");
		int number1 = sc.nextInt();
		int result3 = number1 - number1 % 100;
		System.out.println(result3);
		//강사님 풀이	System.out.println( number1 / 100 * 100);		
		
		/* Quiz4
		 * 수를 입력받아 짝수인지 홀수인지 판단하는 프로그램(삼항 연산자 사용)
		 */
		System.out.println("정수입력>>");
		int number3 = sc.nextInt();
		String result4 = (number3 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result4);
		
		/* Quiz5
		 * 숫자 하나를 입력받아 입력받은 수의 절대값을 구하는 프로그램(if문 사용)
		 */
		System.out.println("정수입력>>");
		int number4 = sc.nextInt();
		if(number4 >= 0) {
			System.out.println(+number4);
		}else {
			System.out.println(-number4);
		}
		
	}

}
