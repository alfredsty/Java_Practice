package Tutorial.ch01.shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // CLI : Command Line Interface
        Scanner scn = new Scanner(System.in);
        String cli = "";

        while (cli.equals("q")) {
            System.out.println("출력할 도형을 선택하세요\n" +
                    "1.사각형\t2.삼각형\t3.다이아몬드\tq.종료\n"+">");
            cli = scn.nextLine();
            if (cli.equals("1")) {
                print_square();
            } else if (cli.equals("2")) {
                print_triangle();
            } else  if (cli.equals("3")) {
                print_diamond();
            }
        }
        scn.close();
    }
    public static  void print_square() {
        System.out.println("사각형을 출력합니다.");
    }
    public static  void print_triangle() {
        System.out.println("삼각형을 출력합니다.");
    }
    public static  void print_diamond() {
        System.out.println("다이아몬드을 출력합니다.");
    }
    public  static void menu() {

    }
}