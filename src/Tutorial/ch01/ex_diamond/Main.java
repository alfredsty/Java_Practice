package Tutorial.ch01.ex_diamond;

public class Main {
    public static void main(String[] args) {
        int h = Integer.parseInt(args[0]);

// 다이아몬드 윗부분
        for (int i = 0; i < h; i++) {
// 공백 출력
            for (int j = 1; j < h - i; j++) {
                System.out.print(" ");
            }

// 별 출력
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
// 한줄 띄우기
            System.out.println();
        }

// 다이아몬드 아랫부분
        for(int i=h-2; i>=0; i--) {
// 공백 출력
            for(int k=1; k<h-i; k++) {
                System.out.print(" ");
            }
// 별 출력
            for(int j=0; j<i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}