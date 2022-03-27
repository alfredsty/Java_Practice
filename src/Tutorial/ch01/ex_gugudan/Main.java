package Tutorial.ch01.ex_gugudan;

public class Main {

    public static void main(String[] args) {
        int dan = Integer.parseInt(args[0]); //3
        int step = Integer.parseInt(args[1]); //3

        for(int i = 1; i<=9; i += step){
            System.out.println(
                    dan + " x " + i + " = " + dan*i
            );
        }
    }
}
