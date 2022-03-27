package Tutorial.ch01.ex_area;

import java.util.Scanner;

public class Main {
    //멤버 변수 선언
    final public static double PI = 3.14159265358979323846264338327;
    final public static Scanner scn = new Scanner(System.in);
    public static int cli = -1;

    public static void main(String[] args) {
//do-while문으로 메뉴를 입력받는다
//메뉴에서 종료가 나올때(0 입력됨)까지 무한 반복해서 실행한다
        do {
//메뉴 넣기
            menu();
        } while( cli != 0 );
    }

    public static void menu() {
// 메뉴 만들기
        System.out.print("┌──────────────────┐\n" +
                "│\t너비를 계산할 도형을 선택하세요\t\t│\n" +
                "│\t1.사각형\t2.삼각형\t3.원\t0.종료\t│\n" +
                "└──────────────────┘\n" +
                "> ");
        cli = scn.nextInt();
        switch(cli) {
            case 1:
//사각형 넓이 구하는 함수
             //   area_square();
                break;
            case 2:
//삼각형 넓이 구하는 함수
               // area_triangle();
                break;
            case 3:
//원 넓이 구하는 함수
                area_circle();
                break;
        }
    }

//    public static void area_square() {
//        System.out.println("▒▒▒▒▒▒사각형 넓이 구하기▒▒▒▒▒▒");
//        System.out.print("가로 크기(㎝)를 입력해주세요 : ");
//        int w = scn.nextInt();
//        System.out.print("세로 크기(㎝)를 입력해주세요 : ");
//        int h = scn.nextInt();
//        System.out.printf(
//                "☞ [결과] 사각형(%d㎝ x %d㎝) 너비는 %d ㎠ 입니다\n",
//                w, h, w*h
//        );


    //public static void area_triangle() {
     //   System.out.println("▒▒▒▒▒▒삼각형 넓이 구하기▒▒▒▒▒▒");
      //  System.out.print("가로 크기(㎝)를 입력해주세요 : ");
       // int w1 = scn.nextInt();
       // System.out.print("세로 크기(㎝)를 입력해주세요 : ");
//        int h1 = scn.nextInt();
//        System.out.printf(
//                "☞ [결과] 삼각형(%d㎝ x %d㎝) 너비는 %.2f ㎠ 입니다\n",
//                w1, h1, w1*h1*0.5
//        );
//    }

    public static void area_circle() {
        System.out.println("▒▒▒▒▒▒원 넓이 구하기▒▒▒▒▒▒");
        System.out.print("반지름 크기(㎝)를 입력해주세요 : ");
        int r = scn.nextInt();
        System.out.printf(
                "☞ [결과] 원(반지름 : %d㎝) 너비는 %.2f ㎠ 입니다\n",
                r, r*r*PI
        );
    }
}