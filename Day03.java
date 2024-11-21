package exam;

import java.util.Scanner;

public class Day03 {

	public static void main(String[] args) {
		/*
		 * 기본자료형
		 * -정수형, 실수형, 논리형
		 * 
		 * 참조자료형
		 * 배열형, 열거형, 클래스.인터페이스
		 */
		
		/*
		 * Stack영역
		 * -기본자료형에 해당하는 지역변수 값이 저장되는 공간
		 * -Heap영역에 생성된 Object타입의 데이터 참조값 할당
		 * (참조값이란 객체의 메모리를 생성했을 때 메모리와 연결된 유일한 주소값)
		 * 
		 * Heap영역
		 * -객체와 배열이 생성되는 영역
		 * -참조하는 변수나 필드가 없다면 의미없는 객체
		 * -JVM은 이러한 것들을 가비지 컬랙처를 실행시켜 지동으로 객체를 제거
		 * 
		 */
		int age = 30;
		double height = 159.7;
		String name = "이예린";
		String job = "학생";
		System.out.println(age);
		System.out.println(height);
		System.out.println(name);
		System.out.println(job);
		
		//String 변수 선언의 완전한 구문 - "객체"를 생성함
 		String name1 = new String("이예린");
		System.out.println(name1);
		
		/*
		 * 형 변환
		 * -자료형울 다룬 자료형으로 변환하는 것
		 * -연산은 같은 자료형끼리만 수행 가능
		 * -서로 다른 자료형의 연산을 수행하기 위해 같은 자료형으로 변환해야함
		 * 형식 : (변경하고자하는 데이터 타입)자료형을 바꾸고 싶은 변수 또는 리터럴
		 */
		
		int num1 = 11;
		double num2 = 3.14;
		double result1 =(double)num1 + num2;//정수형->실수형
		int result2 = num1 + (int)num2;//실수형->정수형
		System.out.println(result1);
		System.out.println(result2);
		
		/*
		 * 자동 형 변환 : 크기가 작은 자료형에서 큰 자료형으로 변환할 때는
		 * 데이터 손실이 없어서 형변환 생략 가능
		 * 
		 * 강제 형 변환 : 큰 자료형에서 작은 자료형으로 이동할 때
		 * 오류가 발생하지 않도록 강제적으로 형 변환을 해두는 것
		 * 
		 * -메모리에 할당받은 크기가 큰 자료형을 크기가 작은 자료형으로
		 * 변환하면 데이터의 손실 발생 (예상치 못한 값의 출력)
		 */
		
		
		/*
		 * 정수형 간의 형 변환
		 */
		System.out.println("==========");
		int a1 = 10;
		byte a2 = (byte)a1; //강제 형 변환
		System.out.println(a2);
		
		int a3 = 128; //byte 범위 밖 - 오버플로우 발생
		byte a4 = (byte)a3;
		System.out.println(a4); 
		
		byte byteVar = 10;
		int intVar =  byteVar; //자동 형 변환
		System.out.println(intVar); 
		
		/*
		 * 실수형 간의 형 변환 
		 * 크기가 큰 자료형(double)에서 작은 자료형(float)으로
		 * 변환할 때 float의 저장 범위를 넘어서는 값을 대입하면
		 * 무한대나 0 출력
		 */
		System.out.println("==========");
		float num4 = 1.1234f;
		double num5 =  num4; //자동 형 변환
		System.out.println(num5);// 정밀도 차이로 소수점 뒤 15번째까지 출력
		double num6 = 1.123456789;
		float num7 = (float)num6; //강제 형 변환
		System.out.println(num7); //정밀도 차이로 소수점 뒤 7번째까지만 출력
		
		double b1 = 10.e100; //1.0의 100승(float의 범위 밖)
		float c1 = (float)b1;
		System.out.println(c1);//출력 : Infinity
		double b2 = 10e-100;//1.0의 -100승(float의 범위 밖)
		float c2 = (float)b2;
		System.out.println(c2);//출력 : 0.0
		
		
		/*
		 * 실수형<->정수형 형 변환
		 */
		System.out.println("==========");
		//정수형->실수형(자동 형 변환 가능)
		long longVar = 727; 
		float floatVar = longVar; 
		System.out.println(floatVar);
		int num = 100;
		double numDouble = num;
		System.out.println (numDouble);
		//실수형->정수형(강제 형 변환 필수)
		float  floatVar1 = 727.0f;
		long longVar1 = (long)floatVar1; 
		System.out.println(longVar1);
		double pie = 3.14;
		int pieInt = (int)pie;
		System.out.println(pieInt);
		
		/*
		 * 문자형의 형 변환
		 */
		//문자형<->정수형
		System.out.println("==========");
		char charVar1 = '냥';
		int intVar1 = charVar1; //자동 형 변환
		System.out.println(intVar1); //문자의 유니코드 값 출력
		int intVar2 = 45285;
		char charVar2 = (char)intVar2; //강제 형 변환
		System.out.println(charVar2);//유니코드 값에 해당하는 문자 출력
		//문자형<->실수형
		char r1 = '멍';
		double e1 = r1; //자동 형 변환
		System.out.println(e1); //유니코드 값을 실수형으로 출력
		double e2 = 47693.123455667;
		char r2 = (char)e2; //강제 형 변환
		System.out.println(r2); //정수부 값에 해당하는 문자 출력(소수부 무시)
		
		/*
		 * Scanner() : 사용자가 데이터를 입력받을 때 사용하는 클래스
		 * 형식) Scanner sc  = new Scanner(System.in);
		 * 
		 * 리터럴의 자료형에 따른 메서드
		 * nextjByte() : byte형 입력 및 리턴
		 * nextShort() : short형 입력 및 리턴
		 * nextInt() : int형 입력 및 리턴
		 * nextLong() : long형 입력 및 리턴
		 * nextFloat() : float형 입력 및 리턴
		 * nextDouble() : double형 입력 및 리턴
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //입력받은 값을 a라는 변수에 넣음
		double b = sc.nextDouble(); //입력받은 값을 b라는 변수에 넣음
		System.out.println(a);
		System.out.println(b);

		/*
		 * next() : String형 입력 및 리턴
		 * 공백을 기준으로 단어 하나를 읽어들임
		 */
		String str1 = sc.next();
		System.out.println(str1);
		sc.nextLine();//입력이 씹히는 경우 입력 행 추가
		
		/*
		 * nextline() : String형 입력 및 리턴
		 * 개행을 기준으로 한 라인을 읽어들임
		 */
		String str2 = sc.nextLine();
		System.out.println(str2);
		
		/*
		 * 연산자(Operator) : 연산에 사용되는 표시나 기호
		 * -피연산자: 연산되는 데이터
		 * -연산(Opertation): 프로그램에서 데이터를 처리하여 결과를 산출하는 것
		 * ex) a + b =c 에서 a,b는 항(피연산자)이고 +,=은 연산자
		 * -연산에는 우선순위가 존재함
		 * 
		 * 단항 연산자 : 피연산자 개수가 1개인 연산자
		 * 이항 연산자 : 피연산자 개수가 2개인 연산자
		 * 삼항 연산자 : 피연산자 개수가 2개인 연산자
		 */
				
		/*
		 * 부호 연산자
		 * +를 적용할 경우 부호를 유지
		 * -를 적용할 경우 부호를 변경
		 * short타입에 저장할 경우 컴파일 에러 발생
		 * 부호연산자로 리터럴의 부호를 변경할때 부호 정보 변경은 int타입으로 처리 
		 */
		int i = -10;
		int result3 = +i;
		int result4 = -i;
		System.out.println(result3);
		System.out.println(result4);
		
		/*
		 * 증감 연산자
		 * 변수의 값을 1 증가 또는 1 감소 시킴
		 * 전위증감 : 변수명 앞에 증감 연산자, 그 라인에서 변수를 1 증가 또는 감소
		 * 후위증감 : 변수명 뒤에 증감연산자, 다음 라인에서 변수를 1 증가 또는 감소
		 */
		System.out.println("=========");
		int n1 = 10;
		int n2 = 10;
		System.out.println(++n1); //전위증감
		System.out.println(n2++); //후위증감
		System.out.println("result1="+ n1 +",result2=" + n2);
		
		int n3 = 1;
		int n4 = 1;
		int result5 = --n3; //전위증감
		int result6 = n4--; //후위증감
		System.out.println(result5);
		System.out.println(result6);
		
		/*
		 * 논리 부정 연산자
		 * boolean 값을 가지는 피연산자 앞에 !(=NOT)을 붙혀서 값을 반대로 바꾸는 역할
		 * true->false
		 * false->true
		 */
		System.out.println("=========");
		boolean isHuman = true;
		System.out.println(isHuman);
		System.out.println(!isHuman);
		
		/*
		 * 산술 연산자 
		 * 사칙 연산자 : +,-, *, /
		 * 나머지 연산자: %
		 * -일반적으로 정수, 실수 등 숫자를 연산할 때 사용
		 * -피연산자의 자료형이 일치하지 않을 경우 크기가 큰 자료형으로 자동 형 변환이
		 * 일어난 후 연산 실행
		 * -연산의 결과값이 자료형의 범위 안에 있어야한다(그렇지 않은 경우 오버플로우 발생)
		 */
		System.out.println("=========");
		int x = 200; int y = 150;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		int result7 = 1000000*1000000; //결과값이 int형의 데이터 범위를 벗어남
		System.out.println(result7); //오버플로우로 인한 에러 발생
		
		long result8 = 1000000*1000000L;
		System.out.println(result8);
		
		//Quiz1. 자신의 나이(int),이름, 학원, 거주지(string)을 압력 받아 출력하는 프로그램
		int myAge = sc.nextInt();
		String myName = sc.next();
		String myAcademy = sc.next();
		sc.nextLine(); //입력이 씹히는 경우 입력 행 추가
		String myAddress = sc.nextLine();
		System.out.println("나이: "+ myAge);
		System.out.println("이름: "+ myName);
		System.out.println("학원: "+ myAcademy);
		System.out.println("거주지: "+ myAddress);
		
		//Quiz2. 두 수를 입력받아 사칙연산을 수행하는 프로그램
		System.out.println("정수1:");
		int f_Num = sc.nextInt();
		System.out.println("정수2:");
		int s_Num = sc.nextInt();
		System.out.println(f_Num + s_Num);
		System.out.println(f_Num - s_Num);
		System.out.println(f_Num * s_Num);
		System.out.println(f_Num / s_Num);
	}

}
