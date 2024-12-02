package exam;

import java.util.Scanner;

public class Day08 {

	public static void main(String[] args) {
		/*
		 * do-while문
		 * 형식) do{
		 * 			실행문
		 * 		} while(조건식)
		 * 
		 * 조건식이 true이든 false이든 상관없이 무조건 한 번 실행한 뒤
		 * 조건을 검사하며 반복을 결정
		 */
		int num = 1; //초기식
		do {
			System.out.println("Hello World " + num + "번"); //실행문
			num++; //증감식
		}while(num <= 10); //조건식
		
		/*
		 * 배열(array)
		 * -같은 자료형의 변수를 지정하여 여러 데이터를 저장할 수 있는 공간
		 * -변수는 1개의 데이터만 저장할 수 있지만 배열은 여러개의 데이터를 저장가능
		 * -여러개의 데이터를 저장하기 위해 별도의 공간이 필요함
		 * -배열을 선언만 하고 값을 부여하지 않을 경울 시그템은 배열 변수를 만들 때
		 * null키워드를 부여함
		 * -배열 선언 후 값을 저장할 수 있는 공간을 만들어야함
		 * -데이터를 저장하기 위한 공간이 필요하므로 메모리에 필요한 만큼 공간을 만들도록 선언
		 * -인덱스(index)는 배열의 요소마다 붙혀진 일련번호로 각 요소를 구분하는데 사용함
		 * -인덱스의 번위는 (0 ~ 배열크기-1) 까지
		 * 
		 * 형식)
		 * 자료형 [] 변수이름 = new int[크기];
		 * 자료형 변수이름 [] = new int[크기};
		 */
		
		int arr[] = null; // 배열을 선언만 하고 공간을 생성하지 않았을 때 null로 초기화
		//arr[0] = 10;
		/*
		 * java.lang.NullPointerException
		 * 참조할 객체가 없는 변수
		 * 즉, null값을 가진 배열은 공간이 할당되지 않았기에
		 * 위치에 값을 대입할 수 없고 에러가 발생함
		 */
		
		int arr1[] = new int[4];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		
		/*
		 * 변수이름.length
		 * 해당 변수의 길이
		 */
		System.out.println("arr1배열길이:"+arr1.length);
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d] : "+ arr1[i] + "\n" ,i);
		}System.out.println();
		
		//배열선언과 동시에 초기화하면 원소 개수만큼 공간이 할당됨
		int arr2[] = {10,20,30,40,50};
		for(int i = 0; i < arr2.length; i++) {
			System.out.printf("arr2[%d] : " + arr2[i] + "\n" ,i);
		}System.out.println();
		
		String arr3[] = {"사과","포도","바나나"};
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}System.out.println();
		
		//반복문 루프를 돌면서 각 인덱스에 접근하여 값 삽입
		int list[] = null;
		list = new int[4];
		for(int i = 0; i < list.length; i++) {
			list[i] = i + 1;
		}
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");	
		}
		
		//배열 입력 받기
		Scanner sc = new Scanner(System.in);
		int arr4[] = new int [4];
		for(int i = 0; i < arr4.length; i++) {
			System.out.println((i+1) + "번째 입력>>");
			arr4[i] = sc.nextInt();
			}
		for(int i = 0; i < arr4.length; i++) {
			System.out.printf("arr4[%d] :" + arr4[i] + "\n",i);
		}
		
		/*
		 * 다차원 배열
		 * 1차원 배열과는 달리 행과 열로 구성된 배열
		 * 
		 * 형식) int [][] arr = new int[행크기][열크기];
		 */
		int [][] array = new int[2][3];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.printf("array[%d][%d]:" + array[i][j] + "\n",i,j);
			}
		}
		
		/*
		 * Quiz1
		 * 중첩 for문
		 * 구구단을 출력하되
		 * 짝수단은 역순으로 출력하고
		 * 홀수단은 정순으로 출력하는 프로그램
		 */
		for(int i = 2; i <= 9; i++) {
			if(i%2==0) {
				for(int j = 9; j >= 1; j--) {
					System.out.printf("%dX%d=" + (i*j) + "\t",i,j);
				}
			}else {
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%dX%d=" + (i*j) + "\t ",i,j);
				}
			}
			System.out.println();
		}
		
		/*
		 * Quiz2
		 * 중첩 for문
		 * 방정식 4x + 5y = 60의 해를 출력하는 프로그램
		 * (단, x와 y는 10이하의 자연수)
		 */
		for(int x = 1; x <= 10 ; x++) {
			for(int y = 1 ;y <= 10; y++) {
				if(4*x+5*y==60) {
					System.out.printf("(%d,%d)",x,y);
					System.out.println();
				}else {
					continue;
				}
			}
		}
		
		/* 
		 * Quiz3
		 * while문
		 * 두 정수 A와 B를 입력받아
		 * A + B를 출력하는 프로그램
		 * 0 두 개를 입력 받으면 종료
		 */
		System.out.println("종료하려면 0을 두번 입력하세요.");
		while(true) {
			System.out.print("정수 2개 입력:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("합:"+ (a+b));
			if(a == 0 & b == 0) {
				System.out.println("종료");
				break;
			}
		}
		
		/*
		 * Quiz4
		 * 중첩 for문
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 모양을 출력하는 프로그램
		 */
		for(int i = 1; i <= 5; i++) { //층 구현
			for(int j = 1; j <= i; j++) { //한 층에 별 개수 지정
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * Quiz5
		 * 중첩 for문
		 * 
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * 모양을 출력하는 프로그램
		 */
		System.out.println();
		for(int k = 1; k <= 5; k++) {
			for(int j = 5; j >= k; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * Quiz6
		 * 길이가 5인 배열을 입력받아 배열 안 모든 값의
		 * 총합과 평균을 출력하는 프로그램
		 */
		int arr5[] = new int[5];
		int sum = 0;
		for(int i = 0; i < arr5.length; i++) {
			System.out.println((i+1)+ "번째 요소 입력 >>");
			arr5[i] = sc.nextInt();
			sum += arr5[i];
		}
		System.out.println("총합 : " + sum + "/ 평균 : " + (double)sum/arr5.length);
		sc.close();
		
		/*
		 * Quiz7
		 * int arr[] = {10,5,2,4,7,1};
		 * 위 arr 배열의 짝수만 출력
		 */
		int arr6[] = {10,5,2,4,7,1};
		for(int i = 0; i < arr6.length; i++) {
			if(arr6[i] % 2 == 0) {
				System.out.println(arr6[i]);
			}
		}
		

	}

}
