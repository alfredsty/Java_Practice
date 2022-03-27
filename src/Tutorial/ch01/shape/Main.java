package Tutorial.ch01.shape;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String Cli = "";

        while(!Cli.equals("q")){
            System.out.print("출력할 도형을 선택하세요\n" + "1.사각형\t2.삼각형\t3.다이아몬드\tq.종료");
            Cli = scn.next();
            if(Cli.equals("1")){
                //사각형 출력
                print_square();
            }
            else if(Cli.equals("2")){
                //삼각형 출력
                print_triangle();
            }
            else if(Cli.equals("3")){
                //다이아몬드 출력
                print_diamond();
            }
        }
    }
    public static void print_square(){
        System.out.println("사각형 출력");
    }
    public static void print_triangle(){
        System.out.println("삼각형 출력");

    }
    public static void print_diamond(){
        System.out.println("다이아몬드 출력");
    }
}
