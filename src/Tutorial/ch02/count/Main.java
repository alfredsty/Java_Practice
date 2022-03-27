package Tutorial.ch02.count;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int max = Integer.parseInt(args[0]);
        int bae = Integer.parseInt(args[1]);

        for (int i = 1; i <= max; i++) {
            if (i % bae == 0) {
                count++;

            }


        }
        System.out.println(count);
    }
}
