package exam;

import java.util.Scanner;

public class Day05 {

	public static void main(String[] args) {
		/*
		 * if-else if문
		 * 
		 * 형식)
		 * if(조건식){
		 * 		실행문
		 * }else if(조건식){
		 * 		실행문
		 * }else if(조건식){
		 * 		실행문
		 * }else{
		 * 		실행문
		 * }
		 */
		//과목 점 수에 따라 과락을 출력하고 과목 평균에 따라 합격, 불합격을 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("국어성적>>");
		int kor = sc.nextInt();
		System.out.println("영어성적>>");
		int eng = sc.nextInt();
	    double avg = (kor + eng)/2.0;
	    if(kor < 50 || eng <50) {
	    	System.out.println("과락");
	    }else if(avg >=70) {
	    	System.out.println("과목 평균이 "+ avg + "이므로 합격");
	    }else {
	    	System.out.println("과목 평균이 " + avg + "이므로 불합격");
	    }
	    
	    //입력값 나이대 분류
	    System.out.println("===============");
	    System.out.println("나이입력>>");
	    int age = sc.nextInt();
	    if(age > 19) {
	    	System.out.println("성인");
	    }else if(age > 13 ){
	    	System.out.println("청소년");
	    }else if(age > 6) {
	    	System.out.println("어린이");
	    }else {
	    	System.out.println("유아");
	    }
	    
	    /*
	     * equals()
	     * -주 개의 문자열이 동일한지 동일하지 않은지 판단해주는 메소드
	     * -대소문자 구분
	     * -모든 객체의 부모 클래스인 Object에 정의되어있는 메소드(자바의 모든 클래스들은 최고 조상인 Object클래스를 상속받음)
	     * 
	     * 형식) 변수명.equals(비교할 변수명)
	     * 		변수명.equals("비교할 문자열")
	     */
	    System.out.println("===============");
	    String str1 = "Hello World";
	    String str2 = "I Love You";
	    String str3 = "Hello World";
	    String str4 = "i love you";
	    
	    boolean compare1 = str1.equals(str2); //문자열이 같으면 true 다르면 false가 저장됨
	    boolean compare2 = str1.equals(str3);
	    boolean compare3 = str2.equals(str4);
	    
	    if(compare1) {
	    	System.out.println("str1과 str2의 문자열이 같습니다.");
	    }else if(compare2){
	    	System.out.println("str1과 str3의 문자열이 같습니다.");
	    }else if(compare3) {
	    	System.out.println("str2와 str4의 문자열이 같습니다.");
	    }
	    
	    //과일 농담 프로그램
	    System.out.println("===============");
	    System.out.println("좋아하는 과일을 입력하세요(영문,소문자):");
	    String fruit = sc.next();
	    if(fruit.equals("orange")) { // 변수명.equal("문자열") 형태
	    	System.out.println("연애한지 얼마나 오렌지 ㅠ.ㅠ");
	    }else if(fruit.equals("banana")) {
	    	System.out.println("예쁘면 나에게 바나나?");
	    }else if(fruit.equals("grape")) {
	    	System.out.println("예쁘냐고 묻는다면 그래이프!");
	    }else if(fruit.equals("watermelon")) {
	    	System.out.println("날 사랑할 수박에~");
	    }else {
	    	System.out.println("프로그램에 농담이 존재하지 않는 과일입니다.");
	    }
	    
	    /*
	     * 중첩 if문
	     * 
	     * 형식)
	     * if(조건식){
		 * 		실행문
		 *		if(조건식){
		 *			실행문
		 *		}else{
		 *			실행문
		 *		}
	     */
	    //학점 출력 프로그램
	    System.out.println("===============");
	    System.out.println("성적입력>>");
	    int score = sc.nextInt();
	    
	    if(score >= 90) {
	    	if(score >= 95) {
	    		System.out.println("A+");
	    	}else {
	    		System.out.println("A");
	    	}
	    }else if(score >= 80) {
	    	if(score >=85) {
	    		System.out.println("B+");
	    	}else {
	    		System.out.println("B");
	    	}
	    }else if(score >= 70) {
	    	if(score >= 75) {
	    		System.out.println("C+");
	    	}else {
	    		System.out.println("C");
	    	}
	    }else if(score >= 60) {
	    	if(score >= 65) {
	    		System.out.println("D+");
	    	}else {
	    		System.out.println("D");
	    	}
	    }else {
	    	System.out.println("F");
	    }
	    
	    /*
		 * switch문
		 * -switch문을 먼저 시기를 계산하고 그 결과값과 일치하는 case문으로 분기
		 * -default는 생략 가능
		 * -switch문 안 case조건에 걸리지 않는다면 default로 빠짐
		 * -case문의 실행문을 실행한 후 break를 만나면 switch문을 빠져나옴
		 */
		 System.out.println("숫자입력>>");
		 int num1 = sc.nextInt();
		 
		 switch(num1) {
		 case 1:
			 System.out.println("가위");
			 break;
		 case 2:
			 System.out.println("바위");
			 break;
		 case 3:
			 System.out.println("보");
			 break;
		 default:
			 System.out.println("잘못된 입력");
		 }
		 //홀짝 출력 프로그램
		 System.out.println("숫자 입력>>");
		 int num2 = sc.nextInt();
		 
		 switch(num2%2) {
		 case 0:
			 System.out.println("짝수");
			 break;
		 case 1: 
			 System.out.println("홀수");
		 }
		 
		 //Quiz1. if-else if문 - 자판기 프로그램
	   	 System.out.println("음료번호입력>>");
		 int bev = sc.nextInt();
			
		 if(bev == 1) {
			 System.out.println("콜라");
		 }else if(bev == 2) {
			 System.out.println("사이다");
		 }else if(bev == 3) {
			 System.out.println("환타");
		 }else if(bev == 4) {
			 System.out.println("포카리");
		 }else {
			 System.out.println("잘못된 입력");
		 }
		 
		 //Quiz2. if-else if문 - 성적이 70점 이상이면 합격 미만이면 불합격을 출력하는 프로그램
		 System.out.println("성적입력>>");
		 int sco = sc.nextInt();
			
		 if(sco < 0||sco > 100) { 
			 System.out.println("입력범위초과");
		 }else if(sco >= 70) {
			 System.out.println("합격");
		 }else {
			 System.out.println("불합격");
		 }
		 
		 //Quiz3. 아이디, 비밀번호를 입력받아 잘못된 입력과 로그인 성공을 출력하는 프로그램
		 String ID = "lee";
		 int PW = 1234;
		 System.out.println("아이디 입력>>");
		 String inputID = sc.nextLine();
		 System.out.println("비밀번호 입력>>");
		 int inputPW = sc.nextInt();
		    
		 if(!ID.equals(inputID) && (PW != inputPW)) {
			 System.out.println("아이디와 비밀번호를 잘못입력하였습니다.");
		 }else if(!ID.equals(inputID)) {
		     System.out.println("아이디를 잘못입력하였습니다.");
		 }else if(PW != inputPW) {
		     System.out.println("비밀번호를 잘못입력하였습니다.");
		 }else {
		     System.out.println("로그인 성공!");
		 }		 

		 //Quiz4. switch문 - 사칙연산 프로그램
		 System.out.println("숫자입력>>");
		 int n1 = sc.nextInt();
		 System.out.println("기호입력>>");
		 char ch = sc.next().charAt(0);
		 System.out.println("숫자입력>>");
		 int n2 = sc.nextInt();
		 int cal = 0;
			
		 switch(ch) {
		 case '+':
			 cal = n1 + n2;
			 break;
		 case '-':
			 cal = n1 - n2;
			 break;
		 case '*':
			 cal = n1 * n2;
			 break;
		 case '/':
			 cal = n1 / n2;
			 break;
		 default:
			 System.out.println("연산불가능기호");
		 }
		 System.out.println("결과 : " + cal);		
		 sc.close();
		 
	    
	    
	    
	}

}
