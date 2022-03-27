package Tutorial.ch01.ex_tringle;

public class Main {
    public static void main(String[] args) {
        int h  = Integer.parseInt(args[0]);

        for(int i = 0; i < h; i++ ){
            for(int j = 1; j < h-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j< i*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
