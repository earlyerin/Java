package exam;

public class Day01 {
	public static void main(String[] args) {
		//main 메소드(실행메소드) - 프로그램이 실행될 때 가장 먼저 실행되는 메소드
		//자동완성기능 단축키 : ctrl+ space + enter
		
		System.out.println("Hello World!!");
		//코드 실행 단축키 : ctrl + F11
		//코드 저장 단축키 : ctrl + s
		
		/*
		 *  주석 (Command) 
		 *  프로그램 소스코드에 설명을 작성해 둔 부분을 의미
		 *  주석은 컴파일러외 인터프리터에 의해 의해 무시되므로 따로 실행되지 않음
		 *  코드에 대한 이해력 향상
		 *  타인이 코드를 봤을 때 프로그램의 작동 방식을 쉽게 이해
		 */
		
		/*
		 *  여러줄 주석처리 시 사용
		 */
		
		// 행 주석
		
		/** 문서주석 - 자바의 문서 api를 만들 때 사용 
		 * 
		 */
		
		/*
		 * 실행문
		 * 변수의 선언 및 변수 값 저장
		 * 메소드 호출에 해당하는 코드를 말함
		 * 실행문 끝에는 반드시 세미를론(;)을 붙혀서 실행문이 끝났음을 표기
		 */
		
		//한줄에 하나의 실행문만 작성
		System.out.println("Hello");
		System.out.println("Java World");
		
		//한줄에 여러 개의 실행문 작성
		int a1 = 1; int a2 = 2; System.out.println(a1); System.out.println(a2);
		//하나의 실행문을 여러 줄에 적성
		int b1
		=
			 10;
		int
			b2=
				20
	    ;
		System.out.println(b1);
		System.out.println(b2);
		
		/*
		 *출력문
		 *System.out.print()
		 *-괄호 안의 내용을 출력하고 행을 바꿈(자동개행)
		 *Sytem.out.print()
		 *-괄호 안의 내용을 출력
		 *System.out.printf()
		 *-문자열을 서식 문자를 이용해 형식화된 내용으로 출력  
		 */
		System.out.println("안녕하세요");
		System.out.println("만나서 반가워요");
		System.out.println();
		System.out.println("열심히 하세요");
		
		System.out.print("Hello ");
		System.out.print("World");
		System.out.println();
		
		// 출력문을 사용하여 이름 나이 mbit 출력하기
		System.out.println("이예린");
		System.out.println("20");
		System.out.println("ESTP");

	}
}
