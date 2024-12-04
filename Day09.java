package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Day09 {
	public static void main(String[] args) {
		// 2차원 배열 선언과 및 기본값 출력
		int[][] array = new int[2][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("array[%d][%d]:" + array[i][j] + "\n", i, j);
			}
		}
		// 2차원 배열 선언 시 값 대입 및 출력
		System.out.println();
		int arr[][] = { { 10, 20, 30 }, { 40, 50, 60 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]:" + arr[i][j] + "\n", i, j);
			}
		}

		// 2차원 배열 선언 후 열크기 지정 및 입력받은 값 출력
		Scanner sc = new Scanner(System.in);
		int arr1[][] = new int[3][];

		arr1[0] = new int[3];
		arr1[1] = new int[2];
		arr1[2] = new int[5];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println("입력>>");
				arr1[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			int inArr[] = arr1[i];
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(inArr[j] + " ");
			}
			System.out.println();
		}

		/*
		 * Quiz1 
		 * 4 X 4의 2차원 배열을 만들고 이 배열에
		 * 1 ~ 10까지 범위의 정수를 랜덤하게 생성하여
		 * 정수 16개를 배열에 저장하고, 2차원 배열을 출력
		 */

		int arr2[][] = new int[4][4];

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = (int) (Math.random() * 10) + 1;
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}

		/*
		 * Quiz2
		 * 숫자 한 개를 입력받아 입력받은 수만큼
		 * 배열 크기를 지정하여 3의 배수를 저장하는 배열을 출력
		 */
		System.out.println("입력>>");
		int num1 = sc.nextInt();
		int arr3[] = new int[num1];

		for (int i = 0; i < num1; i++) {
			arr3[i] = 3 * (i + 1);
			System.out.print(arr3[i] + " ");
		}
		
		/*
		 * Quiz3
		 * 5 X 5의 2차원 배열을 선언하고
		 * 21 ~ 45까지 초기화하여 출력
		 */
		
		int arr4[][] = new int[5][5];
		int num2 = 21;
		for(int i = 0; i < arr4.length; i++) {
			for(int j = 0; j < arr4[i].length; j++) {
					arr4[i][j] = num2++;
			}
			System.out.println(Arrays.toString(arr4[i]));
		}
		
		/*
		 * Quiz4
		 * 주어진 배열의 전체 원소들의 합과 평균값을 출력
		 */
		int arr5[][] = {{93,56,43},{83,71},{96,54,22,97}};
		int total = 0;
		int count = 0;
		for(int i = 0; i < arr5.length; i++) {
			for(int j = 0; j < arr5[i].length; j++) {
				total += arr[i][j];
				count++;
			}
		}
		System.out.println("합:" + total);
		System.out.println("평균:" + (double)total/count);
		
		/*
		 * Quiz5
		 * 학생 수와 각 학생의 점수를 입력받고
		 * 최고 점수, 최소점수, 평균 점수를 출력
		 */
		int student[] = null;
		int sum = 0;
		
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("|1.학생 수|2.점수 입력|3.점수 확인|4.분석|5.종료|");
			System.out.println("-----------------------------------------");
			System.out.println(">>");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("학생 수 : ");
				int numberOfStudent = sc.nextInt();
				student = new int[numberOfStudent]; 
			}else if(num == 2) {
				System.out.println("[학생들의 점수 입력]");
				for(int i = 0; i < student.length; i++) {
					System.out.println((i+1)+")번 학생 점수 : ");
					student[i] = sc.nextInt();
				}
			}else if(num == 3) {
				System.out.println("[학생들의 점수 확인]");
				for(int i = 0; i < student.length; i++) {
					System.out.println((i+1)+")번 학생 점수 : " + student[i]);
				}
			}else if(num == 4) {
				System.out.println("[학생들의 점수 분석]");
				int max = 0;
				int min = student[0];
				for(int i = 0; i < student.length; i++) {
					if(max < student[i]) {
						max = student[i];
					}
					if(min > student[i]) {
						min = student[i];
					}
					sum += student[i];
				}
				System.out.println("최고 점수 : " + student[student.length - 1]);
				System.out.println("최소 점수 : " + student[0]);
				System.out.println("평균 점수 : " + (double)sum/student.length);
			}else if(num == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		sc.close();
		
	}
}
