package exam;

public class Day02 {

	public static void main(String[] args) {
		/*
		 * System.out.printf();
		 * 서식문자와 제어문자를 사용해 값을 출력
		 * 
		 * 서식문자
		 * %d : 정수(10진수)
		 * %o : 정수(8진수)
		 * %x : 정수(16진수)
		 * %f : 실수
		 * %e : 지수(e표기 기반)
		 * %g : 출력 대상에 따라 %e 또는 %f 형태로 출력
		 * %s : 믄자열
		 * %c : 문자
		 * 
		 * 제어문자
		 * \n : 개행
		 * \t : 수평탭
		 * \\ : 역슬래시
		 * \b : 백스페이스
		 * 
		 */
		
		//
		System.out.printf("%d\t", 1);
		System.out.printf("%d\n", 2);
		System.out.printf("저는 %d살 입니다\n.",20);
		//2가지 이상의 서식문자를 이용해 데이터를 출력하는 방법
		System.out.printf("첫번째 숫자 : %d, 두번째 숫자 : %d, 세번째 숫자 : %d\n", 10,20,30);
		
		//서식문자와 제어문자(변수)를 이용해 데이터를 출력하는 방법 
		int a = 100;
		System.out.printf("%d\n", a);
		//println(), print() 에도 값 뿐만 아니라 변수명도 가능
		System.out.println(a);
		System.out.print(a);
		System.out.println();
		//%nd는 n칸 만큼 롹보한 후 왼쪽으로 정렬하여 츌력
		System.out.printf("%3d\n", 10);
		System.out.printf("%5d\n", 10);
		System.out.printf("%10d\n",10);
		
		//실수 표현
		//서식문자와 제어문자(값)을 사용해 값을 출력
		System.out.printf("%f\n",3.141592);
		//서식문자 %f 시용시 소수점 이하 6자리까지만 출력
		System.out.printf("%f\n", 3.1415928);
		//서식문자와 제어문자(변수)을 사용해 값을 출력
		double a1 = 1.1;;
		System.out.printf("%f\n",a1);
		//%.nf는 소수점 이하 n자리까지 출력
		System.out.printf("%.1f\n", 1.1234567);
		System.out.printf("%.2f\n",1.1234567);
		System.out.printf("%.3f\n", 1.1234567);
				
				
		//문자열(쌍따옴표)
		//서식문자와 제어문자(값)을 사용해 값을 출력
		System.out.printf("%s\n","안녕하세요");
		//서식문자와 제어문자(변수)을 사용해 값을 출력
		String str = "Hello Java";
		System.out.printf("%s\n",str);
				
				
		//문자(따옴표)
		//서식문자와 제어문자(변수)을 사용해 값을 출력
		char c = 'A';
		System.out.printf("%c\n", c);
		
		/*변수(Variable)
		 *-메모리에 값을 저장하기 위해 할당해 놓운 특정 공간
		 *-변수 생성 시 값 저장 필수(초기화)
		 *-다양한 자료형을 담을 수 있다(숫자, 문자, 문자열, boolean 등등)
		 *
		 * 형식) [데이터타입][변수명]=[저장할 값]
		 */
		
		 /* 
		 * 변수명 생성 규칙
		 * -영문 문자와 숫자 사용 가능
		 * -대소문자 구분
		 * -변수명 길이에는 제한이 없음
		 * -예약어는 변수명으로 사용 불가능
		 * -사용가능 기호 : $,_ 
		 * -숫자로 시작할 수 없음
		 * -변수의 의미를 쉽게 파악할 수 있도록 구체적으로 명명
		 * -한글 변수명이 가능하지만 권장하지 않음
		 */
		
		int b =10;
		System.out.println(b);
		int B = 10;
		System.out.println(B);
		int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa = 10;
		System.out.println(aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa);
		
		 /* 변수명 표기법
		  * 
		 * -카멜 표기법(Camel Case)*
		 * 각 단어의 첫문자를 대문자로 표기하고 맨처음 문자는 소문자로 표기
		 * ex) String carNuberName
		 * 
		 * -파스칼 표기법(Pascal Case)
		 * 카멜표기법과 흡사하지만 맨 처름 오는 글자도 대문자로 표기
		 * ex)String CarNemberName
		 * 
		 * -헝가리안 표기법(Hungarian Notation)
		 * 변수명 앞에 데이터타입을 표기
		 * ex)String intCarNember
		 * 
		 * -팟홀 표기법(Pothoke case)*
		 * 단어 사이에 언더바를 넣어서 변수명을 작성하는 방법
		 *ex)string car_nember
		 */
		
		//변수 생성과 동시에 초기화
		int studentAge = 20;
		System.out.println("학생의 나이는 : " + studentAge);
		String myCity = "Ulsan";
		System.out.println("I am from " + myCity);
		//이 때 +기호는 문자열 결합 연산자
		
		//변수선언 후 값 대입
		int age;
		age = 20;
		System.out.println(age);
		
		//변수를 선언하여 사칙연산 수행
		int x1 = 10;
		int y1= 5;
		System.out.println(x1 + y1);
		System.out.println(x1 - y1);
		System.out.println(x1 * y1);
		System.out.println(x1 / y1);
		
		//변수를 동해 다른 변수에 데이터 복사
		int myAge = 20;
		int yourAge = myAge;
		System.out.println(yourAge);
		
		System.out.println("==========");
	
		//두 변수값 서로 바꾸기
		int x = 10;
		int y = 20;
		int temp = 0; //x값을 임시저장할 변수
		System.out.println(x);
		System.out.println(y);
		temp = x; //temp에 x값을 넣는다
		x = y; //x에 y값을 대입
		y = temp; //y에 temp값을 대입
		System.out.println(x);
		System.out.println(y);
		
		/*변수의 사용범위
		 *변수는 선언된 블록 내에서만 사용이 가능하다
		 *지역변수 : 함수 내에서 선언된 변수
		 */
		if(true) {
			int n = 5;
			System.out.println("변수 n의 값 : " + n);
		}
		/*System.out.println("변수 n의 값 : " + n);
		 * 블록 밖으로 벗어났으므로 에러발생
		 */
		
		/*
		 * 자료형(Data Type)
		 *어떤 변수든지 타입이 존재하며 타입에 따라 저장할 수 있는 값의 종류와 범위가 다르다
		 */
		
		/*
		 * -정수형
		 *byte(1byte) : -128 ~ 127
		 *short(2byte) : -32768 ~ 32767
		 *int(4byte) : -2147483648 ~ 214743647
		 *long(8byte) : -9222272036854775808 ~ 9223373036854775807
		 */
		
		byte num1 = 100;
		System.out.println(num1);
		//byte num2 = 128; - byte 타입이 가질 수 있는 범위를 초과(오버플로우)하였기 때문에 에러 발생
		
		short num3 = 30;
		short num4 = 40;
		short num5 = 50;
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		//정수형에는 진수, 8진수, 16진수도 표현 가능하지만 출력은 모두 10진수
		byte num6 = 0110; //2진수 입력
		short num7 = 0107; //2진수 입력
		int num8 = 0x46; //16진수 입력
		System.out.println(num6); //10진수 출력
		System.out.println(num7); //10진수 출력
		System.out.println(num8); //10진수 출력
		
		/*
		 * long 타입의 큰 정수를 표현하고자 하면(int의 범위를 벗어났을시)
		 * 숫자 뒤에 소문자 l이나 대문자 L을 반드시 붙혀야함
		 */
		long num9 = 100000000000000L;
		long num10 = 10;
		System.out.println(num9);
		System.out.println(num10);
		
		/*
		 * char : 문자 그대로를 저장하는 것이 아닌, 유니코드라는 숫자로 값을 변환하여 저장
		 * 변수 초기화 시 '' 안에 문자 하나 저장
		 */
		//문자 입력 시 유니코드 숫자로 저장, 입력 그대로 출력
		System.out.println("====================");
		char ga = '가';
		char na = '나';
		char _a = 'a';
		char _b = 'b';
		System.out.println(ga);
		System.out.println(na);
		System.out.println(_a);
		System.out.println(_b);
		//유니코드 숫자 입력 시 해당 문자 출력
		char a3 = 65;
		char a4 = 66;
	    System.out.println(a3);
		System.out.println(a4);
		//int형에 문자입력 시 유니코드 숫자로 출력
		int alphabet1 = 'A';
		int alphabet2 = 'B';
		System.out.println(alphabet1);
		System.out.println(alphabet2);
		
		
		/*
		 *-실수형
		 *float(4byte)
		 *double(8byte)
		 */
		//float형은 반드시 뒤에 소문자 f 혹은 대문자 F를 붙혀야함
		System.out.println("====================");
		float halfMarathon = 21.0975F;
		double Marathon = 41.195;
		System.out.println("마라톤은 " + Marathon + "km를 달린다.");
		System.out.println("하프 마라톤은 " + halfMarathon + "km를 달린다.");
		/*float형은 소수점 뒤 7번째 자리까지 출력
		 *double형은 소수점 뒤 15번째 자리까지 출력
		 */
		float pieFloat = 3.141592653589793f;
		double pieDouble = 3.141592653589793;
		System.out.println(pieFloat);
		System.out.println(pieDouble);
		//서식문자 %f를 사용한 출력에서는 소수점 뒤 7번째 자리까지 출력
		System.out.printf("%f\n",pieFloat);
		System.out.printf("%f\n",pieDouble);
		
		
		
		/*
		 * -논리형
		 *boolean : true,false 값을 저장
		 */
		System.out.println("====================");
		
		boolean isStudent = true; 
		System.out.println(isStudent);
		if(isStudent) {
			System.out.println("학생입니다."); //true이면 출력
			} else { 
				System.out.println("학생이 아닙니다."); //false이면 출력
			}
		
		boolean flag = false;
		if(flag) {
			System.out.println("실행~");; //true이면 출력
		} else {
			System.out.println("종료!"); //false이면 출력
		}
		
		//Quiz1.변수를 선언하여 이름 , 나이, 거주지를 출력하세요
		String my_Name = "이예린";
		int my_Age = 20;
		String my_City = "Ulsan";
		//printf사용
		System.out.printf("%s\n",my_Name);
		System.out.printf("%d\n",my_Age);
		System.out.printf("%s\n",my_City);
		//println사용
		System.out.println(my_Name);
		System.out.println(my_Age);
		System.out.println(my_City);
		
		//Quiz2.정수형 변수 3개를 선언하여 printf()를 사용하여 출력하세요
		int first = 10; int second = 20; int third = 30;
		System.out.printf("%d %d %d",first,second,third);
				
	}

}
