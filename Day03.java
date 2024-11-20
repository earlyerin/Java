
public class Day03 {


	public static void main(String[] args) {
		/*
		 * 기본자료형
		 * -정수형, 실수형, 논리형
		 * 
		 * 참조자료형
		 * 배열형, 열거형, 클래스, 인터페이스
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
		 * -자료형을 다른 자료형으로 변환하는 것
		 * -연산은 같은 자료형끼리만 수행 가능
		 * -서로 다른 자료형의 연산을 수행하기 위해 같은 자료형으로 변환해야함
		 * 형식 : (변경하고자하는 데이터 타입)자료형을 바꾸고 싶은 변수 또는 리터럴
		 */
		
		int num1 = 11;
		double num2 = 3.14;
		double result1 =(double)num1 + num2;//정수형->실수형
		int result2 = num1 + (int)num2;//실수형->정수형
		System.out.println(result1);






